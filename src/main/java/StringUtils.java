import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static String getShortestWord(List<String> words) {

        if(words.size() == 0) {
            throw new IllegalArgumentException("List is empty");
        }

        String minLengthWord = words.get(0);
        for(String word : words) {
            if(word.length() < minLengthWord.length()) {
                minLengthWord = word;
            }
        }
        return minLengthWord;
    }

    public static void main(String[] args) {
        var list = List.of("p", "pp", "222");
        System.out.println(StringUtils.getShortestWord(list));
    }


}
