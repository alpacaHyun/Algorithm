//package programmers.level_1;
//
//import java.util.Arrays;
//import java.util.Collections;
//
//public class SortLong {
//
//    public static void main(String[] args) {
//        solution(873211);
//    }
//
//    public static long solution(long n) {
//        StringBuilder sb = new StringBuilder();
//        String tmp = String.valueOf(n);
//        int[] answerArr = new int[tmp.length()];
//        for (int i = 0; i < tmp.length(); i++) {
//            answerArr[i] = Integer.valueOf(tmp.charAt(i));
//        }
//
//        Arrays.sort(answerArr, Collections.reverseOrder());
//
//        for (int i = 0; i < answerArr.length; i++) {
//            sb.append(answerArr[i]);
//        }
//
//        return Long.parseLong(sb.toString());
//    }
//
//}
