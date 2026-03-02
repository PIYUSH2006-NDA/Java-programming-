// 14. Object Cleanup: Create a Resource class with a finalize() method to display a
// message when an object is garbage collected. Write a program to demonstrate
// garbage collection.
class Demo {
protected void finalize() throws Throwable {
System.out.println("Object is garbage collected");
}
}
public class q14 {
public static void main(String[] args) {
Demo obj = new Demo();
obj = null; // Dereference the object
System.gc(); // Suggest garbage collection
}
}