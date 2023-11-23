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

public class St_Final extends AppCompatActivity {

    private ListView request_list;
    SharedPreferences sharedPreferences;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.strings);



        request_list = findViewById(R.id.listview);


        sharedPreferences = getSharedPreferences("fab_program", Context.MODE_PRIVATE);
        String element = sharedPreferences.getString("language", "Nothing");

        sharedPreferences = getSharedPreferences("basic_to_advance", Context.MODE_PRIVATE);

        if(element.equals("c")){

            hashMap=new HashMap<>();
            hashMap.put("name","String");
            arrayList.add(hashMap);

            hashMap=new HashMap<>();
            hashMap.put("name",
                    "Strings are used for storing text/characters.\n" +
                    "\n" +
                    "For example, \"Hello World\" is a string of characters.\n" +
                    "\n" +
                    "Unlike many other programming languages, C does not have a String type to easily create string variables. Instead, you must use the char type and create an array of characters to make a string in C:\n"+
                            "char greetings[] = \"Hello World!\";\n"+
                            "Note that you have to use double quotes (\"\").\n" +
                            "\n" +
                            "To output the string, you can use the printf() function together with the format specifier %s to tell C that we are now working with strings."
            );
            arrayList.add(hashMap);

            hashMap=new HashMap<>();
            hashMap.put("name","Example :\n"+
                            "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  char greetings[] = \"Hello World!\";\n" +
                    "  printf(\"%s\", greetings);\n" +
                    " \n" +
                    "  return 0;\n" +
                    "}"+
                            "OUTPUT : "+
                    "Hello World!"
            );
            arrayList.add(hashMap);

            hashMap=new HashMap<>();
            hashMap.put("name","1.2 Access Strings\n" +
                    "Since strings are actually arrays in C, you can access a string by referring to its index number inside square brackets [].\n" +
                    "\n" +
                    "This example prints the first character (0) in greetings:\n"+
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  char greetings[] = \"Hello World!\";\n" +
                    "  printf(\"%c\", greetings[0]);\n" +
                    " \n" +
                    "  return 0;\n" +
                    "}\n"+
                    "OUTPUT :"+
                    "\n" +
                    "H\n"+
                    "Note that we have to use the %c format specifier to print a single character."
            );
            arrayList.add(hashMap);

            hashMap=new HashMap<>();
            hashMap.put("name","Modify Strings\n" +
                    "To change the value of a specific character in a string, refer to the index number, and use single quotes:\n"+
                    "Example :"+
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  char greetings[] = \"Hello World!\";\n" +
                    "  greetings[0] = 'F';\n" +
                    "  printf(\"%s\", greetings);\n" +
                    "\n" +
                    "  return 0;\n" +
                    "}"+
                    "\n" +
                    "Fello World!");
            arrayList.add(hashMap);


            hashMap=new HashMap<>();
            hashMap.put("name","1.4 Loop Through a String\n" +
                    "You can also loop through the characters of a string, using a for loop:\n"+
                    "Example :\n"+
                    "#include <stdio.h>\n" +
                    "\n" +
                    "int main() {\n" +
                    "  char carName[] = \"Volvo\";\n" +
                    "  int i;\n" +
                    "  \n" +
                    "  for (i = 0; i < 5; ++i) {\n" +
                    "    printf(\"%c\\n\", carName[i]);\n" +
                    "  }\n" +
                    "\n" +
                    "  return 0;\n" +
                    "}\n"+
                    "Output :"+
                    "V\n" +
                    "o\n" +
                    "l\n" +
                    "v\n" +
                    "o"
            );
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "      End Hare c language  String  \n"+
                    "Go Your Next step structure \n"+
                    "\uD83D\uDCA0Practice makes perfect Man \uD83D\uDCA0\n"
            );
            arrayList.add(hashMap);

        }



        else if(element.equals("cpp")){
            hashMap = new HashMap<>();
            hashMap.put("name", "C++ string\n C++ provides following two types of string representations −\n" +
                    "      The C-style character string.\n" +
                    "The string class type introduced with Standard C++.\n" +
                    "The C-Style Character String\n" +
                    "The C-style character string originated within the C language and continues to be supported within C++. This string is actually a one-dimensional array of characters which is terminated by a null character '\\0'. Thus a null-terminated string contains the characters that comprise the string followed by a null.\n" +
                    "\n" +
                    "The following declaration and initialization create a string consisting of the word \"Hello\". To hold the null character at the end of the array, the size of the character array containing the string is one more than the number of characters in the word \"Hello.\"\n" +
                    "char greeting[6] = {'H', 'e', 'l', 'l', 'o', '\\0'};\n" +
                    "If you follow the rule of array initialization, then you can write the above statement as follows −\n" +
                    "\n" +
                    "char greeting[] = \"Hello\";\n" +
                    "Actually, you do not place the null character at the end of a string constant. The C++ compiler automatically places the '\\0' at the end of the string when it initializes the array. Let us try to print above-mentioned string −");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main () {\n" +
                    "\n" +
                    "   char greeting[6] = {'H', 'e', 'l', 'l', 'o', '\\0'};\n" +
                    "\n" +
                    "   cout << \"Greeting message: \";\n" +
                    "   cout << greeting << endl;\n" +
                    "\n" +
                    "   return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs: \nGreeting message: Hello");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C++ supports a wide range of functions that manipulate null-terminated strings −\nSr.No    Function & Purpose\n" +
                    "1\n" +
                    "strcpy(s1, s2);\n" +
                    "\n" +
                    "Copies string s2 into string s1.\n" +
                    "\n" +
                    "2\n" +
                    "strcat(s1, s2);\n" +
                    "\n" +
                    "Concatenates string s2 onto the end of string s1.\n" +
                    "\n" +
                    "3\n" +
                    "strlen(s1);\n" +
                    "\n" +
                    "Returns the length of string s1.\n" +
                    "\n" +
                    "4\n" +
                    "strcmp(s1, s2);\n" +
                    "\n" +
                    "Returns 0 if s1 and s2 are the same; less than 0 if s1<s2; greater than 0 if s1>s2.\n" +
                    "\n" +
                    "5\n" +
                    "strchr(s1, ch);\n" +
                    "\n" +
                    "Returns a pointer to the first occurrence of character ch in string s1.\n" +
                    "\n" +
                    "6\n" +
                    "strstr(s1, s2);\n" +
                    "\n" +
                    "Returns a pointer to the first occurrence of string s2 in string s1.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "#include <cstring>\n" +
                    "\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "int main () {\n" +
                    "\n" +
                    "   char str1[10] = \"Hello\";\n" +
                    "   char str2[10] = \"World\";\n" +
                    "   char str3[10];\n" +
                    "   int  len ;\n" +
                    "\n" +
                    "   // copy str1 into str3\n" +
                    "   strcpy( str3, str1);\n" +
                    "   cout << \"strcpy( str3, str1) : \" << str3 << endl;\n" +
                    "\n" +
                    "   // concatenates str1 and str2\n" +
                    "   strcat( str1, str2);\n" +
                    "   cout << \"strcat( str1, str2): \" << str1 << endl;\n" +
                    "\n" +
                    "   // total lenghth of str1 after concatenation\n" +
                    "   len = strlen(str1);\n" +
                    "   cout << \"strlen(str1) : \" << len << endl;\n" +
                    "\n" +
                    "   return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "outputs:\nstrcpy( str3, str1) : Hello\n" +
                    "strcat( str1, str2): HelloWorld\n" +
                    "strlen(str1) : 10");
            arrayList.add(hashMap);


        } else if (element.equals("java")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "String in Java:\n In Java, string is basically an object that represents sequence of char values. An array of characters works same as Java string. For example:\n" +
                    "\n" +
                    "char[] ch={'j','a','v','a','t','p','o','i','n','t'};\n" +
                    "String s=new String(ch);\n" +
                    "is same as:\n" +
                    "\n" +
                    "String s=\"javatpoint\";\n" +
                    "Java String class provides a lot of methods to perform operations on strings such as compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring() etc.\n" +
                    "\n" +
                    "The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.\n" +
                    "CharSequence Interface\n" +
                    "The CharSequence interface is used to represent the sequence of characters. String, StringBuffer and StringBuilder classes implement it. It means, we can create strings in Java by using these three classes.\n" +
                    "The Java String is immutable which means it cannot be changed. Whenever we change any string, a new instance is created. For mutable strings, you can use StringBuffer and StringBuilder classes.\n" +
                    "\n" +
                    "We will discuss immutable string later. Let's first understand what String in Java is and how to create the String object.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "public class StringExample{\n" +
                    "public static void main(String args[]){\n" +
                    "String s1=\"java\";//creating string by Java string literal\n" +
                    "char ch[]={'s','t','r','i','n','g','s'};\n" +
                    "String s2=new String(ch);//converting char array to string\n" +
                    "String s3=new String(\"example\");//creating Java string by new keyword\n" +
                    "System.out.println(s1);\n" +
                    "System.out.println(s2);\n" +
                    "System.out.println(s3);\n" +
                    "}}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\njava\n" +
                    "strings\n" +
                    "example");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "The above code, converts a char array into a String object. And displays the String objects s1, s2, and s3 on console using println() method.");
            arrayList.add(hashMap);





        }else if (element.equals("py")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "Python Strong:\nA string is a sequence of characters.\n" +
                    "\n" +
                    "A character is simply a symbol. For example, the English language has 26 characters.\n" +
                    "\n" +
                    "Computers do not deal with characters, they deal with numbers (binary). Even though you may see characters on your screen, internally it is stored and manipulated as a combination of 0s and 1s.\n" +
                    "\n" +
                    "This conversion of character to a number is called encoding, and the reverse process is decoding. ASCII and Unicode are some of the popular encodings used.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "# defining strings in Python\n" +
                    "# all of the following are equivalent\n" +
                    "my_string = 'Hello'\n" +
                    "print(my_string)\n" +
                    "\n" +
                    "my_string = \"Hello\"\n" +
                    "print(my_string)\n" +
                    "\n" +
                    "my_string = 'Hello'\n" +
                    "print(my_string)\n" +
                    "\n" +
                    "# triple quotes string can extend multiple lines\n" +
                    "my_string = \"\"\"Hello, welcome to\n" +
                    "           the world of Python\"\"\"\n" +
                    "print(my_string)");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Hello\n" +
                    "Hello\n" +
                    "Hello\n" +
                    "Hello, welcome to\n" +
                    "           the world of Python");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Strings can be created by enclosing characters inside a single quote or double-quotes. Even triple quotes can be used in Python but generally used to represent multiline strings and docstrings.");
            arrayList.add(hashMap);



        }else if (element.equals("js")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "JS String\nThere are 2 ways to create string in JavaScript\n" +
                    "\n" +
                    "By string literal\n" +
                    "By string object (using new keyword)");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "var s1=\"javascript \";\n" +
                    "var s2=\"concat example\";\n" +
                    "var s3=s1.concat(s2);\n" +
                    "document.write(s3);");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\njavascript concat example");
            arrayList.add(hashMap);







        }else{

            Toast.makeText(this, "Error app Please Try Again Later", Toast.LENGTH_SHORT).show();
        }












        St_Final.MyAdapter myadapter = new St_Final.MyAdapter();
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