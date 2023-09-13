class Main{
    public static void main(String[] args){
        int[] arr={1,3,-9,7,-9,3};
        int n=arr.length;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
        int sum=0;
        for(int j=0;j<n;j++){
        sum+=arr[j];
        res=Math.max(sum,res);
        }
        }
        System.out.println(res);
        
    }
}