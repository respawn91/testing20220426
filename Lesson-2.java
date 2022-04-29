// Вывод данных на экран
public class HelloWorld{

     public static void main(String []args){
        
        System.out.println("Hello World");
        System.out.println("Hello World");
        
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        System.out.print("Hello World");
        System.out.print("Hello World");
        
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        int a = 10;
        boolean b = true;
        String s = "Some text";
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(s);
        
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        int a = 100;
        int b = 30;
        
        System.out.println(a + b); // 130
        System.out.println(a - b); // 70
        System.out.println(a * b); // 3000
        System.out.println(a / b); // 3
        System.out.println(a % b); // 10
        
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        int a = 100;
        int b = 30;
        
        String s = "Text";
        
        System.out.println(s + a + b);
        System.out.println(s + (a + b));
        System.out.println(a + b + s);
        
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        int a = 100;
        System.out.println(a);
        
        // Constructor
        Integer b = new Integer(100);
        System.out.println(b);
     }
}

import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        int a1 = sc.nextInt();
        System.out.println(a1);
        
        int a2 = sc.nextInt();
        System.out.println(a2);
        
        int a3 = sc.nextInt();
        System.out.println(a3);
        
        int a4 = sc.nextInt();
        System.out.println(a4);
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        int a = 20;
        int b = 30;
        
        System.out.println("a = " + a + "; b = " + b + "; sum = " + (a + b));
        
        System.out.printf("a = %d; b = %d; sum = %d", a, b, a + b);
       
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        char c = 113;
        System.out.println(c);
        
        char d = 'r';
        System.out.println(d);

        System.out.println(c + d);
     }
}
// Задача №1
public class HelloWorld{

     public static void main(String []args){
        
        int days = 234;
        
        int weeks = days / 7;
        
        int months = days / 30;
        
        System.out.printf("We have %d days. It means that we have %d weeks and %d months", days, weeks, months);
     }
}

// Задача №2
public class HelloWorld{

     public static void main(String []args){
        
        int number = 39;
        
        int d = number / 10;
        int e = number % 10;
        
        System.out.println(d);
        System.out.println(e);
     }
}




