package com;

abstract class App3 implements Int2
{
    int x, y;
    
    public App3()
    {
        x = 5;
    }

    private App3(int x)
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

final class App31 extends App3
{
    int x, y;
    
    public App31()
    {
        x = 5;
    }

    private App31(int x)
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

class App32 implements Int2
{
    int x, y;
    
    public App32()
    {
        x = 5;
    }

    private App32(int x)
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

abstract interface Int2
{

}
