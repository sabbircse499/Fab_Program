package com.fabred.fabprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class Array extends AppCompatActivity {

    private ListView request_list;
    SharedPreferences sharedPreferences;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.array);


        request_list = findViewById(R.id.listview);


        sharedPreferences = getSharedPreferences("fab_program", Context.MODE_PRIVATE);
        String element = sharedPreferences.getString("language", "Nothing");

        sharedPreferences = getSharedPreferences("basic_to_advance", Context.MODE_PRIVATE);


         if(element.equals("c")) {

             hashMap = new HashMap<>();
             hashMap.put("name", " C Arrays\n" +
                     "Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.\n" +
                     "\n" +
                     "To create an array, define the data type (like int) and specify the name of the array followed by square brackets [].\n"

             );
             arrayList.add(hashMap);

                     hashMap=new HashMap<>();
                     hashMap.put("name",
                     "To insert values to array, use a comma-separated list, inside curly braces:\n" +
                     "\n" +
                     "int myNumbers[] = {25, 50, 75, 100};\n" +
                     "We have now created a variable that holds an array of four integers.\n" +
                     "\n" +
                     "Access the Elements of an Array\n" +
                     "To access an array element, refer to its index number.\n" +
                     "\n" +
                     "Array indexes start with 0: [0] is the first element. [1] is the second element, etc.\n" +
                     "\n" +
                     "This statement accesses the value of the first element [0] in myNumbers:\n" +
                     "\n" );
                     arrayList.add(hashMap);


             hashMap=new HashMap<>();
             hashMap.put("name",
                     "Example\n" +
                     "int myNumbers[] = {25, 50, 75, 100};\n" +
                     "printf(\"%d\", myNumbers[0]);\n" +
                     "\n" +
                     "// Outputs 25\n" +
                     "Change an Array Element\n" +
                     "To change the value of a specific element, refer to the index number:\n" +
                     "\n" +
                     "Example\n" +
                     "myNumbers[0] = 33;\n" +
                     "Example\n" +
                     "int myNumbers[] = {25, 50, 75, 100};\n" +
                     "myNumbers[0] = 33;\n" +
                     "\n" +
                     "printf(\"%d\", myNumbers[0]);\n" +
                     "\n" +
                     "// Now outputs 33 instead of 25\n"
             );
             arrayList.add(hashMap);


             hashMap=new HashMap<>();
             hashMap.put("name",
                     "Loop Through an Array\n" +
                     "You can loop through the array elements with the for loop.\n" +
                     "\n" +
                     "The following example outputs all elements in the myNumbers array:\n" +
                     "\n" +
                     "Example\n" +
                     "int myNumbers[] = {25, 50, 75, 100};\n" +
                     "int i;\n" +
                     "\n" +
                     "for (i = 0; i < 4; i++) {\n" +
                     "  printf(\"%d\\n\", myNumbers[i]);\n" +
                     "}\n"
             );
               arrayList.add(hashMap);


             hashMap=new HashMap<>();
             hashMap.put("name",
                     "Set Array Size\n" +
                     "Another common way to create arrays, is to specify the size of the array, and add elements later:\n" +
                     "\n" +
                     "Example\n" +
                     "// Declare an array of four integers:\n" +
                     "int myNumbers[4];\n" +
                     "\n" +
                     "// Add elements\n" +
                     "myNumbers[0] = 25;\n" +
                     "myNumbers[1] = 50;\n" +
                     "myNumbers[2] = 75;\n" +
                     "myNumbers[3] = 100;\n" +
                     "Using this method, you should know the size of the array, in order for the program to store enough memory.\n" +
                     "\n" +
                     "You are not able to change the size of the array after creation.");
             arrayList.add(hashMap);

             hashMap = new HashMap<>();
             hashMap.put("name", "Example :\n"+
                     "In this example, each array element is accessed directly using its index (starting from 0) and printed to the console without using a loop.\n"+
                     "#include <stdio.h>\n" +
                     "\n" +
                     "int main() {\n" +
                     "    // Declaration and initialization of an array\n" +
                     "    int numbers[] = {2, 4, 6, 8, 10};\n" +
                     "\n" +
                     "    // Accessing and printing elements of the array without a loop\n" +
                     "    printf(\"Array elements:\\n\");\n" +
                     "    printf(\"%d\\n\", numbers[0]);\n" +
                     "    printf(\"%d\\n\", numbers[1]);\n" +
                     "    printf(\"%d\\n\", numbers[2]);\n" +
                     "    printf(\"%d\\n\", numbers[3]);\n" +
                     "    printf(\"%d\\n\", numbers[4]);\n" +
                     "\n" +
                     "    return 0;\n" +
                     "}\n"+
                     "OUTPUT :"+
                     "Array elements:\n" +
                     "0\n" +
                     "1\n" +
                     "2\n" +
                     "3\n" +
                     "4\n"
             );
             arrayList.add(hashMap);


             hashMap = new HashMap<>();
             hashMap.put("name", "Ex :\n"+
                     "In this example, an array named numbers is declared and initialized with five integers. The for loop is used to iterate through the array, and each element is printed to the console. Arrays in C are zero-indexed, so the loop runs from 0 to 4 to access all elements.\n"+
                     "#include <stdio.h>\n" +
                             "\n" +
                             "int main() {\n" +
                             "    // Declaration and initialization of an array\n" +
                             "    int numbers[] = {2, 4, 6, 8, 10};\n" +
                             "\n" +
                             "    // Accessing and printing elements of the array\n" +
                             "    printf(\"Array elements:\\n\");\n" +
                             "    for (int i = 0; i < 5; i++) {\n" +
                             "        printf(\"%d\\n\", numbers[i]);\n" +
                             "    }\n" +
                             "\n" +
                             "    return 0;\n" +
                             "}\n\n"+
                     "Output :\n"+
                             "Array elements:\n" +
                             "2\n" +
                             "4\n" +
                             "6\n" +
                             "8\n" +
                             "10\n"
                     );
             arrayList.add(hashMap);

             hashMap = new HashMap<>();
             hashMap.put("name", "      End Hare c language  Array  \n"+
                     "    Go Your Next step Extras \n"+
                     "\uD83D\uDCA0Practice makes perfect Man \uD83D\uDCA0\n"
             );
             arrayList.add(hashMap);


         }

       else if(element.equals("cpp")){
            hashMap = new HashMap<>();
            hashMap.put("name", "C++ Arrays\nIn C++ std::array is a container that encapsulates fixed size arrays. In C++, array index starts from 0. We can store only fixed set of elements in C++ array.\n" +
                    "\n" +
                    "\uD83D\uDCA0 Advantages of C++ Array\n" +
                    "Code Optimization (less code)\n" +
                    "Random Access\n" +
                    "Easy to traverse data\n" +
                    "Easy to manipulate data\n" +
                    "Easy to sort data etc.\n" +
                    "\n" +
                    "\uD83D\uDCA0 Disadvantages of C++ Array\n" +
                    "Fixed size\n" +
                    "C++ Array Types\n" +
                    "There are 2 types of arrays in C++ programming:\n" +
                    "\n" +
                    "\uD83D\uDCA0 Single Dimensional Array\n" +
                    "\uD83D\uDCA0 Multidimensional Array\n" +
                    "\n" +
                    "C++ Single Dimensional Array\n" +
                    "Let's see a simple example of C++ array, where we are going to create, initialize and traverse array.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main()\n" +
                    "{\n" +
                    " int arr[5]={10, 0, 20, 0, 30};  //creating and initializing array\n" +
                    "        //traversing array\n" +
                    "        for (int i = 0; i < 5; i++)\n" +
                    "        {\n" +
                    "            cout<<arr[i]<<\"\\n\";\n" +
                    "        }\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n10\n" +
                    "0\n" +
                    "20\n" +
                    "0\n" +
                    "30");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Traversal using foreach loop\nWe can also traverse the array elements using foreach loop. It returns array element one by one.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main()\n" +
                    "{\n" +
                    " int arr[5]={10, 0, 20, 0, 30}; //creating and initializing array\n" +
                    "        //traversing array\n" +
                    "       for (int i: arr)\n" +
                    "        {\n" +
                    "            cout<<i<<\"\\\\n\";\n" +
                    "        }\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n10\n" +
                    "20\n" +
                    "30\n" +
                    "40\n" +
                    "50");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C++ Passing Array to Function");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "In C++, to reuse the array logic, we can create function. To pass array to function in C++, we need to provide only array name.\n" +
                    "\n" +
                    "functionname(arrayname); //passing array to function\n" +
                    "C++ Passing Array to Function Example: print array elements\n" +
                    "Let's see an example of C++ function which prints the array elements.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "void printArray(int arr[5]);\n" +
                    "int main()\n" +
                    "{\n" +
                    "        int arr1[5] = { 10, 20, 30, 40, 50 };\n" +
                    "        int arr2[5] = { 5, 15, 25, 35, 45 };\n" +
                    "        printArray(arr1); //passing array to function\n" +
                    "        printArray(arr2);\n" +
                    "}\n" +
                    "void printArray(int arr[5])\n" +
                    "{\n" +
                    "    cout << \"Printing array elements:\"<< endl;\n" +
                    "    for (int i = 0; i < 5; i++)\n" +
                    "    {\n" +
                    "                   cout<<arr[i]<<\"\\\\n\";\n" +
                    "    }\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nPrinting array elements:\n" +
                    "10\n" +
                    "20\n" +
                    "30\n" +
                    "40\n" +
                    "50\n" +
                    "Printing array elements:\n" +
                    "5\n" +
                    "15\n" +
                    "25\n" +
                    "35\n" +
                    "45");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C++ Passing Array to Function Example: Print minimum number\nLet's see an example of C++ array which prints minimum number in an array using function.''',\n" +
                    "      sampleProgram: '''#include <iostream>\n" +
                    "using namespace std;\n" +
                    "void  printMin(int arr[5]);\n" +
                    "int main()\n" +
                    "{\n" +
                    "   int arr1[5] = { 30, 10, 20, 40, 50 };\n" +
                    "        int arr2[5] = { 5, 15, 25, 35, 45 };\n" +
                    "        printMin(arr1);//passing array to function\n" +
                    "         printMin(arr2);\n" +
                    "}\n" +
                    "void  printMin(int arr[5])\n" +
                    "{\n" +
                    "    int min = arr[0];\n" +
                    "        for (int i = 0; i > 5; i++)\n" +
                    "        {\n" +
                    "            if (min > arr[i])\n" +
                    "            {\n" +
                    "                min = arr[i];\n" +
                    "            }\n" +
                    "        }\n" +
                    "        cout<< \"Minimum element is: \"<< min <<\"\\n\";\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nMinimum element is: 10\n" +
                    "Minimum element is: 5\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Multidimensional Arrays\nThe multidimensional array is also known as rectangular arrays in C++. It can be two dimensional or three dimensional. The data is stored in tabular form (row ∗ column) which is also known as matrix.\n" +
                    "Multidimensional Array Example\n" +
                    "Let's see a simple example of multidimensional array in C++ which declares, initializes and traverse two dimensional arrays.''',\n" +
                    "      sampleProgram: '''\n" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main()\n" +
                    "{\n" +
                    "  int test[3][3];  //declaration of 2D array\n" +
                    "    test[0][0]=5;  //initialization\n" +
                    "    test[0][1]=10;\n" +
                    "    test[1][1]=15;\n" +
                    "    test[1][2]=20;\n" +
                    "    test[2][0]=30;\n" +
                    "    test[2][2]=10;\n" +
                    "    //traversal\n" +
                    "    for(int i = 0; i < 3; ++i)\n" +
                    "    {\n" +
                    "        for(int j = 0; j < 3; ++j)\n" +
                    "        {\n" +
                    "            cout<< test[i][j]<<\" \";\n" +
                    "        }\n" +
                    "        cout<<\"\\n\"; //new line at each row\n" +
                    "    }\n" +
                    "    return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outp0uts:\n 10 0 \n" +
                            "0 15 20 \n" +
                            "30 0 10\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Multidimensional Array Example: Declaration and initialization at same time\nLet's see a simple example of multidimensional array which initializes array at the time of declaration.''',\n" +
                    "      sampleProgram: '''\n" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main()\n" +
                    "{\n" +
                    "  int test[3][3] =\n" +
                    "    {\n" +
                    "        {2, 5, 5},\n" +
                    "        {4, 0, 3},\n" +
                    "        {9, 1, 8}  };  //declaration and initialization\n" +
                    "    //traversal\n" +
                    "    for(int i = 0; i < 3; ++i)\n" +
                    "    {\n" +
                    "        for(int j = 0; j < 3; ++j)\n" +
                    "        {\n" +
                    "            cout<< test[i][j]<<\" \";\n" +
                    "        }\n" +
                    "        cout<<\"\\\\n\"; //new line at each row\n" +
                    "    }\n" +
                    "    return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs: \n2 5 5 \n" +
                    "4 0 3 \n" +
                    "9 1 8");
            arrayList.add(hashMap);

        } else if (element.equals("java")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "Arrays and ArrayLists\nIndex\n" +
                    "An index refers to an element’s position within an array.\n" +
                    "\n" +
                    "The index of an array starts from 0 and goes up to one less than the total length of the array.\n" +
                    "int[] marks = {50, 55, 60, 70, 80};\n" +
                    " \n" +
                    "System.out.println(marks[0]);\n" +
                    "// Output: 50\n" +
                    " \n" +
                    "System.out.println(marks[4]);\n" +
                    "// Output: 80\n" +
                    "Arrays\n" +
                    "In Java, an array is used to store a list of elements of the same datatype.\n" +
                    "\n" +
                    "Arrays are fixed in size and their elements are ordered.\n" +
                    "// Create an array of 5 int elements\n" +
                    "int[] marks = {10, 20, 30, 40, 50};\n" +
                    "Array creation in Java\n" +
                    "In Java, an array can be created in the following ways:\n" +
                    "\n" +
                    "Using the {} notation, by adding each element all at once.\n" +
                    "Using the new keyword, and assigning each position of the array individually.\n" +
                    "int[] age = {20, 21, 30};\n" +
                    " \n" +
                    "int[] marks = new int[3];\n" +
                    "marks[0] = 50; \n" +
                    "marks[1] = 70;\n" +
                    "marks[2] = 93;\n" +
                    "Changing an Element Value\n" +
                    "To change an element value, select the element via its index and use the assignment operator to set a new value.\n" +
                    "int[] nums = {1, 2, 0, 4};\n" +
                    "// Change value at index 2\n" +
                    "nums[2] = 3;\n" +
                    "Java ArrayList\n" +
                    "In Java, an ArrayList is used to represent a dynamic list.\n" +
                    "\n" +
                    "While Java arrays are fixed in size (the size cannot be modified), an ArrayList allows flexibility by being able to both add and remove elements.\n" +
                    "// import the ArrayList package\n" +
                    "import java.util.ArrayList;\n" +
                    " \n" +
                    "// create an ArrayList called students\n" +
                    "ArrayList<String> students = new ArrayList<String>();\n" +
                    "Modifying ArrayLists in Java\n" +
                    "An ArrayList can easily be modified using built in methods.\n" +
                    "\n" +
                    "To add elements to an ArrayList, you use the add() method. The element that you want to add goes inside of the ().\n" +
                    "\n" +
                    "To remove elements from an ArrayList, you use the remove() method. Inside the () you can specify the index of the element that you want to remove. Alternatively, you can specify directly the element that you want to remove. import java.util.ArrayList;\n" +
                    " \n" +
                    "public class Students {\n" +
                    "  public static void main(String[] args) {\n" +
                    "\n" +
                    "     // create an ArrayList called studentList, which initially holds []\n" +
                    "        ArrayList<String> studentList = new ArrayList<String>();\n" +
                    "\n" +
                    "    // add students to the ArrayList\n" +
                    "    studentList.add(\"John\");\n" +
                    "    studentList.add(\"Lily\");\n" +
                    "    studentList.add(\"Samantha\");\n" +
                    "    studentList.add(\"Tony\");\n" +
                    "\n" +
                    "    // remove John from the ArrayList, then Lily\n" +
                    "    studentList.remove(0);\n" +
                    "    studentList.remove(\"Lily\");\n" +
                    "\n" +
                    "    // studentList now holds [Samantha, Tony]\n" +
                    "\n" +
                    "    System.out.println(studentList);\n" +
                    "  }\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "// Java program to demonstrate differences between\n" +
                    "// Array and ArrayList\n" +
                    " \n" +
                    "// Importing required classes\n" +
                    "import java.util.ArrayList;\n" +
                    "import java.util.Arrays;\n" +
                    " \n" +
                    "// Main class\n" +
                    "class GFG {\n" +
                    "    // Main driver method\n" +
                    "    public static void main(String args[])\n" +
                    "    {\n" +
                    "        // Normal Array\n" +
                    "        // Need to specify the size for array\n" +
                    "        int[] arr = new int[3];\n" +
                    "        arr[0] = 1;\n" +
                    "        arr[1] = 2;\n" +
                    "        arr[2] = 3;\n" +
                    " \n" +
                    "        // We cannot add more elements to array arr[]\n" +
                    " \n" +
                    "        // ArrayList\n" +
                    "        // Need not to specify size\n" +
                    " \n" +
                    "        // Declaring an Arraylist of Integer type\n" +
                    "        ArrayList<Integer> arrL = new ArrayList<Integer>();\n" +
                    " \n" +
                    "        // Adding elements to ArrayList object\n" +
                    "        arrL.add(1);\n" +
                    "        arrL.add(2);\n" +
                    "        arrL.add(3);\n" +
                    "        arrL.add(4);\n" +
                    " \n" +
                    "        // We can add more elements to arrL\n" +
                    " \n" +
                    "        // Print and display Arraylist elements\n" +
                    "        System.out.println(arrL);\n" +
                    "        // Print and display array elements\n" +
                    "        System.out.println(Arrays.toString(arr));\n" +
                    "    }\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\n[1, 2, 3, 4]\n" +
                    "[1, 2, 3]");
            arrayList.add(hashMap);

             hashMap = new HashMap<>();
             hashMap.put("name", "      End Hare c language  ARRAY  \n"+
                     "Go Your Next step Extras \n"+
                     "\uD83D\uDCA0Practice makes perfect Man \uD83D\uDCA0\n"
             );
             arrayList.add(hashMap);



        }else if (element.equals("py")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "Python Array\nAn array is a collection of items stored at contiguous memory locations. The idea is to store multiple items of the same type together. This makes it easier to calculate the position of each element by simply adding an offset to a base value, i.e., the memory location of the first element of the array (generally denoted by the name of the array).\n" +
                    "For simplicity, we can think of an array a fleet of stairs where on each step is placed a value (let’s say one of your friends). Here, you can identify the location of any of your friends by simply knowing the count of the step they are on. Array can be handled in Python by a module named array. They can be useful when we have to manipulate only a specific data type values. A user can treat lists as arrays. However, user cannot constraint the type of elements stored in a list. If you create arrays using the array module, all elements of the array must be of the same type.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "# Python program to demonstrate\n" +
                    "# Creation of Array\n" +
                    " \n" +
                    "# importing \"array\" for array creations\n" +
                    "import array as arr\n" +
                    " \n" +
                    "# creating an array with integer type\n" +
                    "a = arr.array('i', [1, 2, 3])\n" +
                    " \n" +
                    "# printing original array\n" +
                    "print (\"The new created array is : \", end =\" \")\n" +
                    "for i in range (0, 3):\n" +
                    "    print (a[i], end =\" \")\n" +
                    "print()\n" +
                    " \n" +
                    "# creating an array with float type\n" +
                    "b = arr.array('d', [2.5, 3.2, 3.3])\n" +
                    " \n" +
                    "# printing original array\n" +
                    "print (\"The new created array is : \", end =\" \")\n" +
                    "for i in range (0, 3):\n" +
                    "    print (b[i], end =\" \")");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nThe new created array is :  1 2 3 \n" +
                    "The new created array is :  2.5 3.2 3.3");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Array in Python can be created by importing array module. array(data_type, value_list) is used to create an array with data type and value list specified in its arguments.");
            arrayList.add(hashMap);



        }else if (element.equals("js")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "JavaScript Array\nJavaScript array is an object that represents a collection of similar type of elements.\n" +
                    "\n" +
                    "There are 3 ways to construct array in JavaScript\n" +
                    "\n" +
                    "By array literal\n" +
                    "By creating instance of Array directly (using new keyword)\n" +
                    "By using an Array constructor (using new keyword)");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "var i;\n" +
                    "var emp = new Array();\n" +
                    "emp[0] = \"Arun\";\n" +
                    "emp[1] = \"Varun\";\n" +
                    "emp[2] = \"John\";\n" +
                    "\n" +
                    "for (i=0;i<emp.length;i++){\n" +
                    "console.log(emp[i]);\n" +
                    "}\n" +
                    "\n" +
                    "\n" +
                    "let seas = ['Black Sea', 'Caribbean Sea', 'North Sea', 'Baltic Sea'];\n" +
                    "seas.push('Red Sea');\n" +
                    "\n" +
                    "console.log(seas);");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nArun\n" +
                    "Varun\n" +
                    "John\n" +
                    "\n" +
                    "\n" +
                    "[ 'Black Sea', 'Caribbean Sea', 'North Sea', 'Baltic Sea', 'Red Sea' ]");
            arrayList.add(hashMap);






        }else{

            Toast.makeText(this, "Error app Please Try Again Later", Toast.LENGTH_SHORT).show();
        }












        Array.MyAdapter myadapter = new Array.MyAdapter();
        request_list.setAdapter(myadapter);
    }

    // Base Adapter
    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {

            return arrayList.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            //Grid-View Logo


            LayoutInflater layoutInflater = getLayoutInflater();
            View Myview = layoutInflater.inflate(R.layout.item_data_type, null);
            TextView item = Myview.findViewById(R.id.item_text);

            hashMap = arrayList.get(i);


            item.setText(hashMap.get("name"));


            return Myview;
        }
    }
}