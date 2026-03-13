class restro extends Thread{
     private String task;
     restro(String task){
          this.task= task;
     }
     public void run(){
          System.out.println(task+"task is prepared"+Thread.currentThread().getName());
     }
}
public class multithreading{
     public static void main(String args[]){
          Thread r1= new restro("Pizza");
          r1.start();
          Thread r2= new restro("Burger");
          r2.start();
          Thread r3= new restro("Pasta");
          r3.start();
     }
}
