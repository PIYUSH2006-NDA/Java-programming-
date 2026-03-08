class outer{
     void show(){
          class inner{
               void display(){
                    System.out.println("This is inner class");
               }
          }
          new inner().display();
     }
}
class innerclass_local{
     public static void main(String[] args) {
          new outer().show();
     }
}
