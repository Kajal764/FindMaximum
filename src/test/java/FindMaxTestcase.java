import org.junit.Assert;
import org.junit.Test;

public class FindMaxTestcase {

    //TestCases for Integer
    @Test
    public void whenGivenNo_ShouldReturnThirdPositionMax() {
        FindMaximum max = new FindMaximum();
        int maximum= (int) max.checkMaximum(10,20,30);
        int expected=30;
        Assert.assertEquals(expected,maximum);
    }

    @Test
    public void whenGivenNo_ShouldReturnSecondPositionMax() {
        FindMaximum max = new FindMaximum();
        int a= (int) max.checkMaximum(10, 30, 20);
        int expected=30;
        Assert.assertEquals(expected,a);
    }

    @Test
    public void whenGivenNo_ShouldReturnFirstPositionMax() {
        FindMaximum max = new FindMaximum();
        int a= (int) max.checkMaximum(30, 10, 20);
        int expected=30;
        Assert.assertEquals(expected,a);
    }

  //TestCases For Floating No
  @Test
    public void whenGivenFloat_ShouldReturnThirdPositionMax() {
        FindMaximum max = new FindMaximum();
        Float X= (Float) max.checkMaximum(10.3f,20.3f,30.3f);
        Float expected=30.3f;
        Assert.assertEquals(expected,X);
    }
    @Test
    public void whenGivenFloat_ShouldReturnSecondPositionMax() {
        FindMaximum max = new FindMaximum();
        Float X= (Float) max.checkMaximum(10.3f,30.3f,20.3f);
        Float expected=30.3f;
        Assert.assertEquals(expected,X);
    }
    @Test
    public void whenGivenFloat_ShouldReturnFirstPositionMax() {
        FindMaximum max = new FindMaximum();
        Float X= (Float) max.checkMaximum(40.3f,20.3f,30.3f);
        Float expected=40.3f;
        Assert.assertEquals(expected,X);
    }

    //TestCases For String
    @Test
    public void whenGivenString_ShouldReturnThirdPositionMax() {
        FindMaximum max = new FindMaximum();
        String X= (String) max.checkMaximum("kajal","nisha","sonam");
        String expected="sonam";
        Assert.assertEquals(expected,X);
    }
    @Test
    public void whenGivenString_ShouldReturnSecondPositionMax() {
        FindMaximum max = new FindMaximum();
        String X= (String) max.checkMaximum("Kajal","sonam","pranali");
        String expected="sonam";
        Assert.assertEquals(expected,X);
    }
    @Test
    public void whenGivenString_ShouldReturnFirstPositionMax() {
        FindMaximum max = new FindMaximum();
        String X= (String) max.checkMaximum("sonam","kajal","pranali");
        String expected="sonam";
        Assert.assertEquals(expected,X);
    }


    @Test
    public void whenGivenStringGeneric_ShouldReturnMax() {
        FindMaximum max = new FindMaximum("sonam","kajal","pranali");
        Object X= max.checkMaximumValue();
        String expected="sonam";
        Assert.assertEquals(expected,X);
    }
    @Test
    public void whenGivenIntegerGeneric_ShouldReturnMax() {
        FindMaximum max = new FindMaximum(20,30,10);
        Object X= max.checkMaximumValue();
        Integer expected=30;
        Assert.assertEquals(expected,X);
    }
    @Test
    public void whenGivenFloatGeneric_ShouldReturnMax() {
        FindMaximum max = new FindMaximum(20.3f,30.3f,10.3f);
        Object X= max.checkMaximumValue();
        Float expected=30.3f;
        Assert.assertEquals(expected,X);
    }
}
