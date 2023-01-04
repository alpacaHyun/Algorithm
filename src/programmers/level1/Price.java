package programmers.level1;

public class Price {

    public static void main(String[] args) {
        solution(3, 20, 4);
    }

    public static long solution(int price, int money, int count) {

        long firstPrice = price;

        for (int i = 1; i <= count; i++) {

            money -= price;
            price += firstPrice;
        }

        return money * -1;

    }

}
