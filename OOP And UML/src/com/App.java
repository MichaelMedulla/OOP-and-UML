package com;

final class App 
{
    int x, y;

    public App()
    {
        x = 5;
    }

    private App(int x)
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

class App12 implements Int1
{
    int x, y;
    
    public App12()
    {
        x = 5;
    }

    private App12(int x)
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

    public void hello()
    {
        System.out.println("Hello");
    }
}

final class App13 extends App12
{
    int x, y;
    
    public App13()
    {
        x = 5;
    }

    private App13(int x)
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

    public void hello()
    {
        System.out.println("World");
    }
    
}

class HelloWorld
{
    public static void main(String args[])
    {
        App12 a = new App12();
        App12 b = new App13();

        a.hello();
        b.hello();
    }
}
