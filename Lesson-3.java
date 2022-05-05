// Использование библиотеки Math

public class HelloWorld{

     public static void main(String []args){
        
        double pi = Math.PI;
        double x = Math.sqrt(pi);
        double y = Math.pow(3, 4);
        
        System.out.println(pi); // 3.14
        System.out.println(x);  // 1.77
        System.out.println(y);  // 81
     }
}

// Task 1

public class HelloWorld{

     public static void main(String []args){
        
        double r = 4;
        double C = 2 * Math.PI * r;
        
        System.out.printf("C = %f if r = %f", C, r);
     }
}

// Task 3

public class HelloWorld{

     public static void main(String []args){
        
        int number = 874;
        
        int s = number / 100;
        int d = number % 100 / 10;
        int e = number % 10;
        
        System.out.printf("%d = %d * 100 + %d * 10 + %d * 1\n", number, s, d, e);
        
        System.out.printf("Sum = %d, Multiplication = %d\n", s + d + e, s * d * e);
     }
}

// 

public class HelloWorld{

     public static void main(String []args){
         
         int a = 10;
         int b = 15;
         
         System.out.println(a == b);    // false
         System.out.println(a != b);    // true
         System.out.println(a > b);     // false
         System.out.println(a >= b);    // false
         System.out.println(a < b);     // true
         System.out.println(a <= b);    // true
         
         int c = 15;
         System.out.println(b == c);    // true
         System.out.println(b != c);    // false
         System.out.println(b > c);     // false
         System.out.println(b >= c);    // true
         
         
     }
}

// 

public class HelloWorld{

    public static void main(String []args){
        
        int a = 10;
        int b = 15;
        int c = a + b;
        
        boolean value = a == b;
        
        System.out.println(c);      // 25
        System.out.println(value);  // false
    }
}

public class HelloWorld{

    public static void main(String []args){
        
        int x = 10;
        int y = 15;
        
        boolean b1 = (x > 5);
        System.out.println(b1); // true
        
        boolean b2 = (y < 10);
        System.out.println(b2); // false
        
        boolean b3 = ((x > 5) && (y < 10));
        System.out.println(b3); // false
        
        boolean b4 = ((x > 5) || (y < 10));
        System.out.println(b4); // true
        
        boolean b5 = ((x > 5) && (y < 20));
        System.out.println(b5); // true
        
        boolean b6 = ((x < 5) || (y < 10));
        System.out.println(b6); // false
        
        boolean b7 = (b1 || b2);
        System.out.println(b7); // true
        
    }
}

// Task 5

public class HelloWorld{

    public static void main(String []args){
        
        int number = 1012572;
        
        boolean b1 = (number % 2 == 0);
        boolean b2 = (number % 10 == 7);
        
        System.out.println(b1);
        System.out.println(b2);
    }
}

// Task 5

public class HelloWorld{

    public static void main(String []args){
        
        int number = 10125727;
        
        // boolean b1 = (number % 2 == 0);
        // boolean b2 = (number % 10 == 7);
        
        if(number % 2 == 0)
        {
            System.out.println("This number is even");
        }
        else
        {
            System.out.println("This number is odd");
        }
        
        if(number % 10 == 7)
        {
            System.out.println("This number is ended by 7");
        }
        else
        {
            System.out.println("This number is not ended by 7");
        }
    }
}

// Task 5

public class HelloWorld{

    public static void main(String []args){
        
        int number = 10125727;
        
        boolean b1 = (number % 2 == 0);
        boolean b2 = (number % 10 == 7);
        
        if(b1) // if(b1 == true)
        {
            System.out.println("This number is even");
        }
        else
        {
            System.out.println("This number is odd");
        }
        
        if(b2 == true)
        {
            System.out.println("This number is ended by 7");
        }
        else
        {
            System.out.println("This number is not ended by 7");
        }
    }
}

// Task 6

public class HelloWorld{

    public static void main(String []args){
        
        int a = -20;
        int b = 25;
        
        System.out.printf("a = %d; b = %d\n", a, b);
        
        if(Math.abs(a) > Math.abs(b))
        {
            a = a / 2;
        }
        
        System.out.printf("a = %d; b = %d\n", a, b);
    }
}

// Task 7

public class HelloWorld{

    public static void main(String []args){
        
        int w = 55;
        
        if(w <= 0)
        {
            System.out.println("Incorrect input, try again!");
        }
        else
            if(w < 60)
            {
                System.out.println("Light");
            }
            else
                if(w < 75)
                {
                    System.out.println("Medium");
                }
                else
                    if(w < 91)
                    {
                        System.out.println("Heavy");
                    }
                    else
                    {
                        System.out.println("Super Heavy");
                    }
    }
}

// Task 8

public class HelloWorld{

    public static void main(String []args){
        
        int day = 0;
        
        switch(day)
        {
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
                System.out.println("Incorrect day!");
                break;
        }
    }
}