class Main{
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,5,6,7};
        int m = arr1.length;
        int n = arr2.length;
        System.out.println("union of two arrays");
        printUnion(arr1,arr2,m,n);
        printIntersection(arr1, arr2, m, n);
        
        
    }
    static void printIntersection(int arr1[], int arr2[], int m, int n)
    {
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }
    
    public static void printUnion(int[] arr1,int[] arr2,int m,int n){
        int i=0;int j=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                System.out.println(arr1[i++]+" ");
            }
                else if(arr1[i]>arr2[j]){
                    System.out.println(arr2[j++]+" ");
                }
                else{
                    System.out.println(arr1[i++]+" ");
                    j++;
                }
            }
            
            while(i<m){
                System.out.println(arr1[i++]+" ");
            }
            while(j<n){
                System.out.println(arr2[j++]+" ");
            }
            
        }
    }
    