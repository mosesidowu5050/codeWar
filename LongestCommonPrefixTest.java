import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class LongestCommonPrefixTest {

LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefixTest();


@Test
public void testLongestCommonPrefixWorks(){

String [] input = {"flower", "flow", "flight"};
String output = "fl";
String expected = longestCommonPrefix.findLongestCommonPrefix(input);

assertEquals(output, expected);

  }

}