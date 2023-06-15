using System;
using HelloWorld;

namespace test
{
    class Testing
    {
        static void cross_instance()
        {
            cross_program instance = new cross_program();
            instance.cross_test();
        }
        static void Main(string[] args)
        {
            cross_instance();
            var booga = new Ooga();
            Console.WriteLine(booga.x);
        }
    }

    public class Ooga
    {
        public string x = "boigor";
    }

}
