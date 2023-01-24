import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 5}, {3, 4}, {2, 3}};

        Arrays.sort(arr, (o1, o2) -> {
            return o1[1]-o2[1]; // 첫번째 숫자 기준 오름차순 {1,30}{2,10}{3,50}{4,20}{5,40}
        });

        System.out.println(arr);


    }

}
