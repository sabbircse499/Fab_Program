package com.fabred.fabprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class QuestionCollection extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView lblQuestion;
    RadioButton optionA;
    RadioButton optionB;
    RadioButton optionC;
    RadioButton optionD;
    Button confirm;
    String rightAnswer;
    String Answer;
    public static List<QuestionModule> question_list;
    int score;
    public static String SUBJECT_NAME = "";
    public static ArrayList<ArrayList<QuestionModule>> questionBank = new ArrayList<>();
    public static ArrayList<HashMap<String, String>> subjectList = new ArrayList<>();
    LinearLayout rootLay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);


        rootLay = findViewById(R.id.rootLay);
        confirm = findViewById(R.id.confirm);
        lblQuestion = findViewById(R.id.lblPergunta);
        optionA = findViewById(R.id.opcaoA);
        optionB = findViewById(R.id.opcaoB);
        optionC = findViewById(R.id.opcaoC);
        optionD = findViewById(R.id.opcaoD);
        score = 0;
        radioGroup = findViewById(R.id.radioGroup);
        loadQuestion();

    }


    @Override
    protected void onRestart() {
        super.onRestart();
        loadQuestion();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (rootLay != null)
            rootLay.startAnimation(AnimationUtils.loadAnimation(QuestionCollection.this, R.anim.middle_to_top));
    }


    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired
    private long mBackPressed;

    // When user click bakpress button this method is called
    @Override
    public void onBackPressed() {

        // When landing in home screen

        if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {

            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        } else {

            startActivity(new Intent(QuestionCollection.this, MainActivity.class));
        }

        mBackPressed = System.currentTimeMillis();

    }

    private void loadQuestion() {
        //Toast.makeText(getApplicationContext(), "Total Questions: "+question_list.size(), Toast.LENGTH_SHORT).show();
        if (question_list.size() > 0) {
            QuestionModule q = question_list.remove(0);
            lblQuestion.setText(q.getQuestion());
            List<String> answers = q.getAnswers();

            optionA.setText(answers.get(0));
            optionB.setText(answers.get(1));
            optionC.setText(answers.get(2));
            optionD.setText(answers.get(3));
            rightAnswer = q.getRightAnswer();
        } else {
            Intent intent = new Intent(this, ScoreActivity.class);
            intent.putExtra("score", score);
            startActivity(intent);
            finish();
        }
    }

    public void loadAnswer(View view) {
        int op = radioGroup.getCheckedRadioButtonId();

        if (op == R.id.opcaoA) {
            Answer = "A";
        } else if (op == R.id.opcaoB) {
            Answer = "B";

        } else if (op == R.id.opcaoC) {
            Answer = "C";

        } else if (op == R.id.opcaoD) {
            Answer = "D";

        } else {
            return;
        }


        radioGroup.clearCheck();

        this.startActivity(isRightOrWrong(Answer));

    }

    private Intent isRightOrWrong(String Answer) {
        Intent screen;
        if (Answer.equals(rightAnswer)) {
            this.score += 1;
            screen = new Intent(this, RightActivity.class);

        } else {
            screen = new Intent(this, WrongActivity.class);
        }

        return screen;
    }


    //===============================================================================================


    //====================================================================
    //====================================================================
    public static ArrayList<QuestionModule> questions;

    public static void createQuestionBank() {
        QuestionCollection.subjectList = new ArrayList<>();
        QuestionCollection.questionBank = new ArrayList<>();


        //------------- Subject 1
        questions = new ArrayList() {
            {
                add(new QuestionModule("What is a correct syntax to output \"Hello World\" in C?", "B", "System.out.printline(\"Hello World\");", "printf(\"Hello World\");\n", "Console.WriteLine(\"Hello World\");\n", "cout << \"Hello World\";"));
                add(new QuestionModule(
                        "How do you insert COMMENTS in C code?",
                        "C",
                        "* This is a comment",
                        "# This is a comment\n",
                        "// This is a comment\n",
                        "..This is a comment\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "When a variable is created in C, a memory address is assigned to the variable.",
                        "A",
                        "True",
                        "False\n",
                        "Both",
                        "None"
                ));
                //Nakdslnf
                add(new QuestionModule(
                        "In C, code statements must end with a semicolon (;)",
                        "A",
                        "True",
                        "False\n",
                        "Both\n",
                        "None\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "How can you create a variable with the numeric value 5?",
                        "B",
                        "num = 5 int;",
                        "int num = 5; \n",
                        "val num = 5;\n",
                        "num = 5;\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "How can you create a variable with the floating number 2.8?",
                        "A",
                        "float num = 2.8; ",
                        "val num = 2.8;\n",
                        "num = 2.8 double;\n",
                        "num = 2.8 float;\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "Which operator is used to add together two values?",
                        "C",
                        "The * sign",
                        "The & sign\n",
                        "The + sign\n",
                        "The ADD keyword\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "Which function is often used to output values and print text?",
                        "A",
                        "printf()",
                        "output()\n",
                        "printword()\n",
                        "write()\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "Which format specifier is often used to print integers?",
                        "A",
                        "%d ",
                        "%f\n",
                        "%c\n",
                        "%s\n"));

                //Nakdslnf
                add(new QuestionModule(
                        "Which operator can be used to compare two values?",
                        "C",
                        "><",
                        "=\n",
                        "==  \n",
                        "<>\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "Which operator can be used to find the memory size (in bytes) of a data type or variable?",
                        "D",
                        "The sizer property",
                        "The length property\n",
                        "The len property\n",
                        "The sizeof property \n"));
                //Nakdslnf
                add(new QuestionModule(
                        "Which keyword can be used to make a variable unchangeable/read-only?",
                        "D",
                        "final",
                        "readonly\n",
                        "constant\n",
                        "const\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "What do we call the following? int myNumbers[] = {25, 50, 75, 100};",
                        "A",
                        "An array  ",
                        "A pointer\n",
                        "None of the above\n",
                        "A class\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "Array indexes start with:",
                        "A",
                        "0 ",
                        "1\n",
                        "2\n",
                        "3\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "How do you call a function in C?",
                        "D",
                        "(myFunction);",
                        "myFunction[];\n",
                        "myFunction;\n",
                        "myFunction();  \n"));
                //Nakdslnf
                add(new QuestionModule(
                        "How do you start writing an if statement in C?",
                        "D",
                        "if x > y()",
                        "if x > y then\n",
                        "if x > y\n",
                        "if (x > y)  \n"));
                //Nakdslnf
                add(new QuestionModule(
                        "How do you start writing a while loop in C?",
                        "B",
                        "while x < y",
                        "while (x < y)  \n",
                        "while x < y then\n",
                        "if x > y while\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "Which keyword is used to return a value inside a function?",
                        "D",
                        "break",
                        "void\n",
                        "get\n",
                        "return  \n"));
                //Nakdslnf
                add(new QuestionModule(
                        "How do you start writing a for loop in C?",
                        "D",
                        "for (int i = 0; switch < 5; i++)",
                        "for (x in y)\n",
                        "for (int i = 0; while < 5; i++)\n",
                        "for (int i = 0; i < 5; i++) \n"));
                //Nakdslnf
                add(new QuestionModule(
                        "Which statement can be used to select one of many code blocks to be executed?",
                        "B",
                        "when",
                        "switch  \n",
                        "default\n",
                        "break\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "Which statement is used to stop a loop?",
                        "A",
                        "break ",
                        "stop\n",
                        "void\n",
                        "exit\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "Which keyword is used to create a class in C?",
                        "D",
                        "class()",
                        "class\n",
                        "class = myClass\n",
                        "None of the above \n"));
                //Nakdslnf
                add(new QuestionModule(
                        "What is ptr in the following code known as? int* ptr = &myAge;",
                        "B",
                        "A class",
                        "A pointer\n",
                        "A parameter\n",
                        "An array\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "In C, it is possible to inherit class properties and functions from one class to another.",
                        "B",
                        "True",
                        "False\n",
                        "Both\n",
                        "None\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "Which keyword is used to create a structure?",
                        "D",
                        "structs",
                        "structure\n",
                        "str\n",
                        "struct  \n"));


            }
        };
        QuestionModule.createQuestionsForSubject("C Quiz", R.drawable.category_icon1, questions);


        //------------- Subject 2
        questions = new ArrayList() {
            {
                //Nakdslnf
                add(new QuestionModule(
                        "What is a correct syntax to output \"Hello World\" in C++?",
                        "A",
                        "cout << \"Hello World\";  ",
                        "print (\"Hello World\");\n",
                        "System.out.println(\"Hello World\");\n",
                        "Console.WriteLine(\"Hello World\");\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "C++ is an alias of C#",
                        "B",
                        "True",
                        "False  \n",
                        "Both\n",
                        "None\n"));
                //Nakdslnf
                add(new QuestionModule(
                        "How do you insert COMMENTS in C++ code?",
                        "C",
                        "# This is a comment",
                        "/* This is a comment\n",
                        "// This is a comment  \n",
                        "None\n"));
                add(new QuestionModule(
                        "Which data type is used to create a variable that should store text?",
                        "D",
                        "Txt",
                        "myString\n",
                        "String\n",
                        "string  \n"));
                add(new QuestionModule(
                        "How do you create a variable with the numeric value 5?",
                        "A",
                        "int x = 5; ",
                        "x = 5;\n",
                        "double x = 5;\n",
                        "num x = 5\n"));

                add(new QuestionModule(
                        "How do you create a variable with the floating number 2.8?",
                        "C",
                        "byte x = 2.8",
                        "int x = 2.8;\n",
                        "double x = 2.8;  \n",
                        "x = 2.8;\n"));
                add(new QuestionModule(
                        "Which method can be used to find the length of a string?",
                        "D",
                        "getLength()",
                        "getSize()\n",
                        "len()\n",
                        "length()  \n"));
                add(new QuestionModule(
                        "Which operator is used to add together two values?",
                        "C",
                        "The * sign",
                        "The & sign\n",
                        "The + sign\n",
                        "None\n"));
                ////
                add(new QuestionModule(
                        "The value of a string variable can be surrounded by single quotes.",
                        "A",
                        "False ",
                        "True\n",
                        "Both\n",
                        "None\n"));
                ////
                add(new QuestionModule(
                        "Which header file lets us work with input and output objects?",
                        "D",
                        "#include <stream>",
                        "#include <iosstring>\n",
                        "#include <inputstr>\n",
                        "#include <iostream>  \n"));
                ////
                add(new QuestionModule(
                        "Which operator can be used to compare two values?",
                        "D",
                        "<>",
                        "=\n",
                        "><\n",
                        "==  \n"));     ////
                add(new QuestionModule(
                        "To declare an array in C++, define the variable type with:",
                        "C",
                        "{}",
                        "()\n",
                        "[]  \n",
                        "None\n"));
                ////
                add(new QuestionModule(
                        "Array indexes start with:",
                        "B",
                        "1",
                        "0\n",
                        "both\n",
                        "none\n"));     ////
                add(new QuestionModule(
                        "How do you create a function in C++?",
                        "A",
                        "functionName()  ",
                        "(functionName)\n",
                        "functionName.\n",
                        "functionName[]\n"));     ////
                add(new QuestionModule(
                        "How do you call a function in C++?",
                        "D",
                        "(functionName);",
                        "functionName;\n",
                        "functionName[];\n",
                        "functionName();  \n"));     ////
                add(new QuestionModule(
                        "Which keyword is used to create a class in C++?",
                        "D",
                        "MyClass",
                        "className\n",
                        "class()\n",
                        "class \n"));     ////
                add(new QuestionModule(
                        "What is the correct way to create an object called myObj of MyClass?",
                        "D",
                        "new myObj = MyClass();",
                        "class MyClass = new myObj();\n",
                        "class myObj = new MyClass();\n",
                        "MyClass myObj;  \n"));     ////
                add(new QuestionModule(
                        "In C++, it is possible to inherit attributes and methods from one class to another.",
                        "A",
                        "True  ",
                        "False\n",
                        "Both\n",
                        "None\n"));     ////
                add(new QuestionModule(
                        "Which method can be used to find the highest value of x and y?",
                        "B",
                        "maxNum(x,y)",
                        "max(x,y)  \n",
                        "largest(x,y)\n",
                        "maximum(x,y)\n"));     ////
                add(new QuestionModule(
                        "Which operator is used to multiply numbers?",
                        "A",
                        "* ",
                        "#\n",
                        "%\n",
                        "x\n"));
                ////
                add(new QuestionModule(
                        "How do you create a reference variable of an existing variable?",
                        "C",
                        "With the * operator",
                        "With the ref word\n",
                        "With the & operator  \n",
                        "With the REF word\n"));   ////
                add(new QuestionModule(
                        "How do you start writing an if statement in C++?",
                        "B",
                        "if (x > y)  ",
                        "if x > y then:\n",
                        "if x > y:\n",
                        "None\n"));
                ////
                add(new QuestionModule(
                        "How do you start writing a while loop in C++?",
                        "A",
                        "while (x > y)  ",
                        "x > y while {\n",
                        "while x > y:\n",
                        "while x > y {\n"));   ////
                add(new QuestionModule(
                        "Which keyword is used to return a value inside a method?",
                        "D",
                        "break",
                        "get\n",
                        "void\n",
                        "return \n"));   ////
                add(new QuestionModule(
                        "Which statement is used to stop a loop?",
                        "A",
                        "break  ",
                        "exit\n",
                        "stop\n",
                        "return\n"));

            }
        };
        QuestionModule.createQuestionsForSubject("C++ Quiz", R.drawable.category_icon2, questions);


        //------------- Subject 3
        questions = new ArrayList() {
            {
                add(new QuestionModule(
                        "What is a correct syntax to output \"Hello World\" in Python?",
                        "A",
                        "print(\"Hello World\") ",
                        "p(\"Hello World\")\n",
                        "echo \"Hello World\"\n",
                        "echo(\"Hello World\");\n"));
                //
                add(new QuestionModule(
                        "How do you insert COMMENTS in Python code?",
                        "A",
                        "#This is a comment  ",
                        "//This is a comment\n",
                        "/*This is a comment*/\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Which one is NOT a legal variable name?",
                        "B",
                        "my_var",
                        "my-var  \n",
                        "_myvar\n",
                        "Myvar\n"));
                //
                add(new QuestionModule(
                        "How do you create a variable with the numeric value 5?",
                        "B",
                        "x = int(5)",
                        "Both the other answers are correct\n",
                        "x = 5\n",
                        "None\n"));

                //
                add(new QuestionModule(
                        "What is the correct file extension for Python files?",
                        "D",
                        ".pyth",
                        ".pt\n",
                        ".pyt\n",
                        ".py  \n"));
                //
                add(new QuestionModule(
                        "How do you create a variable with the floating number 2.8?",
                        "A",
                        "Both the other answers are correct ",
                        "x = 2.8\n",
                        "x = float(2.8)\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "What is the correct syntax to output the type of a variable or object in Python?",
                        "D",
                        "print(typeOf(x))",
                        "print(typeof x)\n",
                        "print(typeof(x))\n",
                        "print(type(x))  \n"));
                //
                add(new QuestionModule(
                        "What is the correct way to create a function in Python?",
                        "C",
                        "create myFunction():",
                        "function myfunction():\n",
                        "def myFunction():  \n",
                        "\n"));
                //
                add(new QuestionModule(
                        "In Python, 'Hello', is the same as \"Hello\"",
                        "A",
                        "True ",
                        "False\n",
                        "Both\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "What is a correct syntax to return the first character in a string?",
                        "A",
                        "x = \"Hello\"[0] ",
                        "x = \"Hello\".sub(0, 1)\n",
                        "x = sub(\"Hello\", 0, 1)\n\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Which method can be used to remove any whitespace from both the beginning and the end of a string?",
                        "A",
                        "strip()  ",
                        "trim()\n",
                        "ptrim()\n",
                        "len()\n"));
                //
                add(new QuestionModule(
                        "Which method can be used to return a string in upper case letters?",
                        "D",
                        "uppercase()",
                        "toUpperCase()\n",
                        "upperCase()\n",
                        "upper()  \n"));
                //
                add(new QuestionModule(
                        "Which method can be used to replace parts of a string?",
                        "B",
                        "repl()",
                        "replace()  \n",
                        "switch()\n",
                        "replaceString()\n"));
                //
                add(new QuestionModule(
                        "Which operator is used to multiply numbers?",
                        "C",
                        "#",
                        "%\n",
                        "*  \n",
                        "x\n"));
                //
                add(new QuestionModule(
                        "Which operator can be used to compare two values?",
                        "A",
                        "==  ",
                        "=\n",
                        "<>\n",
                        "><\n"));
                //
                add(new QuestionModule(
                        "Which of these collections defines a LIST?",
                        "D",
                        "{\"apple\", \"banana\", \"cherry\"}",
                        "{\"name\": \"apple\", \"color\": \"green\"}\n",
                        "(\"apple\", \"banana\", \"cherry\")\n",
                        "[\"apple\", \"banana\", \"cherry\"] \n"));
                //
                add(new QuestionModule(
                        "Which of these collections defines a TUPLE?",
                        "A",
                        "(\"apple\", \"banana\", \"cherry\")  ",
                        "[\"apple\", \"banana\", \"cherry\"]\n",
                        "{\"name\": \"apple\", \"color\": \"green\"}\n",
                        "{\"apple\", \"banana\", \"cherry\"}\n"));
                //
                add(new QuestionModule(
                        "Which of these collections defines a SET?",
                        "D",
                        "[\"apple\", \"banana\", \"cherry\"]\n",
                        "{\"name\": \"apple\", \"color\": \"green\"}\n",
                        "(\"apple\", \"banana\", \"cherry\")\n",
                        "{\"apple\", \"banana\", \"cherry\"}\n"));
                //
                add(new QuestionModule(
                        "Which of these collections defines a DICTIONARY?",
                        "A",
                        "{\"name\": \"apple\", \"color\": \"green\"} ",
                        "(\"apple\", \"banana\", \"cherry\")\n",
                        "{\"apple\", \"banana\", \"cherry\"}\n",
                        "[\"apple\", \"banana\", \"cherry\"]\n"));
                //
                add(new QuestionModule(
                        "Which collection is ordered, changeable, and allows duplicate members?",
                        "C",
                        "DICTIONARY",
                        "TUPLE\n",
                        "LIST  \n",
                        "SET\n"));
                //
                add(new QuestionModule(
                        "Which collection does not allow duplicate members?",
                        "A",
                        "SET ",
                        "LIST\n",
                        "TUPLE\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "How do you start writing an if statement in Python?",
                        "A",
                        "if x > y:  ",
                        "if (x > y)\n",
                        "if (x > y)\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "How do you start writing a while loop in Python?",
                        "C",
                        "while x > y {",
                        "while (x > y)\n",
                        "while x > y:  \n",
                        "x > y while {\n"));
                //
                add(new QuestionModule(
                        "How do you start writing a for loop in Python?",
                        "C",
                        "for x > y:",
                        "for each x in y:\n",
                        "for x in y: \n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Which statement is used to stop a loop?",
                        "C",
                        "exit",
                        "return\n",
                        "break \n",
                        "stop\n"));


            }
        };
        QuestionModule.createQuestionsForSubject("Python Quiz", R.drawable.category_icon3, questions);


        //------------- Subject 4
        questions = new ArrayList() {
            {
                //
                add(new QuestionModule(
                        "What is a correct syntax to output \"Hello World\" in Java?",
                        "B",
                        "echo(\"Hello World\");",
                        "System.out.println(\"Hello World\");  \n",
                        "Console.WriteLine(\"Hello World\");\n",
                        "print (\"Hello World\");\n"));
                //
                add(new QuestionModule(
                        "Java is short for \"JavaScript\".",
                        "A",
                        "False",
                        "True\n",
                        "Both\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "How do you insert COMMENTS in Java code?",
                        "C",
                        "/* This is a comment",
                        "# This is a comment\n",
                        "// This is a comment  \n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Which data type is used to create a variable that should store text?",
                        "C",
                        "myString",
                        "Txt\n",
                        "String  \n",
                        "string\n"));
                //
                add(new QuestionModule(
                        "How do you create a variable with the numeric value 5?",
                        "A",
                        "int x = 5; ",
                        "float x = 5;\n",
                        "x = 5;\n",
                        "num x = 5\n"));
                //
                add(new QuestionModule(
                        "How do you create a variable with the floating number 2.8?",
                        "B",
                        "x = 2.8f;",
                        "float x = 2.8f;  \n",
                        "int x = 2.8f;\n",
                        "byte x = 2.8f\n"));
                //
                add(new QuestionModule(
                        "Which method can be used to find the length of a string?",
                        "A",
                        "length()  ",
                        "getLength()\n",
                        "len()\n",
                        "getSize()\n"));
                //
                add(new QuestionModule(
                        "Which operator is used to add together two values?",
                        "B",
                        "The & sign",
                        "The + sign  \n",
                        "The * sign\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "The value of a string variable can be surrounded by single quotes.",
                        "A",
                        "False  ",
                        "True\n",
                        "Both\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Which method can be used to return a string in upper case letters?",
                        "C",
                        "touppercase()",
                        "upperCase()\n",
                        "toUpperCase()  \n",
                        "tuc()\n"));
                //
                add(new QuestionModule(
                        "Which operator can be used to compare two values?",
                        "D",
                        "><",
                        "=\n",
                        "<>\n",
                        "==  \n"));
                //
                add(new QuestionModule(
                        "To declare an array in Java, define the variable type with:",
                        "C",
                        "()",
                        "{}\n",
                        "[]  \n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Array indexes start with:",
                        "B",
                        "1",
                        "0\n",
                        "3\n",
                        "5\n"));
                //
                add(new QuestionModule(
                        "How do you create a method in Java?",
                        "B",
                        "methodName.",
                        "methodName()  \n",
                        "methodName[]\n",
                        "(methodName)\n"));
                //
                add(new QuestionModule(
                        "How do you call a method in Java?",
                        "C",
                        "methodName[];",
                        "(methodName);\n",
                        "methodName(); \n",
                        "methodName;\n"));
                //
                add(new QuestionModule(
                        "Which keyword is used to create a class in Java?",
                        "C",
                        "class()",
                        "MyClass\n",
                        "class  \n",
                        "className\n"));
                //
                add(new QuestionModule(
                        "What is the correct way to create an object called myObj of MyClass?",
                        "A",
                        "MyClass myObj = new MyClass();  ",
                        "class MyClass = new myObj();\n",
                        "class myObj = new MyClass();\n",
                        "new myObj = MyClass();\n"));
                //
                add(new QuestionModule(
                        "In Java, it is possible to inherit attributes and methods from one class to another.",
                        "A",
                        "True  ",
                        "False\n",
                        "Both\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Which method can be used to find the highest value of x and y?",
                        "D",
                        "Math.largest(x,y)",
                        "Math.maximum(x,y)\n",
                        "Math.maxNum(x,y)\n",
                        "Math.max(x,y)  \n"));
                //
                add(new QuestionModule(
                        "Which operator is used to multiply numbers?",
                        "C",
                        "#",
                        "%\n",
                        "*  \n",
                        "x\n"));
                //
                add(new QuestionModule(
                        "Which keyword is used to import a package from the Java API library?",
                        "C",
                        "getlib",
                        "package\n",
                        "import  \n",
                        "lib\n"));
                //
                add(new QuestionModule(
                        "How do you start writing an if statement in Java?",
                        "A",
                        "if (x > y)",
                        "if x > y:\n",
                        "if x > y then:\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "How do you start writing a while loop in Java?",
                        "B",
                        "while x > y {",
                        "while (x > y)  \n",
                        "x > y while {\n",
                        "while x > y:\n"));
                //
                add(new QuestionModule(
                        "Which keyword is used to return a value inside a method?",
                        "A",
                        "return  ",
                        "break\n",
                        "void\n",
                        "get\n"));
                //
                add(new QuestionModule(
                        "Which statement is used to stop a loop?",
                        "B",
                        "return",
                        "break  \n",
                        "exit\n",
                        "stop\n"));

            }
        };
        QuestionModule.createQuestionsForSubject("Java Quiz", R.drawable.category_icon4, questions);


        //------------- Subject 5
        questions = new ArrayList() {
            {
                //
                add(new QuestionModule(
                        "What does HTML stand for?",
                        "C",
                        "Hyperlinks and Text Markup Language",
                        "Home Tool Markup Language\n",
                        "Hyper Text Markup Language  \n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Who is making the Web standards?",
                        "A",
                        "The World Wide Web Consortium  ",
                        "Microsoft\n",
                        "Mozilla\n",
                        "Google\n"));
                //
                add(new QuestionModule(
                        "Choose the correct HTML element for the largest heading:",
                        "B",
                        "<heading>",
                        "<h1>  \n",
                        "<head>\n",
                        "<h6>\n"));
                //
                add(new QuestionModule(
                        "What is the correct HTML element for inserting a line break?",
                        "C",
                        "<break>",
                        "<lb>\n",
                        "<br>  \n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "What is the correct HTML for adding a background color?",
                        "A",
                        "<body style=\"background-color:yellow;\">  ",
                        "<background>yellow</background>\n",
                        "<body bg=\"yellow\">\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Choose the correct HTML element to define important text",
                        "B",
                        "<b>",
                        "<strong>  \n",
                        "<important>\n",
                        "<i>\n"));
                //
                add(new QuestionModule(
                        "Choose the correct HTML element to define emphasized text",
                        "A",
                        "<em>  ",
                        "<italic>\n",
                        "<i>\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "What is the correct HTML for creating a hyperlink?",
                        "B",
                        "<a>http://www.w3schools.com</a>",
                        "<a href=\"http://www.w3schools.com\">W3Schools</a>  \n",
                        "<a url=\"http://www.w3schools.com\">W3Schools.com</a>\n",
                        "<a name=\"http://www.w3schools.com\">W3Schools.com</a>\n"));
                //
                add(new QuestionModule(
                        "Which character is used to indicate an end tag?",
                        "C",
                        "<",
                        "^\n",
                        "/ \n",
                        "*\n"));
                //
                add(new QuestionModule(
                        "How can you open a link in a new tab/browser window?",
                        "A",
                        "<a href=\"url\" target=\"_blank\">  ",
                        "<a href=\"url\" new>\n",
                        "<a href=\"url\" target=\"new\">\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Which of these elements are all <table> elements?",
                        "D",
                        "<table><head><tvcfoot>",
                        "<thead><body><tr>\n",
                        "<table><head><tfoot>\n",
                        "<table><tr><td>\n"));
                //
                add(new QuestionModule(
                        "Inline elements are normally displayed without starting a new line.",
                        "A",
                        "True  ",
                        "False\n",
                        "Both\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "How can you make a numbered list?",
                        "B",
                        "<ul>",
                        "<ol>  \n",
                        "<dl>\n",
                        "<list>\n"));
                //
                add(new QuestionModule(
                        "How can you make a bulleted list?",
                        "B",
                        "<list>",
                        "<ul>\n",
                        "<ol>\n",
                        "<dl>\n"));
                //
                add(new QuestionModule(
                        "What is the correct HTML for making a checkbox?",
                        "D",
                        "<check>",
                        "<checkbox>\n",
                        "<input type=\"check\">\n",
                        "<input type=\"checkbox\">  \n"));
                //
                add(new QuestionModule(
                        "What is the correct HTML for making a text input field?",
                        "C",
                        "<textinput type=\"text\">",
                        "<input type=\"textfield\">\n",
                        "<input type=\"text\">  \n",
                        "<textfield>\n"));
                //
                add(new QuestionModule(
                        "What is the correct HTML for making a drop-down list?",
                        "C",
                        "<input type=\"dropdown\">",
                        "<input type=\"list\">\n",
                        "<select>  \n",
                        "<list>\n"));
                //
                add(new QuestionModule(
                        "What is the correct HTML for making a text area?",
                        "A",
                        "<textarea>  ",
                        "<input type=\"textarea\">\n",
                        "<input type=\"textbox\">\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "What is the correct HTML for inserting an image?",
                        "D",
                        "<image src=\"image.gif\" alt=\"MyImage\">",
                        "<img alt=\"MyImage\">image.gif</img>\n",
                        "<img href=\"image.gif\" alt=\"MyImage\">\n",
                        "<img src=\"image.gif\" alt=\"MyImage\">  \n"));
                //
                add(new QuestionModule(
                        "What is the correct HTML for inserting a background image?",
                        "B",
                        "<background img=\"background.gif\">",
                        "<body style=\"background-image:url(background.gif)\">  \n",
                        "<body bg=\"background.gif\">\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "An <iframe> is used to display a web page within a web page.",
                        "B",
                        "There is no such thing as an <iframe>",
                        "True\n",
                        "False\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "HTML comments start with <!-- and end with -->",
                        "A",
                        "True",
                        "False\n",
                        "Both\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Block elements are normally displayed without starting a new line",
                        "B",
                        "True",
                        "False \n",
                        "Both\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Which HTML element defines the title of a document?",
                        "C",
                        "<head>",
                        "<meta>\n",
                        "<title>  \n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Which HTML attribute specifies an alternate text for an image, if the image cannot be displayed?",
                        "C",
                        "title",
                        "src\n",
                        "alt \n",
                        "longdesc\n"));
            }
        };
        QuestionModule.createQuestionsForSubject("Html Quiz", R.drawable.category_icon5, questions);


        //------------- Subject 6
        questions = new ArrayList() {
            {
                //
                add(new QuestionModule(
                        "Inside which HTML element do we put the JavaScript?",
                        "A",
                        "<script>  ",
                        "<scripting>\n",
                        "<javascript>\n",
                        "<js>\n"));
                //
                add(new QuestionModule(
                        "Where is the correct place to insert a JavaScript?",
                        "B",
                        "The <head> section",
                        "Both the <head> section and the <body> section are correct \n",
                        "The <body> section\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "What is the correct syntax for referring to an external script called \"xxx.js\"?",
                        "A",
                        "<script src=\"xxx.js\">  ",
                        "<script href=\"xxx.js\">\n",
                        "<script name=\"xxx.js\">\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "The external JavaScript file must contain the <script> tag.",
                        "B",
                        "True",
                        "False\n",
                        "Both\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "How do you write \"Hello World\" in an alert box?",
                        "C",
                        "msg(\"Hello World\");",
                        "alertBox(\"Hello World\");\n",
                        "alert(\"Hello World\");  \n",
                        "msgBox(\"Hello World\");\n"));
                //
                add(new QuestionModule(
                        "How do you create a function in JavaScript?",
                        "C",
                        "function:myFunction()",
                        "function = myFunction()\n",
                        "function myFunction() \n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "How do you call a function named \"myFunction\"?",
                        "A",
                        "myFunction()  ",
                        "call myFunction()\n",
                        "call function myFunction()\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "How to write an IF statement in JavaScript?",
                        "B",
                        "if i = 5 then",
                        "if (i == 5)  \n",
                        "if i == 5 then\n",
                        "if i == 5 then\n"));
                //
                add(new QuestionModule(
                        "How to write an IF statement for executing some code if \"i\" is NOT equal to 5?",
                        "D",
                        "if i <> 5",
                        "if i =! 5 then\n",
                        "if (i <> 5)\n",
                        "if (i != 5)  \n"));
                //
                add(new QuestionModule(
                        "How does a WHILE loop start?",
                        "A",
                        "while (i <= 10)  ",
                        "while i = 1 to 10\n",
                        "while (i <= 10; i++)\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "How does a FOR loop start?",
                        "D",
                        "for i = 1 to 5",
                        "for (i = 0; i <= 5)\n",
                        "while i = 1 to 10\n",
                        "for (i = 0; i <= 5; i++)  \n"));
                //
                add(new QuestionModule(
                        "How can you add a comment in a JavaScript?",
                        "A",
                        "//This is a comment ",
                        "<!--This is a comment-->\n",
                        "'This is a comment\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "How to insert a comment that has more than one line?",
                        "A",
                        "/*This comment has\n" +
                                "more than one line*/  ",
                        "//This comment has\n" +
                                "more than one line//\n",
                        "<!--This comment has\n" +
                                "more than one line-->\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "What is the correct way to write a JavaScript array?",
                        "D",
                        "var colors = 1 = (\"red\"), 2 = (\"green\"), 3 = (\"blue\")",
                        "var colors = (1:\"red\", 2:\"green\", 3:\"blue\")\n",
                        "var colors = \"red\", \"green\", \"blue\"\n",
                        "var colors = [\"red\", \"green\", \"blue\"]\n"));
                //
                add(new QuestionModule(
                        "How do you round the number 7.25, to the nearest integer?",
                        "A",
                        "Math.round(7.25)",
                        "Math.rnd(7.25)\n",
                        "rnd(7.25)\n",
                        "round(7.25)\n"));
                //
                add(new QuestionModule(
                        "How do you find the number with the highest value of x and y?",
                        "B",
                        "ceil(x, y)",
                        "ceil(x, y)\n",
                        "top(x, y)\n",
                        "Math.ceil(x, y)\n"));
                //
                add(new QuestionModule(
                        "What is the correct JavaScript syntax for opening a new window called \"w2\" ?",
                        "A",
                        "w2 = window.open(\"http://www.w3schools.com\"); ",
                        "w2 = window.new(\"http://www.w3schools.com\");\n",
                        "Both\n",
                        "none\n"));
                //
                add(new QuestionModule(
                        "JavaScript is the same as Java.",
                        "B",
                        "True",
                        "False  \n",
                        "Both\n",
                        "None"));
                //
                add(new QuestionModule(
                        "How can you detect the client's browser name?",
                        "A",
                        "navigator.appName ",
                        "browser.name\n",
                        "client.navName\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Which event occurs when the user clicks on an HTML element?",
                        "D",
                        "onmouseclick",
                        "onmouseover\n",
                        "onchange\n",
                        "onclick \n"));
                //
                add(new QuestionModule(
                        "How do you declare a JavaScript variable?",
                        "A",
                        "var carName;  ",
                        "variable carName;\n",
                        "v carName;\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Which operator is used to assign a value to a variable?",
                        "D",
                        "-",
                        "x\n",
                        "*\n",
                        "=\n"));
                //
                add(new QuestionModule(
                        "What will the following code return: Boolean(10 > 9)",
                        "C",
                        "false",
                        "NaN\n",
                        "True\n",
                        "None\n"));
                //
                add(new QuestionModule(
                        "Is JavaScript case-sensitive?",
                        "B",
                        "No",
                        "Yes\n",
                        "Both\n",
                        "None\n"));
                //

            }
        };
        QuestionModule.createQuestionsForSubject("JavaScript Quiz", R.drawable.category_icon6, questions);


    }




    }


