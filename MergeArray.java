public class MergeArrays {
    public static void mergeSortedArrays(int[] arr1, int[] arr2, int[] arr3, int n, int m) {
        int left = 0, right = 0, k = 0;

        while (left < n && right < m) {
            if (arr1[left] < arr2[right]) {
                arr3[k++] = arr1[left++];
            } else if (arr2[right] < arr1[left]) {
                arr3[k++] = arr2[right++];
            } else {
                // If both elements are equal, insert any of them
                arr3[k++] = arr1[left++];
            }
        }

        // Copy remaining elements from arr1, if any
        while (left < n) {
            arr3[k++] = arr1[left++];
        }

        // Copy remaining elements from arr2, if any
        while (right < m) {
            arr3[k++] = arr2[right++];
        }

        // Copy the merged elements back to arr1 and arr2
        for (int i = 0; i < n; i++) {
            arr1[i] = arr3[i];
        }

        for (int i = 0; i < m; i++) {
            arr2[i] = arr3[n + i];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6};
        int n = arr1.length;
        int m = arr2.length;
        int[] arr3 = new int[n + m];

        mergeSortedArrays(arr1, arr2, arr3, n, m);

        System.out.println("Merged and sorted arr1:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Merged and sorted arr2:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

