package dev.scorpio;

public class Demo
{
    public void m1(String s)
    {
        System.out.println("I am from String");
    }

    public void m1(StringBuffer sb)
    {
        System.out.println("I am from Stringbuffer");
    }

    public static void main(String[] args)
    {
        Demo demo = new Demo();
//        demo.m1(null); // WHAT WILL BE tHE OUTPUT
    }
}
