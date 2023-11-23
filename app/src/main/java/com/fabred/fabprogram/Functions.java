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

public class Functions extends AppCompatActivity {
    private ListView request_list;
    SharedPreferences sharedPreferences;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.functions);


        request_list = findViewById(R.id.listview);


        sharedPreferences = getSharedPreferences("fab_program", Context.MODE_PRIVATE);
        String element = sharedPreferences.getString("language", "Nothing");

        sharedPreferences = getSharedPreferences("basic_to_advance", Context.MODE_PRIVATE);

        if(element.equals("cpp")){

            hashMap = new HashMap<>();
            hashMap.put("name", "Function in c language\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "1. Function\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "A function is a block of code which only runs when it is called.\n" +
                    "\n" +
                    "You can pass data, known as parameters, into a function.\n" +
                    "\n" +
                    "Functions are used to perform certain actions, and they are important for reusing code: Define the code once, and use it many times.\n" +
                    "\n" +
                    "Predefined Functions\n" +
                    "So it turns out you already know what a function is. You have been using it the whole time while studying this tutorial!\n" +
                    "\n" +
                    "For example, main() is a function, which is used to execute code, and printf() is a function; used to output/print text to the screen:\n" +
                    "\n" +
                    "Example\n" +
                    "int main() {\n" +
                    "  printf(\"Hello World!\");\n" +
                    "  return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "1.1 Create a Function\n" +
                    "To create (often referred to as declare) your own function, specify the name of the function, followed by parentheses () and curly brackets {}:\n" +
                    "\n" +
                    "Syntax\n" +
                    "void myFunction() {\n" +
                    "  // code to be executed\n" +
                    "}\n" +
                    "Example Explained\n" +
                    "myFunction() is the name of the function\n" +
                    "void means that the function does not have a return value. You will learn more about return values later in the next chapter\n" +
                    "Inside the function (the body), add code that defines what the function should do");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Call a Function\n" +
                    "Declared functions are not executed immediately. They are \"saved for later use\", and will be executed when they are called.\n" +
                    "\n" +
                    "To call a function, write the function's name followed by two parentheses () and a semicolon ;\n" +
                    "\n" +
                    "In the following example, myFunction() is used to print a text (the action), when it is called:\n" +
                    "\n" +
                    "Example\n" +
                    "Inside main, call myFunction():\n" +
                    "\n" +
                    "// Create a function\n" +
                    "void myFunction() {\n" +
                    "  printf(\"I just got executed!\");\n" +
                    "}\n" +
                    "\n" +
                    "int main() {\n" +
                    "  myFunction(); // call the function\n" +
                    "  return 0;\n" +
                    "}\n" +
                    "\n" +
                    "// Outputs \"I just got executed!\"");
            arrayList.add(hashMap);



            hashMap = new HashMap<>();
            hashMap.put("name", "A function can be called multiple times:\n" +
                    "\n" +
                    "Example\n" +
                    "void myFunction() {\n" +
                    "  printf(\"I just got executed!\");\n" +
                    "}\n" +
                    "\n" +
                    "int main() {\n" +
                    "  myFunction();\n" +
                    "  myFunction();\n" +
                    "  myFunction();\n" +
                    "  return 0;\n" +
                    "}\n" +
                    "\n" +
                    "Output"+
                    "// I just got executed!\n" +
                    "// I just got executed!\n" +
                    "// I just got executed!");
            arrayList.add(hashMap);



            hashMap = new HashMap<>();
            hashMap.put("name", "1.2 Function Declaration and Definition\n\n" +
                    "You just learned from the previous chapters that you can create and call a function in the following way:\n" +
                    "\n" +
                    "Example\n" +
                    "// Create a function\n" +
                    "void myFunction() {\n" +
                    "  printf(\"I just got executed!\");\n" +
                    "}\n" +
                    "\n" +
                    "int main() {\n" +
                    "  myFunction(); // call the function\n" +
                    "  return 0;\n" +
                    "}\n" +
                    "A function consist of two parts:\n" +
                    "\n" +
                    "Declaration: the function's name, return type, and parameters (if any)\n" +
                    "Definition: the body of the function (code to be executed)\n" +
                    "void myFunction() { // declaration\n" +
                    "  // the body of the function (definition)\n" +
                    "}\n" +
                    "For code optimization, it is recommended to separate the declaration and the definition of the function.\n" +
                    "\n" +
                    "You will often see C programs that have function declaration above main(), and function definition below main(). This will make the code better organized and easier to read:\n" +
                    "\n" +
                    "Example\n" +
                    "// Function declaration\n" +
                    "void myFunction();\n" +
                    "\n" +
                    "// The main method\n" +
                    "int main() {\n" +
                    "  myFunction();  // call the function\n" +
                    "  return 0;\n" +
                    "}\n" +
                    "\n" +
                    "// Function definition\n" +
                    "void myFunction() {\n" +
                    "  printf(\"I just got executed!\");\n" +
                    "}\n" +
                    "Another Example\n" +
                    "If we use the example from the previous chapter regarding function parameters and return values:\n" +
                    "\n" +
                    "Example\n" +
                    "int myFunction(int x, int y) {\n" +
                    "  return x + y;\n" +
                    "}\n" +
                    "\n" +
                    "int main() {\n" +
                    "  int result = myFunction(5, 3);\n" +
                    "  printf(\"Result is = %d\", result);\n" +
                    "  return 0;\n" +
                    "}\n" +
                    "// Outputs 8 (5 + 3)\n" +
                    "It is considered good practice to write it like this instead:\n" +
                    "\n" +
                    "Example\n" +
                    "// Function declaration\n" +
                    "int myFunction(int, int);\n" +
                    "\n" +
                    "// The main method\n" +
                    "int main() {\n" +
                    "  int result = myFunction(5, 3); // call the function\n" +
                    "  printf(\"Result is = %d\", result);\n" +
                    "  return 0;\n" +
                    "}\n" +
                    "\n" +
                    "// Function definition\n" +
                    "int myFunction(int x, int y) {\n" +
                    "  return x + y;\n" +
                    "}\n");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "1.3 C Function Parameters");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "1.3.1  Type of User-defined function Based On Calling \n"+
                    "No argument passed and no return value.\n"+
                    "No argument passed and A return value.\n"+
                    " argument passed and no return value.\n"+
                    " argument passed and A return value.\n"
            );
            arrayList.add(hashMap);



            hashMap = new HashMap<>();
            hashMap.put("name", "\uD83D\uDCA0No argument passed and no return value.\n"+
                    "// no arg pass and no return value\n" +
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int name(){\n" +
                    "int n;\n" +
                    "printf(\"Enter a number : \");\n" +
                    "scanf(\"%d\",&n);\n" +
                    "printf(\"your enterd number is : %d\",n);\n" +
                    "}\n" +
                    "int main(){\n" +
                    "name();\n" +
                    "}\n"

            );
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "No argument passed and A return value.\n"+
                    "//no arg pass and a return value\n" +
                    "\n" +
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int num(){\n" +
                    "int n=10,n1=20;\n" +
                    "int a=n+n1;\n" +
                    "return a;\n" +
                    "}\n" +
                    "int main(){\n" +
                    "int b=num();\n" +
                    "printf(\"sum is :%d\",b);\n" +
                    "}\n"
            );
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", " argument passed and no return value.\n"+
                    "// argument pased but no return value\n" +
                    "#include <stdio.h>\n" +
                    "int num(int a,int b){\n" +
                    "int c=a+b;\n" +
                    "printf(\"sum is :%d\",c);\n" +
                    "}\n" +
                    "int main (){\n" +
                    "num(10,20);\n" +
                    "}\n"
            );
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", " argument passed and A return value.\n"+
                    "// agument passed and return value\n" +
                    "#include <stdio.h>\n" +
                    "float a(int n,int n1,int n2,int n4){\n" +
                    "float c=n+n1+n2+n4;\n" +
                    "float ave=c/4;\n" +
                    "return ave;\n" +
                    "}\n" +
                    "int main(){\n" +
                    "    int n1,n2,n3,n4;\n" +
                    "   float r;\n" +
                    "    scanf(\"%d%d%d%d\",&n1,&n2,&n3, &n4);\n" +
                    "r=a(n1,n2,n3,n4);\n" +
                    "printf(\"average is :%f\",r);\n" +
                    "}\n"
            );
            arrayList.add(hashMap);





            hashMap = new HashMap<>();
            hashMap.put("name", "Parameters and Arguments\n" +
                    "Information can be passed to functions as a parameter. Parameters act as variables inside the function.\n" +
                    "\n" +
                    "Parameters are specified after the function name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma:\n" +
                    "\n" +
                    "Syntax\n" +
                    "returnType functionName(parameter1, parameter2, parameter3) {\n" +
                    "  // code to be executed\n" +
                    "}\n" +
                    "The following function that takes a string of characters with name as parameter. When the function is called, we pass along a name, which is used inside the function to print \"Hello\" and the name of each person.\n"+
                    "Example \n"+
                            "#include <stdio.h>\n" +
                            "\n" +
                            "void myFunction(char name[]) {\n" +
                            "  printf(\"Hello %s\\n\", name);\n" +
                            "}\n" +
                            "\n" +
                            "int main() {\n" +
                            "  myFunction(\"Liam\");\n" +
                            "  myFunction(\"Jenny\");\n" +
                            "  myFunction(\"Anja\");\n" +
                            "  return 0;\n" +
                            "}\n"+
                    "Hello Liam\n" +
                            "Hello Jenny\n" +
                            "Hello Anja\n"
                    );
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "1.4 Multiple Parameters\n"+"Inside the function, you can add as many parameters as you want:\n" +
                    "\n" +
                    "Example\n" +
                    "void myFunction(char name[], int age) {\n" +
                    "  printf(\"Hello %s. You are %d years old.\\n\", name, age);\n" +
                    "}\n" +
                    "\n" +
                    "int main() {\n" +
                    "  myFunction(\"Liam\", 3);\n" +
                    "  myFunction(\"Jenny\", 14);\n" +
                    "  myFunction(\"Anja\", 30);\n" +
                    "  return 0;\n" +
                    "}\n" +
                    "\n" +
                    "// Hello Liam. You are 3 years old.\n" +
                    "// Hello Jenny. You are 14 years old.\n" +
                    "// Hello Anja. You are 30 years old.\n"+
                    "Note that when you are working with multiple parameters, the function call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "1.5 Return Values\n" +
                    "The void keyword, used in the previous examples, indicates that the function should not return a value. If you want the function to return a value, you can use a data type (such as int or float, etc.) instead of void, and use the return keyword inside the function:\n" +
                    "\n" +
                    "Example 01\n" +
                    "int myFunction(int x) {\n" +
                    "  return 5 + x;\n" +
                    "}\n" +
                    "\n" +
                    "int main() {\n" +
                    "  printf(\"Result is: %d\", myFunction(3));\n" +
                    "  return 0;\n" +
                    "}\n" +
                    "\n" +
                    "// Outputs 8 (5 + 3)\n" +
                    "This example returns the sum of a function with two parameters:\n" +
                    "\n" +
                    "Example 02\n" +
                    "int myFunction(int x, int y) {\n" +
                    "  return x + y;\n" +
                    "}\n" +
                    "\n" +
                    "int main() {\n" +
                    "  printf(\"Result is: %d\", myFunction(5, 3));\n" +
                    "  return 0;\n" +
                    "}\n" +
                    "\n" +
                    "// Outputs 8 (5 + 3)\n" +
                    "You can also store the result in a variable:\n" +
                    "\n" +
                    "Example 03\n" +
                    "int myFunction(int x, int y) {\n" +
                    "  return x + y;\n" +
                    "}\n" +
                    "\n" +
                    "int main() {\n" +
                    "  int result = myFunction(5, 3);\n" +
                    "  printf(\"Result is = %d\", result);\n" +
                    "  return 0;\n" +
                    "}\n" +
                    "// Outputs 8 (5 + 3)");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Some Pre defined Function \n"+
                    "scanf(),printf(), gets(), puts(), getchar(), putchar()  The  <stdio.h>  library contains those functions\n"+
                    "sqrt(), pow(), abs(), sin(), cos(), tan(), rand() The <math.h>  library contains those functions\n"+
                    "clrscr(), getch(), putch() The <conio.h>  library contains those functions\n"+
                    "strcpy(), strcat(), strcmp() The <string.h>  library contains those functions\n");

            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "      End Hare c language  Function  \n"+
                    "Go Your Next step Array \n"+
                    "\uD83D\uDCA0Practice makes perfect Man \uD83D\uDCA0\n"
            );
            arrayList.add(hashMap);


        }





        else if(element.equals("cpp")){
            hashMap = new HashMap<>();
            hashMap.put("name", "Function in C++\nhe function in C++ language is also known as procedure or subroutine in other programming languages.\n" +
                    "\n" +
                    "To perform any task, we can create function. A function can be called many times. It provides modularity and code reusability.\n" +
                    "Advantage of functions in C\n" +
                    "There are many advantages of functions.\n" +
                    "\n" +
                    "1) Code Reusability\n" +
                    "\n" +
                    "By creating functions in C++, you can call it many times. So we don't need to write the same code again and again.\n" +
                    "\n" +
                    "2) Code optimization\n" +
                    "\n" +
                    "It makes the code optimized, we don't need to write much code.\n" +
                    "\n" +
                    "Suppose, you have to check 3 numbers (531, 883 and 781) whether it is prime number or not. Without using function, you need to write the prime number logic 3 times. So, there is repetition of code.\n" +
                    "\n" +
                    "But if you use functions, you need to write the logic only once and you can reuse it several times.\n" +
                    "Types of Functions\n" +
                    "There are two types of functions in C programming:\n" +
                    "\n" +
                    "1. Library Functions: are the functions which are declared in the C++ header files such as ceil(x), cos(x), exp(x), etc.\n" +
                    "\n" +
                    "2. User-defined functions: are the functions which are created by the C++ programmer, so that he/she can use it many times. It reduces complexity of a big program and optimizes the code.\n" +
                    "Declaration of a function\n" +
                    "The syntax of creating function in C++ language is given below:");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "void func() {\n" +
                    "   static int i=0; //static variable\n" +
                    "   int j=0; //local variable\n" +
                    "   i++;\n" +
                    "   j++;\n" +
                    "   cout<<\"i=\" << i<<\" and j=\" <<j<<endl;\n" +
                    "}\n" +
                    "int main()\n" +
                    "{\n" +
                    " func();\n" +
                    " func();\n" +
                    " func();\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n\n" +
                    "      sampleProgramOutput: '''i= 1 and j= 1\n" +
                    "i= 2 and j= 1\n" +
                    "i= 3 and j= 1");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "return_type function_name(data_type parameter...)\n" +
                    "{\n" +
                    "//code to be executed\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Call by value in C++\nThere are two ways to pass value or data to function in C language: call by value and call by reference. Original value is not modified in call by value but it is modified in call by reference.\n" +
                    "Let's understand call by value and call by reference in C++ language one by one.\n" +
                    "Call by value in C++\n" +
                    "In call by value, original value is not modified.\n" +
                    "\n" +
                    "In call by value, value being passed to the function is locally stored by the function parameter in stack memory location. If you change the value of function parameter, it is changed for the current function only. It will not change the value of variable inside the caller method such as main().\n" +
                    "\n" +
                    "Let's try to understand the concept of call by value in C++ language by the example given below:");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "void change(int data);\n" +
                    "int main()\n" +
                    "{\n" +
                    "int data = 3;\n" +
                    "change(data);\n" +
                    "cout << \"Value of the data is: \" << data<< endl;\n" +
                    "return 0;\n" +
                    "}\n" +
                    "void change(int data)\n" +
                    "{\n" +
                    "data = 5;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\nValue of the data is: 3");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Call by value in C++\n In call by reference, original value is modified because we pass reference (address).\n" +
                    "\n" +
                    "Here, address of the value is passed in the function, so actual and formal arguments share the same address space. Hence, value changed inside the function, is reflected inside as well as outside the function.\n" +
                    "\n" +
                    "Note: To understand the call by reference, you must have the basic knowledge of pointers.\n" +
                    "\n" +
                    "Let's try to understand the concept of call by reference in C++ language by the example given below:");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include<iostream>\n" +
                    "using namespace std;\n" +
                    "void swap(int *x, int y)\n" +
                    "{\n" +
                    " int swap;\n" +
                    " swap=x;\n" +
                    " x=y;\n" +
                    " *y=swap;\n" +
                    "}\n" +
                    "int main()\n" +
                    "{\n" +
                    " int x=500, y=100;\n" +
                    " swap(&x, &y);  // passing value to function\n" +
                    " cout<<\"Value of x is: \"<<x<<endl;\n" +
                    " cout<<\"Value of y is: \"<<y<<endl;\n" +
                    " return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nValue of x is: 100\n" +
                    "Value of y is: 500");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Function Recursion\n When function is called within the same function, it is known as recursion in C++. The function which calls the same function, is known as recursive function.\n" +
                    "\n" +
                    "A function that calls itself, and doesn't perform any task after function call, is known as tail recursion. In tail recursion, we generally call the same function with return statement.\n" +
                    "\n" +
                    "C++ Recursion Example\n" +
                    "Let's see an example to print factorial number using recursion in C++ language.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include<iostream>\n" +
                    "using namespace std;\n" +
                    "int main()\n" +
                    "{\n" +
                    "int factorial(int);\n" +
                    "int fact,value;\n" +
                    "cout<<\"Enter any number: \";\n" +
                    "cin>>value;\n" +
                    "fact=factorial(value);\n" +
                    "cout<<\"Factorial of a number is: \"<<fact<<endl;\n" +
                    "return 0;\n" +
                    "}\n" +
                    "int factorial(int n)\n" +
                    "{\n" +
                    "if(n<0)\n" +
                    "return(-1); /Wrong value/\n" +
                    "if(n==0)\n" +
                    "return(1);  /Terminating condition/\n" +
                    "else\n" +
                    "{\n" +
                    "return(n*factorial(n-1));\n" +
                    "}\n" +
                    "}");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nEnter any number: 5\n" +
                    "Factorial of a number is: 120");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "recursionfunction(){\n" +
                    "recursionfunction(); //calling self function\n" +
                    "}");
            arrayList.add(hashMap);



        } else if (element.equals("java")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "Java Methods\nIn general, a method is a way to perform some task. Similarly, the method in Java is a collection of instructions that performs a specific task. It provides the reusability of code. We can also easily modify code using methods. In this section, we will learn what is a method in Java, types of methods, method declaration, and how to call a method in Java.\n" +
                    "\n" +
                    "What is a method in Java?\n" +
                    "A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation. It is used to achieve the reusability of code. We write a method once and use it many times. We do not require to write code again and again. It also provides the easy modification and readability of code, just by adding or removing a chunk of code. The method is executed only when we call or invoke it.\n" +
                    "Method Declaration\n" +
                    "The method declaration provides information about method attributes, such as visibility, return-type, name, and arguments. It has six components that are known as method header, as we have shown in the following figure. Method Declaration\n" +
                    "The method declaration provides information about method attributes, such as visibility, return-type, name, and arguments. It has six components that are known as method header, as we have shown in the following figure. Method Signature: Every method has a method signature. It is a part of the method declaration. It includes the method name and parameter list.\n" +
                    "\n" +
                    "Access Specifier: Access specifier or modifier is the access type of the method. It specifies the visibility of the method. Java provides four types of access specifier:\n" +
                    "\n" +
                    "Public: The method is accessible by all classes when we use public specifier in our application.\n" +
                    "Private: When we use a private access specifier, the method is accessible only in the classes in which it is defined.\n" +
                    "Protected: When we use protected access specifier, the method is accessible within the same package or subclasses in a different package.\n" +
                    "Default: When we do not use any access specifier in the method declaration, Java uses default access specifier by default. It is visible only from the same package only.\n" +
                    "Return Type: Return type is a data type that the method returns. It may have a primitive data type, object, collection, void, etc. If the method does not return anything, we use void keyword.\n" +
                    "\n" +
                    "Method Name: It is a unique name that is used to define the name of a method. It must be corresponding to the functionality of the method. Suppose, if we are creating a method for subtraction of two numbers, the method name must be subtraction(). A method is invoked by its name.\n" +
                    "\n" +
                    "Parameter List: It is the list of parameters separated by a comma and enclosed in the pair of parentheses. It contains the data type and variable name. If the method has no parameter, left the parentheses blank.\n" +
                    "\n" +
                    "Method Body: It is a part of the method declaration. It contains all the actions to be performed. It is enclosed within the pair of curly braces.\n" +
                    "\n" +
                    "Naming a Method\n" +
                    "While defining a method, remember that the method name must be a verb and start with a lowercase letter. If the method name has more than two words, the first name must be a verb followed by adjective or noun. In the multi-word method name, the first letter of each word must be in uppercase except the first word. For example:\n" +
                    "\n" +
                    "Single-word method name: sum(), area()\n" +
                    "\n" +
                    "Multi-word method name: areaOfCircle(), stringComparision()\n" +
                    "\n" +
                    "It is also possible that a method has the same name as another method name in the same class, it is known as method overloading.\n" +
                    "\n" +
                    "Types of Method\n" +
                    "There are two types of methods in Java:\n" +
                    "\n" +
                    "Predefined Method\n" +
                    "User-defined Method\n" +
                    "Predefined Method\n" +
                    "In Java, predefined methods are the method that is already defined in the Java class libraries is known as predefined methods. It is also known as the standard library method or built-in method. We can directly use these methods just by calling them in the program at any point. Some pre-defined methods are length(), equals(), compareTo(), sqrt(), etc. When we call any of the predefined methods in our program, a series of codes related to the corresponding method runs in the background that is already stored in the library.\n" +
                    "\n" +
                    "Each and every predefined method is defined inside a class. Such as print() method is defined in the java.io.PrintStream class. It prints the statement that we write inside the method. For example, print(\"Java\"), it prints Java on the console.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "//user defined method\n" +
                    "public static void findEvenOdd(int num)\n" +
                    "{\n" +
                    "//method body\n" +
                    "if(num%2==0)\n" +
                    "System.out.println(num+\" is even\");\n" +
                    "else\n" +
                    "System.out.println(num+\" is odd\");\n" +
                    "}\n" +
                    "We have defined the above method named findevenodd(). It has a parameter num of type int. The method does not return any value that's why we have used void. The method body contains the steps to check the number is even or odd. If the number is even, it prints the number is even, else prints the number is odd.\n" +
                    "import java.util.Scanner;\n" +
                    "public class EvenOdd\n" +
                    "{\n" +
                    "public static void main (String args[])\n" +
                    "{\n" +
                    "//creating Scanner class object\n" +
                    "Scanner scan=new Scanner(System.in);\n" +
                    "System.out.print(\"Enter the number: \");\n" +
                    "//reading value from user\n" +
                    "int num=scan.nextInt();\n" +
                    "//method calling\n" +
                    "findEvenOdd(num);\n" +
                    "}\n" +
                    "//user defined method\n" +
                    "public static void findEvenOdd(int num)\n" +
                    "{\n" +
                    "//method body\n" +
                    "if(num%2==0)\n" +
                    "System.out.println(num+\" is even\");\n" +
                    "else\n" +
                    "System.out.println(num+\" is odd\");\n" +
                    "}\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\nnter the number: 12\n" +
                    "12 is even");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "We have defined the above method named findevenodd(). It has a parameter num of type int. The method does not return any value that's why we have used void. The method body contains the steps to check the number is even or odd. If the number is even, it prints the number is even, else prints the number is odd.");
            arrayList.add(hashMap);



        }else if (element.equals("py")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "Python Function\nA function is a block of code which only runs when it is called.\n" +
                    "\n" +
                    "You can pass data, known as parameters, into a function.\n" +
                    "\n" +
                    "A function can return data as a result.\n" +
                    "\n" +
                    "Creating a Function\n" +
                    "In Python a function is defined using the def keyword:\n" +
                    "\n" +
                    "Example\n" +
                    "def my_function():\n" +
                    "  print(\"Hello from a function\")\n" +
                    "Calling a Function\n" +
                    "To call a function, use the function name followed by parenthesis:\n" +
                    "\n" +
                    "Example\n" +
                    "def my_function():\n" +
                    "  print(\"Hello from a function\")\n" +
                    "\n" +
                    "my_function()");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#!/usr/bin/python\n" +
                    "\n" +
                    "# Function definition is here\n" +
                    "def changeme( mylist ):\n" +
                    "   \"This changes a passed list into this function\"\n" +
                    "   mylist = [1,2,3,4]; # This would assig new reference in mylist\n" +
                    "   print \"Values inside the function: \", mylist\n" +
                    "   return\n" +
                    "\n" +
                    "# Now you can call changeme function\n" +
                    "mylist = [10,20,30];\n" +
                    "changeme( mylist );\n" +
                    "print \"Values outside the function: \", mylist");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nValues inside the function:  [1, 2, 3, 4]\n" +
                    "Values outside the function:  [10, 20, 30]");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "The parameter mylist is local to the function changeme. Changing mylist within the function does not affect mylist.");
            arrayList.add(hashMap);



        }else if (element.equals("js")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "JS Function\nJavaScript provides functions similar to most of the scripting and programming languages.\n" +
                    "\n" +
                    "In JavaScript, a function allows you to define a block of code, give it a name and then execute it as many times as you want.\n" +
                    "\n" +
                    "A JavaScript function can be defined using function keyword.\n" +
                    "\n" +
                    "Syntax:\n" +
                    "//defining a function\n" +
                    "function <function-name>()\n" +
                    "{\n" +
                    "    // code to be executed\n" +
                    "};\n" +
                    "\n" +
                    "//calling a function\n" +
                    "<function-name>();");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "function ShowMessage(firstName, lastName) {\n" +
                    "    alert(\"Hello \" + firstName + \" \" + lastName);\n" +
                    "}\n" +
                    "\n" +
                    "ShowMessage(\"Steve\", \"Jobs\");");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nHello Steve Jobs");
            arrayList.add(hashMap);



        }else{

            Toast.makeText(this, "Error app Please Try Again Later", Toast.LENGTH_SHORT).show();
        }












        Functions.MyAdapter myadapter = new Functions.MyAdapter();
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