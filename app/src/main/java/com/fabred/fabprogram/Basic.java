package com.fabred.fabprogram;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

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

public class Basic extends AppCompatActivity {

    private ListView request_list;
    SharedPreferences sharedPreferences;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic);
        request_list = findViewById(R.id.listview);

        sharedPreferences = getSharedPreferences("fab_program", Context.MODE_PRIVATE);
        String element = sharedPreferences.getString("language", "Nothing");


        if(element.equals("c")){

            hashMap = new HashMap<>();
            hashMap.put("name", "      Learn Basic of C  Language ");
            arrayList.add(hashMap);
            //1
            hashMap = new HashMap<>();
            hashMap.put("name", "01.What is C?");
            arrayList.add(hashMap);

//2
            hashMap = new HashMap<>();
            hashMap.put("name", "C is a general-purpose programming language created by Dennis Ritchie at the Bell Laboratories in 1972.\n" +
                    "\n" +
                    "It is a very popular language, despite being old. The main reason for its popularity is because it is a fundamental language in the field of computer science.");
            arrayList.add(hashMap);

//3
            hashMap = new HashMap<>();
            hashMap.put("name", "02.Why Learn C?");
            arrayList.add(hashMap);

//4
            hashMap = new HashMap<>();
            hashMap.put("name", "\uD83D\uDCA0It is one of the most popular programming language in the world\n" +
                    "\uD83D\uDCA0If you know C, you will have no problem learning other popular programming languages such as Java, Python, C++, C#, etc, as the syntax is similar\n" +
                    "\uD83D\uDCA0C is very fast, compared to other programming languages, like Java and Python\n" +
                    "\uD83D\uDCA0C is very versatile; it can be used in both applications and technologies");
            arrayList.add(hashMap);
//5
            hashMap = new HashMap<>();
            hashMap.put("name", "03.Difference between C and C++");
            arrayList.add(hashMap);

            //6

            hashMap = new HashMap<>();
            hashMap.put("name", "\uD83D\uDCA0C++ was developed as an extension of C, and both languages have almost the same syntax\n" +
                    "\uD83D\uDCA0The main difference between C and C++ is that C++ support classes and objects, while C does not");
            arrayList.add(hashMap);
//7
            hashMap = new HashMap<>();
            hashMap.put("name", "04.Get Started With C");
            arrayList.add(hashMap);
//8
            hashMap = new HashMap<>();
            hashMap.put("name", "To start using C, you need two things:\n" +
                    "\n" +
                    "\uD83D\uDCA0A text editor, like Notepad, to write C code\n" +
                    "\uD83D\uDCA0A compiler, like GCC, to translate the C code into a language that the computer will understand\n" +
                    "There are many text editors and compilers to choose from.");
            arrayList.add(hashMap);

//9
            hashMap = new HashMap<>();
            hashMap.put("name", "05.C Install IDE");
            arrayList.add(hashMap);
//10
            hashMap = new HashMap<>();
            hashMap.put("name", "An IDE (Integrated Development Environment) is used to edit AND compile the code.\n" +
                    "\n" +
                    "Popular IDE's include Code::Blocks, Eclipse, and Visual Studio. These are all free, and they can be used to both edit and debug C code.\n" +
                    "\n" +
                    "Note: Web-based IDE's can work as well, but functionality is limited.\n" +
                    "\n" +
                    "We will use Code::Blocks in our tutorial, which we believe is a good place to start.\n" +
                    "\n" +
                    "You can find the latest version of Codeblocks at http://www.codeblocks.org/. Download the mingw-setup.exe file, which will install the text editor with a compiler.\n"+
                    "I think however as a beginner it is better to use DevC++ to compile or run the code"
                    );
            arrayList.add(hashMap);

            //11
            hashMap = new HashMap<>();
            hashMap.put("name", "06.C Quickstart");
            arrayList.add(hashMap);


            //12
            hashMap = new HashMap<>();
            hashMap.put("name", "Let's create our first C file.\n" +
                    "\n" +
                    "Open Codeblocks and go to File > New > Empty File.\n" +
                    "\n" +
                    "Write the following C code and save the file as myfirstprogram.c (File > Save File as):");
            arrayList.add(hashMap);
//13
            hashMap = new HashMap<>();
            hashMap.put("name", "07.SYNTAX");
            arrayList.add(hashMap);



            //14
            hashMap = new HashMap<>();
            hashMap.put("name", "myfirstprogram.c is file name\n" +
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  printf(\"Hello World!\");\n" +
                    "  return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            //15output
            hashMap = new HashMap<>();
            hashMap.put("name", "OUTPUT");
            arrayList.add(hashMap);
//16
            hashMap = new HashMap<>();
            hashMap.put("name", "Hello World!");
            arrayList.add(hashMap);


            //17 NEWLINE
            hashMap = new HashMap<>();
            hashMap.put("name", "08.NEWLINE");
            arrayList.add(hashMap);
//18
            hashMap = new HashMap<>();
            hashMap.put("name", "To insert a new line, you can use the \\n character:");
            arrayList.add(hashMap);
//19 ex 01
            hashMap = new HashMap<>();
            hashMap.put("name", "EXAMPLE 01");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  printf(\"Hello World!\");\n" +
                    "  printf(\"I am learning C.\");\n" +
                    "  return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "OUTPUT");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Hello World ! I am learning c.");
            arrayList.add(hashMap);
//20 ex2
            hashMap = new HashMap<>();
            hashMap.put("name", "EXAMPLE 02");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  printf(\"Hello World!\\n\");\n" +
                    "  printf(\"I am learning C.\");\n" +
                    "  return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "OUTPUT");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Hello World!"+
                    "\n I am learning c.");
            arrayList.add(hashMap);

   //21 ex 03
            hashMap = new HashMap<>();
            hashMap.put("name", "EXAMPLE 03");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  printf(\"Hello World!\\nI am learning C.\\nAnd it is awesome!\");\n" +
                    "  return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "OUTPUT :");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Hello World!"+
                    "\n I am learning c."+
                    "\n And it is awesome!");
            arrayList.add(hashMap);

//22 comment
            hashMap = new HashMap<>();
            hashMap.put("name", "09.C Comments");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Comments can be used to explain code, and to make it more readable. It can also be used to prevent execution when testing alternative code.\n" +
                    "\n" +
                    "Comments can be \n"+
                    "\uD83D\uDCA0singled-lined\n" +
                    "\uD83D\uDCA0 multi-lined.\n"+
            "9.1->Single-line Comments\n" +
                            "Single-line comments start with two forward slashes (//).\n" +
                            "\n" +
                            "Any text between // and the end of the line is ignored by the compiler (will not be executed).\n" +
                            "\n" +
                            "This example uses a single-line comment before a line of code:\n" +
                            "\n" +
                            "Example\n" +
                            "// This is a comment\n" +
                            "#include <stdio.h>\n" +
                            "\n" +
                            "int main() {\n" +
                            "  printf(\"Hello World!\"); // This is a comment\n" +
                            "  return 0;\n" +
                            "}\n"+
                    "output:\n"+
                    "Hello World!"
            );
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "9.2->MULTILINE COMMENT");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C Multi-line Comments\n" +
                    "Multi-line comments start with /* and ends with */.\n" +
                    "\n" +
                    "Any text between /* and */ will be ignored by the compiler:\n" +
                    "\n" +
                    "Example\n" +
                    "/* The code below will print the words Hello World!\n" +
                    "to the screen, and it is amazing */\n" +
                    "printf(\"Hello World!\");\n"+
                    "output:\n"+
                    "Hello World!"
            );
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "10. Variable");
            arrayList.add(hashMap);



            hashMap = new HashMap<>();
            hashMap.put("name", "Variables are containers for storing data values, like numbers and characters.\n" +
                    "\n" +
                    "In C, there are different types of variables (defined with different keywords), for example:\n" +
                    "\n" +
                    "int - stores integers (whole numbers), without decimals, such as 123 or -123\n" +
                    "float - stores floating point numbers, with decimals, such as 19.99 or -19.99\n" +
                    "char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes\n"
                    +"\uD83D\uDCA0Declaring (Creating) Variables\n"+
                    "Syntax\n" +
                    "type variableName = value;");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Example 01\n" +
                    "Create a variable called myNum of type int and assign the value 15 to it:\n" +
                    "\n" +
                    "int myNum = 15;");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name",
                    "You can also declare a variable without assigning the value, and assign the value later:\n\n" +
                            "Example 02\n"+

                    "int myNum; \"// Declare a variable \n" +
                            "myNum = 15;"+
                            "// Assign a value to the variable\n"
                    );
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "In many other programming languages (like Python, Java, and C++), you would normally use a print function to display the value of a variable. However, this is not possible in C:");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name",
                    "Example 03\n"+
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  int myNum = 15;\n" +
                    "  printf(myNum); // Nothing happens\n" +
                    "  return 0;\n" +
                    "}\n"+
                            "Output : 15"

            );
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "11.Format Specifiers(%d,%i,%f,%c)");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "Format specifiers are used together with the printf() function to tell the compiler what type of data the variable is storing. It is basically a placeholder for the variable value.\n" +
                    "\n" +
                    "A format specifier starts with a percentage sign %, followed by a character.\n" +
                    "\n" +
                    "For example, to output the value of an int variable, you must use the format specifier %d or %i surrounded by double quotes, inside the printf() function:\n"+"To print other types, use %c for char and %f for float:");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Example 01:\n"+
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  // Create variables\n" +
                    "  int myNum = 15;              // Integer (whole number)\n" +
                    "  float myFloatNum = 5.99;     // Floating point number\n" +
                    "  char myLetter = 'D';         // Character\n" +
                    "  \n" +
                    "  // Print variables\n" +
                    "  printf(\"%d\\n\", myNum);\n" +
                    "  printf(\"%f\\n\", myFloatNum);\n" +
                    "  printf(\"%c\\n\", myLetter);\n" +
                    "  return 0;\n" +
                    "}\n"+
                    "Output :\n"+
                            "15\n" +
                            "5.990000\n" +
                            "D"
                    );
            arrayList.add(hashMap);



            hashMap = new HashMap<>();
            hashMap.put("name", "12.C Exercises");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name","Ex 01 :\n"+ "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  int x = 5;\n" +
                    "  int y = 6;\n" +
                    "  int sum = x + y;\n" +
                    "  printf(\"%d\", sum);\n" +
                    "  return 0;\n" +
                    "}\n"+
                    "Output: 11");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "13.Declare Multiple Variables\n" +
                    "To declare more than one variable of the same type, use a comma-separated list:\n" +
                    "\n" +
                    "Example\n" +
                    "int x = 5, y = 6, z = 50;\n" +
                    "printf(\"%d\", x + y + z);");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "14.C Variable Names");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "All C variables must be identified with unique names.\n" +
                    "\n" +
                    "These unique names are called identifiers.\n" +
                    "\n" +
                    "Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).\n"+
                    "The general rules for naming variables are:\n" +
                            "\n" +
                            "\uD83D\uDCA0Names can contain letters, digits and underscores\n" +
                            "\uD83D\uDCA0Names must begin with a letter or an underscore (_)\n" +
                            "\uD83D\uDCA0Names are case sensitive (myVar and myvar are different variables)\n" +
                            "\uD83D\uDCA0Names cannot contain whitespaces or special characters like !, #, %, etc.\n" +
                            "\uD83D\uDCA0Reserved words (such as int) cannot be used as names"
                    );
            arrayList.add(hashMap);




            hashMap = new HashMap<>();
            hashMap.put("name", "15.Real-Life Example\n" +
                    "Often in our examples, we simplify variable names to match their data type (myInt or myNum for int types, myChar for char types etc). This is done to avoid confusion.\n" +
                    "\n" +
                    "However, if you want a real-life example on how variables can be used, take a look at the following, where we have made a program that stores different data of a college student:");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name","Example 01\n"+"#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  // Student data\n" +
                    "  int studentID = 15;\n" +
                    "  int studentAge = 23;\n" +
                    "  float studentFee = 75.25;\n" +
                    "  char studentGrade = 'B';\n" +
                    "\n" +
                    "  // Print variables\n" +
                    "  printf(\"Student id: %d\\n\", studentID);\n" +
                    "  printf(\"Student age: %d\\n\", studentAge);\n" +
                    "  printf(\"Student fee: %f\\n\", studentFee);\n" +
                    "  printf(\"Student grade: %c\", studentGrade);\n" +
                    "\n" +
                    "  return 0;\n" +
                    "}\n\n\n"+
                    "Output:\n"+
                    "Student id: 15\n" +
                    "Student age: 23\n" +
                    "Student fee: 75.250000\n" +
                    "Student grade: B");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "16.User Input");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "You have already learned that printf() is used to output values in C.\n" +
                    "\n" +
                    "To get user input, you can use the scanf() function:\n"+
                    "Example :\n"+
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  // Create an integer variable that will store the number we get from the user\n" +
                    "  int myNum;\n" +
                    "\n" +
                    "  // Ask the user to type a number\n" +
                    "  printf(\"Type a number and press enter: \\n\"); \n" +
                    "\n" +
                    "  // Get and save the number the user types\n" +
                    "  scanf(\"%d\", &myNum);\n" +
                    "\n" +
                    "  // Print the number the user typed\n" +
                    "  printf(\"Your number is: %d\", myNum);\n" +
                    "\n" +
                    "  return 0;\n" +
                    "}\n"+
                    "Output :\n"+
                    "Type a number and press enter:(input hare )"
            );
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "17.Multiple Inputs\n"+
                    "The scanf() function also allow multiple inputs (an integer and a character in the following example):"+
                    "Example :\n"+
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  // Create an int and a char variable\n" +
                    "  int myNum;\n" +
                    "  char myChar;\n" +
                    "\n" +
                    "  // Ask the user to type a number AND a character\n" +
                    "  printf(\"Type a number AND a character and press enter: \\n\");\n" +
                    "\n" +
                    "  // Get and save the number AND character the user types\n" +
                    "  scanf(\"%d %c\", &myNum, &myChar);\n" +
                    "\n" +
                    "  // Print the number\n" +
                    "  printf(\"Your number is: %d\\n\", myNum);\n" +
                    "\n" +
                    "  // Print the character\n" +
                    "  printf(\"Your character is: %c\\n\", myChar);\n" +
                    "  \n" +
                    "  return 0;\n" +
                    "}\n"+
                    "Output :\n"+
                    "Type a number AND a character and press enter: 5b\n" +
                    "Your number is: 5\n" +
                    "Your character is: b\n"
            );
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "18.Take String Input\n\n" +
                    "You can also get a string entered by the user:\n"
            +
                            "Note: When working with strings in scanf(), you must specify the size of the string/array (we used a very high number, 30 in our example, but atleast then we are certain it will store enough characters for the first name), and you don't have to use the reference operator (&).\n"+
                    "However, the scanf() function has some limitations: it considers space (whitespace, tabs, etc) as a terminating character, which means that it can only display a single word (even if you type many words). For example:\n"+
                    "From the example above, you would expect the program to print \"John Doe\", but it only prints \"John\".\n" +
                            "\n" +
                            "That's why, when working with strings, we often use the fgets() function to read a line of text. Note that you must include the following arguments: the name of the string variable, sizeof(string_name), and stdin:\n"+
                            "Example :\n"+
                            "#include <stdio.h>\n" +
                            "\n" +
                            "int main() {\n" +
                            "  // Create a string\n" +
                            "  char fullName[30];\n" +
                            "\n" +
                            "  // Ask the user to input some text (full name)\n" +
                            "  printf(\"Type your full name and press enter: \\n\");\n" +
                            "\n" +
                            "  // Get the text\n" +
                            "  fgets(fullName, sizeof(fullName), stdin);\n" +
                            "\n" +
                            "  // Output the text\n" +
                            "  printf(\"Hello %s\", fullName);\n" +
                            "  \n" +
                            "  return 0;\n" +
                            "}\n"+
                            "output\n"
                    +"nter your first name and press enter:\n" +
                            "jhon\n" +
                            "\n" +
                            "Hello jhon"
            );
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "      End Hare your Basic Part \n"+
                    "Go Your Next step Data type \n"+
                    "\uD83D\uDCA0Practice makes perfect Man \uD83D\uDCA0\n"
            );
            arrayList.add(hashMap);




        }






        else if(element.equals("cpp")){

            hashMap = new HashMap<>();
            hashMap.put("name", "      Learn basic of C++ Language ");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Hello World!\n'A \"Hello, World!\" is a simple program that outputs Hello, World! on the screen. Since it's a very simple program, it's often used to introduce a new programming language to a newbie.");
            arrayList.add(hashMap);

           hashMap = new HashMap<>();
            hashMap.put("name", "// Your First C++ Program\n" +
                    "\n" +
                    "#include <iostream>\n" +
                    "\n" +
                    "int main() {\n" +
                    "    std::cout << \"Hello World!\";\n" +
                    "    return 0;\n" +
                    "}");

            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output\nHello World!");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Let us look at the various parts of the above program −\n" +
                    "\n" +
                    "\uD83D\uDCA0 The C++ language defines several headers, which contain information that is either necessary or useful to your program. For this program, the header <iostream> is needed.\n" +
                    "\n" +
                    "\uD83D\uDCA0 The line using namespace std; tells the compiler to use the std namespace. Namespaces are a relatively recent addition to C++.\n" +
                    "\n" +
                    "\uD83D\uDCA0 The next line '// main() is where program execution begins.' is a single-line comment available in C++. Single-line comments begin with // and stop at the end of the line.\n" +
                    "\n" +
                    "\uD83D\uDCA0 The line int main() is the main function where program execution begins.\n" +
                    "\n" +
                    "\uD83D\uDCA0 The next line cout << \"Hello World\"; causes the message \"Hello World\" to be displayed on the screen." +
                    "\uD83D\uDCA0 The next line return 0; terminates main( )function and causes it to return the value 0 to the calling process.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Comments \nC++ supports single-line and multi-line comments. All characters available inside any comment are ignored by C++ compiler.\n" +
                    "\n" +
                    " For example −");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main() {\n" +
                    "   cout << \"Hello World\"; // prints Hello World\n" +
                    "\n" +
                    "   return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output\nHello World");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C++ comments start with /* and end with */.");
            arrayList.add(hashMap);


        } else if (element.equals("java")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "      Learn  Basic of java language ");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "Hello world!\n'In this section, we will learn how to write the simple program of Java. We can write a simple hello Java program easily after installing the JDK.\n" +
                    "\n" +
                    "To create a simple Java program, you need to create a class that contains the main method. Let's understand the requirement first.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "class Hello{\n" +
                    "    public static void main(String args[]){\n" +
                    "     System.out.println(\"Hello World\");\n" +
                    "    }\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\nHello World");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Let's see what is the meaning of class, public, static, void, main, String[], System.out.println().\n" +
                    "\n" +
                    "class keyword is used to declare a class in Java.\n" +
                    "public keyword is an access modifier that represents visibility. It means it is visible to all.\n" +
                    "static is a keyword. If we declare any method as static, it is known as the static method. The core advantage of the static method is that there is no need to create an object to invoke the static method. The main() method is executed by the JVM, so it doesn't require creating an object to invoke the main() method. So, it saves memory.\n" +
                    "void is the return type of the method. It means it doesn't return any value.\n" +
                    "main represents the starting point of the program.\n" +
                    "String[] args or String args[] is used for command line argument. We will discuss it in coming section.\n" +
                    "System.out.println() is used to print statement. Here, System is a class, out is an object of the PrintStream class, println() is a method of the PrintStream class. We will discuss the internal working of System.out.println() statement in the coming section.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Java comments\nComments can be used to explain Java code, and to make it more readable. It can also be used to prevent execution when testing alternative code.\n" +
                    "\n" +
                    "Single-line Comments\n" +
                    "Single-line comments start with two forward slashes (//).\n" +
                    "\n" +
                    "Any text between // and the end of the line is ignored by Java (will not be executed).\n" +
                    "\n" +
                    "This example uses a single-line comment before a line of code:");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "// This is a comment\n" +
                    "System.out.println(\"Hello World\");");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output: \n Hello World");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Single or multi-line comments?\n" +
                    "It is up to you which you want to use. Normally, we use // for short comments, and /* */ for longer.");
            arrayList.add(hashMap);





        }else if (element.equals("py")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "      Learn Basic of Python  Language ");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Hello World\nIn this program, we have used the built-in print() function to print the string Hello, world! on our screen.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "print('Hello, world!')");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output\nHello, world!");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "In this program, we have used the built-in print() function to print the string Hello, world! on our screen.\n" +
                    "A simple program that displays “Hello, World!”. It's often used to illustrate the syntax of the language.");
            arrayList.add(hashMap);




        }else if (element.equals("js")) {
            hashMap = new HashMap<>();
            hashMap.put("name", "Hello World\nIn this example, you will learn to print 'Hello World' in JavaScript in three different ways.\n" +
                    "\n" +
                    "A \"Hello, World!\" is a simple program that prints Hello, World! on the screen. Since it's a very simple program, this program is often used to introduce a new programming language to beginners.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "/ the hello world program\n" +
                    "console.log('Hello World');");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\nHello, World!");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Here, the first line is a comment.\n" +
                    "\n" +
                    "// the hello world program\n" +
                    "The second line\n" +
                    "\n" +
                    "console.log('Hello, World!');\n" +
                    "prints the 'Hello, World!' string to the console.");
            arrayList.add(hashMap);






        }else{

            Toast.makeText(this, "Error app Please Try Again Later", Toast.LENGTH_SHORT).show();
        }


        // Hash Map


        Basic.MyAdapter myadapter = new Basic.MyAdapter();
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
            View Myview = layoutInflater.inflate(R.layout.basic_item, null);
            TextView item = Myview.findViewById(R.id.item_text);

            hashMap = arrayList.get(i);


            item.setText(hashMap.get("name"));


            return Myview;
        }
    }
}