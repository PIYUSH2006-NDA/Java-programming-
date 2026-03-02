class c{
     int fact(int n){
         if(n==0 || n==1){
             return 1;
         }
         else{
             return n*fact(n-1);
         }
     }
}
public class fact {
    public static void main(String[] args) {
        c ob=new c();
        int n=5;
        System.out.println("Factorial of "+n+" is: "+ob.fact(n));
    }
}