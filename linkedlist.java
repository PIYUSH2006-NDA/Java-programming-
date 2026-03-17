import java.util.*;
public class linkedlist {
     public static void main(String args[]){
          LinkedList<String>list = new LinkedList<String>();
          list.add("java");
          list.add("python");
          Iterator<String> it = list.iterator();
          while (it.hasNext()){
               System.out.println(it.next());
          }
     }
}
