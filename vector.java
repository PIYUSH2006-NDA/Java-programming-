import java.util.*;
public class vector {
     public static void main(String args[]){
          Stack<String>stack = new Stack<String>();
          stack.push("hello");
          stack.push("world");
          Iterator<String> it = stack.iterator();
          while (it.hasNext()){
               System.out.println(it.next());
          }
     }
}
