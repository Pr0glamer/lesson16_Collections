import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestUtils {

    @Test
    public void shouldReturnShortestWordFromListOfWords() {
        var list = List.of("p", "pp", "222");
        String result = StringUtils.getShortestWord(list);
        assertEquals(1, result.length());
    }

    @Test
    public void shouldThrowExceptionWhenListOfWordsIsEmpty() {
        var list = new ArrayList<String>();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            String result = StringUtils.getShortestWord(list);
        });
        String expectedMessage = "List is empty";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
    @Test
    public void shouldReturnCountOfWordsInSentence() {
        String sentence = "this is ilon mask, really it is him";
        String word = "is";
        int result = StringUtils.countWordsInSentence(sentence, word);
        assertEquals(result, 2);
    }

    @Test
    public void shouldReturnSumOfElements() {
        var list = List.of(1,2,3);
        int result = NumberUtils.getSum(list);
        assertEquals(6, result);
    }

    @Test
    public void shouldReturnNewListOfMultipliedOddNumber() {
        var list = List.of(1,2,3);
        List<Integer> resultList = NumberUtils.multiplyOddNumber(list);
        var listExpected = List.of(2, 6);
        assertEquals(listExpected, resultList);
    }






}
