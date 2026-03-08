import java.util.ArrayList;
class arraylist {
     public static void main(String[] args) {
          ArrayList<Integer>list= new ArrayList<Integer>();
          list.add(0);
          System.out.println(list);
          int ele= list.get(0);
          System.out.println(ele);
          list.add(1,1);
          System.out.println(list);
          list.set(0,5);
          System.out.println(list);
          list.remove(0);
          System.out.println(list);
          
}}
