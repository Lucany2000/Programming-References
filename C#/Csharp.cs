/* "using System" = use of classes from the "System" namespace
namespace is used to organized code, and it is a container for classes and other namespaces
{} curly braces marks the beginning and the end of a block of code
class is container for data and methods which brings functionality
every line of code must be in a class
there will always be a "Main" method and eveyrthing within its curly braces will execute

"Console" is a class of the "System" namespace which has a "Writeline()" method is used to output/print text
if you don't use "using system" then you can use "System.console.writeline()" to print/output text
every C# statement ends with a ";"
C# is case sensitive */ 
 
/* instead of using // for comment, you can use multi line comments yada yada
ooga booga */

using System;
using System.Linq;

namespace HelloWorld
{
    public class cross_program
    {
        public void cross_test()
        {
            Console.WriteLine("Hello World!");
            Console.WriteLine("ooga boog");
            Console.Write("Hello world");
            Console.Write("ooga booga");
            Console.WriteLine();
        }
    }
  class Program
  {

    static void output()
    {
/* writeline() prints output on a new line each time
write() prints on the same line */
        Console.WriteLine("Hello World!");
        Console.WriteLine("ooga boog");
        Console.Write("Hello world");
        Console.Write("ooga booga");
        Console.WriteLine();
    }

    static void variables()
    {
        /* different types of variables:
        int: stores integers, no decimals Ex. -123 and 123
        double: stores floating points numbers with decimals Ex. 19.99 and -19.99
        char: stores single characters, are surrounded by single quotes Ex. 'a' and 'A'
        string: stores text, are surrounded by double quotes Ex. "hello world"
        bool: stores values either true or false
        variables that arent't labeled as constants, can be overwritten
        */
        int integer = 10;
        double duo = 19.99;
        char letter = 'a';
        string str = "Hello";
        bool tru = true;
        const int num = 15;
        Console.WriteLine(integer);
        Console.WriteLine(duo);
        Console.WriteLine(letter);
        Console.WriteLine(str);
        Console.WriteLine(tru);
        Console.WriteLine(num);
        integer = 20;
        Console.WriteLine(integer);
        string fname = "John";
        Console.WriteLine("Hello"+fname);
        string lname = "Doe";
        int x = 5, y = 6, z = 10;
        Console.WriteLine(fname+lname);
        Console.WriteLine(integer+num);
        Console.WriteLine(x+y+z);
        Console.WriteLine(integer+" "+num);
    }
    static void data()
    {
        /* "longs" are used when ints aren't long enough to store values, and the values should end with an "L"
        "float" can store decimals and usually the values end with an "F"
        "double" stores decimals smaller than floats and the values can end in "D"
        Scientific numbers such as 12e3F or 35E4D  
        */
        long num = 15000000000L;
        Console.WriteLine(num);
        float flt = 5.75F;
        Console.WriteLine(flt);
        double dbl = 19.99D;
        Console.WriteLine(dbl);
        float flt1 = 12e3F;
        double dbl1 = 35E4D;
        Console.WriteLine(flt1+" "+dbl1);
    } 

    static void type_casting()
    {
        /* Implicit Casting (automatically): converting a smaller type to a larger type size 
        char -> int -> long -> float -> double
        Explicit casting (manually): converting a larger type to a smaller size type
        double -> float -> long -> int -> char 
        Its also possible to convert data types by using built in methods */
        // Implicit Casting
        int num = 9;
        double dbl = num;
        Console.WriteLine(num+" "+dbl);

        //Explicit Casting
        double dbl2 = 9.78;
        int num2 = (int) dbl2;
        Console.WriteLine(dbl2+" "+num2);

        int integer = 10;
        double duo = 5.25;
        bool TF = true;
        Console.WriteLine(Convert.ToString(integer));
        Console.WriteLine(Convert.ToDouble(integer));
        Console.WriteLine(Convert.ToString(TF));
        Console.WriteLine(Convert.ToInt16(duo));
        Console.WriteLine(Convert.ToInt32(duo));
        Console.WriteLine(Convert.ToInt64(duo));
        // others include: ToSingle, ToSByte, ToBoolean, and ToUInt16, 32, 64 
    }

    static void input()
    {
        /*"Console.ReadLine() is used to get user input
        Console.ReadLine returns a string and thus cannot be used when trying to get numbers
        To get numbers as input, you have to put the ".ReadLine" within a "Convert.ToInt32()*/
        Console.WriteLine("Enter something ");
        string in_put = Console.ReadLine();
        Console.WriteLine(in_put);
        Console.WriteLine("Enter number");
        int num = Convert.ToInt32(Console.ReadLine());
        Console.WriteLine(num);
    }

    static void operators()
    {   
        /* Assignment Operators: 
        =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=
        Comparison Operators:
        ==, !=, >, <, <=, >=
        Logical Operators:
        &&, ||, !
        */
        int x = 10;
        int y = 25;
        int z = 20;
        Console.WriteLine(x+y);
        Console.WriteLine(z-x);
        Console.WriteLine(x*z);
        Console.WriteLine(z/x);
        Console.WriteLine(y%x);
        Console.WriteLine(x&y);
        Console.WriteLine(x|y);
        Console.WriteLine(x^y);
        Console.WriteLine(x >> 3);
        Console.WriteLine(x << 3);

    }

    static void math()
    {
      Console.WriteLine(Math.Max(5,10));
      Console.WriteLine(Math.Min(5,10));
      Console.WriteLine(Math.Sqrt(64));
      Console.WriteLine(Math.Abs(-4.7));
      Console.WriteLine(Math.Round(9.99));
    }

    static void str()
    {   
        /*Substring() = extracts the characters from a string starting from a specified point/index and returns a new string*/
        string stg = "hello world";
        string txt = "ooga booga";
        Console.WriteLine(stg.Length);
        Console.WriteLine(stg.ToLower());
        Console.WriteLine(stg.ToUpper());
        string full = string.Concat(stg, txt);
        Console.WriteLine(full);
        string fstr = $"{stg} {txt}";
        Console.WriteLine(fstr);
        Console.WriteLine(stg[0]+" "+stg[1]);
        Console.WriteLine(stg.IndexOf("e"));
        int charPos = stg.IndexOf("w");
        string lststr = stg.Substring(charPos);
        Console.WriteLine(lststr);
    }

    static void Boolean()
    {
        //Expressions

        int x = 9;
        int y = 10;
        int z = 9;
        Console.WriteLine(x > y);
        Console.WriteLine(x < y);
        Console.WriteLine(x == y);
        Console.WriteLine(x >= y);
        Console.WriteLine(x <= y);
        Console.WriteLine(x >= z);
    }
    static void Conditions()
    {
        /*Conditional statements:
        if, else, else if, and switch*/
        int x = 20;
        int y = 10;
        int z = 10;
        if (x > y)
        {
            Console.WriteLine(true);
        }

        if (x < y)
        {
            Console.WriteLine(false);
        }
        else
        {
            Console.WriteLine(false);
        }

        if (x < y)
        {
            Console.WriteLine(false);
        }
        else if (y == z)
        {
            Console.WriteLine(true);
        }
        else
        {
            Console.WriteLine("none");
        }

        bool answer = (x > y) ? true : false;
        Console.WriteLine(answer);

    }

    static void switch_state()
    {
        Console.WriteLine("Enter a number from 1-4: ");
        int x = Convert.ToInt32(Console.ReadLine());
        switch(x)
        {
            case 1:
                Console.WriteLine("Hello");
                break;
            case 2:
                Console.WriteLine("world");
                break;
            case 3:
                Console.WriteLine("ooga");
                break;
            case 4:    
                Console.WriteLine("booga");
                break;
            default:
                Console.WriteLine("I want a boiger");
                break;                
        }
    }

    static void whl_loop()
    {
        int x = 10;
        int y = 0;
        while (y < x)
        {
            Console.WriteLine(y);
            y++;
        }

        x += 10;

        do
        {
            Console.WriteLine(y);
            y++;
        }
        while (y < 10);

    }

    static void for_loop()
    {
        for (int i = 0; i < 5; i++)
        {
            Console.WriteLine(i);
        }

        for (int x = 0; x < 5; x = x + 2)
        {
            Console.WriteLine(x);
        }

        // foreach loops are exclusively for looping through elements in an array
        string[] list = {"1", "2", "3"};
        foreach (string i in list)
        {
            Console.WriteLine(i);
        }

        int[] list2 = {1, 2, 3};
        foreach (int i in list2)
        {
            Console.WriteLine(i);
        }
    }

    static void brk_con()
    {
        /*break statements will stop the loop completely when conditions are met
        Continue statements will skip over that point in the loop when conditions are met*/

        for (int i = 0; i < 10; i++)
        {
            if (i == 4)
            {
                break;
            }
            Console.WriteLine(i);
        }

        for (int i = 0; i < 10; i++)
        {
            if (i == 4)
            {
               continue;
            }
            Console.WriteLine(i);
        }

        int x = 0;
        while (x < 10)
        {
            Console.WriteLine(x);
            x++;
            if (x == 5)
            {
                break;
            }
        }

        while (x < 20)
        {
            if (x == 15)
            {
                x++;
                continue;
            }
            Console.WriteLine(x);
            x++;
        }
    }

    static void array()
    {
        // You can get the min, max, and sum of an array by using the "System.Linq" = "using System.Linq"
        
        
        string[] str_list = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] num_list = {20, 40, 10, 30};

        Console.WriteLine(str_list[0]);
        str_list[0] = "Opel";
        Console.WriteLine(str_list[0]);
        Console.WriteLine(str_list.Length);

        for (int i = 0; i < str_list.Length; i++)
        {
            Console.WriteLine(str_list[i]);
        }

        foreach (string i in str_list)
        {
            Console.WriteLine(i);
        }

        Array.Sort(str_list);
        Array.Sort(num_list);
        Console.WriteLine(str_list);
        Console.WriteLine(num_list);

        Console.WriteLine(num_list.Max());
        Console.WriteLine(num_list.Min());
        Console.WriteLine(num_list.Sum());

        //There are different ways to create an array:
        //Create an array of 4 elements and add values later
        string[] list1 = new string[4];
        //Create an array of 4 elements and add values right away
        string[] list2 = new string[4] {"Volvo", "BMW", "Ford", "Mazda"};
        //Create an array of 4 elements without specifying the size
        string[] list3 = new string[] {"Volvo", "BMW", "Ford", "Mazda"};
        //Create an array of 4 elements, omitting the new keyword, without specifying the size
        string[] list4 = {"Volvo", "BMW", "Ford", "Mazda"};

        //To add new values to an array, you need the "new" + array type or else it will cause an error
        string[] list5;
        list5 = new string[] {"Volvo", "BMW", "Ford"};

    }


    static void Main(string[] args)
    {
        output();
        variables();
        data();
        type_casting(); 
        input();
        operators();
        math();
        str();
        Boolean();
        Conditions();
        switch_state();
        whl_loop();
        for_loop();
        brk_con();
        array();

    }
  }
}




