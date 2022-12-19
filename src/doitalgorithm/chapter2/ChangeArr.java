package doitalgorithm.chapter2;

import java.util.Arrays;

public class ChangeArr {

        static int[] arr = {1, 2, 3, 4, 5};
    public static void main(String[] args) {


        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] a, int indx1, int indx2) {
        int t = a[indx1];
        a[indx1] = a[indx2];
        a[indx2] = t;
    }

    private static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }
}
