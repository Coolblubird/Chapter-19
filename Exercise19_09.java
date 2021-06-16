/*
Author: Jordan Ashe 
Date: 6-16-21

Description: 
*/
import java.util.ArrayList;

public class Exercise19_09 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(14);
    list.add(24);
    list.add(4);
    list.add(42);
    list.add(5);
    
    Exercise19_09.<Integer>sort(list);
    
    System.out.print(list);
  }
  
  public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
    E temp;
    int index;
    
    for (int b=0; b<list.size(); b++){
      temp = list.get(b);
      index = b;
      
      for (int i=b+1; i<list.size(); i++){
        if (temp.compareTo(list.get(i)) > 0){
          temp = list.get(b);
          list.set(b, list.get(i));
          list.set(i, temp);
        }
      }
    }
  }
}
