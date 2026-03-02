class Data {
     int id;
     String name;
     Data(){
          id=01;
          name="piyush";
     }
     Data(int i,String n){
          this.id=i;
          this.name=n;
     }
     void display(){
          System.out.println("id: "+id+" name: "+name);
     }
}
public class constructover {
     public static void main(String[] args) {
          Data d=new Data();
          d.display();
          Data d2=new Data(02,"pratik");
          d2.display();
     }
}
