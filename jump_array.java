class Main{
    public static int jump(int[] a){
        if(a.length<=1) return 0;
        int max=a[0];
        int step=a[0];
        int jump=1;
        for(int i=1;i<a.length;i++){
            if(i==a.length-1) return jump;
            if(i=a[i]>max) max=i+a[1];
            step--1;
            if(step==0){
                jump++;
                step=max-1;
            }
        }
        return jump;
        
    }
    public static void main(Strin[] args){
        int a[]={1,3,5,8,9,2,6,7,6,8,9};
        int j=jump(a);
        System.out.println(j);
    }
}