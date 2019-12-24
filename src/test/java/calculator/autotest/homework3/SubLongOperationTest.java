package calculator.autotest.homework3;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SubLongOperationTest extends AbstractBaseTest {
    public SubLongOperationTest() {
    }

    @DataProvider(
            name = "Positive Sub Test Data"
    )
    public Object[][] subPositiveTestDataProvider() {
        return new Object[][]{{110, 30, 80}, {20, 110, -90}, {110, 110, 0}};
    }

    @DataProvider(
            name = "Negative Sub Test Data"
    )
    public Object[][] subNegativeTestDataProvider() {
        return new Object[][]{{110, 30, 81}, {20, 110, -90}, {110, 110, 1}};
    }

    @Test(
            dataProvider = "Positive Sub Test Data"
    )
    public void positiveDataProviderSubTest(long a, long b, long expected) {
        double actual = (double)this.calculator.sub(a, b);
        Assert.assertEquals(actual, (double)expected);
    }

    @Test(
            dataProvider = "Negative Sub Test Data"
    )
    public void negativeDataProviderSubTest(long a, long b, long expected) {
        double actual = (double)this.calculator.sub(a, b);
        Assert.assertNotEquals(actual, expected);
    }

    @AfterMethod
    public void tearDown() {
        this.calculator = null;
        System.out.println("After Method");
    }
}
