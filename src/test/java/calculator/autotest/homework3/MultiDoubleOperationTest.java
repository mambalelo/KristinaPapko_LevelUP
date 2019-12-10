package calculator.autotest.homework3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultiDoubleOperationTest extends AbstractBaseTest{
    public MultiDoubleOperationTest() {
    }

    @DataProvider(
            name = "Positive Multi Test Data"
    )
    public Object[][] multiPositiveTestDataProvider() {
        return new Object[][]{
                {110.0, 3.0, 330.0},
                {20.0, -11.0, -220.0},
                {110.0, 0., 0.0}};
    }

    @DataProvider(
            name = "Negative Multi Test Data"
    )
    public Object[][] multiNegativeTestDataProvider() {
        return new Object[][]{
                {110.0, 3.5, 331.0},
                {20.0, -11.0, 220.0},
                {110.0, 0.0, 22.0}};
    }

    @Test(
            dataProvider = "Positive Multi Test Data"
    )
    public void positiveDataProviderMultiTest(double a, double b, double expected) {
        double actual = this.calculator.mult(a, b);
        Assert.assertEquals(actual, (double) expected);
    }

    @Test(
            dataProvider = "Negative Multi Test Data"
    )
    public void negativeDataProviderMultiTest(double a, double b, double expected) {
        double actual = this.calculator.mult(a, b);
        Assert.assertNotEquals(actual, expected);
    }

}
