class restro implements Runnable{
     private String task;
     restro(String task){
          this.task=task;
     }
     public void run(){
            System.out.println(task + " is being prepared by " +  Thread.currentThread().getName());
     }
}
public class multithreading_using_implements{
     public static void main(String args[]){
          Thread t1= new Thread(new restro("pizza"));
          t1.start();
          Thread t2= new Thread(new restro("burger"));
          t2.start();
          Thread t3= new Thread(new restro("pasta"));
          t3.start();


     }
}
