interface Drawable{  
    void draw();  
    
    static void msg(){
        System.out.println("static method in interface");
    }  
}  

class Rectangle implements Drawable{  
    public void draw(){
        System.out.println("drawing rectangle");
    }  
}  

class DefaultMethod{  
    public static void main(String args[]){  
        Drawable d = new Rectangle();  
        d.draw();  
        Drawable.msg();   // calling static method correctly
    }  
}
