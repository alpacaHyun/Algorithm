package programmers.level1;


public class NumberPartner {
    public String solution(String X, String Y) {
        int[] x = new int[10];
        int[] y = new int[10];

        String[] xTmp = X.split("");
        String[] yTmp = Y.split("");

        for (String s : xTmp) {
            x[Integer.parseInt(s)]++;
        }
        for (String s : yTmp) {
            y[Integer.parseInt(s)]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {

            while (x[i] > 0 && y[i] > 0) {
                sb.append(i);
                x[i]--;
                y[i]--;
            }
        }

        if (sb.toString().charAt(0) == '0') {
            return "0";
        }

        if (sb.toString().equals("")) {
            return "-1";
        }

        return sb.toString();
    }
}
