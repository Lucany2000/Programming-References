public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(1000);

        String name = "john";
        System.out.println(name);

        //int: whole numbers from -2147483648 to 2147483647
        int num = 15;
        System.out.println(num);

        int num2;
        num2 = 15;
        num2 = 20;
        System.out.println(num2);

        //this cannot be reassigned
        final int num3 = 25;
        System.out.println(num3);

        //this requires f at the end of the number to count for a float
        float myFloatNum = 5.99f;

        //this uses single quotes rather double
        char myLetter = 'D';

        boolean myBool = true;

        //concats both strings
        System.out.println("hello"+"world");

        System.out.println(num2+num3);

        int x1 = 5, x2 = 6, x3 = 50;
        System.out.println(x1+x2+x3);

        String y1, y2, y3;
        y1 = y2 = y3 = "foobar";
        System.out.println(y1+y2+y3);

        //short: whole numbers from -32768 to 32767
        short shortNum = 5000;
        System.out.println(shortNum);

        //long: whole numbers from -9223372036854775808 to 9223372036854775807, requires L at the end of the number to count
        long longNum = 15000000000L;
        System.out.println(longNum);

        //doubles: requires d at the end of the number to count
        double doubleNum = 19.99d;
        System.out.println(doubleNum);

        //returns the letter that correlates with that value in ASCII
        char val1 = 65;
        System.out.println(val1);

        //vice versa
        int val2 = 'A';
        System.out.println(val2);

        //not exclusive to int
        float val3 = 'A';
        System.out.println(val3);

        //Widening casting: converting a smaller size type to a larger size type
        double intToDouble = num;

        //narrow casting: converting a larger size type to a smaller size type
        int doubleToInt = (int) intToDouble;

        int x = num;
        int y = num2;

        //add
        System.out.println(x+y);
        //subtract
        System.out.println(x-y);
        //multiply
        System.out.println(x*y);
        //division
        System.out.println(x/y);
        //mod
        System.out.println(x%y);
        //increment and reassign
        System.out.println(++y);
        //decrement and reassign
        System.out.println(--y);

        /*
        bitwise AND
        * ex. 5 &= 3
        *
        * 5 = 0101
        *
        * 3 = 0011
        *
        * result: 0001 or 1
        * */

        System.out.println(5 & 3);

        /*
        bitwise OR
         * ex. 5 |= 3
         *
         * 5 = 0101
         *
         * 3 = 0011
         *
         * result: 0111 or 7
         * */

        System.out.println(5 | 3);

        /*
        bitwise XOR
         * ex. 5 |= 3
         *
         * 5 = 0101
         *
         * 3 = 0011
         *
         * result: 0110 or 6
         * */

        System.out.println(5 ^ 3);

        int bit = 3;

        /*
        binary shift left
         * ex. 3 << 2
         *
         * 3 = 0011
         *
         *
         * result: 1100 or 12
         * */


        bit <<= 2;

        System.out.println(bit);

        /*
        binary shift right
         * ex. 12 >> 2
         *
         * 12 = 1100
         *
         *
         * result: 0011 or 3
         * */

        bit >>= 2;

        System.out.println(bit);

        //logical operators
        System.out.println(x <= 5 && x > 10);

        String text = "Hello World";
        System.out.println(text.length());
        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());
        System.out.println(text.indexOf("World"));

        System.out.println("johnny"+" "+"boy");
        String firstName = "johnny";
        String lastName = "boy";
        System.out.println(firstName.concat(lastName));

        // \": double quote
        System.out.println("Hello \"Cruel\" World");

        // \': single quote
        System.out.println("Hello \'Cruel\' World");

        // \\: single backslash
        System.out.println("Hello \\Cruel\\ World");

        // \n: new line
        System.out.println("Hello Cruel\n World");

        // \r: return
        System.out.println("Hello \rCruel World");

        // \b: backspace
        System.out.println("Hello \bCruel World");

        // \t: tab
        System.out.println("Hello\tCruel World");

        // \f: form feed
        System.out.println("Hello \fCruel World");

        //max
        System.out.println(Math.max(5,10));

        //min
        System.out.println(Math.min(5,10));

        //sqrt
        System.out.println(Math.sqrt(4));

        //absolute value
        System.out.println(Math.abs(-4.7));

        //random
        System.out.println(Math.random());

        //random between 0 and 100
        System.out.println((int)(Math.random()*101));

        // if, else if, else
        if (20 > 18){
            System.out.println("20 > 18");
        } else if (20 == 18) {
            System.out.println("20 == 18");
        } else {
            System.out.println("20 < 18");
        }

        //Short-hand if
        String shortIf = (16 < 18) ? "Good day." : "Good evening.";
        System.out.println(shortIf);

        //switch
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }

        //while: check first execute later
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        //do-while: execute first check later
        i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        //for loop + nested
        for (int i2 = 0; i2 < 5; i2++) {
            System.out.println(i2);

            for (int i3 = 1; i3 <= 3; i3++) {
                System.out.println(" Inner: " + i3); // Executes 6 times (2 * 3)
            }
        }

        //for each: exclusively used to loop through elements in data sets
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i2 : cars) {
            System.out.println(i2);
        }

        //break and continue
        for (int i2 = 1; i2 <= 12; i2++) {
            if (i2 == 4) {
                //breaks current iteration and skips to another
                continue;
            }

            if(i2 == 8){
                break;
            }

            System.out.println("not a third of 12");
        }

        //array
        String[] strArray = {"hello", "world"}; //string array
        int[] numArray = {10, 20, 30, 40};

        //access array
        System.out.println(strArray[0]);
        strArray[0] = "my";
        //reassign value
        System.out.println(strArray[0]);
        //length
        System.out.println(numArray.length);

        //looping array with foreach
        for (int i2 = 0; i2 < numArray.length; i2++) {
            System.out.println(numArray[i2]);
        }

        //2d array
        int[][] numArray2D = { {1, 2, 3, 4}, {5, 6, 7} };
        //access 2nd array, 3rd element
        System.out.println(numArray2D[1][2]);
        //reassign 3rd element in 2nd array
        numArray2D[1][2] = 9;
        System.out.println(numArray2D[1][2]);

        //looping through
        for (int i3 = 0; i3 < numArray2D.length; ++i3) {
            for (int i4 = 0; i4 < numArray2D[i3].length; ++i4) {
                System.out.println(numArray2D[i3][i4]);
            }
        }

        //for each ver.
        for (int[] row : numArray2D) {
            for (int i3 : row) {
                System.out.println(i3);
            }
        }

        newMethod("my world");
        String returnValue = returnCatString("ungus","bungus");

        System.out.println(plusMethod(1, 2)+ " vs "+plusMethod(1.0, 2.0));
        recursiveMethod(10);

        Another object = new Another(1);
        System.out.println(object.init);
        System.out.println(object.str);
        //changes value
        object.empty = "full";
        System.out.println(object.x);
        //object.x = 5; will cause an error

        object.PublicMethod();


    }

    //static: belongs to the Main class and not an object of the Main class
    //void: this does not return anything

    static void newMethod(String str){

        System.out.println("a static void method that takes in "+ str);
    }

    //method returns string
    static String returnCatString (String str1, String str2){
        return str1+str2;
    }

    //method overloading
    static int plusMethod(int x, int y){
        return x + y;
    }

    static double plusMethod(double x, double y){
        return x+y;
    }

    public static int recursiveMethod(int num) {
        if (num >= 0) {
            System.out.println(num);
            return recursiveMethod(num - 1);
        } else {
            System.out.println(0);
            return 0;
        }
    }


}