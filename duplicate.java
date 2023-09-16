import java.util.*;
class Main{
    static void duplicate(int[] a){
        int n=a.length;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(a[i]==a[i+1]){
            return a[i];
        }
    }
    return 0;
    }
    public static void main(String[] args){
        int a[]={2,5,7,8,9,2,7};
        System.out.println("the duplicate element is"+ duplicate(arr));
        
    }
}