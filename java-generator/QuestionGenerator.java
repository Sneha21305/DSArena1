import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.*;
import java.io.*;
import java.util.List;

public class QuestionGenerator {

    public static void main(String[] args) {
        Map<String, List<Question>> quizData = new HashMap<>();

        // ===== Array Questions =====
List<Question> arrayQuestions = new ArrayList<>();
arrayQuestions.add(new Question("Which of these is a Advantage of arrays?", 
    Arrays.asList("Fixed size", "Random access", "Easy to traverse", "Contiguous memory"), "Fixed size"));
arrayQuestions.add(new Question("What is the index of the first element in an array?", 
    Arrays.asList("0", "1", "-1", "Depends"), "0"));
arrayQuestions.add(new Question("What is the time complexity to access an element by index in an array?", 
    Arrays.asList("O(1)", "O(n)", "O(log n)", "O(n log n)"), "O(1)"));
arrayQuestions.add(new Question("Which Java class allows dynamic resizing like an array?", 
    Arrays.asList("Array", "ArrayList", "LinkedList", "Set"), "ArrayList"));
arrayQuestions.add(new Question("What exception occurs if you access an invalid index in an array?", 
    Arrays.asList("NullPointerException", "ArrayIndexOutOfBoundsException", "ClassCastException", "ArithmeticException"), "ArrayIndexOutOfBoundsException"));
arrayQuestions.add(new Question("Which data structure uses contiguous memory allocation?", 
    Arrays.asList("Array", "Linked List", "Binary Tree", "Graph"), "Array"));
arrayQuestions.add(new Question("What is the default value of an int array in Java?", 
    Arrays.asList("0", "null", "undefined", "-1"), "0"));
arrayQuestions.add(new Question("Which method is used to sort arrays in Java?", 
    Arrays.asList("Arrays.sort()", "sort()", "Collections.sort()", "arraySort()"), "Arrays.sort()"));
arrayQuestions.add(new Question("What does `arr.length` return?", 
    Arrays.asList("Size of array", "Last index", "Array elements", "Memory size"), "Size of array"));
arrayQuestions.add(new Question("Which of these is not a valid array declaration in Java?", 
    Arrays.asList("int[] a = new int[5];", "int a[] = {1,2};", "int a(5);", "int[] a = {1,2};"), "int a(5);"));
arrayQuestions.add(new Question("Which operation is fastest in arrays?", 
    Arrays.asList("Access", "Insertion", "Deletion", "Search"), "Access"));
arrayQuestions.add(new Question("What is the time complexity to insert an element at the end of an array (without resizing)?", 
    Arrays.asList("O(1)", "O(n)", "O(log n)", "O(n log n)"), "O(1)"));
arrayQuestions.add(new Question("Arrays in Java are:", 
    Arrays.asList("Immutable", "Mutable", "Abstract", "Dynamic"), "Mutable"));
arrayQuestions.add(new Question("What is the output of accessing an array index out of bounds?", 
    Arrays.asList("null", "ArrayIndexOutOfBoundsException", "0", "Undefined"), "ArrayIndexOutOfBoundsException"));
arrayQuestions.add(new Question("What is the time complexity of searching for an element in an unsorted array?", 
    Arrays.asList("O(n)", "O(log n)", "O(1)", "O(n log n)"), "O(n)"));
arrayQuestions.add(new Question("How can you declare a 2D array in Java?", 
    Arrays.asList("int[][] arr;", "int[2] arr;", "int arr[];", "int[] arr[];"), "int[][] arr;"));
arrayQuestions.add(new Question("What is the size of an array declared as `int[] arr = new int[10];`?", 
    Arrays.asList("9", "10", "11", "Undefined"), "10"));
arrayQuestions.add(new Question("What keyword is used to get the length of an array in Java?", 
    Arrays.asList("length", "size()", "getLength()", "length()"), "length"));
arrayQuestions.add(new Question("Arrays are stored in which part of memory in Java?", 
    Arrays.asList("Heap", "Stack", "Code segment", "Register"), "Heap"));
arrayQuestions.add(new Question("Can arrays in Java store different data types?", 
    Arrays.asList("Yes", "No", "Only primitive types", "Only objects"), "No"));
arrayQuestions.add(new Question("Which of these is NOT a feature of arrays?", 
    Arrays.asList("Fixed size", "Random access", "Efficient insertion in the middle", "Contiguous memory"), "Efficient insertion in the middle"));
arrayQuestions.add(new Question("Which of these methods can be used to copy arrays in Java?", 
    Arrays.asList("System.arraycopy()", "Arrays.copyOf()", "Manual loop", "All of the above"), "All of the above"));
arrayQuestions.add(new Question("What is the index of the last element in an array of size n?", 
    Arrays.asList("n", "n-1", "1", "0"), "n-1"));
arrayQuestions.add(new Question("What is the default value of boolean array elements in Java?", 
    Arrays.asList("true", "false", "null", "undefined"), "false"));
arrayQuestions.add(new Question("What will happen if you assign an array to another array reference?", 
    Arrays.asList("Both refer to same array", "Copies values", "Compile error", "Runtime error"), "Both refer to same array"));
arrayQuestions.add(new Question("Which of these is a disadvantage of arrays?", 
    Arrays.asList("Fixed size", "Random access", "Easy to traverse", "Contiguous memory"), "Fixed size"));
arrayQuestions.add(new Question("Which of these is a Advantage of arrays?", 
    Arrays.asList("Fixed size", "Random access", "Easy to traverse", "Contiguous memory"), "Fixed size"));
quizData.put("Array", arrayQuestions);


        // ===== Linked List Questions =====
List<Question> linkedListQuestions = new ArrayList<>();
linkedListQuestions.add(new Question("What is the time complexity to insert at the head of a linked list?", 
    Arrays.asList("O(1)", "O(n)", "O(log n)", "O(n log n)"), "O(1)"));
linkedListQuestions.add(new Question("Which pointers are used in a doubly linked list?", 
    Arrays.asList("prev and next", "left and right", "top and bottom", "front and rear"), "prev and next"));
linkedListQuestions.add(new Question("What is a circular linked list?", 
    Arrays.asList("Last node points to first", "Head is null", "Only one node", "None"), "Last node points to first"));
linkedListQuestions.add(new Question("Which data structure is used in undo functionality?", 
    Arrays.asList("Stack", "Queue", "Linked List", "Array"), "Stack"));
linkedListQuestions.add(new Question("Which traversal is not possible in singly linked list?", 
    Arrays.asList("Backward", "Forward", "Search", "Insert"), "Backward"));
linkedListQuestions.add(new Question("What is the head of a linked list?", 
    Arrays.asList("First node", "Last node", "Null", "Middle node"), "First node"));
linkedListQuestions.add(new Question("Which operation takes O(n) in linked list?", 
    Arrays.asList("Search", "Insert at head", "Insert at tail (with tail pointer)", "Traversal"), "Search"));
linkedListQuestions.add(new Question("Which structure allows bidirectional traversal?", 
    Arrays.asList("Doubly linked list", "Singly linked list", "Array", "Queue"), "Doubly linked list"));
linkedListQuestions.add(new Question("Which pointer is null in the last node of singly linked list?", 
    Arrays.asList("next", "prev", "head", "tail"), "next"));
linkedListQuestions.add(new Question("Which of these is not an advantage of linked list?", 
    Arrays.asList("Random access", "Dynamic size", "Efficient insertion", "No memory wastage"), "Random access"));
linkedListQuestions.add(new Question("In a singly linked list, how do you access the previous node?", 
    Arrays.asList("Traverse from head", "Direct pointer", "Using tail pointer", "Not possible"), "Traverse from head"));
linkedListQuestions.add(new Question("What is the time complexity to delete a node in singly linked list if the pointer to node is given?", 
    Arrays.asList("O(1)", "O(n)", "O(log n)", "O(n log n)"), "O(1)"));
linkedListQuestions.add(new Question("Which of these is a disadvantage of linked lists?", 
    Arrays.asList("Random access", "Dynamic size", "Efficient insertions", "Memory efficient"), "Random access"));
linkedListQuestions.add(new Question("What is the key difference between singly and doubly linked lists?", 
    Arrays.asList("Number of pointers", "Data type", "Size", "Traversal"), "Number of pointers"));
linkedListQuestions.add(new Question("Which operation in linked list has O(n) complexity?", 
    Arrays.asList("Search", "Insertion at head", "Insertion at tail (with tail pointer)", "Deletion of first node"), "Search"));
linkedListQuestions.add(new Question("What is a sentinel node in linked lists?", 
    Arrays.asList("Dummy node", "First node", "Last node", "Null node"), "Dummy node"));
linkedListQuestions.add(new Question("Which type of linked list has the last node pointing to the first?", 
    Arrays.asList("Circular", "Singly", "Doubly", "None"), "Circular"));
linkedListQuestions.add(new Question("How is memory allocated in linked lists?", 
    Arrays.asList("Dynamically", "Contiguously", "Statically", "At compile time"), "Dynamically"));
linkedListQuestions.add(new Question("Which linked list traversal can be done backwards?", 
    Arrays.asList("Doubly linked list", "Singly linked list", "Circular singly", "None"), "Doubly linked list"));
linkedListQuestions.add(new Question("What is the space complexity to store n elements in a linked list?", 
    Arrays.asList("O(n)", "O(1)", "O(log n)", "O(n log n)"), "O(n)"));
linkedListQuestions.add(new Question("Which is the first node of a linked list called?", 
    Arrays.asList("Head", "Tail", "Root", "Parent"), "Head"));
linkedListQuestions.add(new Question("Which pointer in a doubly linked list points to the previous node?", 
    Arrays.asList("prev", "next", "head", "tail"), "prev"));
linkedListQuestions.add(new Question("Which of the following is NOT a type of linked list?", 
    Arrays.asList("Singly", "Doubly", "Triply", "Circular"), "Triply"));
linkedListQuestions.add(new Question("What happens when you delete the head node in a linked list?", 
    Arrays.asList("Head moves to next node", "List becomes empty", "Last node becomes head", "Error"), "Head moves to next node"));
linkedListQuestions.add(new Question("In linked list insertion at tail without a tail pointer, the time complexity is:",
Arrays.asList("O(n)", "O(1)", "O(log n)", "O(n log n)"), "O(n)"));

quizData.put("Linked List", linkedListQuestions);



        // ===== String Questions =====

List<Question> stringQuestions = new ArrayList<>();
stringQuestions.add(new Question("Which class in Java represents strings?", 
    Arrays.asList("String", "StringBuilder", "StringBuffer", "All of the above"), "String"));
stringQuestions.add(new Question("Strings in Java are:", 
    Arrays.asList("Immutable", "Mutable", "Abstract", "Dynamic"), "Immutable"));
stringQuestions.add(new Question("What is the output of \"hello\".charAt(1)?", 
    Arrays.asList("e", "h", "l", "o"), "e"));
stringQuestions.add(new Question("Which method is used to compare two strings ignoring case?", 
    Arrays.asList("equalsIgnoreCase()", "compare()", "equals()", "compareTo()"), "equalsIgnoreCase()"));
stringQuestions.add(new Question("Which of these is NOT a string method?", 
    Arrays.asList("substring()", "length()", "append()", "charAt()"), "append()"));
stringQuestions.add(new Question("What does the `length()` method of String return?", 
    Arrays.asList("Number of characters", "Size in bytes", "Memory size", "Array size"), "Number of characters"));
stringQuestions.add(new Question("What is the result of \"abc\" + \"def\"?", 
    Arrays.asList("\"abcdef\"", "\"abc def\"", "\"abc+def\"", "Compile error"), "\"abcdef\""));
stringQuestions.add(new Question("Which method converts a string to uppercase?", 
    Arrays.asList("toUpperCase()", "toUpper()", "uppercase()", "convertUpper()"), "toUpperCase()"));
stringQuestions.add(new Question("How can you get a substring from index 2 to 5?", 
    Arrays.asList("substring(2,5)", "substr(2,5)", "substring(2,6)", "sub(2,5)"), "substring(2,5)"));
stringQuestions.add(new Question("What is the index of the first character in a string?", 
    Arrays.asList("0", "1", "-1", "Depends"), "0"));
stringQuestions.add(new Question("Which operator concatenates two strings in Java?", 
    Arrays.asList("+", "&", "concat()", "."), "+"));
stringQuestions.add(new Question("What is the return type of the `indexOf()` method?", 
    Arrays.asList("int", "String", "boolean", "char"), "int"));
stringQuestions.add(new Question("Which string method removes leading and trailing spaces?", 
    Arrays.asList("trim()", "strip()", "removeSpaces()", "stripLeadingTrailing()"), "trim()"));
stringQuestions.add(new Question("What will \"hello\".equals(\"Hello\") return?", 
    Arrays.asList("false", "true", "Exception", "null"), "false"));
stringQuestions.add(new Question("What is the time complexity to access a character at an index in String?", 
    Arrays.asList("O(1)", "O(n)", "O(log n)", "O(n log n)"), "O(1)"));
stringQuestions.add(new Question("Which string class is thread-safe in Java?", 
    Arrays.asList("StringBuffer", "StringBuilder", "String", "None"), "StringBuffer"));
stringQuestions.add(new Question("What does `toCharArray()` method do?", 
    Arrays.asList("Converts string to char array", "Converts char array to string", "Returns string length", "Returns substring"), "Converts string to char array"));
stringQuestions.add(new Question("Which method checks if a string starts with a particular prefix?", 
    Arrays.asList("startsWith()", "beginsWith()", "prefix()", "start()"), "startsWith()"));
stringQuestions.add(new Question("What will \"Java\".substring(1,3) return?", 
    Arrays.asList("\"av\"", "\"Ja\"", "\"va\"", "\"a\""), "\"av\""));
stringQuestions.add(new Question("Which method converts a string to lowercase?", 
    Arrays.asList("toLowerCase()", "toLower()", "lowercase()", "convertLower()"), "toLowerCase()"));
stringQuestions.add(new Question("What is the result of \"abc\".compareTo(\"abd\")?", 
    Arrays.asList("Negative value", "Positive value", "Zero", "Compile error"), "Negative value"));
stringQuestions.add(new Question("Which method splits a string based on a delimiter?", 
    Arrays.asList("split()", "divide()", "separate()", "cut()"), "split()"));
stringQuestions.add(new Question("How do you get the length of a string variable `s`?", 
    Arrays.asList("s.length()", "s.length", "length(s)", "len(s)"), "s.length()"));
stringQuestions.add(new Question("Which of these is not a valid way to create a string?", 
    Arrays.asList("new String()", "\"text\"", "String s = null;", "String s = '';"), "String s = '';"));
stringQuestions.add(new Question("What is the output of \"hello\".toUpperCase()?", 
    Arrays.asList("\"HELLO\"", "\"hello\"", "\"Hello\"", "Error"), "\"HELLO\""));

quizData.put("String", stringQuestions);


        // ===== BST Questions =====
List<Question> bstQuestions = new ArrayList<>();
bstQuestions.add(new Question("What property does a binary search tree maintain?", 
    Arrays.asList("Left child < parent < right child", "Left child > parent > right child", "No order", "Random order"), "Left child < parent < right child"));
bstQuestions.add(new Question("What is the time complexity of search in a balanced BST?", 
    Arrays.asList("O(log n)", "O(n)", "O(1)", "O(n log n)"), "O(log n)"));
bstQuestions.add(new Question("Which traversal of BST results in sorted order?", 
    Arrays.asList("Inorder", "Preorder", "Postorder", "Level order"), "Inorder"));
bstQuestions.add(new Question("What is the time complexity to insert in BST?", 
    Arrays.asList("O(log n)", "O(n)", "O(1)", "O(n log n)"), "O(log n)"));
bstQuestions.add(new Question("Which is the minimum element in a BST?", 
    Arrays.asList("Leftmost node", "Rightmost node", "Root node", "Leaf node"), "Leftmost node"));
bstQuestions.add(new Question("What is the maximum number of children a node can have in a BST?", 
    Arrays.asList("2", "3", "1", "Unlimited"), "2"));
bstQuestions.add(new Question("Which traversal visits root node first?", 
    Arrays.asList("Preorder", "Inorder", "Postorder", "Level order"), "Preorder"));
bstQuestions.add(new Question("What is the height of a tree with a single node?", 
    Arrays.asList("0", "1", "-1", "Depends"), "0"));
bstQuestions.add(new Question("Which of these is NOT a type of BST?", 
    Arrays.asList("AVL tree", "Red-black tree", "Splay tree", "Heap"), "Heap"));
bstQuestions.add(new Question("Which operation in BST has worst-case time complexity O(n)?", 
    Arrays.asList("Search", "Insert", "Delete", "All"), "All"));
bstQuestions.add(new Question("In a BST, where are elements smaller than root located?", 
    Arrays.asList("Left subtree", "Right subtree", "Both subtrees", "None"), "Left subtree"));
bstQuestions.add(new Question("What is the inorder predecessor of a node in BST?", 
    Arrays.asList("Maximum in left subtree", "Minimum in right subtree", "Parent node", "Sibling node"), "Maximum in left subtree"));
bstQuestions.add(new Question("What happens when you delete a node with two children in BST?", 
    Arrays.asList("Replace with inorder predecessor or successor", "Delete directly", "Replace with root", "Error"), "Replace with inorder predecessor or successor"));
bstQuestions.add(new Question("Which traversal visits nodes level by level?", 
    Arrays.asList("Level order", "Inorder", "Preorder", "Postorder"), "Level order"));
bstQuestions.add(new Question("What is the best case height of a BST with n nodes?", 
    Arrays.asList("log n", "n", "1", "n log n"), "log n"));
bstQuestions.add(new Question("What is the worst case height of a BST?", 
    Arrays.asList("n", "log n", "1", "n log n"), "n"));
bstQuestions.add(new Question("Which of these balances a BST automatically?", 
    Arrays.asList("AVL tree", "Binary tree", "Linked list", "Heap"), "AVL tree"));
bstQuestions.add(new Question("Which of the following is NOT a BST property?", 
    Arrays.asList("Left subtree has smaller keys", "Right subtree has larger keys", "No duplicate keys", "All keys are unique"), "No duplicate keys"));
bstQuestions.add(new Question("Which traversal method can be used to clone a BST?", 
    Arrays.asList("Preorder", "Inorder", "Postorder", "Level order"), "Preorder"));
bstQuestions.add(new Question("What data structure can be used to implement BST traversal iteratively?", 
    Arrays.asList("Stack", "Queue", "Heap", "Array"), "Stack"));
bstQuestions.add(new Question("What is the time complexity to find the minimum element in BST?", 
    Arrays.asList("O(log n)", "O(n)", "O(1)", "O(n log n)"), "O(log n)"));
bstQuestions.add(new Question("Which algorithm can balance a BST?", 
    Arrays.asList("AVL rotation", "Binary search", "Merge sort", "Quick sort"), "AVL rotation"));
bstQuestions.add(new Question("How many children can a node have in a BST?", 
    Arrays.asList("0, 1 or 2", "Exactly 2", "1 or 2 only", "Any number"), "0, 1 or 2"));
bstQuestions.add(new Question("Which of these is a leaf node?", 
    Arrays.asList("Node with no children", "Node with two children", "Root node", "Node with one child"), "Node with no children"));
bstQuestions.add(new Question("What happens if you insert duplicate keys in BST?", 
    Arrays.asList("Usually ignored or placed on right subtree", "Replace existing node", "Create error", "Allowed anywhere"), "Usually ignored or placed on right subtree"));

quizData.put("BST", bstQuestions);

        // ===== Write to JSON =====
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try (FileWriter writer = new FileWriter("newques.json")) {
            gson.toJson(quizData, writer);
            System.out.println("✅ questions.json created successfully!");
        } catch (IOException e) {
            System.out.println("❌ Error writing JSON: " + e.getMessage());
        }
    }
}
