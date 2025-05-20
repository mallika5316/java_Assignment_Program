<%-- 
    8b. Read all the existing records from the table coffee which is from the database test 
    and update an existing coffee product in the table with its id. 
    [Create a table coffee with fields (id, coffee_name, price)] 
    using HTML and JSP to get the fields and display the results respectively.
--%>
<%@ page import="java.sql.*" %>
<%
    String id = request.getParameter("id");
    String name = request.getParameter("coffee_name");
    String price = request.getParameter("price");

    Connection conn = null;
    PreparedStatement updateStmt = null;
    Statement selectStmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");

        if (id != null && name != null && price != null) {
            String updateQuery = "UPDATE coffee SET coffee_name = ?, price = ? WHERE id = ?";
            updateStmt = conn.prepareStatement(updateQuery);
            updateStmt.setString(1, name);
            updateStmt.setDouble(2, Double.parseDouble(price));
            updateStmt.setInt(3, Integer.parseInt(id));
            int rowsAffected = updateStmt.executeUpdate();

            if (rowsAffected == 0) {
                out.println("<p style='color:red;'>No record found with ID: " + id + "</p>");
            }
        }

        String selectQuery = "SELECT * FROM coffee";
        selectStmt = conn.createStatement();
        rs = selectStmt.executeQuery(selectQuery);
%>

<h2>Coffee Products</h2>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Coffee Name</th>
        <th>Price</th>
    </tr>
<%
    while (rs.next()) {
%>
    <tr>
        <td><%= rs.getInt("id") %></td>
        <td><%= rs.getString("coffee_name") %></td>
        <td><%= rs.getDouble("price") %></td>
    </tr>
<%
    }
    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    } finally {
        try { if (rs != null) rs.close(); } catch (Exception e) {}
        try { if (updateStmt != null) updateStmt.close(); } catch (Exception e) {}
        try { if (selectStmt != null) selectStmt.close(); } catch (Exception e) {}
        try { if (conn != null) conn.close(); } catch (Exception e) {}
    }
%>
</table>
