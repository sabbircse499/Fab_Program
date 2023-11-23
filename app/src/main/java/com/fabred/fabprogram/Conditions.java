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

public class Conditions extends AppCompatActivity {

    private ListView request_list;
    SharedPreferences sharedPreferences;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.conditions);
        request_list = findViewById(R.id.listview);


        sharedPreferences = getSharedPreferences("fab_program", Context.MODE_PRIVATE);
        String element = sharedPreferences.getString("language", "Nothing");

        sharedPreferences = getSharedPreferences("basic_to_advance", Context.MODE_PRIVATE);




     if(element.equals("c")) {

         hashMap = new HashMap<>();
         hashMap.put("name", "Condition in C language");
         arrayList.add(hashMap);
         hashMap = new HashMap<>();
         hashMap.put("name", "Before learning the condition one more thing we need to know is operator");
         arrayList.add(hashMap);
         hashMap = new HashMap<>();
         hashMap.put("name", "01.Operator");
         arrayList.add(hashMap);

         hashMap = new HashMap<>();
         hashMap.put("name", "Operators are used to perform operations on variables and values.\n" +
                 "\n" +
                 "In the example below, we use the + operator to add together two values:\n" +
                 "#include <stdio.h>\n" +
                 "int main() {\n" +
                 "  int myNum = 100 + 50;\n" +
                 "  printf(\"%d\", myNum);\n" +
                 "  return 0;\n" +
                 "}\n" +
                 "Output :150 \n\n\n" +
                 "Although the + operator is often used to add together two values, like in the example above, it can also be used to add together a variable and a value, or a variable and another variable");
         arrayList.add(hashMap);
         hashMap = new HashMap<>();
         hashMap.put("name", "1.C divides the operators into the following groups:\n" +
                 "\n" +
                 "\uD83D\uDCA0Arithmetic operators\n" +
                 "\uD83D\uDCA0Assignment operators\n" +
                 "\uD83D\uDCA0Comparison operators\n" +
                 "\uD83D\uDCA0Logical operators\n" +
                 "\uD83D\uDCA0Bitwise operators");
         arrayList.add(hashMap);

         hashMap = new HashMap<>();
         hashMap.put("name", "1.1 Arithmetic Operators(+-/*%)\n" +
                 "+ \nAddition  Adds together two values\tx + y\n" +
                 "-\nSubtraction  Subtracts one value from another\tx - y\n" +
                 "/\tDivision\tDivides one value by another\tx / y\n"
                 + "*\nMultiplication Multiplies two values\tx * y\n"
                 + "%\nModulus Returns the division remainder\tx % y\n" +
                 "--\nDecrement Decreases the value of a variable by 1\t--x\n" +
                 "++\nIncrement Increases the value of a variable by 1\t++x");
         arrayList.add(hashMap);


         hashMap = new HashMap<>();
         hashMap.put("name", "Example :" +
                 "#include <stdio.h>\n" +
                 "\n" +
                 "int main() {\n" +
                 "    // Declare variables\n" +
                 "    int x = 5, y = 2;\n" +
                 "\n" +
                 "    // Addition\n" +
                 "    int sum = x + y;\n" +
                 "    printf(\"Sum: %d\\n\", sum);\n" +
                 "\n" +
                 "    // Subtraction\n" +
                 "    int difference = x - y;\n" +
                 "    printf(\"Difference: %d\\n\", difference);\n" +
                 "\n" +
                 "    // Multiplication\n" +
                 "    int product = x * y;\n" +
                 "    printf(\"Product: %d\\n\", product);\n" +
                 "\n" +
                 "    // Division\n" +
                 "    int quotient = x / y;\n" +
                 "    printf(\"Quotient: %d\\n\", quotient);\n" +
                 "\n" +
                 "    // Modulus\n" +
                 "    int remainder = x % y;\n" +
                 "    printf(\"Remainder: %d\\n\", remainder);\n" +
                 "\n" +
                 "    // Increment\n" +
                 "    ++x;\n" +
                 "    printf(\"After Increment: x = %d\\n\", x);\n" +
                 "\n" +
                 "    // Decrement\n" +
                 "    --y;\n" +
                 "    printf(\"After Decrement: y = %d\\n\", y);\n" +
                 "\n" +
                 "    return 0;\n" +
                 "}\n" +

                 "OUTPUT:\n" +
                 "Sum: 7\n" +
                 "Difference: 3\n" +
                 "Product: 10\n" +
                 "Quotient: 2\n" +
                 "Remainder: 1\n" +
                 "After Increment: x = 6\n" +
                 "After Decrement: y = 1\n");
         arrayList.add(hashMap);


         hashMap=new HashMap<>();
         hashMap.put("name","1.2 assignment operators\n" +
                 "In C language, assignment operators are used to assign values to variables. The basic assignment operator is '='. For example, 'x = 5' assigns the value 5 to variable x. Compound assignment operators like '+=', '-=', '*=', etc., combine operations with assignment, e.g., 'x += 3' increments x by 3.\n\n"+
                 "Example :\n"+
                 "#include <stdio.h>\n" +
                 "\n" +
                 "int main() {\n" +
                 "    // Basic Assignment\n" +
                 "    int x;\n" +
                 "    x = 5;\n" +
                 "    printf(\"x after basic assignment: %d\\n\", x);\n" +
                 "\n" +
                 "    // Compound Assignment\n" +
                 "    x += 3; // Equivalent to x = x + 3\n" +
                 "    printf(\"x after +=: %d\\n\", x);\n" +
                 "\n" +
                 "    x -= 2; // Equivalent to x = x - 2\n" +
                 "    printf(\"x after -=: %d\\n\", x);\n" +
                 "\n" +
                 "    x *= 4; // Equivalent to x = x * 4\n" +
                 "    printf(\"x after *=: %d\\n\", x);\n" +
                 "\n" +
                 "    x /= 2; // Equivalent to x = x / 2\n" +
                 "    printf(\"x after /=: %d\\n\", x);\n" +
                 "\n" +
                 "    x %= 3; // Equivalent to x = x % 3\n" +
                 "    printf(\"x after %%=: %d\\n\", x);\n" +
                 "\n" +
                 "    return 0;\n" +
                 "}\n"+
                 "Output:\n"+
                 "x after basic assignment: 5\n" +
                 "x after +=: 8\n" +
                 "x after -=: 6\n" +
                 "x after *=: 24\n" +
                 "x after /=: 12\n" +
                 "x after %=: 0\n");
         arrayList.add(hashMap);

         hashMap=new HashMap<>();
         hashMap.put("name","1.3 Comparison operators\n"+
                 "In C language, comparison operators are used to compare values. Examples include '==' (equal), '!=' (not equal), '>' (greater than), '<' (less than), '>=' (greater than or equal), and '<=' (less than or equal). They return a boolean result (1 for true, 0 for false).\n" +
                 "\n" +
                 "Here's a code snippet illustrating their use:");
         arrayList.add(hashMap);
         hashMap=new HashMap<>();
         hashMap.put("name","Example :\n"+
                 "#include <stdio.h>\n" +
                 "\n" +
                 "int main() {\n" +
                 "    int a = 5, b = 10;\n" +
                 "\n" +
                 "    // Comparison operators\n" +
                 "    printf(\"a == b: %d\\n\", a == b); // 0 (false)\n" +
                 "    printf(\"a != b: %d\\n\", a != b); // 1 (true)\n" +
                 "    printf(\"a > b: %d\\n\", a > b);   // 0 (false)\n" +
                 "    printf(\"a < b: %d\\n\", a < b);   // 1 (true)\n" +
                 "    printf(\"a >= b: %d\\n\", a >= b); // 0 (false)\n" +
                 "    printf(\"a <= b: %d\\n\", a <= b); // 1 (true)\n" +
                 "\n" +
                 "    return 0;\n" +
                 "}\n"+
                 "Output : \n" +
                 "a == b: 0\n" +
                 "a != b: 1\n" +
                 "a > b: 0\n" +
                 "a < b: 1\n" +
                 "a >= b: 0\n" +
                 "a <= b: 1\n");
         arrayList.add(hashMap);

         hashMap=new HashMap<>();
         hashMap.put("name","1.4 Logical operators\n"+
                 "\n" +
                 "In C language, logical operators are used to perform logical operations on boolean values. Examples include '&&' (logical AND), '||' (logical OR), and '!' (logical NOT). They combine or negate boolean expressions. Here's a code snippet demonstrating their use:");
         arrayList.add(hashMap);
         hashMap=new HashMap<>();
         hashMap.put("name","Example :"+
                 "#include <stdio.h>\n" +
                 "\n" +
                 "int main() {\n" +
                 "    int x = 5, y = 10;\n" +
                 "\n" +
                 "    // Logical operators\n" +
                 "    printf(\"x && y: %d\\n\", x && y); // 1 (true)\n" +
                 "    printf(\"x || y: %d\\n\", x || y); // 1 (true)\n" +
                 "    printf(\"!(x && y): %d\\n\", !(x && y)); // 0 (false)\n" +
                 "\n" +
                 "    return 0;\n" +
                 "}\n"+
                 "Output :"+
                 "x && y: 1\n" +
                 "x || y: 1\n" +
                 "!(x && y): 0\n");
         arrayList.add(hashMap);

         hashMap=new HashMap<>();
         hashMap.put("name","1.5 Bitwise operators\n"+
                 "\n" +
                 "In C language, bitwise operators perform operations at the bit level. Examples include '&' (bitwise AND), '| (bitwise OR), '^' (bitwise XOR), '~' (bitwise NOT), '<<' (left shift), and '>>' (right shift). Here's a code snippet illustrating their use:");
         arrayList.add(hashMap);
         hashMap=new HashMap<>();
         hashMap.put("name","Example :\n"+
                 "#include <stdio.h>\n" +
                 "\n" +
                 "int main() {\n" +
                 "    int x = 5, y = 3;\n" +
                 "\n" +
                 "    // Bitwise operators\n" +
                 "    printf(\"x & y: %d\\n\", x & y); // 1\n" +
                 "    printf(\"x | y: %d\\n\", x | y); // 7\n" +
                 "    printf(\"x ^ y: %d\\n\", x ^ y); // 6\n" +
                 "    printf(\"~x: %d\\n\", ~x); // -6\n" +
                 "    printf(\"x << 1: %d\\n\", x << 1); // 10\n" +
                 "    printf(\"y >> 1: %d\\n\", y >> 1); // 1\n" +
                 "\n" +
                 "    return 0;\n" +
                 "}\n"+
                 "Output :\n"+
                 "x & y: 1\n" +
                 "x | y: 7\n" +
                 "x ^ y: 6\n" +
                 "~x: -6\n" +
                 "x << 1: 10\n" +
                 "y >> 1: 1\n");
         arrayList.add(hashMap);

         hashMap = new HashMap<>();
         hashMap.put("name", "#include <stdio.h>\n" +
                 "\n" +
                 "int main() {\n" +
                 "  printf(\"practice makes perfect!\");\n" +
                 "  return 0;\n" +
                 "}");
         arrayList.add(hashMap);



         hashMap = new HashMap<>();
         hashMap.put("name", "2.CONDITION");
         arrayList.add(hashMap);

         hashMap = new HashMap<>();
         hashMap.put("name", "C has the following conditional statements:\n" +
                 "\n" +
                 "Use if to specify a block of code to be executed, if a specified condition is true\n" +
                 "Use else to specify a block of code to be executed, if the same condition is false\n" +
                 "Use else if to specify a new condition to test, if the first condition is false\n"+
                 "Use switch to specify many alternative blocks of code to be executed");
         arrayList.add(hashMap);

         hashMap = new HashMap<>();
         hashMap.put("name", "2.1 If Statements");
         arrayList.add(hashMap);
         hashMap = new HashMap<>();
         hashMap.put("name", "You have already learned that C supports the usual logical conditions from mathematics:\n" +
                 "\n" +
                 "Less than: a < b\n" +
                 "Less than or equal to: a <= b\n" +
                 "Greater than: a > b\n" +
                 "Greater than or equal to: a >= b\n" +
                 "Equal to a == b\n" +
                 "Not Equal to: a != b\n\n\n"+
                 "Use the if statement to specify a block of code to be executed if a condition is true.\n" +
                 "\n\n" +
                 "Syntax\n" +
                 "if (condition) {\n" +
                 "  // block of code to be executed if the condition is true\n" +
                 "}\n\n"+
                 "EXample :"+
                 "#include <stdio.h>\n" +
                 "\n" +
                 "int main() {\n" +
                 "  if (20 > 18) {\n" +
                 "    printf(\"20 is greater than 18\");\n" +
                 "  }  \n" +
                 "  return 0;\n" +
                 "}\n"+
                 "Output:\n"+
                 "20 is greater than 18\n\n"+
                 "Example :\n"+
                 "#include <stdio.h>\n" +
                 "\n" +
                 "int main() {\n" +
                 "  int x = 20;\n" +
                 "  int y = 18;\n" +
                 "  if (x > y) {\n" +
                 "    printf(\"x is greater than y\");\n" +
                 "  }  \n" +
                 "  return 0;\n" +
                 "}\n"+
                 "Output :"+
                 "x is greater than y");
         arrayList.add(hashMap);

         hashMap = new HashMap<>();
         hashMap.put("name", "2.2 Else statement");
         arrayList.add(hashMap);

         hashMap = new HashMap<>();
         hashMap.put("name", "\n" +
                 "In C language, the else statement is used to specify a block of code that should be executed when the condition of the preceding if statement evaluates to false. Here's an example code snippet with output:\n"+
                 "#include <stdio.h>\n" +
                 "\n" +
                 "int main() {\n" +
                 "    int num = 7;\n" +
                 "\n" +
                 "    // Example using if-else statement\n" +
                 "    if (num % 2 == 0) {\n" +
                 "        printf(\"%d is even.\\n\", num);\n" +
                 "    } else {\n" +
                 "        printf(\"%d is odd.\\n\", num);\n" +
                 "    }\n" +
                 "\n" +
                 "    return 0;\n" +
                 "}\n"+
                 "Output :"+
                 "7 is odd.\n");
         arrayList.add(hashMap);

         hashMap=new HashMap<>();
         hashMap.put("name","2.3 Else if");
         arrayList.add(hashMap);

         hashMap = new HashMap<>();
         hashMap.put("name", "\n" +
                 "In C language, the else if statement is used to extend the conditional logic of an if statement. It allows you to check multiple conditions in sequence. Here's an example code snippet with output:\n"+
                 "Example :\n"+
                 "#include <stdio.h>\n" +
                         "\n" +
                         "int main() {\n" +
                         "    int num = 12;\n" +
                         "\n" +
                         "    // Example using if-else if-else statement\n" +
                         "    if (num > 0) {\n" +
                         "        printf(\"%d is positive.\\n\", num);\n" +
                         "    } else if (num < 0) {\n" +
                         "        printf(\"%d is negative.\\n\", num);\n" +
                         "    } else {\n" +
                         "        printf(\"%d is zero.\\n\", num);\n" +
                         "    }\n" +
                         "\n" +
                         "    return 0;\n" +
                         "}\n"+
                         "12 is positive.\n"+
                         "In this example, the program checks whether the variable num is positive, negative, or zero. It uses the if, else if, and else statements to handle these different cases. Since 12 is greater than 0, the first condition is true, and \"12 is positive.\" is printed."
                 );
         arrayList.add(hashMap);
         hashMap = new HashMap<>();
         hashMap.put("name", "2.4 Switch");
         arrayList.add(hashMap);
         hashMap = new HashMap<>();
         hashMap.put("name", "Switch statement\n"+
                 "\n" +
                 "In C, the switch statement allows for multi-way branching based on the value of an expression. The expression is evaluated, and control is transferred to the case that matches the evaluated value. Each case contains a set of statements and ends with a break statement. If no case matches, the default case is executed. Here's a code snippet demonstrating the switch statement:\n"+
                 "Example :\n"+
                 "#include <stdio.h>\n" +
                 "\n" +
                 "int main() {\n" +
                 "    int day = 3;\n" +
                 "\n" +
                 "    switch (day) {\n" +
                 "        case 1:\n" +
                 "            printf(\"Monday\\n\");\n" +
                 "            break;\n" +
                 "        case 2:\n" +
                 "            printf(\"Tuesday\\n\");\n" +
                 "            break;\n" +
                 "        case 3:\n" +
                 "            printf(\"Wednesday\\n\");\n" +
                 "            break;\n" +
                 "        default:\n" +
                 "            printf(\"Invalid day\\n\");\n" +
                 "    }\n" +
                 "\n" +
                 "    return 0;\n" +
                 "}\n"+
                 "Output :\n"+
                 "Wednesday\n"+
                 "In this example, the switch statement evaluates the value of the variable day and prints the corresponding day of the week. Since day is 3, \"Wednesday\" is printed.");
         arrayList.add(hashMap);


         hashMap = new HashMap<>();
         hashMap.put("name", "Example :1 ");
         arrayList.add(hashMap);


         hashMap = new HashMap<>();
         hashMap.put("name", "//6.\tCheck Whether a Number is Positive or Negative or Zero.\n" +
                 "#include<stdio.h>\n" +
                 "int main(){\n" +
                 "\n" +
                 "int a;\n" +
                 "\n" +
                 "scanf(\"%d\",&a);\n" +
                 "\n" +
                 "if(a==0){\n" +
                 "\n" +
                 "    printf(\"%d is zero.\\n\",a);\n" +
                 "}\n" +
                 "else if (a>0){\n" +
                 "\n" +
                 "\n" +
                 "    printf(\"%d is positive.\\n\",a);\n" +
                 "}\n" +
                 "else\n" +
                 "    printf(\"%d is negative .\\n\",a);\n" +
                 "\n" +
                 "\n" +
                 "}\n");
         arrayList.add(hashMap);

         hashMap = new HashMap<>();
         hashMap.put("name", "Example :2 ");
         arrayList.add(hashMap);

         hashMap = new HashMap<>();
         hashMap.put("name", "//.\tCheck Whether the Entered Year is Leap Year or not\n" +
                 "#include <stdio.h>\n" +
                 "int main(){\n" +
                 "int a;\n" +
                 "printf(\"Enter a year :\");\n" +
                 "scanf(\"%d\",&a);\n" +
                 "\n" +
                 "if(((a%4==0)&&(a%100!=0))||(a%400==0)){\n" +
                 "\n" +
                 "    printf(\"leep year .\\n\");\n" +
                 "}\n" +
                 "else {\n" +
                 "\n" +
                 "    printf(\"not leep year ! man\\n\");\n" +
                 "}\n" +
                 "\n" +
                 "/*2020 was a leap year\n" +
                 "2016 was a leap year\n" +
                 "2012 was a leap year\n" +
                 "2008 was a leap year\n" +
                 "2004 was a leap year\n" +
                 "2000 was a leap year\n" +
                 "1996 was a leap year\n" +
                 "1992 was a leap year\n" +
                 "1988 was a leap year\n" +
                 "1984 was a leap year*/\n" +
                 "\n" +
                 "}\n" +
                 "\n" +
                 "\n" +
                 "\n ");
         arrayList.add(hashMap);

         hashMap = new HashMap<>();
         hashMap.put("name", "Example :3 \n\n"+
                 "//1.\tCheck whether a number is even or odd\n" +
                 "#include <stdio.h>\n" +
                 "int main(){\n" +
                 "\n" +
                 "int a;\n" +
                 "printf(\"Enter a number :\");\n" +
                 "scanf(\"%d\",&a);\n" +
                 "\n" +
                 "if(a>0){\n" +
                 "\n" +
                 "\n" +
                 "    printf(\"%d is even number .\",a);\n" +
                 "\n" +
                 "}\n" +
                 "else {\n" +
                 "\n" +
                 "    printf(\"%d is odd number .\",a);\n" +
                 "\n" +
                 "}\n" +
                 "\n" +
                 "}\n");
         arrayList.add(hashMap);
         hashMap = new HashMap<>();
         hashMap.put("name", "Example :4 \n\n"+
                 "//2.\tCheck whether a character is a vowel or consonant\n" +
                 "#include <stdio.h>\n" +
                 "int main()\n" +
                 "{\n" +
                 "\n" +
                 "\n" +
                 "char a;\n" +
                 "printf(\"Enter  Char:\");\n" +
                 "scanf(\"%c\",&a);\n" +
                 "\n" +
                 "if((a=='a')&&(a=='e')&&(a=='i')&&(a=='o')&&(a=='u')\n" +
                 "   ||(a=='A')&&(a=='E')&&(a=='I')&&(a=='O')&&(a=='U'))\n" +
                 "\n" +
                 "{\n" +
                 "    printf(\"%c is vowel.\",a);\n" +
                 "}\n" +
                 "else if((a>='a')&&(a<='z')|| (a>='A')&&(a<='Z') ){\n" +
                 "\n" +
                 "\n" +
                 "    printf(\"%c is consonant.\",a);\n" +
                 "\n" +
                 "}\n" +
                 "else {\n" +
                 "\n" +
                 "    printf(\"invalid number .\");\n" +
                 "\n" +
                 "}\n" +
                 "\n" +
                 "\n" +
                 "}\n" +
                 "\n");
         arrayList.add(hashMap);
         hashMap = new HashMap<>();
         hashMap.put("name", "Example :5 \n\n"+
                 " Here's a simple C code snippet implementing a basic calculator using the switch statement:\n\n"+
                 "#include <stdio.h>\n" +
                 "\n" +
                 "int main() {\n" +
                 "    char operator;\n" +
                 "    double num1, num2;\n" +
                 "\n" +
                 "    // Input\n" +
                 "    printf(\"Enter an operator (+, -, *, /): \");\n" +
                 "    scanf(\"%c\", &operator);\n" +
                 "\n" +
                 "    printf(\"Enter two numbers: \");\n" +
                 "    scanf(\"%lf %lf\", &num1, &num2);\n" +
                 "\n" +
                 "    // Switch statement for the calculator\n" +
                 "    switch (operator) {\n" +
                 "        case '+':\n" +
                 "            printf(\"%.2lf + %.2lf = %.2lf\\n\", num1, num2, num1 + num2);\n" +
                 "            break;\n" +
                 "        case '-':\n" +
                 "            printf(\"%.2lf - %.2lf = %.2lf\\n\", num1, num2, num1 - num2);\n" +
                 "            break;\n" +
                 "        case '*':\n" +
                 "            printf(\"%.2lf * %.2lf = %.2lf\\n\", num1, num2, num1 * num2);\n" +
                 "            break;\n" +
                 "        case '/':\n" +
                 "            if (num2 != 0) {\n" +
                 "                printf(\"%.2lf / %.2lf = %.2lf\\n\", num1, num2, num1 / num2);\n" +
                 "            } else {\n" +
                 "                printf(\"Error: Division by zero\\n\");\n" +
                 "            }\n" +
                 "            break;\n" +
                 "        default:\n" +
                 "            printf(\"Error: Invalid operator\\n\");\n" +
                 "    }\n" +
                 "\n" +
                 "    return 0;\n" +
                 "}\n"+
                 "This program takes an operator (+, -, *, /) and two numbers as input. It then uses a switch statement to perform the corresponding operation and displays the result. The program also checks for division by zero to avoid errors.");
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
            hashMap.put("name", "if Condition\nIn C++ programming, if statement is used to test the condition. There are various types of if statements in C++.\n" +
                    "\n" +
                    "if statement\n" +
                    "if-else statement\n" +
                    "nested if statement\n" +
                    "if-else-if ladder\n" +
                    "\n" +
                    "The C++ if statement tests the condition. It is executed if condition is true.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main () {\n" +
                    "   int num = 10;\n" +
                    "            if (num % 2 == 0)\n" +
                    "            {\n" +
                    "                cout<<\"It is even number\";\n" +
                    "            }\n" +
                    "   return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output\nIt is even number");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "if(condition){\n" +
                    "//code to be executed\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "if-else Condition\nThe C++ if-else statement also tests the condition. It executes if block if condition is true otherwise else block is executed.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main () {\n" +
                    "   int num = 11;\n" +
                    "            if (num % 2 == 0)\n" +
                    "            {\n" +
                    "                cout<<\"It is even number\";\n" +
                    "            }\n" +
                    "            else\n" +
                    "            {\n" +
                    "                cout<<\"It is odd number\";\n" +
                    "            }\n" +
                    "   return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\nIt is odd number");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "if(condition){\n" +
                    "//code if condition is true\n" +
                    "}else{\n" +
                    "//code if condition is false\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Switch\nC++ switch\n" +
                    "The C++ switch statement executes one statement from multiple conditions. It is like if-else-if ladder statement in C++.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "int main () {\n" +
                    "       int num;\n" +
                    "       cout<<\"Enter a number to check grade:\";\n" +
                    "       cin>>num;\n" +
                    "           switch (num)\n" +
                    "          {\n" +
                    "              case 10: cout<<\"It is 10\"; break;\n" +
                    "              case 20: cout<<\"It is 20\"; break;\n" +
                    "              case 30: cout<<\"It is 30\"; break;\n" +
                    "              default: cout<<\"Not 10, 20 or 30\"; break;\n" +
                    "          }\n" +
                    "    }");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\nEnter a number:\n" +
                    "10\n" +
                    "It is 10");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "switch(expression){\n" +
                    "case value1:\n" +
                    " //code to be executed;\n" +
                    " break;\n" +
                    "case value2:\n" +
                    " //code to be executed;\n" +
                    " break;\n" +
                    "......\n" +
                    "\n" +
                    "default:\n" +
                    " //code to be executed if all cases are not matched;\n" +
                    " break;\n" +
                    "}");
            arrayList.add(hashMap);

        } else if (element.equals("java")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "Java Control Statements | Control Flow in Java\nJava compiler executes the code from top to bottom. The statements in the code are executed according to the order in which they appear. However, Java provides statements that can be used to control the flow of Java code. Such statements are called control flow statements. It is one of the fundamental features of Java, which provides a smooth flow of program.\n" +
                    "\n" +
                    "Java provides three types of control flow statements.\n" +
                    "\n" +
                    "Decision Making statements\n" +
                    "if statements\n" +
                    "switch statement\n" +
                    "Loop statements\n" +
                    "do while loop\n" +
                    "while loop\n" +
                    "for loop\n" +
                    "for-each loop\n" +
                    "Jump statements\n" +
                    "break statement\n" +
                    "continue statement\n" +
                    "Decision-Making statements:\n" +
                    "As the name suggests, decision-making statements decide which statement to execute and when. Decision-making statements evaluate the Boolean expression and control the program flow depending upon the result of the condition provided. There are two types of decision-making statements in Java, i.e., If statement and switch statement.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "public class Student {\n" +
                    "public static void main(String[] args) {\n" +
                    "String address = \"Delhi, India\";\n" +
                    "\n" +
                    "if(address.endsWith(\"India\")) {\n" +
                    "    if(address.contains(\"Meerut\")) {\n" +
                    "      System.out.println(\"Your city is Meerut\");\n" +
                    "  } else if(address.contains(\"Noida\")) {\n" +
                    "        System.out.println(\"Your city is Noida\");\n" +
                    "  }else {\n" +
                    "    System.out.println(address.split(\",\")[0]);\n" +
                    "  }\n" +
                    " }else {\n" +
                    "      System.out.println(\"You are not living in India\");\n" +
                    "    }\n" +
                    "  }\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\n Delhi");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "The if-else-if statement contains the if-statement followed by multiple else-if statements. In other words, we can say that it is the chain of if-else statements that create a decision tree where the program may enter in the block of code where the condition is true. We can also define an else statement at the end of the chain.");
            arrayList.add(hashMap);




        }else if (element.equals("py")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "Python if else\nThere comes situations in real life when we need to make some decisions and based on these decisions, we decide what should we do next. Similar situations arises in programming also where we need to make some decisions and based on these decisions we will execute the next block of code.\n" +
                    "\n" +
                    "Decision making statements in programming languages decides the direction of flow of program execution. Decision making statements available in python are:\n" +
                    "\n" +
                    "if statement\n" +
                    "if..else statements\n" +
                    "nested if statements\n" +
                    "if-elif ladder\n" +
                    "Short Hand if statement\n" +
                    "Short Hand if-else statement\n" +
                    "if statement\n" +
                    "\n" +
                    "if statement is the most simple decision making statement. It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statement is executed otherwise not.\n" +
                    "\n" +
                    "Syntax:\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "if condition:\n" +
                    "   # Statements to execute if\n" +
                    "   # condition is true\n" +
                    "Here, condition after evaluation will be either true or false. if statement accepts boolean values – if the value is true then it will execute the block of statements below it otherwise not. We can use condition with bracket ‘(‘ ‘)’ also.\n" +
                    "\n" +
                    "As we know, python uses indentation to identify a block. So the block under an if statement will be identified as shown in the below example:\n" +
                    "\n" +
                    "if condition:\n" +
                    "   statement1\n" +
                    "statement2\n" +
                    "\n" +
                    "# Here if the condition is true, if block \n" +
                    "# will consider only statement1 to be inside \n" +
                    "# its block.\n" +
                    "\n" +
                    "if- else\n" +
                    "\n" +
                    "The if statement alone tells us that if a condition is true it will execute a block of statements and if the condition is false it won’t. But what if we want to do something else if the condition is false. Here comes the else statement. We can use the else statement with if statement to execute a block of code when the condition is false.\n" +
                    "Syntax:\n" +
                    "\n" +
                    "if (condition):\n" +
                    "    # Executes this block if\n" +
                    "    # condition is true\n" +
                    "else:\n" +
                    "    # Executes this block if\n" +
                    "    # condition is false\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "# Python program to illustrate if-elif-else ladder\n" +
                    "#!/usr/bin/python\n" +
                    "\n" +
                    "i = 20\n" +
                    "if (i == 10):\n" +
                    "    print (\"i is 10\")\n" +
                    "elif (i == 15):\n" +
                    "    print (\"i is 15\")\n" +
                    "elif (i == 20):\n" +
                    "    print (\"i is 20\")\n" +
                    "else:\n" +
                    "    print (\"i is not present\")");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output: \ni is 20");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "The block of code following the else statement is executed as the condition present in the if statement is false after call the statement which is not in block(without spaces).");
            arrayList.add(hashMap);




        }else if (element.equals("js")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "JS if-else\nThere are multiple different types of conditionals in JavaScript including:\n" +
                    "\n" +
                    "“If” statements: where if a condition is true it is used to specify execution for a block of code.\n" +
                    "“Else” statements: where if the same condition is false it specifies the execution for a block of code.\n" +
                    "“Else if” statements: this specifies a new test if the first condition is false.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "if (false) {\n" +
                    "      var outcome = \"if block\";\n" +
                    "} else if (true) {\n" +
                    "      var outcome = \"first else if block\";\n" +
                    "} else if (true) {\n" +
                    "      var outcome = \"second else if block\";\n" +
                    "} else {\n" +
                    "      var outcome = \"else block\";\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\n\"first else if block\"");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "An else if statement doesn’t need a following else statement to work. If none of the if or else if conditions pass, then JavaScript moves forward and doesn’t run any of the conditional blocks of code.");
            arrayList.add(hashMap);




        }else{

            Toast.makeText(this, "Error app Please Try Again Later", Toast.LENGTH_SHORT).show();
        }












        Conditions.MyAdapter myadapter = new Conditions.MyAdapter();
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