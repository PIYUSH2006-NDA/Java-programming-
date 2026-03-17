import java.util.*;
public class PriorityQueqe1{
     public static void main(String args[]){
          PriorityQueue<String>q= new PriorityQueue<String>();
          q.add("java");
          Iterator <String> r1= q.iterator();
          while(r1.hasNext()){
               System.out.println(r1.next());
          }
          q.remove();
          q.poll();
          System.out.println("after removing two elements:");
          Iterator<String> itr2 = q.iterator();
          while(itr2.hasNext()){
               System.out.println(itr2.next());


          }
     }
}
