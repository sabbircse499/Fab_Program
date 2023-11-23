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

public class Loops extends AppCompatActivity {

    private ListView request_list;
    SharedPreferences sharedPreferences;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oops);

        request_list = findViewById(R.id.listview);


        sharedPreferences = getSharedPreferences("fab_program", Context.MODE_PRIVATE);
        String element = sharedPreferences.getString("language", "Nothing");

        sharedPreferences = getSharedPreferences("basic_to_advance", Context.MODE_PRIVATE);

        if(element.equals("c")){
            hashMap=new HashMap<>();
            hashMap.put("name",
                    "LOOP  in C language");
            arrayList.add(hashMap);

            hashMap=new HashMap<>();
            hashMap.put("name",
                    "Loops can execute a block of code as long as a specified condition is reached.\n" +
                            "\n" +
                            "Loops are handy because they save time, reduce errors, and they make code more readable.");
            arrayList.add(hashMap);
            hashMap=new HashMap<>();
            hashMap.put("name",
                    "1. While Loop\n"+
                            "\n" +
                            "In C, a while loop is used to repeatedly execute a block of code as long as a specified condition is true.\n"+
                            "Syntax\n" +
                            "while (condition) {\n" +
                            "  // code block to be executed\n" +
                            "}\n"+
                            "Example : \n"+
                            "#include <stdio.h>\n" +
                            "\n" +
                            "int main() {\n" +
                            "    int count = 1;\n" +
                            "\n" +
                            "    // Example of a while loop\n" +
                            "    while (count <= 5) {\n" +
                            "        printf(\"Count: %d\\n\", count);\n" +
                            "        count++;\n" +
                            "    }\n" +
                            "\n" +
                            "    return 0;\n" +
                            "}\n"+
                            "output : "+
                            "Count: 1\n" +
                            "Count: 2\n" +
                            "Count: 3\n" +
                            "Count: 4\n" +
                            "Count: 5\n"+
                            "In this example, the while loop iterates as long as the count variable is less than or equal to 5, printing the current count in each iteration. The count++ statement increments the count in each loop iteration.\n"+
                            "#include <stdio.h>\n" +
                            "\n" +
                            "int main() {\n" +
                            "    int count = 1;\n" +
                            "\n" +
                            "    while (count <= 100) {\n" +
                            "        printf(\"This is message number %d\\n\", count);\n" +
                            "        count++;\n" +
                            "    }\n" +
                            "\n" +
                            "    return 0;\n" +
                            "}\n"+

                            "100 time printf function or statement run "

                    );
            arrayList.add(hashMap);


            hashMap=new HashMap<>();
            hashMap.put("name",
                    "FOR LOOP");
            arrayList.add(hashMap);


            hashMap=new HashMap<>();
            hashMap.put("name",
                    "When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:\n" +
                            "\n" +
                            "Syntax\n" +
                            "for (statement 1; statement 2; statement 3) {\n" +
                            "  // code block to be executed\n" +
                            "}\n" +
                            "Statement 1 is executed (one time) before the execution of the code block.\n" +
                            "\n" +
                            "Statement 2 defines the condition for executing the code block.\n" +
                            "\n" +
                            "Statement 3 is executed (every time) after the code block has been executed.\n" +
                            "\n" +
                            "The example below will print the numbers 0 to 4:\n" +
                            "\n" +
                            "Example: \n"+
                            "#include <stdio.h>\n" +
                            "\n" +
                            "int main() {\n" +
                            "  int i;\n" +
                            "\n" +
                            "  for (i = 0; i < 5; i++) {\n" +
                            "    printf(\"%d\\n\", i);\n" +
                            "  }\n" +
                            "  \n" +
                            "  return 0;\n" +
                            "}\n"+
                            "Output :\n"+
                            "0\n" +
                            "1\n" +
                            "2\n" +
                            "3\n" +
                            "4\n\n"+
                            "Example: "+
                            "#include <stdio.h>\n" +
                            "\n" +
                            "int main() {\n" +
                            "    int sum = 0;\n" +
                            "\n" +
                            "    // Calculate the sum using a for loop\n" +
                            "    for (int i = 1; i <= 5; i++) {\n" +
                            "        sum += i;\n" +
                            "    }\n" +
                            "\n" +
                            "    // Print the result\n" +
                            "    printf(\"Sum of numbers from 1 to 5: %d\\n\", sum);\n" +
                            "\n" +
                            "    return 0;\n" +
                            "}\n"+
                            "Output :"+
                            "Sum of numbers from 1 to 5: 15\n\n"+
                            "Example 3 :"+
                            "#include<stdio.h>\n" +
                            "int main(){\n" +
                            "int i,num,f=1;\n" +
                            "printf(\"which number number need factorial :\");\n" +
                            "scanf(\"%d\",&num);\n" +
                            "\n" +
                            "for (i=1;i<=num;i++){\n" +
                            "\n" +
                            "    f=f*i;\n" +
                            "\n" +
                            "}\n" +
                            "printf(\" factorial is :%d\",f);\n" +
                            "\n" +
                            "}\n"+
                            "Output : find ?"
            );
            arrayList.add(hashMap);

            hashMap=new HashMap<>();
            hashMap.put("name",
                    "1.3 Do While Loop");
            arrayList.add(hashMap);

            hashMap=new HashMap<>();
            hashMap.put("name",
                    "In C, a do-while loop is used to repeatedly execute a block of code while a specified condition is true. Unlike the while loop, the do-while loop guarantees that the block of code is executed at least once. Here's a simple example with code and output:\n"+
                            "The syntax for a do-while loop in C is as follows:\n" +
                            "\n" +
                            "c\n" +
                            "Copy code\n" +
                            "do {\n" +
                            "    // code to be executed\n" +
                            "} while (condition);\n" +
                            "The do keyword marks the beginning of the loop.\n" +
                            "The code block inside the curly braces {} contains the statements to be executed.\n" +
                            "The while keyword is followed by a condition in parentheses. The loop continues to execute as long as this condition is true.\n" +
                            "A semicolon (;) terminates the do-while loop.\n" +
                            "This loop structure ensures that the code block is executed at least once, as the condition is checked after the execution of the loop body.");
            arrayList.add(hashMap);

            hashMap=new HashMap<>();
            hashMap.put("name",
                    "Example :\n\n"+
                            "\n" +
                            "Certainly! Here's an example of a do-while loop in C that calculates the sum of numbers from 1 to n:\n"+
                            "#include <stdio.h>\n" +
                            "\n" +
                            "int main() {\n" +
                            "    int n, sum = 0;\n" +
                            "\n" +
                            "    // Input: Get the value of n\n" +
                            "    printf(\"Enter a positive integer (n): \");\n" +
                            "    scanf(\"%d\", &n);\n" +
                            "\n" +
                            "    // Validate if n is a positive integer\n" +
                            "    if (n <= 0) {\n" +
                            "        printf(\"Please enter a positive integer.\\n\");\n" +
                            "        return 1; // Exit the program with an error code\n" +
                            "    }\n" +
                            "\n" +
                            "    // Calculate the sum using a do-while loop\n" +
                            "    int i = 1;\n" +
                            "    do {\n" +
                            "        sum += i;\n" +
                            "        i++;\n" +
                            "    } while (i <= n);\n" +
                            "\n" +
                            "    // Output: Print the result\n" +
                            "    printf(\"Sum of numbers from 1 to %d: %d\\n\", n, sum);\n" +
                            "\n" +
                            "    return 0;\n" +
                            "}\n"+
                            "Output = find ?"+
                            "example 2:\n"+
                            "\n" +
                            "Certainly! Here's another simple example of a do-while loop in C that prints even numbers from 2 to 10:\n"+
                            "#include <stdio.h>\n" +
                            "\n" +
                            "int main() {\n" +
                            "    int number = 2;\n" +
                            "\n" +
                            "    printf(\"Even numbers from 2 to 10:\\n\");\n" +
                            "\n" +
                            "    // Example of a do-while loop\n" +
                            "    do {\n" +
                            "        printf(\"%d\\n\", number);\n" +
                            "        number += 2;\n" +
                            "    } while (number <= 10);\n" +
                            "\n" +
                            "    return 0;\n" +
                            "}\n"+
                            "Output :\n"+
                            "Even numbers from 2 to 10:\n" +
                            "2\n" +
                            "4\n" +
                            "6\n" +
                            "8\n" +
                            "10\n");
            arrayList.add(hashMap);








            hashMap=new HashMap<>();
            hashMap.put("name",
                    "1.4 Nested Loop");
            arrayList.add(hashMap);

            hashMap=new HashMap<>();
            hashMap.put("name",
                    "Nested Loops\n" +
                            "It is also possible to place a loop inside another loop. This is called a nested loop.\n" +
                            "\n" +
                            "The \"inner loop\" will be executed one time for each iteration of the \"outer loop\":\n"+
                            "Example :\n"+
                            "#include <stdio.h>\n" +
                            "\n" +
                            "int main() {\n" +
                            "  int i, j;\n" +
                            "  \n" +
                            "  // Outer loop\n" +
                            "  for (i = 1; i <= 2; ++i) {\n" +
                            "    printf(\"Outer: %d\\n\", i);  // Executes 2 times\n" +
                            "    \n" +
                            "    // Inner loop\n" +
                            "    for (j = 1; j <= 3; ++j) {\n" +
                            "      printf(\" Inner: %d\\n\", j);  // Executes 6 times (2 * 3)\n" +
                            "    }\n" +
                            "  }\n" +
                            "  \n" +
                            "  return 0;\n" +
                            "}\n"+
                            "OUTPUT :\n"+
                            "Outer: 1\n" +
                            " Inner: 1\n" +
                            " Inner: 2\n" +
                            " Inner: 3\n" +
                            "Outer: 2\n" +
                            " Inner: 1\n" +
                            " Inner: 2\n" +
                            " Inner: 3");
            arrayList.add(hashMap);




            hashMap = new HashMap<>();
            hashMap.put("name", "      End Hare c language  Condition  \n"+
                    "Go Your Next step Loop \n"+
                    "\uD83D\uDCA0Practice makes perfect Man \uD83D\uDCA0\n"
            );
            arrayList.add(hashMap);


        }

        else if(element.equals("cpp")){
            hashMap = new HashMap<>();
            hashMap.put("name", "For Loop\nThe C++ for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop than while or do-while loops.\n" +
                    "\n" +
                    "The C++ for loop is same as C/C#. We can initialize variable, check condition and increment/decrement value.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main() {\n" +
                    "         for(int i=1;i<=10;i++){\n" +
                    "            cout<<i <<\"\\\\n\";\n" +
                    "          }\n" +
                    "    }");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n1\n" +
                    "2\n" +
                    "3\n" +
                    "4\n" +
                    "5\n" +
                    "6\n" +
                    "7\n" +
                    "8\n" +
                    "9\n" +
                    "10");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "for(initialization; condition; incr/decr){}\n" +
                    "//code to be executed");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Nested For Loop\nIn C++, we can use for loop inside another for loop, it is known as nested for loop. Let's see a simple example of nested for loop in C++.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main () {\n" +
                    "        for(int i=1;i<=3;i++){\n" +
                    "             for(int j=1;j<=3;j++){\n" +
                    "            cout<<i<<\" \"<<j<<\"\\\\n\";\n" +
                    "          }\n" +
                    "        }\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n1  1\n" +
                    "1  2\n" +
                    "1  3\n" +
                    "2  1\n" +
                    "2  2 \n" +
                    "2  3\n" +
                    "3  1\n" +
                    "3  2\n" +
                    "3  3");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "The inner loop is executed fully when outer loop is executed one time. So if outer loop and inner loop are executed 4 times, inner loop will be executed 4 times for each outer loop i.e. total 16 times.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Infinite For Loop\nIf we use double semicolon in for loop, it will be executed infinite times. Let's see a simple example of infinite for loop in C++.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main () {\n" +
                    "        for ( ; ; )\n" +
                    "          {\n" +
                    "                  cout<<\"Infinitive For Loop\";\n" +
                    "          }\n" +
                    "}\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nInfinitive For Loop\n" +
                    "Infinitive For Loop\n" +
                    "Infinitive For Loop\n" +
                    "Infinitive For Loop\n" +
                    "Infinitive For Loop\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "While Loop\nn C++, while loop is used to iterate a part of the program several times. If the number of iteration is not fixed, it is recommended to use while loop than for loop.\n" +
                    "\n" +
                    "C++ While Loop Example\n" +
                    "Let's see a simple example of while loop to print table of 1.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main() {\n" +
                    " int i=1;\n" +
                    "         while(i<=10)\n" +
                    "       {\n" +
                    "            cout<<i <<\"\\\\n\";\n" +
                    "            i++;\n" +
                    "          }\n" +
                    "    }");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n1\n" +
                    "2\n" +
                    "3\n" +
                    "4\n" +
                    "5\n" +
                    "6\n" +
                    "7\n" +
                    "8\n" +
                    "9\n" +
                    "10");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "while(condition){\n" +
                    "//code to be executed\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Nested While Loop\nIn C++, we can use while loop inside another while loop, it is known as nested while loop. The nested while loop is executed fully when outer loop is executed once.\n" +
                    "\n" +
                    "Let's see a simple example of nested while loop in C++ programming language.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main () {\n" +
                    "        int i=1;\n" +
                    "          while(i<=3)\n" +
                    "          {\n" +
                    "              int j = 1;\n" +
                    "              while (j <= 3)\n" +
                    "{\n" +
                    "            cout<<i<<\" \"<<j<<\"\\\\n\";\n" +
                    "            j++;\n" +
                    "          }\n" +
                    "           i++;\n" +
                    "        }\n" +
                    "    }");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n1 1\n" +
                    "1 2\n" +
                    "1 3\n" +
                    "2 1\n" +
                    "2 2 \n" +
                    "2 3\n" +
                    "3 1\n" +
                    "3 2\n" +
                    "3 3");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Do-While Loop\nThe C++ do-while loop is used to iterate a part of the program several times. If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use do-while loop.\n" +
                    "\n" +
                    "The C++ do-while loop is executed at least once because condition is checked after loop body.\n" +
                    "Let's see a simple example of nested do-while loop in C++.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "\n" +
                    "      sampleProgram: '''#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main() {\n" +
                    "     int i = 1;\n" +
                    "          do{\n" +
                    "              cout<<i<<\"\\\\n\";\n" +
                    "              i++;\n" +
                    "          } while (i <= 10) ;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n1 1\n" +
                    "1 2\n" +
                    "1 3\n" +
                    "2 1\n" +
                    "2 2 \n" +
                    "2 3\n" +
                    "3 1\n" +
                    "3 2\n" +
                    "3 3");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "do{\n" +
                    "//code to be executed\n" +
                    "}while(condition);");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "reak Statement\nLet's see a simple example of C++ break statement which is used inside the loop.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main() {\n" +
                    "      for (int i = 1; i <= 10; i++)\n" +
                    "          {\n" +
                    "              if (i == 5)\n" +
                    "              {\n" +
                    "                  break;\n" +
                    "              }\n" +
                    "        cout<<i<<\"\\\\n\";\n" +
                    "          }\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs: \n1\n" +
                    "2\n" +
                    "3\n" +
                    "4");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Continue Statement\nThe C++ continue statement is used to continue loop. It continues the current flow of the program and skips the remaining code at specified condition. In case of inner loop, it continues only inner loop.\n" +
                    "\n" +
                    "jump-statement;\n" +
                    "continue;");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main()\n" +
                    "{\n" +
                    "     for(int i=1;i<=10;i++){\n" +
                    "            if(i==5){\n" +
                    "                continue;\n" +
                    "            }\n" +
                    "            cout<<i<<\"\\\\n\";\n" +
                    "        }\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n1\n" +
                    "2\n" +
                    "3\n" +
                    "4\n" +
                    "6\n" +
                    "7\n" +
                    "8\n" +
                    "9\n" +
                    "10");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Goto Statement\nThe C++ goto statement is also known as jump statement. It is used to transfer control to the other part of the program. It unconditionally jumps to the specified label.\n" +
                    "\n" +
                    "It can be used to transfer control from deeply nested loop or switch case label.\n" +
                    "C++ Goto Statement Example\n" +
                    "Let's see the simple example of goto statement in C++.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main()\n" +
                    "{\n" +
                    "ineligible:\n" +
                    "         cout<<\"You are not eligible to vote!\\\\n\";\n" +
                    "      cout<<\"Enter your age:\\\\n\";\n" +
                    "      int age;\n" +
                    "      cin>>age;\n" +
                    "      if (age < 18){\n" +
                    "              goto ineligible;\n" +
                    "      }\n" +
                    "      else\n" +
                    "      {\n" +
                    "              cout<<\"You are eligible to vote!\";\n" +
                    "      }\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nYou are not eligible to vote!\n" +
                    "Enter your age:\n" +
                    "16\n" +
                    "You are not eligible to vote!\n" +
                    "Enter your age:\n" +
                    "7\n" +
                    "You are not eligible to vote!\n" +
                    "Enter your age:\n" +
                    "22\n" +
                    "You are eligible to vote!");
            arrayList.add(hashMap);




        } else if (element.equals("java")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "Loops in Java\nThe Java for loop is used to iterate a part of the program several times. If the number of iteration is fixed, it is recommended to use for loop.\n" +
                    "\n" +
                    "There are three types of for loops in Java.\n" +
                    "\n" +
                    "Loops in Java\n" +
                    "Simple for Loop\n" +
                    "For-each or Enhanced for Loop\n" +
                    "Labeled for Loop\n" +
                    "Java Simple for Loop\n" +
                    "A simple for loop is the same as C/C++. We can initialize the variable, check condition and increment/decrement value. It consists of four parts:\n" +
                    "\n" +
                    "Initialization: It is the initial condition which is executed once when the loop starts. Here, we can initialize the variable, or we can use an already initialized variable. It is an optional condition.\n" +
                    "Condition: It is the second condition which is executed each time to test the condition of the loop. It continues execution until the condition is false. It must return boolean value either true or false. It is an optional condition.\n" +
                    "Increment/Decrement: It increments or decrements the variable value. It is an optional condition.\n" +
                    "Statement: The statement of the loop is executed each time until the second condition is false.\n" +
                    "Syntax:\n" +
                    "\n" +
                    "for(initialization; condition; increment/decrement){\n" +
                    "//statement or code to be executed\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "//Java Program to demonstrate the example of for loop\n" +
                    "//which prints table of 1\n" +
                    "public class ForExample {\n" +
                    "public static void main(String[] args) {\n" +
                    "    //Code of Java for loop\n" +
                    "    for(int i=1;i<=10;i++) {\n" +
                    "        System.out.println(i);\n" +
                    "    }\n" +
                    "  }\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n1\n" +
                    "2\n" +
                    "3\n" +
                    "4\n" +
                    "5\n" +
                    "6\n" +
                    "7\n" +
                    "8\n" +
                    "9\n" +
                    "10");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Java While Loop\nThe Java while loop is used to iterate a part of the program repeatedly until the specified Boolean condition is true. As soon as the Boolean condition becomes false, the loop automatically stops.\n" +
                    "\n" +
                    "The while loop is considered as a repeating if statement. If the number of iteration is not fixed, it is recommended to use the while loop.\n" +
                    "\n" +
                    "Syntax:\n" +
                    "\n" +
                    "while (condition){\n" +
                    "//code to be executed\n" +
                    "I ncrement / decrement statement\n" +
                    "}\n" +
                    "The different parts of do-while loop:\n" +
                    "\n" +
                    "1. Condition: It is an expression which is tested. If the condition is true, the loop body is executed and control goes to update expression. When the condition becomes false, we exit the while loop.\n" +
                    "\n" +
                    "Example:\n" +
                    "\n" +
                    "i <=100\n" +
                    "\n" +
                    "2. Update expression: Every time the loop body is executed, this expression increments or decrements loop variable.\n" +
                    "\n" +
                    "Example:\n" +
                    "\n" +
                    "i++;");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "public class WhileExample {\n" +
                    "public static void main(String[] args) {\n" +
                    "    int i=1;\n" +
                    "    while(i<=10){\n" +
                    "        System.out.println(i);\n" +
                    "    i++;\n" +
                    "    }\n" +
                    "  }\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n1\n" +
                    "2\n" +
                    "3\n" +
                    "4\n" +
                    "5\n" +
                    "6\n" +
                    "7\n" +
                    "8\n" +
                    "9\n" +
                    "10");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "In the below example, we print integer values from 1 to 10. Unlike the for loop, we separately need to initialize and increment the variable used in the condition (here, i). Otherwise, the loop will execute infinitely.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Java do-while Loop\nThe Java do-while loop is used to iterate a part of the program repeatedly, until the specified condition is true. If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use a do-while loop.\n" +
                    "\n" +
                    "Java do-while loop is called an exit control loop. Therefore, unlike while loop and for loop, the do-while check the condition at the end of loop body. The Java do-while loop is executed at least once because condition is checked after loop body.\n" +
                    "\n" +
                    "Syntax:\n" +
                    "\n" +
                    "do{\n" +
                    "//code to be executed / loop body\n" +
                    "//update statement\n" +
                    "}while (condition);\n" +
                    "The different parts of do-while loop:\n" +
                    "\n" +
                    "1. Condition: It is an expression which is tested. If the condition is true, the loop body is executed and control goes to update expression. As soon as the condition becomes false, loop breaks automatically.\n" +
                    "\n" +
                    "Example:\n" +
                    "\n" +
                    "i <=100\n" +
                    "\n" +
                    "2. Update expression: Every time the loop body is executed, the this expression increments or decrements loop variable.\n" +
                    "\n" +
                    "Example:\n" +
                    "\n" +
                    "i++;");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "public class DoWhileExample {\n" +
                    "public static void main(String[] args) {\n" +
                    "    int i=1;\n" +
                    "    do{\n" +
                    "        System.out.println(i);\n" +
                    "    i++;\n" +
                    "    }while(i<=10);\n" +
                    "}\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n1\n" +
                    "2\n" +
                    "3\n" +
                    "4\n" +
                    "5\n" +
                    "6\n" +
                    "7\n" +
                    "8\n" +
                    "9\n" +
                    "10");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "In the above example, we print integer values from 1 to 10. Unlike the for loop, we separately need to initialize and increment the variable used in the condition (here, i). Otherwise, the loop will execute infinitely.");
            arrayList.add(hashMap);





        }else if (element.equals("py")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "while Loop\nPython programming language provides following types of loops to handle looping requirements. Python provides three ways for executing the loops. While all the ways provide similar basic functionality, they differ in their syntax and condition checking time.\n" +
                    "\n" +
                    "While Loop: \n" +
                    "In python, while loop is used to execute a block of statements repeatedly until a given a condition is satisfied. And when the condition becomes false, the line immediately after the loop in program is executed. \n" +
                    "Syntax :\n" +
                    "\n" +
                    "while expression:\n" +
                    "    statement(s)\n" +
                    "        3. All the statements indented by the same number of character spaces after a programming construct are considered to be             part of a single block of code. Python uses indentation as its method of grouping statements. \n" +
                    "            Example:");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "# Python program to illustrate\n" +
                    "# while loop\n" +
                    "count = 0\n" +
                    "while (count < 3):\n" +
                    "    count = count + 1\n" +
                    "    print(\"Hello Geek\")");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nHello Geek\n" +
                    "Hello Geek\n" +
                    "Hello Geek");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "This is how while loop works!");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "for Loop\nA for loop is used for iterating over a sequence (that is either a list, a tuple, a dictionary, a set, or a string).\n" +
                    "\n" +
                    "This is less like the for keyword in other programming languages, and works more like an iterator method as found in other object-orientated programming languages.\n" +
                    "\n" +
                    "With the for loop we can execute a set of statements, once for each item in a list, tuple, set etc.''',\n" +
                    "      sampleProgram: '''fruits = [\"apple\", \"banana\", \"cherry\"]\n" +
                    "for x in fruits:\n" +
                    "  print(x)");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\napple\n" +
                    "banana\n" +
                    "cherry");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "The for loop does not require an indexing variable to set beforehand.");
            arrayList.add(hashMap);




        }else if (element.equals("js")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "JS Loops\nThe JavaScript loops are used to iterate the piece of code using for, while, do while or for-in loops. It makes the code compact. It is mostly used in array.\n" +
                    "\n" +
                    "There are four types of loops in JavaScript.\n" +
                    "\n" +
                    "for loop\n" +
                    "while loop\n" +
                    "do-while loop\n" +
                    "for-in loop");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "for (let i = 0; i < cars.length; i++) {\n" +
                    "  text += cars[i] + \"<br>\";\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nBMW\n" +
                    "Volvo\n" +
                    "Saab\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "for (statement 1; statement 2; statement 3) {\n" +
                    "  // code block to be executed\n" +
                    "}");
            arrayList.add(hashMap);

        }else{

            Toast.makeText(this, "Error app Please Try Again Later", Toast.LENGTH_SHORT).show();
        }












        Loops.MyAdapter myadapter = new Loops.MyAdapter();
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