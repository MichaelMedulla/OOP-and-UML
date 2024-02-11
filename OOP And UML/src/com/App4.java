package com;

class App4 
{
    int x, y;
    
    public App4()
    {
        x = 5;
    }

    private App4(int x)
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

abstract class App41 extends App4
{
    int x, y;
    
    public App41()
    {
        x = 5;
    }

    private App41(int x)
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

final class App42 extends App41
{
    int x, y;
    
    public App42()
    {
        x = 5;
    }

    private App42(int x)
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
