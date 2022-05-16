package OOPS.Polymorphism;

import java.util.Scanner;

public class Overloading {

    public static int product(int x, int y)
    {
        return x*y;
    }
    public static int product(int x, int y, int z)
    {
        return x*y*z;
    }
    public static double product(double x, double y)
    {
        return x*y;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter You Choice: \n1. For 2 number Multiplication.\n2. For 3 number Multiplication.\n3. For 2 Decimal number Multiplications.");

            System.out.println("Enter 0 to exit the program.");
            int n = sc.nextInt();

            switch (n)
            {
                case 1:
                    System.out.println("Enter two Numbers:");
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println("Product: "+product(x,y));
                case 2:
                    System.out.println("Enter three Numbers:");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    int c = sc.nextInt();
                    System.out.println("Product: "+product(a,b,c));
                case 3:
                    System.out.println("Enter two floating Numbers:");
                    double k = sc.nextDouble();
                    double l = sc.nextDouble();
                    System.out.println(product(k,l));
                case 0:
                    System.exit(0);
            }

        }
    }
}
