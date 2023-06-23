import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void smallestSubsequenceTest1() {
        String s = "bcabc";
        String expected = "abc";
        String actual = new Solution().smallestSubsequence(s);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void smallestSubsequenceTest2() {
        String s = "cbacdcbc";
        String expected = "acdb";
        String actual = new Solution().smallestSubsequence(s);
        Assert.assertEquals(expected, actual);
    }

}
