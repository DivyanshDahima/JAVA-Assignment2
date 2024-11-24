import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 7};
        int[] B = {2, 4, 6, 8, 10};

        int[] C = mergeSortedArrays(A, B);

        System.out.println("Merged Array: " + Arrays.toString(C));
    }

    public static int[] mergeSortedArrays(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        int[] C = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }

        while (i < n) {
            C[k++] = A[i++];
        }
        
        while (j < m) {
            C[k++] = B[j++];
        }

        return C;
    }
}
