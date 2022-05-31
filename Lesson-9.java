//  Queue
https://codeboard.io/projects/333237

// ArrayList

import java.util.*;
import java.util.ArrayList;

public class Main {
    
    public static void printArrayList(ArrayList<String> list)
    {
      for(int i = 0; i < list.size(); i++)
      {
        System.out.print(list.get(i) + " ");
      }
      System.out.println();
    }
    
    public static void main(String[] args) {
      
      ArrayList<String> list = new ArrayList();
      
      printArrayList(list);
      
      list.add("Anton");
      list.add("Kate");
      printArrayList(list);
      
      list.add(0, "Linar");
      printArrayList(list);
      
      list.add(1, "Denis");
      printArrayList(list);
      
      list.set(2, "Kirill");
      printArrayList(list);
      
      list.remove(0);
      printArrayList(list);
      
      System.out.println(list.size());
    }
}