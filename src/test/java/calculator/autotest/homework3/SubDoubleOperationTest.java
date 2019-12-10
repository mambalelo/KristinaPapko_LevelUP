package calculator.autotest.homework3;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SubDoubleOperationTest extends AbstractBaseTest {
    public SubDoubleOperationTest() {
    }

    @DataProvider(
            name = "Positive Sub Test Data"
    )
    public Object[][] subPositiveTestDataProvider() {
        return new Object[][]{{110.0D, 30.0D, 80.0D}, {20.5D, 110, -89.5D}, {110.0D, 110, 0}};
    }

    @DataProvider(
            name = "Negative Sub Test Data"
    )
    public Object[][] subNegativeTestDataProvider() {
        return new Object[][]{{110.0D, 30.0D, 81.0D}, {20.5D, 110, -90.5D}, {110.0D, 110, 1}};
    }

    @Test(
            dataProvider = "Positive Sub Test Data"
    )
    public void positiveDataProviderSubTest(double a, double b, double expected) {
        double actual = this.calculator.sub(a, b);
        Assert.assertEquals(actual, expected);
    }

    @Test(
            dataProvider = "Negative Sub Test Data"
    )
    public void negativeDataProviderSubTest(double a, double b, double expected) {
        double actual = this.calculator.sub(a, b);
        Assert.assertNotEquals(actual, expected);
    }
}
