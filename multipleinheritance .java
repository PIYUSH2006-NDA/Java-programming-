interface drawing{
     void show();
}
class rectangle implements drawing{
     public void show(){
          System.out.println("This is rectangle");
     }
}
class circle implements drawing{
     public void show(){
          System.out.println("This is circle");
     }
}
class multipleinheritance {
     public static void main(String[] args) {
          rectangle r = new rectangle();
          circle c = new circle();
          r.show();
          c.show();
}
}
