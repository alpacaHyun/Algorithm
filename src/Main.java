import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        int sum = list.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);

    }

}
  