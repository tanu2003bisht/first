// find maximum and minimum element  in an array
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int[] arr= new int[n];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.println( arr[i]);
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min){
                min=arr[i];
         }
        }
               System.out.println("The maximum array is " + max);
              System.out.println("The minimum  is " + min);
            
       
    }
}