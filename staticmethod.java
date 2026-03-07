interface draw{
     void printvalue();
     static void display(){
         System.out.println("This is a static method in interface");
     }
}
class staticmethod implements draw{
    public void printvalue(){
        System.out.println("This is a non-static method in interface");
    }
    public static void main(String[] args){
        draw.display();
        staticmethod obj = new staticmethod();
        obj.printvalue();
    }
}
