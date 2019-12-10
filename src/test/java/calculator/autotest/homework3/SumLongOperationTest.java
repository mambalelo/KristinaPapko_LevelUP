package calculator.autotest.homework3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumLongOperationTest extends AbstractBaseTest {
    public SumLongOperationTest() {
    }

    @DataProvider(
            name = "Positive Sum Test Data"
    )
    public Object[][] sumPositiveTestDataProvider() {
        return new Object[][]{{110, 30, 140}, {20, -11, 9}, {110, 0, 110}};
    }

    @DataProvider(
            name = "Negative Sum Test Data"
    )
    public Object[][] sumNegativeTestDataProvider() {
        return new Object[][]{{110, 30, 141}, {20, 110, -140}, {110, 110, 1}};
    }

    @Test(
            dataProvider = "Positive Sum Test Data"
    )
    public void positiveDataProviderSubTest(long a, long b, long expected) {
        double actual = (double)this.calculator.sum(a, b);
        Assert.assertEquals(actual, (double)expected);
    }

    @Test(
            dataProvider = "Negative Sum Test Data"
    )
    public void negativeDataProviderSubTest(long a, long b, long expected) {
        double actual = (double)this.calculator.sum(a, b);
        Assert.assertNotEquals(actual, expected);
    }
}
