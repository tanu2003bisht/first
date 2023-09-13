           class Main{
    public static void main(String[]args){
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println("the original array is\n");
        int n=arr.length;
        int last,i;
        for(i=0;i<n;i++)
        System.out.println(arr[i]);
        last=arr[n-1];
        for(i=n-1;i>0;i--)
            arr[i]=arr[i-1];
            arr[0]=last;
            System.out.println("the rotated array]\n");
            for(i=0;i<n;i++)
            System.out.println(arr[i]);
        
    }
}