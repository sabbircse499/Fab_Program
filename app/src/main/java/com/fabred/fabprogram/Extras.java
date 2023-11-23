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

public class Extras extends AppCompatActivity {
    private ListView request_list;
    SharedPreferences sharedPreferences;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extras);


        request_list = findViewById(R.id.listview);


        sharedPreferences = getSharedPreferences("fab_program", Context.MODE_PRIVATE);
        String element = sharedPreferences.getString("language", "Nothing");

        sharedPreferences = getSharedPreferences("basic_to_advance", Context.MODE_PRIVATE);


        if(element.equals("c")){

            hashMap = new HashMap<>();
            hashMap.put("name", "1. Memory Address");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "When a variable is created in C, a memory address is assigned to the variable.\n" +
                    "\n" +
                    "The memory address is the location of where the variable is stored on the computer.\n" +
                    "\n" +
                    "When we assign a value to the variable, it is stored in this memory address.\n" +
                    "\n" +
                    "To access it, use the reference operator (&), and the result represents where the variable is stored:\n" +
                    "\n"
            );
            arrayList.add(hashMap);
                    hashMap = new HashMap<>();
                    hashMap.put("name",
                    "Example\n" +
                    "int myAge = 43;\n" +
                    "printf(\"%p\", &myAge); // Outputs 0x7ffe5367e044\n");
                    arrayList.add(hashMap);

                    hashMap = new HashMap<>();
                    hashMap.put("name",
                    "Note: The memory address is in hexadecimal form (0x..). You will probably not get the same result in your program, as this depends on where the variable is stored on your computer.\n" +
                    "\n" +
                    "You should also note that &myAge is often called a \"pointer\". A pointer basically stores the memory address of a variable as its value. To print pointer values, we use the %p format specifier.\n" +
                    "\n" +
                    "You will learn much more about pointers in the next chapter.\n" +
                    "\n" +
                    "Why is it useful to know the memory address?\n" +
                    "Pointers are important in C, because they allow us to manipulate the data in the computer's memory - this can reduce the code and improve the performance.\n" +
                    "\n" +
                    "Pointers are one of the things that make C stand out from other programming languages, like Python and Java.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "2.POINTER\n"+
                    "\n" +
                    "In C, a pointer is a variable that stores the memory address of another variable. Pointers enable dynamic memory allocation, efficient array manipulation, and direct interaction with hardware. They play a crucial role in advanced programming, facilitating efficient memory management and enhancing program flexibility. Declared using the asterisk (*) symbol, pointers can be dereferenced to access the value at the stored memory address. Proper pointer usage is essential for tasks such as dynamic memory allocation and function parameter passing by reference.\n" +
                    ""
            );
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Here are four simple examples demonstrating the use of pointers with output:\n"
                   );
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name",  "2.1 Pointer Declaration and Initialization:\n"+
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "    int x = 5;\n" +
                    "    int *ptr = &x;\n" +
                    "\n" +
                    "    printf(\"Value at the memory location pointed by ptr: %d\\n\", *ptr);\n" +
                    "\n" +
                    "    return 0;\n" +
                    "}\n"+
                    "Output :\n"+
                    "Value at the memory location pointed by ptr: 5\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "2.2 Pointer Arithmetic:\n"+
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "    int arr[] = {1, 2, 3, 4, 5};\n" +
                    "    int *ptr = arr;\n" +
                    "\n" +
                    "    printf(\"Second element using pointer arithmetic: %d\\n\", *(ptr + 1));\n" +
                    "\n" +
                    "    return 0;\n" +
                    "}\n"+
                    "Output\n"+
                    "Second element using pointer arithmetic: 2\n"
            );
            arrayList.add(hashMap);



 hashMap = new HashMap<>();
            hashMap.put("name", "2.3 Dynamic Memory Allocation:\n"+
                            "#include <stdio.h>\n" +
                    "#include <stdlib.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "    int *ptr = (int*)malloc(sizeof(int));\n" +
                    "    *ptr = 10;\n" +
                    "\n" +
                    "    printf(\"Value stored in dynamically allocated memory: %d\\n\", *ptr);\n" +
                    "\n" +
                    "    free(ptr);\n" +
                    "    return 0;\n" +
                    "}\n"+
                            "Output\n"+
                            "Value stored in dynamically allocated memory: 10\n"
            );
            arrayList.add(hashMap);



            hashMap = new HashMap<>();
            hashMap.put("name", "      End Hare c language  Extras  \n"+
                    "        Go Your Next step String \n"+
                    "\uD83D\uDCA0Practice makes perfect Man \uD83D\uDCA0\n"
            );
            arrayList.add(hashMap);




        }

        else if(element.equals("cpp")){
            hashMap = new HashMap<>();
            hashMap.put("name", "C++ Pointer\nThe pointer in C++ language is a variable, it is also known as locator or indicator that points to an address of a value.\n" +
                    "Advantage of pointer\n" +
                    "\n" +
                    "1) Pointer reduces the code and improves the performance, it is used to retrieving strings, trees etc. and used with arrays, structures and functions.\n" +
                    "\n" +
                    "2) We can return multiple values from function using pointer.\n" +
                    "\n" +
                    "3) It makes you able to access any memory location in the computer's memory.Usage of pointer\n" +
                    "\n" +
                    "There are many usage of pointers in C++ language.\n" +
                    "\n" +
                    "1) Dynamic memory allocation\n" +
                    "\n" +
                    "In c language, we can dynamically allocate memory using malloc() and calloc() functions where pointer is used.\n" +
                    "\n" +
                    "2) Arrays, Functions and Structures\n" +
                    "\n" +
                    "Pointers in c language are widely used in arrays, functions and structures. It reduces the code and improves the performance.\n" +
                    "Declaring a pointer : The pointer in C++ language can be declared using ∗ (asterisk symbol).\n" +
                    "\n" +
                    "int ∗   a; //pointer to int\n" +
                    "char ∗  c; //pointer to char");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Let's see the simple example of using pointers printing the address and value.\n" +
                    "\n" +
                    "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main()\n" +
                    "{\n" +
                    "int number=30;\n" +
                    "int ∗   p;\n" +
                    "p=&number;//stores the address of number variable\n" +
                    "cout<<\"Address of number variable is:\"<<&number<<endl;\n" +
                    "cout<<\"Address of p variable is:\"<<p<<endl;\n" +
                    "cout<<\"Value of p variable is:\"<<*p<<endl;\n" +
                    "   return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nAddress of number variable is:0x7ffccc8724c4\n" +
                    "Address of p variable is:0x7ffccc8724c4\n" +
                    "Value of p variable is:30");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Pointer Program to swap 2 numbers without using 3rd variable\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main()\n" +
                    "{string food = \"Pizza\";  // A food variable of type string\n" +
                    "string* ptr = &food;    // A pointer variable, with the name ptr, that stores the address of food\n" +
                    "\n" +
                    "// Output the value of food (Pizza)\n" +
                    "cout << food << \"\\\\n\";\n" +
                    "\n" +
                    "// Output the memory address of food (0x6dfed4)\n" +
                    "cout << &food << \"\\\\n\";\n" +
                    "\n" +
                    "// Output the memory address of food with the pointer (0x6dfed4)\n" +
                    "cout << ptr << \"\\\\n\";\n" +
                    "   return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nPizza\n" +
                    "0x6dfed4\n" +
                    "0x6dfed4");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Example explained\n" +
                    "Create a pointer variable with the name ptr, that points to a string variable, by using the asterisk sign * (string* ptr). Note that the type of the pointer has to match the type of the variable you're working with.\n" +
                    "\n" +
                    "Use the & operator to store the memory address of the variable called food, and assign it to the pointer.\n" +
                    "\n" +
                    "Now, ptr holds the value of food's memory address.");
            arrayList.add(hashMap);



        } else if (element.equals("java")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "Problem Solving\nWrite a Java program to multiply two integers without using multiplication, division, bitwise operators, and loops.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "import java.util.;\n" +
                    "public class solution {\n" +
                    "  public static int multiply_two_nums(int a, int b) { \n" +
                    "\n" +
                    "        / 0 multiplied with anything gives 0 */\n" +
                    "        if (b == 0) \n" +
                    "            return 0; \n" +
                    "\n" +
                    "        if (b > 0) \n" +
                    "            return (a + multiply_two_nums(a, b - 1)); \n" +
                    "\n" +
                    "        if (b < 0) \n" +
                    "            return -multiply_two_nums(a, -b); \n" +
                    "\n" +
                    "        return -1; \n" +
                    "    } \n" +
                    " \n" +
                    "   public static void main(String[] args) {\n" +
                    "        Scanner scan = new Scanner(System.in);\n" +
                    "        System.out.print(\"Input first integer: \");\n" +
                    "        int num1 = scan.nextInt();\n" +
                    "       System.out.print(\"Input second integer: \");\n" +
                    "        int num2 = scan.nextInt();\n" +
                    "        scan.close(); \n" +
                    "       System.out.println(\"Multiply of two integers: \"+multiply_two_nums(num1, num2));\n" +
                    "        }\n" +
                    " }");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\nInput first integer:  5\n" +
                    "Input second integer:  25\n" +
                    "Multiply of two integers: 125");
            arrayList.add(hashMap);





        }else if (element.equals("py")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "Python: Compute the square of first N Fibonacci numbers, use map function and generate a list of the numbers\nFibonacci numbers:\n" +
                    "\n" +
                    "From Wikipedia,\n" +
                    "In mathematics, the Fibonacci numbers, commonly denoted Fn, form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,\n" +
                    "\n" +
                    "F0 = 0,   F1 = 1,\n" +
                    "\n" +
                    "and\n" +
                    "\n" +
                    "Fn = Fn - 1 + Fn - 2,\n" +
                    "\n" +
                    "for n > 1.\n" +
                    "\n" +
                    "The beginning of the sequence is thus:\n" +
                    "\n" +
                    "0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,....");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "import itertools\n" +
                    "n = 10\n" +
                    "def fibonacci_nums(x=0, y=1):\n" +
                    "    yield x\n" +
                    "    while True:\n" +
                    "        yield y\n" +
                    "        x, y = y, x + y\n" +
                    "print(\"First 10 Fibonacci numbers:\")\n" +
                    "result = list(itertools.islice(fibonacci_nums(), n))\n" +
                    "print(result)\n" +
                    "square = lambda x: x * x \n" +
                    "print(\"\\nAfter squaring said numbers of the list:\")\n" +
                    "print(list(map(square, result)))");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n First 10 Fibonacci numbers:\n" +
                    "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]\n" +
                    "\n" +
                    "After squaring said numbers of the list:\n" +
                    "[0, 1, 1, 4, 9, 25, 64, 169, 441, 1156]");
            arrayList.add(hashMap);




        }else if (element.equals("js")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "JavaScript: Get the last element of an array\nWrite a JavaScript function to get the last element of an array. Passing a parameter 'n' will return the last 'n' elements of the array.\n" +
                    "\n" +
                    "Test Data :\n" +
                    "console.log(last([7, 9, 0, -2]));\n" +
                    "console.log(last([7, 9, 0, -2],3));\n" +
                    "console.log(last([7, 9, 0, -2],6));");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "var last =  function(array, n) {\n" +
                    "  if (array == null) \n" +
                    "    return void 0;\n" +
                    "  if (n == null) \n" +
                    "     return array[array.length - 1];\n" +
                    "  return array.slice(Math.max(array.length - n, 0));\n" +
                    "  };\n" +
                    "\n" +
                    "console.log(last([7, 9, 0, -2]));\n" +
                    "console.log(last([7, 9, 0, -2],3));\n" +
                    "console.log(last([7, 9, 0, -2],6));");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n-2\n" +
                    "[9,0,-2]\n" +
                    "[7,9,0,-2]");
            arrayList.add(hashMap);







        }else{

            Toast.makeText(this, "Error app Please Try Again Later", Toast.LENGTH_SHORT).show();
        }












        Extras.MyAdapter myadapter = new Extras.MyAdapter();
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