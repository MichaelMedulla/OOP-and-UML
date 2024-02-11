package com;

abstract class App2 implements Int1
{
    int x, y;
    
    public App2()
    {
        x = 5;
    }

    private App2(int x)
    {
        y = x + 6;
    }

    protected static int addition(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        int num = addition(5,7);
    }
}

class App21 extends App2
{
    int x, y;
    
    public App21()
    {
        x = 5;
    }

    private App21(int x)
    {
        y = x + 6;
    }

    protected static int addition(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        int num = addition(5,7);
    }
}

final class App22 implements Int1
{
    int x, y;
    
    public App22()
    {
        x = 5;
    }

    private App22(int x)
    {
        y = x + 6;
    }

    protected static int addition(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        int num = addition(5,7);
    }
}

abstract interface Int1
{

}
