// Arrays

public class HelloWorld{

    public static void main(String []args){
        
        int[] array1 = new int[10];
        
        array1[0] = 5;
        array1[3] = 7;
        array1[5] = 1;
        array1[8] = -3;
        
        for(int i = 0; i < 10; i++)
        {
            System.out.print(array1[i] + " ");
        }
        
        System.out.println();
        
        int[] array2 = {1, 3, 4, 5, 8, 9, 10, -2, 5, 6};
         
        for(int j = 0; j < 10; j++)
        {
            System.out.print(array2[j] + " ");
        }       
        
    }
}

// Task1

import java.util.Scanner;

public class HelloWorld{

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] fillArray(int n)
    {
        int[] array = new int[n];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }
        
        return array;
    }

    public static void main(String []args){
        
        int[] array = fillArray(13);
        printArray(array);
    }
}

// Task 2

import java.util.Scanner;
import java.util.Random;

public class HelloWorld{

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] fillArray(int length)
    {
        int[] array = new int[length];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < length; i++)
        {
            array[i] = sc.nextInt();
        }
        
        return array;
    }
    
    public static int[] generateArray(int length)
    {
        int[] array = new int[length];
        
        Random rnd = new Random();
        
        for(int i = 0; i < length; i++)
        {
            array[i] = rnd.nextInt(100);
        }
        
        return array;
    }

    public static void main(String []args){
        
        int[] array = generateArray(15);
        printArray(array);
    }
}

// Task 4

import java.util.Scanner;
import java.util.Random;

public class HelloWorld{

    public static void printArray(double[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.printf("%.2f\t", array[i]);
        }
        System.out.println();
    }
    
    public static double[] fillArray(int length)
    {
        double[] array = new double[length];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < length; i++)
        {
            array[i] = sc.nextDouble();
        }
        
        return array;
    }
    
    public static double[] generateArray(int length)
    {
        double[] array = new double[length];
        
        Random rnd = new Random();
        
        for(int i = 0; i < length; i++)
        {
            array[i] = rnd.nextDouble();
        }
        
        return array;
    }
    
    public static double[] multiplyArray(double[] array, double n)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i] * n;
        }
        
        return array;
    }
    
    public static double[] additionArray(double[] array, double n)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i] + n;
        }
        
        return array;        
        
    }

    public static double[] divisionArray(double[] array, double n)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = array[i] / n;
        }
        
        return array;         
    }
    
    public static void main(String []args){
        
        double[] array = {16, 4, 5, 10, 9, 10};
        
        printArray(array);
        
        divisionArray(array, array[0]);
        
        printArray(array);
    }
}

// Task 6

import java.util.Scanner;
import java.util.Random;

public class HelloWorld{

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] fillArray(int length)
    {
        int[] array = new int[length];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < length; i++)
        {
            array[i] = sc.nextInt();
        }
        
        return array;
    }
    
    public static int[] generateArray(int length)
    {
        int[] array = new int[length];
        
        Random rnd = new Random();
        
        for(int i = 0; i < length; i++)
        {
            array[i] = rnd.nextInt(100);
        }
        
        return array;
    }
    
    public static int findMaxElementOfArray(int[] array)
    {
        int max = array[0];
        
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }

        return max;
    }
    
    public static int findIndexOfMaxElementOfArray(int[] array)
    {
        int max = findMaxElementOfArray(array);
        
        int index = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == max)
            {
                index = i;
                break;
            }
        }
        
        return index;
    }

    public static void main(String []args){
        
        int[] array = generateArray(15);
        printArray(array);
        
        System.out.println(findMaxElementOfArray(array));
        System.out.println(findIndexOfMaxElementOfArray(array));
    }
}

// Task 7.1

import java.util.Scanner;
import java.util.Random;

public class HelloWorld{

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] fillArray(int length)
    {
        int[] array = new int[length];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < length; i++)
        {
            array[i] = sc.nextInt();
        }
        
        return array;
    }
    
    public static int[] generateArray(int length)
    {
        int[] array = new int[length];
        
        Random rnd = new Random();
        
        for(int i = 0; i < length; i++)
        {
            array[i] = rnd.nextInt(100);
        }
        
        return array;
    }
    
    public static int findMaxElementOfArray(int[] array)
    {
        int max = array[0];
        
        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }

        return max;
    }
    
    public static int findIndexOfMaxElementOfArray(int[] array)
    {
        int max = findMaxElementOfArray(array);
        
        int index = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == max)
            {
                index = i;
                break;
            }
        }
        
        return index;
    }
    
    public static int[] swapElementsOfArray(int[] array, int index1, int index2)
    {
        if((index1 >= array.length) || (index2 >= array.length))
            return array;
        else
        {
            int temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
            
            return array;
        }
    }

    public static void main(String []args){
        
        int[] array = generateArray(10);
        printArray(array);
        
        swapElementsOfArray(array, 2, findIndexOfMaxElementOfArray(array));
        printArray(array);
        
        swapElementsOfArray(array, 3, 10);
        printArray(array);
        
        swapElementsOfArray(array, 10, 3);
        printArray(array);        
        
        swapElementsOfArray(array, 12, 15);
        printArray(array);
        
    }
}