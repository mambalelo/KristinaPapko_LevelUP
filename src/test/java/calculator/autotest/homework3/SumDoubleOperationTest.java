package calculator.autotest.homework3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumDoubleOperationTest extends AbstractBaseTest {
    public SumDoubleOperationTest() {
    }

    @DataProvider(
            name = "Positive Sum Test Data"
    )
    public Object[][] sumPositiveTestDataProvider() {
        return new Object[][]{{110.5D, 30.5D, 141}, {20.0D, -11.0D, 9.0D}, {110.0D, 0, 110.0D}};
    }

    @DataProvider(
            name = "Negative Sum Test Data"
    )
    public Object[][] sumNegativeTestDataProvider() {
        return new Object[][]{{110.0D, 30.0D, 141}, {20.0D, 110.0D, -140.0D}, {110.0D, 110.0D, 1.0D}};
    }

    @Test(
            dataProvider = "Positive Sum Test Data"
    )
    public void positiveDataProviderSubTest(double a, double b, double expected) {
        double actual = this.calculator.sum(a, b);
        Assert.assertEquals(actual, expected);
    }

    @Test(
            dataProvider = "Negative Sum Test Data"
    )
    public void negativeDataProviderSubTest(double a, double b, double expected) {
        double actual = this.calculator.sum(a, b);
        Assert.assertNotEquals(actual, expected);
    }
}

