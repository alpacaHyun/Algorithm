package doitalgorithm.chapter3;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수");
        int num = sc.nextInt();
        int[] x = new int[num];      // 요솟수가 num 인 배열

        System.out.println("오름차순으로 입력하세요");

        for (int i = 1; i < num; i++) {
            do {
                System.out.println("x[i] : ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.println("검색할 값 입력");
        int ky = sc.nextInt();

        int idx = binSearch(x, num, ky);

        if(idx == -1){
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("ky 값은" + idx + "에 있습니다.");
        }

    }

    private static int binSearch(int[] a, int n, int key) {
        int firstIndex = 0; // 검색 범위의 첫 인덱스
        int lastIndex = n - 1; // 검색 범위의 마지막 인덱스

        do {
            int middleIndex = (firstIndex + lastIndex) / 2;    // 중앙 요소의 인덱스
            if(a[middleIndex] == key){
                return middleIndex;             // 검색 성공
            } else if (a[middleIndex] < key) {
                firstIndex = middleIndex + 1;          // 검색 범위를 뒤쪽 절반으로 좁힘
            } else{
                lastIndex = middleIndex - 1;          // 검색 범위를 앞쪽 절반으로 좁힘

        }
            }while (firstIndex <= lastIndex);
            return -1;   // 검색 실패
    }
}
