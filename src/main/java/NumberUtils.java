import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for(int i : numbers) {
            sum+= i;
        }
        return  sum;

    }

    public static List<Integer> multiplyOddNumber(List<Integer> numbers) {
        List<Integer> resultList = new ArrayList<>();
        for(int i : numbers) {
            if( i % 2 != 0) {
                resultList.add(i * 2);
            }
        }
        return resultList;

    }

    public static void main(String[] args) {
        var list = List.of(1,2,3);
        System.out.println(NumberUtils.getSum(list));
        System.out.println(NumberUtils.multiplyOddNumber(list));
    }

}
