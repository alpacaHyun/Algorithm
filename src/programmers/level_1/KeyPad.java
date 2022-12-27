package programmers.level_1;


public class KeyPad {
    public static String solution(int[] numbers, String hand) {
        StringBuilder LeftRightResult = new StringBuilder();

        String[] keyPad = {"123", "456", "789", "*0#"};
        String leftIndex = "30";
        String rightIndex = "32";

        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (checkLeftNumber(number) == true) {
                LeftRightResult.append("L");
                leftIndex = findRowColAtKeyPad(number, keyPad);
                continue;
            }

            if (checkRightNumber(number) == true) {
                LeftRightResult.append("R");
                rightIndex = findRowColAtKeyPad(number, keyPad);
                continue;
            }

            String middleNumberIndex = findRowColAtKeyPad(number, keyPad);

            int leftIndexDistance = calculateDistance(leftIndex,middleNumberIndex);
            int rightIndexDistance = calculateDistance(rightIndex, middleNumberIndex);

            int distance = leftIndexDistance - rightIndexDistance;

            if(distance > 0) {
                LeftRightResult.append("R");
                rightIndex = middleNumberIndex;
                continue;
            }

            if(distance < 0) {
                LeftRightResult.append("L");
                leftIndex = middleNumberIndex;
                continue;
            }

            if(distance == 0) {
                if (hand.equals("right")) {
                    LeftRightResult.append("R");
                    rightIndex = middleNumberIndex;
                    continue;
                }

                if (hand.equals("left")) {
                    LeftRightResult.append("L");
                    leftIndex = middleNumberIndex;
                }
            }
        }

        return LeftRightResult.toString();
    }

    private static boolean checkLeftNumber(int number) {
        if (number == 1 || number == 4 || number == 7) {
            return true;
        }
        return false;
    }

    private static boolean checkRightNumber(int number) {
        if (number == 3 || number == 6 || number == 9) {
            return true;
        }
        return false;
    }

    private static String findRowColAtKeyPad(int number, String[] keyPad) {
        StringBuilder resultStringBuilder = new StringBuilder();
        int index = 0;
        String numberString = String.valueOf(number);
        for (int i = 0; i < keyPad.length; i++) {
            if(keyPad[i].contains(numberString)){
                index = i;
                resultStringBuilder.append(index);
                break;
            }
        }

        String keyPadString = keyPad[index];
        for (int i = 0; i < keyPadString.length(); i++) {
            if(keyPadString.charAt(i) == numberString.charAt(0)){
                resultStringBuilder.append(i);
                break;
            }
        }

        return resultStringBuilder.toString();
    }

    private static int calculateDistance(String index, String numberIndex) {
        int indexRow = Integer.parseInt(String.valueOf(index.charAt(0)));
        int indexCol = Integer.parseInt(String.valueOf(index.charAt(1)));

        int numberIndexRow = Integer.parseInt(String.valueOf(numberIndex.charAt(0)));
        int numberIndexCol = Integer.parseInt(String.valueOf(numberIndex.charAt(1)));

        return Math.abs(indexRow - numberIndexRow) + Math.abs(indexCol - numberIndexCol);
    }
}
