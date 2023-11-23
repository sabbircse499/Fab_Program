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

public class DataType extends AppCompatActivity {

    private ListView request_list;
    SharedPreferences sharedPreferences;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_type);
        request_list = findViewById(R.id.listview);

        sharedPreferences = getSharedPreferences("fab_program", Context.MODE_PRIVATE);
        String element = sharedPreferences.getString("language", "Nothing");

        sharedPreferences = getSharedPreferences("basic_to_advance", Context.MODE_PRIVATE);

        if(element.equals("c") ){

            hashMap=new HashMap<>();
            hashMap.put("name","Data Type in C language");
            arrayList.add(hashMap);

            hashMap=new HashMap<>();
            hashMap.put("name","01.Data Types");
            arrayList.add(hashMap);
            hashMap=new HashMap<>();
            hashMap.put("name","\uD83D\uDCA0In the C programming language, data types define the type of values that variables can hold. Basic data types include int for integers, float for floating-point numbers, and char for characters. These types help allocate memory and determine the range of values a variable can store. Additionally, C supports modifiers like short and long to specify the range of integers, and signed and unsigned to indicate whether numbers are positive or can be both positive and negative. The language also allows user-defined data types through structures and enums, enabling the creation of complex data structures. Understanding data types is fundamental for efficient and reliable C programming.");
            arrayList.add(hashMap);





            hashMap=new HashMap<>();
            hashMap.put("name","As explained in the Variables chapter, a variable in C must be a specified data type, and you must use a format specifier inside the printf() function to display it:");
            arrayList.add(hashMap);
            hashMap=new HashMap<>();
            hashMap.put("name","Example:\n"+
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  // Create variables\n" +
                    "  int myNum = 5; // Integer (whole number)\n" +
                    "  float myFloatNum = 5.99; // Floating point number\n" +
                    "  char myLetter = 'D'; // Character\n" +
                    "  \n" +
                    "  // Print variables\n" +
                    "  printf(\"%d\\n\", myNum);\n" +
                    "  printf(\"%f\\n\", myFloatNum);\n" +
                    "  printf(\"%c\\n\", myLetter);\n" +
                    "  return 0;\n" +
                    "}\n"+
                    "Output :\n"+
                    "5\n" +
                    "5.990000\n" +
                    "D");
            arrayList.add(hashMap);

            hashMap=new HashMap<>();
            hashMap.put("name","02.Basic Data Types\n"+
                    "\n" +
                    "Data Type\tSize\tDescription\n" +
                    "int:\n"+"Size :2 or 4 bytes\n"+"It Stores whole numbers, without decimals\n\n" +
                    "float\n"+"Size : 4 bytes"+"It Stores fractional numbers, containing one or more decimals. Sufficient for storing 6-7 decimal digits\n" +
                    "double\n"+"Size :8 bytes"+"It Stores fractional numbers, containing one or more decimals. Sufficient for storing 15 decimal digits\n" +
                    "char\n"+"Size :1 byte"+"Stores a single character/letter/number, or ASCII values");
            arrayList.add(hashMap);

            hashMap=new HashMap<>();
            hashMap.put("name","03.Basic Format Specifiers\n\n" +
                    "There are different format specifiers for each data type. Here are some of them:\n"+

                            "Format Specifier->\t\t"+"Data Type\n" +
                            "%d or %i ->\t\t\t\t\tint\n" +
                            "%f->\t\t\t\t\tfloat\n" +
                            "%lf->\t\t\t\t\tdouble\n" +
                            "%c->\t\t\t\t\tchar"
                    );
            arrayList.add(hashMap);

            hashMap=new HashMap<>();
            hashMap.put("name","04.Set Decimal Precision\n" +
                    "You have probably already noticed that if you print a floating point number, the output will show many digits after the decimal point:\n"+
                    "Example\n"+
                            "#include <stdio.h>\n" +
                            "\n" +
                            "int main() {\n" +
                            "  float myFloatNum = 3.5;\n" +
                            "\n" +
                            "  printf(\"%f\\n\", myFloatNum); // Default will show 6 digits after the decimal point\n" +
                            "  printf(\"%.1f\\n\", myFloatNum); // Only show 1 digit\n" +
                            "  printf(\"%.2f\\n\", myFloatNum); // Only show 2 digits\n" +
                            "  printf(\"%.4f\", myFloatNum);   // Only show 4 digits\n" +
                            "  return 0;\n" +
                            "}\n"+
                    "OUTPUT :"+
                    "3.500000\n" +
                            "3.5\n" +
                            "3.50\n" +
                            "3.5000"
                    );
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "      End Hare your Basic Part \n"+
                    "Go Your Next step Condition \n"+
                    "\uD83D\uDCA0Practice makes perfect Man \uD83D\uDCA0\n"
            );
            arrayList.add(hashMap);









        }


     else if(element.equals("cpp")){
            hashMap = new HashMap<>();
            hashMap.put("name", "data_types_tutorial.dart\nC++ offers the programmer a rich assortment of built-in as well as user defined data types. Following table lists down seven basic C++ data types −\n" +
                    "\n" +
                    "Type   Keyword\n" +
                    "---------------\n" +
                    "Boolean    bool\n" +
                    "Character    char\n" +
                    "Integer    int\n" +
                    "Floating point    float\n" +
                    "Double floating point    double\n" +
                    "Valueless    void\n" +
                    "Wide character    wchar_t");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main() {\n" +
                    "   cout << \"Size of char : \" << sizeof(char) << endl;\n" +
                    "   cout << \"Size of int : \" << sizeof(int) << endl;\n" +
                    "   cout << \"Size of short int : \" << sizeof(short int) << endl;\n" +
                    "   cout << \"Size of long int : \" << sizeof(long int) << endl;\n" +
                    "   cout << \"Size of float : \" << sizeof(float) << endl;\n" +
                    "   cout << \"Size of double : \" << sizeof(double) << endl;\n" +
                    "   cout << \"Size of wchar_t : \" << sizeof(wchar_t) << endl;\n" +
                    "\n" +
                    "   return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\nSize of char : 1\n" +
                    "Size of int : 4\n" +
                    "Size of short int : 2\n" +
                    "Size of long int : 4\n" +
                    "Size of float : 4\n" +
                    "Size of double : 8\n" +
                    "Size of wchar_t : 4");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Several of the basic types can be modified using one or more of these type modifiers −\n" +
                    "\n" +
                    "\uD83D\uDCA0 signed\n" +
                    "\uD83D\uDCA0 unsigned\n" +
                    "\uD83D\uDCA0 short\n" +
                    "\uD83D\uDCA0 long\n" +
                    "\n" +
                    "\uD83D\uDCA0 This example uses endl, which inserts a new-line character after every line and << operator is being used to pass multiple values out to the screen. We are also using sizeof() operator to get size of various data types.'''),\n" +
                    "");
            arrayList.add(hashMap);


        } else if (element.equals("java")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "Data Types in Java\nData types specify the different sizes and values that can be stored in the variable. There are two types of data types in Java:\n" +
                    "\n" +
                    "Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.\n" +
                    "Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.\n" +
                    "Java Primitive Data Types\n" +
                    "In Java language, primitive data types are the building blocks of data manipulation. These are the most basic data types available in Java language.\n" +
                    "\n" +
                    "Java is a statically-typed programming language. It means, all variables must be declared before its use. That is why we need to declare variable's type and name.\n" +
                    "\n" +
                    "There are 8 types of primitive data types:\n" +
                    "\n" +
                    "boolean data type\n" +
                    "byte data type\n" +
                    "char data type\n" +
                    "short data type\n" +
                    "int data type\n" +
                    "long data type\n" +
                    "float data type\n" +
                    "double data type");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "int myNum = 100000;\n" +
                    "System.out.println(myNum);");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\n100000");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "int myNum = 5;   // Integer (whole number)\n" +
                    "float myFloatNum = 5.99f;    // Floating point number\n" +
                    "char myLetter = 'D';         // Character\n" +
                    "boolean myBool = true;       // Boolean\n" +
                    "String myText = \"Hello\";     // String");
            arrayList.add(hashMap);





        }else if (element.equals("py")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "Python Data Types\nData types are the classification or categorization of data items. It represents the kind of value that tells what operations can be performed on a particular data. Since everything is an object in Python programming, data types are actually classes and variables are instance (object) of these classes.\n" +
                    "\n" +
                    "Following are the standard or built-in data type of Python:\n" +
                    "\n" +
                    "Numeric\n" +
                    "Sequence Type\n" +
                    "Boolean\n" +
                    "Set\n" +
                    "Dictionary");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "# Python program to \n" +
                    "# demonstrate numeric value\n" +
                    "\n" +
                    "a = 5\n" +
                    "print(\"Type of a: \", type(a))\n" +
                    "\n" +
                    "b = 5.0\n" +
                    "print(\"\\nType of b: \", type(b))\n" +
                    "\n" +
                    "c = 2 + 4j\n" +
                    "print(\"\\nType of c: \", type(c))");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\nType of a:  <class 'int'>\n" +
                    "\n" +
                    "Type of b:  <class 'float'>\n" +
                    "\n" +
                    "Type of c:  <class 'complex'>");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "This is how datatypes works!");
            arrayList.add(hashMap);



        }else if (element.equals("js")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "JS Data-types\nA value in JavaScript is always of a certain type. For example, a string or a number.\n" +
                    "\n" +
                    "There are eight basic data types in JavaScript. Here, we’ll cover them in general and in the next chapters we’ll talk about each of them in detail.\n" +
                    "\n" +
                    "We can put any type in a variable. For example, a variable can at one moment be a string and then store a number:");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "/ BigInt value\n" +
                    "const value1 = 900719925124740998n;\n" +
                    "\n" +
                    "// Adding two big integers\n" +
                    "const result1 = value1 + 1n;\n" +
                    "console.log(result1); // \"900719925124740999n\"\n" +
                    "\n" +
                    "const value2 = 900719925124740998n;\n" +
                    "\n" +
                    "// Error! BitInt and number cannot be added\n" +
                    "const result2 = value2 + 1; \n" +
                    "console.log(result2);");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\n900719925124740999n\n" +
                    "Uncaught TypeError: Cannot mix BigInt and other types");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Note: BigInt was introduced in the newer version of JavaScript and is not supported by many browsers including Safari.");
            arrayList.add(hashMap);





        }else{

            Toast.makeText(this, "Error app Please Try Again Later", Toast.LENGTH_SHORT).show();
        }












        DataType.MyAdapter myadapter = new DataType.MyAdapter();
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