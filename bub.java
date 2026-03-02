class bub{
    public static void bubs(int[] arr){
        int n= arr.length;
        for (int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }
        
    public static void main(String[] args){
        int[] arr={9,8,5,6,3,2,7,4,5,6};
        bubs(arr);
        System.out.println("the sorted array is :- ");
        for (int i=0;i<arr.length;i++){
          System.out.print(arr[i] + " ");
            
        }
    }
}