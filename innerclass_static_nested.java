class outer{
     static String name= "outer class";
     static class inner{
          void display(){
               System.out.println("this is inner class");
               System.out.println(name);
          }
     }
}
public class innerclass_static_nested {
     public static void main(String[] args) {
          outer.inner obj = new outer.inner();
          obj.display();
     }
}
