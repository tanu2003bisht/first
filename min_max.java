import java.util.*;
class Main{
    static int getmin(int[] a,int n,int k){
        Array.sort(a);
        int ans=a[n-1]-a[0];//last-first
        int smallest=a[n-1]-k;
        int largest=a[n-1]-k;
        for(int i=0;i<n-1;i++){
            int min=Math.min(smallest,a[i+1]-k);
            int max=Math.max(largest,a[i]+k);
            if(min<0)
            continue;
            ans=Math.main(ans,max-min);
        }
        return 0;
    }
    public static void main(Strin[] args){
        int a[]={1,10,5,15};
        int n=a.lenght;
        int b(a,n,k);
        System.out.println(b);
    }
}