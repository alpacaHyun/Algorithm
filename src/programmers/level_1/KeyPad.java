//package programmers.level_1;
//
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.OutputStreamWriter;
//import java.util.Arrays;
//import java.util.Iterator;
//
//public class KeyPad {
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//        String hand = "right";
//
//        String result = solution(numbers, hand);
//
//        bw.write(result);
//        bw.flush();
//        bw.close();
//    }
//
//    public static String solution(int[] numbers, String hand) {
//        StringBuilder LeftRightResult = new StringBuilder();
//
//        String answer = "";
//
//        String[][] keyPad = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}, {"*", "0", "#"}};
//        int[] initialLeftIndex = {3, 0};
//        int[] initialRightIndex = {3, 2};
//
//        for (int i = 0; i < numbers.length; i++) {
//            int number = numbers[i];
//            if (checkLeftNumber(number)) {
//                LeftRightResult.append("L");
//            }
//
//
//        }
//
//        return answer;
//    }
//
//    private static boolean checkLeftNumber(int number) {
//        if (number == 1 || number == 4 || number == 7) {
//            return true;
//        }
//        return false;
//    }
//
//    private static boolean checkRight(int number) {
//        if (number == 3 || number == 6 || number == 9) {
//            return true;
//        }
//        return false;
//    }
//
//    private static int[] findRowColAtKeyPad(int number) {
//
//    }
//}
