package OOPS.Polymorphism;

public class Overriding
{
    void show()
    {
        System.out.println("Parent's show()");
    }
}

class Child extends Overriding {

    @Override
    void show()
    {
        System.out.println("Child's show()");
    }
}

class Main {
    public static void main(String[] args)
    {
        Overriding obj1 = new Overriding();
        obj1.show();

        Overriding obj2 = new Overriding();
        obj2.show();
    }
}

