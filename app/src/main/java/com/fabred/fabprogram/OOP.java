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

public class OOP extends AppCompatActivity {

    private ListView request_list;
    SharedPreferences sharedPreferences;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oop);



        request_list = findViewById(R.id.listview);


        sharedPreferences = getSharedPreferences("fab_program", Context.MODE_PRIVATE);
        String element = sharedPreferences.getString("language", "Nothing");

        sharedPreferences = getSharedPreferences("basic_to_advance", Context.MODE_PRIVATE);

        if(element.equals("c")){
            hashMap = new HashMap<>();
            hashMap.put("name","Although C language does not have an object oriented part, we will learn the structure");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name","Structure In C Language ");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name","\n" +
                    "In C, a structure is a composite data type that allows grouping variables of different types under a single name. It facilitates the creation of user-defined data structures. Structs enable the organization and storage of related data items, promoting modularity and readability in code. Each member in a structure can have a distinct data type, and data members are accessed using the dot (.) operator. Structs are fundamental for creating complex data structures and organizing data logically.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name","Example 01: \n"+
                    "//Structure Declaration and Usage:\n"+
                    "#include <stdio.h>\n" +
                    "\n" +
                    "// Define a structure\n" +
                    "struct Point {\n" +
                    "    int x;\n" +
                    "    int y;\n" +
                    "};\n" +
                    "\n" +
                    "int main() {\n" +
                    "    // Declare and initialize a structure variable\n" +
                    "    struct Point p1 = {10, 20};\n" +
                    "\n" +
                    "    // Access and print structure members\n" +
                    "    printf(\"Coordinates: (%d, %d)\\n\", p1.x, p1.y);\n" +
                    "\n" +
                    "    return 0;\n" +
                    "}\n"+
                    "OUTPUT"+
                    "Coordinates: (10, 20)\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name","Example 02 \n"+
                    "//Array of Structures:"+
                    "#include <stdio.h>\n" +
                    "\n" +
                    "// Define a structure\n" +
                    "struct Student {\n" +
                    "    char name[50];\n" +
                    "    int age;\n" +
                    "};\n" +
                    "\n" +
                    "int main() {\n" +
                    "    // Declare an array of structures\n" +
                    "    struct Student students[2] = {{\"Alice\", 20}, {\"Bob\", 22}};\n" +
                    "\n" +
                    "    // Access and print structure members in an array\n" +
                    "    for (int i = 0; i < 2; i++) {\n" +
                    "        printf(\"Student %d: Name: %s, Age: %d\\n\", i + 1, students[i].name, students[i].age);\n" +
                    "    }\n" +
                    "\n" +
                    "    return 0;\n" +
                    "}\n"+
                    "OUTPUT"+
                    "Student 1: Name: Alice, Age: 20\n" +
                    "Student 2: Name: Bob, Age: 22\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name","In C++, the primary difference between a class and a structure lies in the default access specifier and the default access level for members.\n" +
                    "\n" +
                    "Class:\n" +
                    "\n" +
                    "In a class, the default access specifier is \"private.\"\n" +
                    "Members (data and functions) are private by default and can only be accessed within the class unless explicitly specified otherwise using access specifiers like public or protected.\n" +
                    "Commonly used when encapsulation and abstraction are essential for implementation hiding.\n\n"+
                    "Structure:" +
                    "\n\n" +

                    "In a structure, the default access specifier is \"public.\"\n" +
                    "Members are public by default and can be accessed directly from outside the structure.\n" +
                    "Often used for simple data structures where encapsulation is not a primary concern.\n");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "      End Hare c language  Structure  \n"+
                    "        Go Your Next step problem solving and join competitive programming  \n"+
                    "\uD83D\uDCA0Practice makes perfect Man \uD83D\uDCA0\n"
            );
            arrayList.add(hashMap);


        }

      else if(element.equals("cpp")){
            hashMap = new HashMap<>();
            hashMap.put("name", "OOPs (Object Oriented Programming System)\n Object\n" +
                    "\uD83D\uDCA0 Class\n" +
                    "\uD83D\uDCA0 Inheritance\n" +
                    "\uD83D\uDCA0 Polymorphism\n" +
                    "\uD83D\uDCA0 Abstraction\n" +
                    "\uD83D\uDCA0 Encapsulation\n" +
                    "\n" +
                    "\uD83D\uDCA0 Object\n" +
                    "Any entity that has state and behavior is known as an object. For example: chair, pen, table, keyboard, bike etc. It can be physical and logical.\n" +
                    "\n" +
                    "\uD83D\uDCA0 Class\n" +
                    "Collection of objects is called class. It is a logical entity.\n" +
                    "\n" +
                    "\uD83D\uDCA0 Inheritance\n" +
                    "When one object acquires all the properties and behaviours of parent object i.e. known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism.\n" +
                    "\n" +
                    "\uD83D\uDCA0 Polymorphism\n" +
                    "When one task is performed by different ways i.e. known as polymorphism. For example: to convince the customer differently, to draw something e.g. shape or rectangle etc.\n" +
                    "\n" +
                    "In C++, we use Function overloading and Function overriding to achieve polymorphism.\n" +
                    "\n" +
                    "\uD83D\uDCA0 Abstraction\n" +
                    "Hiding internal details and showing functionality is known as abstraction. For example: phone call, we don't know the internal processing.\n" +
                    "\n" +
                    "In C++, we use abstract class and interface to achieve abstraction.\n" +
                    "\n" +
                    "\uD83D\uDCA0 Encapsulation\n" +
                    "Binding (or wrapping) code and data together into a single unit is known as encapsulation. For example: capsule, it is wrapped with different medicines.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Advantage of OOPs over Procedure-oriented programming language\n" +
                    "OOPs makes development and maintenance easier where as in Procedure-oriented programming language it is not easy to manage if code grows as project size grows.\n" +
                    "OOPs provide data hiding whereas in Procedure-oriented programming language a global data can be accessed from anywhere.\n" +
                    "OOPs provide ability to simulate real-world event much more effectively. We can provide the solution of real word problem if we are using the Object-Oriented Programming language.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C++ class:\nIn C++, class is a group of similar objects. It is a template from which objects are created. It can have fields, methods, constructors etc.\n" +
                    "\n" +
                    "Let's see an example of C++ class that has three fields only.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "class Student\n" +
                    " {\n" +
                    "     public:\n" +
                    "     int id;  //field or data member\n" +
                    "     float salary; //field or data member\n" +
                    "     String name;//field or data member\n" +
                    " }");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "C++ Object and Class Example.\nLet's see an example of class that has two fields: id and name. It creates instance of the class, initializes the object and prints the object value.\n" +
                    " ");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "class Student {\n" +
                    "   public:\n" +
                    "      int id;//data member (also instance variable)\n" +
                    "      string name;//data member(also instance variable)\n" +
                    "};\n" +
                    "int main() {\n" +
                    "    Student s1; //creating an object of Student\n" +
                    "    s1.id = 201;\n" +
                    "    s1.name = \"Fahim Shariar\";\n" +
                    "    cout<<s1.id<<endl;\n" +
                    "    cout<<s1.name<<endl;\n" +
                    "    return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\n201\n" +
                    "Fahim Shariar");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C++ Constructor\nIn C++, constructor is a special method which is invoked automatically at the time of object creation. It is used to initialize the data members of new object generally. The constructor in C++ has the same name as class or structure.\n" +
                    "\n" +
                    "There can be two types of constructors in C++.\n" +
                    "\n" +
                    "Default constructor\n" +
                    "Parameterized constructor\n" +
                    "C++ Default Constructor\n" +
                    "A constructor which has no argument is known as default constructor. It is invoked at the time of creating object.\n" +
                    "\n" +
                    "Let's see the simple example of C++ default Constructor.");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "class Employee\n" +
                    " {\n" +
                    "   public:\n" +
                    "        Employee()\n" +
                    "        {\n" +
                    "            cout<<\"Default Constructor Invoked\"<<endl;\n" +
                    "        }\n" +
                    "};\n" +
                    "int main(void)\n" +
                    "{\n" +
                    "    Employee e1; //creating an object of Employee\n" +
                    "    Employee e2;\n" +
                    "    return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nDefault Constructor Invoked \n" +
                    "Default Constructor Invoked");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C++ Parameterized Constructor\nA constructor which has parameters is called parameterized constructor. It is used to provide different values to distinct objects.\n" +
                    "\n" +
                    "Let's see the simple example of C++ Parameterized Constructor");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "class Employee {\n" +
                    "   public:\n" +
                    "       int id;//data member (also instance variable)\n" +
                    "       string name;//data member(also instance variable)\n" +
                    "       float salary;\n" +
                    "       Employee(int i, string n, float s)\n" +
                    "        {\n" +
                    "            id = i;\n" +
                    "            name = n;\n" +
                    "            salary = s;\n" +
                    "        }\n" +
                    "       void display()\n" +
                    "        {\n" +
                    "            cout<<id<<\"  \"<<name<<\"  \"<<salary<<endl;\n" +
                    "        }\n" +
                    "};\n" +
                    "int main(void) {\n" +
                    "    Employee e1 =Employee(101, \"Fahim\", 890000); //creating an object of Employee \n" +
                    "    Employee e2=Employee(102, \"Fahad\", 59000); \n" +
                    "    e1.display();\n" +
                    "    e2.display();\n" +
                    "    return 0;\n" +
                    "}");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\n101  Fahim  890000\n" +
                    "102  Fahad  59000'");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C++ Inheritance\nIn C++, inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically. In such way, you can reuse, extend or modify the attributes and behaviors which are defined in other class.\n" +
                    "\n" +
                    "In C++, the class which inherits the members of another class is called derived class and the class whose members are inherited is called base class. The derived class is the specialized class for the base class.Types Of Inheritance\n" +
                    "C++ supports five types of inheritance:\n" +
                    "\n" +
                    "Single inheritance\n" +
                    "Multiple inheritance\n" +
                    "Hierarchical inheritance\n" +
                    "Multilevel inheritance\n" +
                    "Hybrid inheritance\n" +
                    "Derived Classes\n" +
                    "A Derived class is defined as the class derived from the base class.\n" +
                    "C++ Single Level Inheritance Example: Inheriting Fields\n" +
                    "When one class inherits another class, it is known as single level inheritance. Let's see the example of single level inheritance which inherits the fields only.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    " class Account {\n" +
                    "   public:\n" +
                    "   float salary = 60000;\n" +
                    " };\n" +
                    "   class Programmer: public Account {\n" +
                    "   public:\n" +
                    "   float bonus = 5000;\n" +
                    "   };\n" +
                    "int main(void) {\n" +
                    "     Programmer p1;\n" +
                    "     cout<<\"Salary: \"<<p1.salary<<endl;\n" +
                    "     cout<<\"Bonus: \"<<p1.bonus<<endl;\n" +
                    "    return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "outputs:\nalary: 60000\n" +
                    "Bonus: 5000");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "The Syntax of Derived class:\n" +
                    "\n" +
                    "class derived_class_name :: visibility-mode base_class_name\n" +
                    "{\n" +
                    "    // body of the derived class.\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C++ Single Level Inheritance Example: Inheriting Methods");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    " class Animal {\n" +
                    "   public:\n" +
                    " void eat() {\n" +
                    "    cout<<\"Eating...\"<<endl;\n" +
                    " }\n" +
                    "   };\n" +
                    "   class Dog: public Animal\n" +
                    "   {\n" +
                    "       public:\n" +
                    "     void bark(){\n" +
                    "    cout<<\"Barking...\";\n" +
                    "     }\n" +
                    "   };\n" +
                    "int main(void) {\n" +
                    "    Dog d1;\n" +
                    "    d1.eat();\n" +
                    "    d1.bark();\n" +
                    "    return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nEating...\n" +
                    "Barking...");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C++ Multi Level Inheritance Example\nWhen one class inherits another class which is further inherited by another class, it is known as multi level inheritance in C++. Inheritance is transitive so the last derived class acquires all the members of all its base classes.\n" +
                    "\n" +
                    "Let's see the example of multi level inheritance in C++.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    " class Animal {\n" +
                    "   public:\n" +
                    " void eat() {\n" +
                    "    cout<<\"Eating...\"<<endl;\n" +
                    " }\n" +
                    "   };\n" +
                    "   class Dog: public Animal\n" +
                    "   {\n" +
                    "       public:\n" +
                    "     void bark(){\n" +
                    "    cout<<\"Barking...\"<<endl;\n" +
                    "     }\n" +
                    "   };\n" +
                    "   class BabyDog: public Dog\n" +
                    "   {\n" +
                    "       public:\n" +
                    "     void weep() {\n" +
                    "    cout<<\"Weeping...\";\n" +
                    "     }\n" +
                    "   };\n" +
                    "int main(void) {\n" +
                    "    BabyDog d1;\n" +
                    "    d1.eat();\n" +
                    "    d1.bark();\n" +
                    "     d1.weep();\n" +
                    "     return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nEating...\n" +
                    "Barking...\n" +
                    "Weeping...");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C++ Polymorphism\nThe term \"Polymorphism\" is the combination of \"poly\" + \"morphs\" which means many forms. It is a greek word. In object-oriented programming, we use 3 main concepts: inheritance, encapsulation, and polymorphism.\n" +
                    "Real Life Example Of Polymorphism\n" +
                    "Let's consider a real-life example of polymorphism. A lady behaves like a teacher in a classroom, mother or daughter in a home and customer in a market. Here, a single person is behaving differently according to the situations.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "class A                                  //  base class declaration.\n" +
                    "  {\n" +
                    "       int a;\n" +
                    "       public:\n" +
                    "       void display()\n" +
                    "       {\n" +
                    "             cout<< \"Class A \";\n" +
                    "        }\n" +
                    "  };\n" +
                    "class B : public A                       //  derived class declaration.\n" +
                    "{\n" +
                    "    int b;\n" +
                    "    public:\n" +
                    "   void display()\n" +
                    "  {\n" +
                    "        cout<<\"Class B\";\n" +
                    "  }\n" +
                    "};");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C++ Runtime Polymorphism Example\nLet's see a simple example of run time polymorphism in C++.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "class Animal {\n" +
                    "    public:\n" +
                    "void eat(){\n" +
                    "cout<<\"Eating...\";\n" +
                    "    }\n" +
                    "};\n" +
                    "class Dog: public Animal\n" +
                    "{\n" +
                    " public:\n" +
                    " void eat()\n" +
                    "    {           cout<<\"Eating bread...\";\n" +
                    "    }\n" +
                    "};\n" +
                    "int main(void) {\n" +
                    "   Dog d = Dog();\n" +
                    "   d.eat();\n" +
                    "   return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\nEating bread...");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "C++ Run time Polymorphism Example: By using two derived class");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "class Shape {                              //  base class\n" +
                    "    public:\n" +
                    "virtual void draw(){                      // virtual function\n" +
                    "cout<<\"drawing...\"<<endl;\n" +
                    "    }\n" +
                    "};\n" +
                    "class Rectangle: public Shape             //  inheriting Shape class.\n" +
                    "{\n" +
                    " public:\n" +
                    " void draw()\n" +
                    "   {\n" +
                    "       cout<<\"drawing rectangle...\"<<endl;\n" +
                    "    }\n" +
                    "};\n" +
                    "class Circle: public Shape              //  inheriting Shape class.\n" +
                    "\n" +
                    "{\n" +
                    " public:\n" +
                    " void draw()\n" +
                    "   {\n" +
                    "      cout<<\"drawing circle...\"<<endl;\n" +
                    "   }\n" +
                    "};\n" +
                    "int main(void) {\n" +
                    "    Shape *s;                      //  base class pointer.\n" +
                    "    Shape sh;                      // base class object.\n" +
                    "       Rectangle rec;\n" +
                    "        Circle cir;\n" +
                    "      s=&sh;\n" +
                    "     s->draw();\n" +
                    "        s=&rec;\n" +
                    "     s->draw();\n" +
                    "    s=?\n" +
                    "    s->draw();\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\ndrawing...\n" +
                    "drawing rectangle...\n" +
                    "drawing circle...");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Interfaces in C++ (Abstract Classes)\nAbstract classes are the way to achieve abstraction in C++. Abstraction in C++ is the process to hide the internal details and showing functionality only. Abstraction can be achieved by two ways:\n" +
                    "\n" +
                    "Abstract class\n" +
                    "Interface\n" +
                    "C++ Abstract class\n" +
                    "In C++ class is made abstract by declaring at least one of its functions as <>strong>pure virtual function. A pure virtual function is specified by placing \"= 0\" in its declaration. Its implementation must be provided by derived classes.\n" +
                    "\n" +
                    "Let's see an example of abstract class in C++ which has one abstract method draw(). Its implementation is provided by derived classes: Rectangle and Circle. Both classes have different implementation.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    " class Shape\n" +
                    "{\n" +
                    "    public:\n" +
                    "    virtual void draw()=0;\n" +
                    "};\n" +
                    " class Rectangle : Shape\n" +
                    "{\n" +
                    "    public:\n" +
                    "     void draw()\n" +
                    "    {\n" +
                    "        cout < <\"drawing rectangle...\" < <endl;\n" +
                    "    }\n" +
                    "};\n" +
                    "class Circle : Shape\n" +
                    "{\n" +
                    "    public:\n" +
                    "     void draw()\n" +
                    "    {\n" +
                    "        cout <<\"drawing circle...\" < <endl;\n" +
                    "    }\n" +
                    "};\n" +
                    "int main( ) {\n" +
                    "    Rectangle rec;\n" +
                    "    Circle cir;\n" +
                    "    rec.draw();\n" +
                    "    cir.draw();\n" +
                    "   return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\ndrawing rectangle...\n" +
                    "drawing circle...");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Data Encapsulation in C++\nAll C++ programs are composed of the following two fundamental elements −\n" +
                    "\n" +
                    "Program statements (code) − This is the part of a program that performs actions and they are called functions.\n" +
                    "\n" +
                    "Program data − The data is the information of the program which gets affected by the program functions.\n" +
                    "\n" +
                    "Encapsulation is an Object Oriented Programming concept that binds together the data and functions that manipulate the data, and that keeps both safe from outside interference and misuse. Data encapsulation led to the important OOP concept of data hiding.\n" +
                    "\n" +
                    "Data encapsulation is a mechanism of bundling the data, and the functions that use them and data abstraction is a mechanism of exposing only the interfaces and hiding the implementation details from the user.\n" +
                    "C++ supports the properties of encapsulation and data hiding through the creation of user-defined types, called classes. We already have studied that a class can contain private, protected and public members. By default, all items defined in a class are private. The variables length, breadth, and height are private. This means that they can be accessed only by other members of the Box class, and not by any other part of your program. This is one way encapsulation is achieved.\n" +
                    "\n" +
                    "To make parts of a class public (i.e., accessible to other parts of your program), you must declare them after the public keyword. All variables or functions defined after the public specifier are accessible by all other functions in your program.\n" +
                    "\n" +
                    "Making one class a friend of another exposes the implementation details and reduces encapsulation. The ideal is to keep as many of the details of each class hidden from all other classes as possible.\n" +
                    "Data Encapsulation Example\n" +
                    "Any C++ program where you implement a class with public and private members is an example of data encapsulation and data abstraction. Consider the following example −\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#include <iostream>\n" +
                    "using namespace std;\n" +
                    "\n" +
                    "class Adder {\n" +
                    "   public:\n" +
                    "      // constructor\n" +
                    "      Adder(int i = 0) {\n" +
                    "         total = i;\n" +
                    "      }\n" +
                    "\n" +
                    "      // interface to outside world\n" +
                    "      void addNum(int number) {\n" +
                    "         total += number;\n" +
                    "      }\n" +
                    "\n" +
                    "      // interface to outside world\n" +
                    "      int getTotal() {\n" +
                    "         return total;\n" +
                    "      };\n" +
                    "\n" +
                    "   private:\n" +
                    "      // hidden data from outside world\n" +
                    "      int total;\n" +
                    "};\n" +
                    "\n" +
                    "int main() {\n" +
                    "   Adder a;\n" +
                    "\n" +
                    "   a.addNum(10);\n" +
                    "   a.addNum(20);\n" +
                    "   a.addNum(30);\n" +
                    "\n" +
                    "   cout << \"Total \" << a.getTotal() <<endl;\n" +
                    "   return 0;\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nTotal 60");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "class Box {\n" +
                    "   public:\n" +
                    "      double getVolume(void) {\n" +
                    "         return length * breadth * height;\n" +
                    "      }\n" +
                    "\n" +
                    "   private:\n" +
                    "      double length;      // Length of a box\n" +
                    "      double breadth;     // Breadth of a box\n" +
                    "      double height;      // Height of a box\n" +
                    "};");
            arrayList.add(hashMap);



        } else if (element.equals("java")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "OOP in Java\nn this page, we will learn about the basics of OOPs. Object-Oriented Programming is a paradigm that provides many concepts, such as inheritance, data binding, polymorphism, etc.\n" +
                    "\n" +
                    "Simula is considered the first object-oriented programming language. The programming paradigm where everything is represented as an object is known as a truly object-oriented programming language.\n" +
                    "\n" +
                    "Smalltalk is considered the first truly object-oriented programming language.\n" +
                    "\n" +
                    "The popular object-oriented languages are Java, C#, PHP, Python, C++, etc.\n" +
                    "\n" +
                    "The main aim of object-oriented programming is to implement real-world entities, for example, object, classes, abstraction, inheritance, polymorphism, etc.\n" +
                    "\n" +
                    "OOPs (Object-Oriented Programming System)\n" +
                    "Object means a real-world entity such as a pen, chair, table, computer, watch, etc. Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies software development and maintenance by providing some concepts:\n" +
                    "\n" +
                    "Object\n" +
                    "Class\n" +
                    "Inheritance\n" +
                    "Polymorphism\n" +
                    "Abstraction\n" +
                    "Encapsulation\n" +
                    "Apart from these concepts, there are some other terms which are used in Object-Oriented design:\n" +
                    "\n" +
                    "Coupling\n" +
                    "Cohesion\n" +
                    "Association\n" +
                    "Aggregation\n" +
                    "Composition\n" +
                    "Object\n" +
                    "Java Object\n" +
                    "Any entity that has state and behavior is known as an object. For example, a chair, pen, table, keyboard, bike, etc. It can be physical or logical.\n" +
                    "\n" +
                    "An Object can be defined as an instance of a class. An object contains an address and takes up some space in memory. Objects can communicate without knowing the details of each other's data or code. The only necessary thing is the type of message accepted and the type of response returned by the objects.\n" +
                    "\n" +
                    "Example: A dog is an object because it has states like color, name, breed, etc. as well as behaviors like wagging the tail, barking, eating, etc.\n" +
                    "\n" +
                    "Class\n" +
                    "Collection of objects is called class. It is a logical entity.\n" +
                    "\n" +
                    "A class can also be defined as a blueprint from which you can create an individual object. Class doesn't consume any space.\n" +
                    "\n" +
                    "Inheritance\n" +
                    "When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism.\n" +
                    "\n" +
                    "Polymorphism in Java\n" +
                    "Polymorphism\n" +
                    "If one task is performed in different ways, it is known as polymorphism. For example: to convince the customer differently, to draw something, for example, shape, triangle, rectangle, etc.\n" +
                    "\n" +
                    "In Java, we use method overloading and method overriding to achieve polymorphism.\n" +
                    "\n" +
                    "Another example can be to speak something; for example, a cat speaks meow, dog barks woof, etc.\n" +
                    "\n" +
                    "Abstraction\n" +
                    "Hiding internal details and showing functionality is known as abstraction. For example phone call, we don't know the internal processing.\n" +
                    "\n" +
                    "In Java, we use abstract class and interface to achieve abstraction.\n" +
                    "\n" +
                    "Encapsulation in Java OOPs Concepts\n" +
                    "Encapsulation\n" +
                    "Binding (or wrapping) code and data together into a single unit are known as encapsulation. For example, a capsule, it is wrapped with different medicines.\n" +
                    "\n" +
                    "A java class is the example of encapsulation. Java bean is the fully encapsulated class because all the data members are private here.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\n100000");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Inheritance in Java\n'Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).\n" +
                    "\n" +
                    "The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.\n" +
                    "\n" +
                    "Inheritance represents the IS-A relationship which is also known as a parent-child relationship.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "'class Employee{\n" +
                    " float salary=40000;\n" +
                    "}\n" +
                    "class Programmer extends Employee{\n" +
                    " int bonus=10000;\n" +
                    " public static void main(String args[]){\n" +
                    "   Programmer p=new Programmer();\n" +
                    "   System.out.println(\"Programmer salary is:\"+p.salary);\n" +
                    "   System.out.println(\"Bonus of Programmer is:\"+p.bonus);\n" +
                    "}\n" +
                    "}");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\nProgrammer salary is:40000.0\n" +
                    " Bonus of programmer is:10000");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "In the above example, Programmer object can access the field of own class as well as of Employee class i.e. code reusability.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Java Polymorphism\nPolymorphism means \"many forms\", and it occurs when we have many classes that are related to each other by inheritance.\n" +
                    "\n" +
                    "Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.\n" +
                    "\n" +
                    "For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs, Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "lass Bike{\n" +
                    "  void run(){System.out.println(\"running\");}\n" +
                    "}\n" +
                    "class Splendor extends Bike{\n" +
                    "  void run(){System.out.println(\"running safely with 60km\");}\n" +
                    "\n" +
                    "  public static void main(String args[]){\n" +
                    "    Bike b = new Splendor();//upcasting\n" +
                    "    b.run();\n" +
                    "  }\n" +
                    "}");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "Output:\nrunning safely with 60km.");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "In this example, we are creating two classes Bike and Splendor. Splendor class extends Bike class and overrides its run() method. We are calling the run method by the reference variable of Parent class. Since it refers to the subclass object and subclass method overrides the Parent class method, the subclass method is invoked at runtime.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Abstract Classes and Methods\nData abstraction is the process of hiding certain details and showing only essential information to the user.\n" +
                    "Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).\n" +
                    "\n" +
                    "The abstract keyword is a non-access modifier, used for classes and methods:\n" +
                    "\n" +
                    "Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).\n" +
                    "\n" +
                    "Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).\n" +
                    "An abstract class can have both abstract and regular methods:''',\n" +
                    "      sampleProgram: '''abstract class Bike{\n" +
                    "  abstract void run();\n" +
                    "}\n" +
                    "class Honda4 extends Bike{\n" +
                    "void run(){System.out.println(\"running safely\");}\n" +
                    "public static void main(String args[]){\n" +
                    " Bike obj = new Honda4();\n" +
                    " obj.run();\n" +
                    "}\n" +
                    "}");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nrunning safely");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "In this example, Bike is an abstract class that contains only one abstract method run. Its implementation is provided by the Honda class.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Encapsulation in Java\nEncapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.\n" +
                    "\n" +
                    "encapsulation in java\n" +
                    "We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.\n");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "public class Person {\n" +
                    "  private String name; // private = restricted access\n" +
                    "\n" +
                    "  // Getter\n" +
                    "  public String getName() {\n" +
                    "    return name;\n" +
                    "  }\n" +
                    "\n" +
                    "  // Setter\n" +
                    "  public void setName(String newName) {\n" +
                    "    this.name = newName;\n" +
                    "  }\n" +
                    "}\n" +
                    "public class Main {\n" +
                    "  public static void main(String[] args) {\n" +
                    "    Person myObj = new Person();\n" +
                    "    myObj.name = \"John\";  // error\n" +
                    "    System.out.println(myObj.name); // error \n" +
                    "  }\n" +
                    "}");
            arrayList.add(hashMap);


            hashMap = new HashMap<>();
            hashMap.put("name", "outputs: \nJohn");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Example explained\n" +
                    "The get method returns the value of the variable name.\n" +
                    "\n" +
                    "The set method takes a parameter (newName) and assigns it to the name variable. The this keyword is used to refer to the current object.\n" +
                    "\n" +
                    "However, as the name variable is declared as private, we cannot access it from outside this class:");
            arrayList.add(hashMap);








        }else if (element.equals("py")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "OOP in Python\nPython is a multi-paradigm programming language. It supports different programming approaches.\n" +
                    "\n" +
                    "One of the popular approaches to solve a programming problem is by creating objects. This is known as Object-Oriented Programming (OOP).\n" +
                    "\n" +
                    "An object has two characteristics:\n" +
                    "\n" +
                    "attributes\n" +
                    "behavior\n" +
                    "Let's take an example:\n" +
                    "\n" +
                    "A parrot is an object, as it has the following properties:\n" +
                    "\n" +
                    "name, age, color as attributes\n" +
                    "singing, dancing as behavior\n" +
                    "The concept of OOP in Python focuses on creating reusable code. This concept is also known as DRY (Don't Repeat Yourself).\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "#!/usr/bin/python\n" +
                    "\n" +
                    "class Employee:\n" +
                    "   'Common base class for all employees'\n" +
                    "   empCount = 0\n" +
                    "\n" +
                    "   def init(self, name, salary):\n" +
                    "      self.name = name\n" +
                    "      self.salary = salary\n" +
                    "      Employee.empCount += 1\n" +
                    "\n" +
                    "   def displayCount(self):\n" +
                    "     print \"Total Employee %d\" % Employee.empCount\n" +
                    "\n" +
                    "   def displayEmployee(self):\n" +
                    "      print \"Name : \", self.name,  \", Salary: \", self.salary\n" +
                    "\n" +
                    "\"This would create first object of Employee class\"\n" +
                    "emp1 = Employee(\"Zara\", 2000)\n" +
                    "\"This would create second object of Employee class\"\n" +
                    "emp2 = Employee(\"Manni\", 5000)\n" +
                    "emp1.displayEmployee()\n" +
                    "emp2.displayEmployee()\n" +
                    "print \"Total Employee %d\" % Employee.empCount''',\n" +
                    "      sampleProgramOutput: '''Name :  Zara ,Salary:  2000\n" +
                    "Name :  Manni ,Salary:  5000\n" +
                    "Total Employee 2");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Inheritance\nInheritance is a way of creating a new class for using details of an existing class without modifying it. The newly formed class is a derived class (or child class). Similarly, the existing class is a base class (or parent class).\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "# parent class\n" +
                    "class Bird:\n" +
                    "\n" +
                    "    def init(self):\n" +
                    "        print(\"Bird is ready\")\n" +
                    "\n" +
                    "    def whoisThis(self):\n" +
                    "        print(\"Bird\")\n" +
                    "\n" +
                    "    def swim(self):\n" +
                    "        print(\"Swim faster\")\n" +
                    "\n" +
                    "# child class\n" +
                    "class Penguin(Bird):\n" +
                    "\n" +
                    "    def init(self):\n" +
                    "        # call super() function\n" +
                    "        super().init()\n" +
                    "        print(\"Penguin is ready\")\n" +
                    "\n" +
                    "    def whoisThis(self):\n" +
                    "        print(\"Penguin\")\n" +
                    "\n" +
                    "    def run(self):\n" +
                    "        print(\"Run faster\")\n" +
                    "\n" +
                    "peggy = Penguin()\n" +
                    "peggy.whoisThis()\n" +
                    "peggy.swim()\n" +
                    "peggy.run()");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "outputs:\nBird is ready\n" +
                    "Penguin is ready\n" +
                    "Penguin\n" +
                    "Swim faster\n" +
                    "Run faster");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "In the above program, we created two classes i.e. Bird (parent class) and Penguin (child class). The child class inherits the functions of parent class. We can see this from the swim() method.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Encapsulation\nUsing OOP in Python, we can restrict access to methods and variables. This prevents data from direct modification which is called encapsulation. In Python, we denote private attributes using underscore as the prefix i.e single _ or double __.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "class Computer:\n" +
                    "\n" +
                    "    def init(self):\n" +
                    "        self.maxprice = 900\n" +
                    "\n" +
                    "    def sell(self):\n" +
                    "        print(\"Selling Price: {}\".format(self.maxprice))\n" +
                    "\n" +
                    "    def setMaxPrice(self, price):\n" +
                    "        self.maxprice = price\n" +
                    "\n" +
                    "c = Computer()\n" +
                    "c.sell()\n" +
                    "\n" +
                    "# change the price\n" +
                    "c.maxprice = 1000\n" +
                    "c.sell()\n" +
                    "\n" +
                    "# using setter function\n" +
                    "c.setMaxPrice(1000)\n" +
                    "c.sell()");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nSelling Price: 900\n" +
                    "Selling Price: 900\n" +
                    "Selling Price: 1000");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "the above program, we defined a Computer class.\n" +
                    "\n" +
                    "We used init() method to store the maximum selling price of Computer. We tried to modify the price. However, we can't change it because Python treats the __maxprice as private attributes.\n" +
                    "\n" +
                    "As shown, to change the value, we have to use a setter function i.e setMaxPrice() which takes price as a parameter.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Polymorphism\nolymorphism is an ability (in OOP) to use a common interface for multiple forms (data types).\n" +
                    "\n" +
                    "Suppose, we need to color a shape, there are multiple shape options (rectangle, square, circle). However we could use the same method to color any shape. This concept is called Polymorphism.\n");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "class Parrot:\n" +
                    "\n" +
                    "    def fly(self):\n" +
                    "        print(\"Parrot can fly\")\n" +
                    "\n" +
                    "    def swim(self):\n" +
                    "        print(\"Parrot can't swim\")\n" +
                    "\n" +
                    "class Penguin:\n" +
                    "\n" +
                    "    def fly(self):\n" +
                    "        print(\"Penguin can't fly\")\n" +
                    "\n" +
                    "    def swim(self):\n" +
                    "        print(\"Penguin can swim\")\n" +
                    "\n" +
                    "# common interface\n" +
                    "def flying_test(bird):\n" +
                    "    bird.fly()\n" +
                    "\n" +
                    "#instantiate objects\n" +
                    "blu = Parrot()\n" +
                    "peggy = Penguin()\n" +
                    "\n" +
                    "# passing the object\n" +
                    "flying_test(blu)\n" +
                    "flying_test(peggy)");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Parrot can fly\n" +
                    "Penguin can't fly");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "In the above program, we defined two classes Parrot and Penguin. Each of them have a common fly() method. However, their functions are different.\n" +
                    "\n" +
                    "To use polymorphism, we created a common interface i.e flying_test() function that takes any object and calls the object's fly() method. Thus, when we passed the blu and peggy objects in the flying_test() function, it ran effectively.\n");
            arrayList.add(hashMap);



        }else if (element.equals("js")) {

            hashMap = new HashMap<>();
            hashMap.put("name", "JS OOP\nAs JavaScript is widely used in Web Development, in this article we would explore some of the Object Oriented mechanism supported by JavaScript to get most out of it. Some of the common interview question in JavaScript on OOPS includes,- “How Object-Oriented Programming is implemented in JavaScript? How they differ from other languages? Can you implement Inheritance in JavaScript and so on…”\n" +
                    "There are certain features or mechanisms which makes a Language Object-Oriented like: \n" +
                    " \n" +
                    "\n" +
                    "Object\n" +
                    "Classes\n" +
                    "Encapsulation\n" +
                    "Inheritance");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "// Defining class using es6\n" +
                    "class Vehicle {\n" +
                    "  constructor(name, maker, engine) {\n" +
                    "    this.name = name;\n" +
                    "    this.maker =  maker;\n" +
                    "    this.engine = engine;\n" +
                    "  }\n" +
                    "  getDetails(){\n" +
                    "      return (The name of the bike is \\${this.name.)\n" +
                    "  }\n" +
                    "}\n" +
                    "// Making object with the help of the constructor\n" +
                    "let bike1 = new Vehicle('Hayabusa', 'Suzuki', '1340cc');\n" +
                    "let bike2 = new Vehicle('Ninja', 'Kawasaki', '998cc');\n" +
                    "\n" +
                    "console.log(bike1.name);    // Hayabusa\n" +
                    "console.log(bike2.maker);   // Kawasaki\n" +
                    "console.log(bike1.getDetails());");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "Outputs:\nHayabusa\n" +
                    "Kawasaki\n" +
                    "The name of the bike is Hayabusa");
            arrayList.add(hashMap);

            hashMap = new HashMap<>();
            hashMap.put("name", "As seen in the above example it is much simpler to define and reuse object in ES6. Hence, we would be using ES6 in all our examples.\n");
            arrayList.add(hashMap);






        }else{

            Toast.makeText(this, "Error app Please Try Again Later", Toast.LENGTH_SHORT).show();
        }












        OOP.MyAdapter myadapter = new OOP.MyAdapter();
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