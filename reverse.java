//reverse the array
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n= sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            
        }
         System.out.println("enter the reverse array");
         for(int i=arr.length-1;i>=0;i--){
             System.out.println(arr[i]);
         }
        
    }
}