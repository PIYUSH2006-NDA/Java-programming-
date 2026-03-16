class error extends Exception{
     error (String s ){
          super (s);
     }
}
public class user_defined_ecxeption {
     public static void main(String[] args) {
          try {
               throw new error("This is a user defined exception");
          } catch (error e) {
               System.out.println(e.getMessage());
          }
     }
}
