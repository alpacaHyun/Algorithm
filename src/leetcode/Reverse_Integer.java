package leetcode;


import java.math.BigInteger;

public class Reverse_Integer {

    public static int reverse(int x) {
        BigInteger max= BigInteger.valueOf((int) (Math.pow(2,31) - 1));
        BigInteger min = BigInteger.valueOf((int) (Math.pow(-2, 31)));

        StringBuilder answerSb = new StringBuilder();
        boolean checkMinus = false;

        String tmp = String.valueOf(x);

        for (int i = tmp.length() - 1; i >= 0; i--) {
            if (tmp.charAt(i) == '-') {
                checkMinus = true;
                continue;
            }
            answerSb.append(tmp.charAt(i));
        }

        BigInteger result = new BigInteger(String.valueOf(answerSb));

        if (checkMinus == true) {
            result = result.negate();
        }

        if (result.compareTo(max) == 1 || result.compareTo(min) == -1) {
            return 0;
        }

        return result.intValue();
    }

}
