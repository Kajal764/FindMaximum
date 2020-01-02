import org.junit.Assert;
import org.junit.Test;

public class FindMaxTestcase {

    //TestCases for Integer
    @Test
    public void whenGivenNo_ShouldReturnThirdPositionMax() {
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
    public void whenGivenNo_ShouldReturnFirstPositionMax() {
        FindMaximum max = new FindMaximum();
        Integer a= max.checkMax(30, 10, 20);
        Integer expected=30;
        Assert.assertEquals(expected,a);
    }

    //TestCases For Floating No
    @Test
    public void whenGivenFloat_ShouldReturnThirdPositionMax() {
        FindMaximum max = new FindMaximum();
        Float X= max.checkMaxFloat(10.3f,20.3f,30.3f);
        Float expected=30.3f;
        Assert.assertEquals(expected,X);
    }
    @Test
    public void whenGivenFloat_ShouldReturnSecondPositionMax() {
        FindMaximum max = new FindMaximum();
        Float X= max.checkMaxFloat(10.3f,30.3f,20.3f);
        Float expected=30.3f;
        Assert.assertEquals(expected,X);
    }
    @Test
    public void whenGivenFloat_ShouldReturnFirstPositionMax() {
        FindMaximum max = new FindMaximum();
        Float X= max.checkMaxFloat(40.3f,20.3f,30.3f);
        Float expected=40.3f;
        Assert.assertEquals(expected,X);
    }


}
