class nestedexceptionhandling{
     public static void main(String args[]){
          try {
               int arr[]={1,2,3,4,5,6};
               System.out.println(arr[10]);
          try {
               int a=10/0;
               System.out.println(a);
          try {
               String s= null;
               System.out.println(s.length());
          }
          catch(NullPointerException e){
               System.out.println(e);
          }
          }
          catch(ArithmeticException e){
               System.out.println(e);
          }
          }
          catch(ArrayIndexOutOfBoundsException e){
               System.out.println(e);
          }
          }
     }
