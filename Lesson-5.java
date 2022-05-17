// Найти максимальное значение из двух чисел

public class HelloWorld{
    
    // Function
    public static int max(int a, int b) {
        
        int max;
        
        if(a > b)
            max = a;
        else
            max = b;
            
        return max;
    }
    
    // Method
    public static void print(int a) {
        
        System.out.println(a);
    }
    
    public static void main(String []args){
        
        int a = 100;
        int b = 20;
        
        int maximum = max(a,b);
            
        int x = 100;
        int y = 200;

        print(maximum); // 100
        print(max(x,y)); // 200
    }
}

// Task 1
public class HelloWorld{
    
    public static void print(int rows, int columns ,int number){
        
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < columns; j++)
            {
                System.out.print(number + " ");        
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        
        print(11,15,0);
    }
}

// Task 3
public class HelloWorld{
    
    public static void printElement(int a, int b){
        
        System.out.printf("%d + %d = %d\t", a, b, a + b);
    }
    
    public static void printLine(int row){
        
        for(int i = 1; i <= 9; i++)
        {
            printElement(row, i);
        }
        System.out.println();
    }
    
    public static void printTable(){
        
        for(int i = 1; i <= 9; i++)
        {
            printLine(i);
        }
    }
    
    public static void main(String []args){
        
        printTable();
    }
}

// Task 4.2 - FOR
public class HelloWorld{
    
    public static void main(String []args){
        
        int f1 = 1;
        int f2 = 1;
        
        int n = 10;
        
        System.out.print("1 1 ");
        
        for(int i = 3; i <= n; i++)
        {
            int fk = f1 + f2;
            System.out.print(fk + " ");
            f1 = f2;
            f2 = fk;
        }
    }
}

// Task 4 - recursion
public class HelloWorld{
    
    public static int fib(int n){
        
        if((n == 1) || (n == 2))
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }
    
    public static void printFib(int n){
        
        for(int i = 1; i <= n; i++)
        {
            System.out.print(fib(i) + " ");
        }
    }
    
    public static void main(String []args){
        
        printFib(15);
    }
}

// Task 5
public class HelloWorld{
    
    public static long factorialClassic(int n){
        
        long result;
        
        if((n == 0) || (n == 1))
            result = 1;
        else
        {
            result = 1;
            
            for(int i = 2; i <= n; i++)
            {
                result = result * i;    
            }
        }
        
        return result;
    }
    
    public static long factorialRecursion(int n){
        
        if((n == 0) || (n == 1))
            return 1;
        else
            return n * factorialRecursion(n - 1);
    }
    
    public static void main(String []args){
        
        System.out.println(factorialClassic(0));
        System.out.println(factorialClassic(1));
        System.out.println(factorialClassic(5));
        System.out.println(factorialClassic(10));
        System.out.println(factorialClassic(20));
        
        System.out.println(factorialRecursion(0));
        System.out.println(factorialRecursion(1));
        System.out.println(factorialRecursion(5));
        System.out.println(factorialRecursion(10));
        System.out.println(factorialRecursion(20));
        
    }
}

// Task 6 

public class HelloWorld{
    
    public static int minimum(int a, int b){
        
        if(a < b)
            return a;
        else
            return b;
    }
    
    public static double minimum(double a, double b){
        
        if(a < b)
            return a;
        else
            return b;
    }
    
    public static int minimum(int a, int b, int c){
        
        return minimum(minimum(a,b),c);
    }
    
    public static int minimum(int a, int b, int c, int d){
        
        return minimum(minimum(a,b), minimum(c,d));
    }
    
    public static int minimum(int a, int b, int c, int d, int e){
        
        return minimum(minimum(a,b), minimum(c,d), e);
    }
    
    public static void main(String []args){
        
        System.out.println(minimum(-10, -15));              //  -15
        System.out.println(minimum(-10, -15, -20));         //  -20
        System.out.println(minimum(10, 15, 20));            //  10
        System.out.println(minimum(0, 0, 0));               //  0
        System.out.println(minimum(1, 5, 7, -2));           //  -2
        System.out.println(minimum(-1, -5, -7, -2, -8));    // -8
        
        double a = 10.0;
        double b = -12.4;
        
        System.out.println(minimum(a, b));                  // -12
    }
}

// Task 7

public class HelloWorld{

    public static boolean isTriangle(double a, double b, double c){
        
        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0))
            return true;
        else
            return false;
    }

    public static double perimetr(double a, double b, double c){
        
        if(isTriangle(a, b, c) == true)
            return a + b + c;
        else
            return 0;
    }
    
    public static double square(double a, double b, double c){
        
        if(isTriangle(a, b, c) == true)
        {
            double p = perimetr(a, b, c) / 2;
        
            return Math.sqrt(p*(p - a)*(p - b)*(p - c));    
        }
        else
            return 0;
    }
    
    public static void printInfo(double a, double b, double c){
        
        System.out.printf("Exist = %b; Perimetr = %.2f; Square = %.2f;\n", isTriangle(a, b, c), perimetr(a, b, c), square(a, b, c));
    }
    
    public static void main(String []args){
        
        printInfo(3, 4, 5);
        printInfo(3, 5, 8);
        printInfo(-3, 5, 7);
    }
}