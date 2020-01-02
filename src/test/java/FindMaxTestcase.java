import org.junit.Assert;
import org.junit.Test;

public class FindMaxTestcase {
    @Test
    public void whenGivenNo_ShouldReturnFirstPositionMax() {
        FindMaximum max = new FindMaximum();
        Integer X= max.checkMax(10,20,30);
        Integer expected=30;
        Assert.assertEquals(expected,X);
    }

    @Test
    public void whenGivenNo_ShouldReturnSecondPositionMax() {
        FindMaximum max = new FindMaximum();
        Integer a= max.checkMax(10, 30, 20);
        Integer expected=30;
        Assert.assertEquals(expected,a);
    }

    @Test
    public void whenGivenNo_ShouldReturnThirdPositionMax() {
        FindMaximum max = new FindMaximum();
        Integer a= max.checkMax(30, 10, 20);
        Integer expected=30;
        Assert.assertEquals(expected,a);
    }
}
