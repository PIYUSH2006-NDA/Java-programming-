class outer {
     private String name = "Outer class variable";
     class inner{
          void display(){
               System.out.println(name);
          }
     }
}
public class innerclass_memberinnner {
     public static void main(String[] args){
          outer obj = new outer();
          outer.inner innerobj = obj.new inner();
          innerobj.display();
     }
}
