package doitalgorithm.chapter2;

public class ChangeArr {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr);
        System.out.println(arr);
    }

    private static void swap(int[] a, int indx1, int indx2) {
        int i = a[indx1];
        a[indx1] = a[indx2];
        a[indx2] = i;
    }

    private static void reverse(int[] a) {
        for (int i = 0; i < a.length; i++) {
            swap(a, i, a.length - i - 1);
        }
    }
}
