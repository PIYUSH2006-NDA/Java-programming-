import java.util.*;
class arrchk{
public static void main(String args[]){
    int[] arr={1,2,3,4,5,6};
    System.out.println("enter the number here :- ");
    Scanner sc= new Scanner(System.in);
    int key=sc.nextInt();
    int n= arr.length;
    int min=0;
    int max=(n-1);
    int mid=(min+max)/2;
    while(min<=max){
        if (arr[mid]==key){
            int k=mid;
            System.out.println("the key found at index :- "+k);
        }
        else if (arr[mid]>key){
            max =mid- 1;
            System.out.println("the key found at index :- "+max);
        }
        else if ((arr[mid]<key))  {
            min =mid+ 1;
            System.out.println("the key found at index :- "+min);
        }
        else {
             System.out.println("the key donot found at any index");
        }
        
    }
}    
    
}