// 7. Temperature Converter: Create a Temperature class with a static method to
// convert temperature between Celsius and Fahrenheit. Write a program to
// demonstrate its usage.
class temprature{
     static double convertCtoF(double celsius){
          return (celsius * 9/5) + 32;
     }
     static double convertFtoC(double fahrenheit){
          return (fahrenheit - 32) * 5/9;
     }
}
public class q7 {
     public static void main(String[] args) {
          double celsius = 25.0;
          double fahrenheit = temprature.convertCtoF(celsius);
          System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
          
          fahrenheit = 77.0;
          celsius = temprature.convertFtoC(fahrenheit);
          System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
     }
}