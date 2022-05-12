// Циклы

public class HelloWorld{

     public static void main(String []args){
        
        for(int i = 0; i <= 10; i++)
        {
            System.out.println("5");
        }
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        for(int i = -10; i > -20; i = i - 1)
        {
            System.out.print(i + " ");
        }
     }
}

public class HelloWorld{

     public static void main(String []args){
        
        for(int i = 1; i < 30; i = i * 2)
        {
            System.out.print(i + " ");
        }
     }
}

public class HelloWorld{

    public static void main(String []args){
        
        for(int i = 1; i < 20; i++)
        {
            System.out.printf("The number of square for %d is %d\n", i, i * i);
        }
    }
}

// Task 2
public class HelloWorld{

    public static void main(String []args){
        
        for(int i = 10; i <= 25; i++)
        {
            System.out.printf("%d %d.4\n", i, i);
        }
    }
}

// Task 3
public class HelloWorld{

    public static void main(String []args){
        
        for(int i = 1; i <= 9; i++)
        {
            System.out.printf("%d X 7 = %d\n", i, i * 7);
        }
    }
}

// Task 4.1
public class HelloWorld{

    public static void main(String []args){
        
        int sum = 0;
        
        for(int i = 100; i <= 500; i++)
        {
            System.out.println("=========================");
            System.out.println("i = " + i);
            System.out.println("BEFORE: sum = " + sum);
            sum = sum + i;
            System.out.println("AFTER: sum = " + sum);
            System.out.println("=========================");
        }
        
        System.out.println("Sum of range is " + sum);
    }
}

// Task 5
import java.util.Scanner;

public class HelloWorld{

    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        int n = 8;
        
        double sum = 0;
        int counter = 0;
        
        for(int i = 0; i < n; i++)
        {
            double temp = sc.nextDouble();
            sum = sum + temp;
            counter++;
            System.out.print(temp + " ");
        }
        System.out.println();
        
        System.out.println("Sum = " + sum + "; Count = " + counter);
        
        double avg = sum / counter;
        
        System.out.println("Average = " + avg);
    }
}

// While

public class HelloWorld{

    public static void main(String []args){
        
        int i = 1;
        
        while(i < 10)
        {
            System.out.print(i + " ");
            i++;
        }
    }
}

// Do While

public class HelloWorld{

    public static void main(String []args){
        
        int i = 1;
        
        do
        {
            System.out.print(i + " ");
            i++;
        }
        
        while(i < 10);
    }
}

// Task 7
import java.util.Scanner;

public class HelloWorld{

    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        
        int temp = sc.nextInt();
        
        int sum = 0;
        int counter = 0;
        
        while(temp != 0)
        {
            System.out.print(temp + " ");
            sum = sum + temp;
            counter++;
            temp = sc.nextInt();
        }
        System.out.println();
        
        System.out.println("Sum = " + sum + "; Count = " + counter);
    }
}

// Task 8.1
public class HelloWorld{

    public static void main(String []args){
        
        int number = 329373843;
        
        int counter = 0;
        
        while(number > 0)
        {
            int last = number % 10;
            
            if(last == 3)
            {
                counter++;
            }
            
            number = number / 10;
        }
        
        System.out.println(counter);
    }
}

// Найти все четные числа в диапозоне 1-30

public class HelloWorld{

    public static void main(String []args){
        
        System.out.println("CASE 1");
        
        for(int i = 1; i <= 30; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        
        System.out.println("CASE 2");
        
        for(int j = 1; j <= 30; j++)
        {
            if(j % 2 != 0)
                continue;
            System.out.print(j + " ");
        }
    }
}

// Task 10
public class HelloWorld{

    public static void main(String []args){
        
        int number = 329373843;
        
        int max = 0;
        
        while(number > 0)
        {
            System.out.println("=====================");
            System.out.println("The number is " + number);
            System.out.println("Max digit is " + max);
            int last = number % 10;
            
            if(last > max)
            {
                max = last;
                System.out.println("New max digit is " + max);
            }
            
            number = number / 10;
            System.out.println("=====================");
        }
        
        System.out.println(max);
    }
}

// Task 11

public class HelloWorld{

    public static void main(String []args){
        
        for(int i = 5000; i > 0; i--)
        {
            if(i % 39 == 0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}