import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public static int countWordsInSentence(String sentence, String word) {
        String[] words = sentence.split(" ");
        int counter = 0;
        for(String sentenceWord : words) {
            if(word.equals(sentenceWord)) {
                counter++;
            }
        }
        return counter;
    }

    public static Map<String, Integer> countWordsInSentence(String sentence) {

         String [] wordsInSentence = sentence.split("\\W+");
         Map<String, Integer> result = new HashMap<>();
         for(String sentenceWord : wordsInSentence) {
            Integer value = result.get(sentenceWord);
            if(value == null) {
                result.put(sentenceWord, 1);
            } else {
                result.put(sentenceWord, ++value);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        var list = List.of("p", "pp", "222");
        System.out.println(StringUtils.getShortestWord(list));

        var result = StringUtils.countWordsInSentence("this is ilon mask, really it is him");
        System.out.println(result);

    }


}
