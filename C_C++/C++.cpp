#include <iostream>
using namespace std;
#include <string>
#include <cmath>

//Output

// New line /n & <<endl;
void output(){
    cout << "hello world\n";
    cout << "ooga booga" << endl;
}


//Variables

//int = 123/-123
//double = -19.99/19.99, up to 15 decimal places
//float = -19.99/19.99, up to 7 decimal places
//char = 'a'/'B', has to be surrounded by single quotes
//string = "Hello world", can only be used with the #include <string> library
//bool = true/false
//const = unchangeable/read-only const int myNum = 15; myNum = 10; would through an error

//declare variables either as int num = 15; or int num; num = 15;
//declare multiple variables int x = 15, y = 10, z = 16;
//unique identifiers must begin with _

void variables(){
    int num = 15;
    cout << num << endl;
    num = 10;
    cout << num << endl;
    double deci = 5.99;
    cout << deci << endl;
    char let = 'A';
    cout << let << endl;
    string hello = "hello world2";
    cout << hello << endl;
    bool True = true;
    cout << True << endl;
    cout << "I am " << num << " years old.\n";
    cout << deci << let << True << endl << false << endl;
    double sum = num + deci;
    cout << sum << endl;
    int x = 15, y = 10, z = 16;
    cout << x + y + z << endl;
    const int rom = 10;
    cout << rom << endl;
}

//Input
void input() {
    int x;
    cout << "Enter a number, any number\n";
    cin >> x;
    cout << "Your number is: " << x << endl;
    int y;
    cout << "Enter another number\n";
    cin >> y;
    cout << "The sum of the two numbers is: " << x+y << endl;
}

//Data Types

//double > float
//doubles and floats can also be outputed as scientific notations
//true is outputed as 1 while false is outputed as 0
//for char, you can use ASCII values to display certain characters
void data() {
    float f1 = 35E3;
    double d1 = 12E4;
    cout << f1 << " " << d1 << endl;
    bool isTrue = true;
    bool isFalse = false;
    cout << "True = " << isTrue << " " << "False = " << isFalse << endl;
    char a = 65, b = 66, c = 67;
    cout << a << " " << b << " " << c << endl;  
}

//Operators
//Arithmetic Operators: +, -, *, /, %, //, ++, --
//Assignment Operators =, +=, -=, *=, /=, %=, &=, |=, ^=, >>=, <<=
//&=: AND bitwise assignment operator  Ex: 9 & 5   (9 = 1001, 5 = 0101) == 0001 = 1
//|=: OR bitwise  assignment operator  Ex: 9 | 5   (9 = 1001, 5 = 0101) == 1101 = 13
//^=: XOR bitwise assignment operator  Ex: 9 ^ 5   (9 = 1001, 5 = 0101) == 1100 = 12
//<<=: shift left bitwise assignment operator   Ex: (2 = 0010) << 2 == 1000 = 8
//>>=: shift right bitwise assignment operator   Ex: (2 = 0010) >> 1 == 0001 = 1

//Comparison Operators: ==, !=, >, <, <=, >=
//Logical Operators: &&, ||, !
//!: NOT, reverses the result !(5 == 5) = False

void operate() {
    int a = 9;
    int b = 5;
    int c = 2;
    cout << (a & b) << endl; 
    cout << (a | b) << endl;
    cout << (a ^ b) << endl;
    cout << (c << 2) << endl;
    cout << (c >> 1) << endl;

}

//Strings
//string.append can also be used to concatenate strings however there will be no space in between the 2 strings similar to the + method of concatenation
//concatenating a number and a string will result in an error
//length() will tell you the length of teh string similar to len() in python
//when changing the character at x index (string[x] = ' ') the character must be surrounded by ' '
//when doing cin >>, anything that comes after a space gets deleted, however if you use getline (cin, string), then the entire string will be used.

void strings() {
    string greeting = "Hello";
    string world = "world";
    string full = greeting + world;
    cout << full << endl;
    full = greeting + " " + world;
    cout << full << endl;
    full = greeting.append(world);
    cout << full << endl;
    int x = 10;
    int y = 20;
    cout << x + y << endl;
    string a = "10";
    string b = "20";
    cout << a + b << endl;
    string c = "ooga booga";
    cout << c.length() << endl;
    cout << c[0] << endl;
    c[0] = 'A';
    cout << c << endl;
    string z;
    // cout << "Type full name ";
    // cin >> z; 
    // cout << z << endl;
    cout << "Type full name again ";
    getline (cin, z);
    cout << z << endl; 
}

// max(x,y) function will give you largest value of x and y
// min(x,y) function will give you the smallest value between x and y
// include <cmath> is required to use square root (sqrt), rounding (round), and natural log (log)
//other math functions: absolute value (abs(x)), arccosine (acos(x)), arcsine (asin(x)), arctangent (atan(x)), cube root (cbrt(x)), round up to nearest integer (ceil(x))...
// cosine (cos(x)), hyberbolic cosine (cosh(x)), exponent E^x (exp(x)), e^x -1 (expm1(x)), absolute value of floating x (fabs(x)), positive difference between 2 numbers (fdim(x,y))...
// round down to nearest integer (floor(x)), hypotenus sqrt(x^2 + y^2) (hypot(x,y)), x*y+z (fma(x,y,z)), highest value of floating x and y (fmax(x,y)), lowest value of floating x and y (fmin(x,y))...
// floating point remainder of x/y (fmod(x,y)), x to the power of y (pow(x,y)), sine of x (sin(x)), hyperbolic sine (sinh(x)), tangant (tan(x)), hyperbolic tangant (tanh(x))

void math() {
    int x = 5;
    int y = 10;
    cout << fmax(x,y) << endl;
    cout << fmin(x,y) << endl;
    cout << sqrt(4) << endl;
    cout << round(5.5) << endl;
    cout << log(2) << endl;
}

//true returns 1 and false returns 0 like binary ons and offs

void Bool() {
    bool True = true;
    bool False = false;
    cout << True << endl;
    cout << False << endl;
}

//logical conditions: <, <=, >=, >, ==, !=
//conditional statements: if, else, else if, switch

void conditions(){
    if (20 > 10){
        cout << "True\n";
    } else if (10 > 20) {
        cout << "False\n";
    } else {
        cout << "cowabunga it is\n";
    }

    //short hane if.else
    string result = (10 < 20) ? "ooga booga" : "booga ooga?";
    cout << result << endl;
}

//break statements can also be used in switch statements

void switch_a_ru() {
    int x = 1;
    switch(x) {
        case 1:
            cout << "bunga cowa\n";
            break;
        case 2:
            cout << "it\n";
            break;
        case 3:
            cout << "is\n";
            break;
        default:
            cout << "bunga cowa it is\n";    
    }

    int y = 4;
    switch(y) {
        case 1:
            cout << "bunga cowa\n";
            break;
        case 2:
            cout << "it\n";
            break;
        case 3:
            cout << "is\n";
            break;
        default:
            cout << "bunga cowa it is\n";    
    }
}

void loop() {
    //while
    int x = 0;
    while (x < 10) {
        cout << x << " ";
        x++;
    }
    cout << "\n";

    //do while
    do {
        cout << x << " ";
        x--;
    }
    while (x > 0);
    cout << "\n";

    //for
    for (int i = 10; i < 20; i++) {
        cout << i << " ";
    }
    cout << "\n";

    for (int y = 20; y <= 30; y = y+2) {
        cout << y << " ";
    }
    cout << "\n";
}

void brk_con() {
    //break and contine: for loop
    for (int y = 30; y <= 50; y = y+2) {
        if (y == 40) {
            break;
        }
        cout << y << " ";
    }
    cout << "\n";

    for (int x = 30; x <= 40; x++) {
        if (x == 35) {
            continue;
        }
        cout << x << " ";
    }
    cout << "\n";

    //break and contine: while loop
    int i = 0;
    while (i < 10) {
        cout << i << " ";
        i++;
        if (i == 5) {
            break;
        }
    }
    cout << "\n";

    int z = 0;
    while (z < 10) {
        if (z == 5) {
            z++;
            continue;
        }
        cout << z << " ";
        z++;
    }
    cout << "\n";
}

// declaring an array with no defined size ([]) is fine except if you want extra spaces, it will override what's already in there
// if an array has a size of [5] and only 3 are taken up, then you can add in 2 more things without overriding by: array[3] = 4; array[4] = 5;
// you can also add things in later Ex: string cars[5]; cars[0] = "honda"; cars[1] = ford; etc...

void arrays() {
    int password[4] = {1, 2, 3, 4};
    cout << password[3] << endl;
    password[0] = 5;
    cout << password[0] << endl;
    for (int i = 0; i < 4; i++) {
        cout << password[i] << " ";
    }
    cout << "\n";
}

//put & before the new variable to make it a reference to another variable
//put & before a variable in cout and it will be the memory address of the contents which is in hexadecimal

void reference() {
    string food = "pizza";
    string &meal = food;
    string bar = food;
    cout << food << " " << meal << endl;
    cout << bar << endl;
    food = "chocolate";
    cout << food << " " << meal << endl;
    cout << &bar << endl;
}

// a pointer is a variable that stores the memory address as its value
// create a pointer by putting a * Ex. string* ptr = &food; Without the *, it will throw an error
// dereference a variable by putting a * before the pointer in cout
// you can change the value of the pointer however this will also change the value of the original variable

void pointers() {
    string food = "chocolate";
    string* ptr = &food;
    cout << food << " " << &food << " " << ptr << endl;
    cout << *ptr << endl;
    *ptr = "boiger";
    cout << *ptr << " " << food << endl;
}

// is a user defineded function is declared after main, it will throw and error
// string fname would be considered a parameter while string fname = "Alice" would be considered a default parameter
// when there are multiple parameters , the default parameter must be at end of the parameter list or it will throw and error
// a void function cannot return anything only int and string functions can

void function(string fname = "Alice", int age = 10) {
    auto s = to_string(age); //this turns an int into a string
    string person = fname + ": " + s;
    cout << person << endl;
}

// you can also pass reference variables as parameters

int myFunc(int &x, int &y) {
    int z = x;
    x = y;
    y = z;
    return x, y;
}

// functions can also have the same name as long as thee types are different

double myFunc(double &x, double &y) {
    x += 1.5;
    y += 2.5;
    return x, y;
}


int main() {
    output();
    variables();
    // input();
    data();
    operate();
    // strings();
    math();
    Bool();
    conditions();
    switch_a_ru();
    loop();
    brk_con();
    arrays();
    reference();
    pointers();
    function("Lucva", 25);
    int num1 = 10, num2 = 20;
    cout << num1 << " " << num2 << endl;
    myFunc(num1, num2);
    cout << num1 << " " << num2 << endl;

    double num3 = 6.6, num4 = 7.9;
    cout << num3 << " " << num4 << endl;
    myFunc(num3, num4);
    cout << num3 << " " << num4 << endl;
    
    return 0;
}