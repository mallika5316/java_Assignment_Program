<!--9d. Develop a JDBC project using MySQL to delete the records in the table Emp of the database
Employee by getting the name starting with ‘S’ through keyboard and Generate the report as
follows using HTML and JSP to get the field and display the results respectively

Salary Report

~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 101
Emp_Name: Ramesh'
Basic : 25000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Emp_No : 102
Emp_Name: Ravi
Basic : 20000
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-->
<%@ page import="java.sql.*" %>
<html>
<head><title>Delete Employee by Name Starting Letter</title></head>
<body>
    <h2>Delete Employees whose names start with:</h2>

    <form method="post">
        Enter Starting Letter: <input type="text" name="startLetter" maxlength="1" required />
        <input type="submit" value="Delete and Show Report" />
    </form>

<%
    String startLetter = request.getParameter("startLetter");
    Connection con = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", ""); // add password if needed

        if (startLetter != null && !startLetter.trim().isEmpty()) {
            PreparedStatement delStmt = con.prepareStatement("DELETE FROM Emp WHERE Emp_Name LIKE ?");
            delStmt.setString(1, startLetter + "%");
            int rowsDeleted = delStmt.executeUpdate();
            out.println("<p style='color:green'>" + rowsDeleted + " record(s) deleted where Emp_Name starts with '" + startLetter + "'</p>");
        }

        // Display Salary Report
        out.println("<h3>Salary Report</h3>");
        out.println("<pre>~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>");

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM Emp");

        int grandSalary = 0;
        while (rs.next()) {
            int eno = rs.getInt("Emp_NO");
            String ename = rs.getString("Emp_Name");
            int basic = rs.getInt("Basicsalary");
            grandSalary += basic;

            out.println("<pre>Emp_No   : " + eno + "\nEmp_Name : " + ename + "\nBasic    : " + basic + "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>");
        }

        out.println("<pre><b>Grand Salary : " + grandSalary + "</b>\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~</pre>");
    } catch (Exception e) {
        out.println("<p style='color:red'>Error: " + e.getMessage() + "</p>");
    } finally {
        if (con != null) try { con.close(); } catch (Exception e) {}
    }
%>
</body>
</html>
