//1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
//and a LinkedList to perform the following operations with different functions directed as
//follows
//1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
//Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
//size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list
package mypro;
import java.util.*;
public class LinkedListAndArrayList {

	    public static void main(String[] args) {
	        // 1. Creating ArrayList and LinkedList
	        List<String> arrayList = new ArrayList<>();
	        List<String> linkedList = new LinkedList<>();

	        // 1. Adding elements
	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");

	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Orange");

	        System.out.println("Initial ArrayList: " + arrayList);
	        System.out.println("Initial LinkedList: " + linkedList);

	        // 2. Adding element at specific index
	        arrayList.add(1, "Mango");
	        linkedList.add(1, "Mango");

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Grapes", "Pineapple");
	        arrayList.addAll(moreFruits);
	        linkedList.addAll(moreFruits);

	        // 4. Accessing elements
	        System.out.println("Element at index 2 in ArrayList: " + arrayList.get(2));
	        System.out.println("Element at index 2 in LinkedList: " + linkedList.get(2));

	        // 5. Updating elements
	        arrayList.set(2, "Strawberry");
	        linkedList.set(2, "Strawberry");

	        // 6. Removing elements
	        arrayList.remove("Mango");
	        linkedList.remove("Mango");

	        // 7. Searching elements
	        System.out.println("Does ArrayList contain Banana? " + arrayList.contains("Banana"));
	        System.out.println("Does LinkedList contain Banana? " + linkedList.contains("Banana"));

	        // 8. List size
	        System.out.println("Size of ArrayList: " + arrayList.size());
	        System.out.println("Size of LinkedList: " + linkedList.size());

	        // 9. Iterating over list (for-each)
	        System.out.println("\nIterating ArrayList with for-each:");
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }

	        System.out.println("Iterating LinkedList with for-each:");
	        for (String fruit : linkedList) {
	            System.out.println(fruit);
	        }

	        // 10. Using Iterator
	        System.out.println("\nUsing Iterator for ArrayList:");
	        Iterator<String> arrayIterator = arrayList.iterator();
	        while (arrayIterator.hasNext()) {
	            System.out.println(arrayIterator.next());
	        }

	        System.out.println("Using Iterator for LinkedList:");
	        Iterator<String> linkedIterator = linkedList.iterator();
	        while (linkedIterator.hasNext()) {
	            System.out.println(linkedIterator.next());
	        }

	        // 11. Sorting
	        Collections.sort(arrayList);
	        Collections.sort(linkedList);
	        System.out.println("\nSorted ArrayList: " + arrayList);
	        System.out.println("Sorted LinkedList: " + linkedList);

	        // 12. Sublist
	        System.out.println("Sublist of ArrayList (1 to 3): " + arrayList.subList(1, 3));
	        System.out.println("Sublist of LinkedList (1 to 3): " + linkedList.subList(1, 3));

	        // 13. Clearing the list
	        arrayList.clear();
	        linkedList.clear();
	        System.out.println("\nArrayList after clearing: " + arrayList);
	        System.out.println("LinkedList after clearing: " + linkedList);
	    }
	}

	
	
	

