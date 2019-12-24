package calculator.autotest.homework3;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DivisionLongOperationTest extends AbstractBaseTest {
    public DivisionLongOperationTest() {
    }

    @DataProvider(
            name = "Positive Division Test Data"
    )
    public Object[][] divPositiveTestDataProvider() {
        return new Object[][]{{110, 3, 36}, {20, -5, -4}, {110, 1, 110}};
    }

    @DataProvider(
            name = "Negative Division Test Data"
    )
    public Object[][] divNegativeTestDataProvider() {
        return new Object[][]{{110, 3, 331}, {20, -11, 220}, {110, 1, 22}};
    }

    @Test(
            dataProvider = "Positive Division Test Data"
    )
    public void positiveDataProviderMultiTest(long a, long b, long expected) {
        double actual = (double)this.calculator.div(a, b);
        Assert.assertEquals(actual, (double)expected);
    }

    @Test(
            dataProvider = "Negative Division Test Data"
    )
    public void negativeDataProviderMultiTest(long a, long b, long expected) {
        double actual = (double)this.calculator.div(a, b);
        Assert.assertNotEquals(actual, expected);
    }
}

