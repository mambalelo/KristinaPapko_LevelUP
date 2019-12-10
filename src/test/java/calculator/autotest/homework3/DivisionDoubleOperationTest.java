package calculator.autotest.homework3;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DivisionDoubleOperationTest  extends AbstractBaseTest {
    public DivisionDoubleOperationTest() {
        }

        @DataProvider(
                name = "Positive Division Test Data"
        )
        public Object[][] divPositiveTestDataProvider() {
            return new Object[][]{
                    {90.0D, 3.0D, 30.0D},
                    {20.0D, -5.0D, -4.0D},
                    {110.0D, 1.0D, 110.0D}
            };
        }

        @DataProvider(
                name = "Negative Division Test Data"
        )
        public Object[][] divNegativeTestDataProvider() {
            return new Object[][]{
                    {110.0D, 3.0D, 331.0D},
                    {2.0D, -11.0D, 220.0D},
                    {110.0D, 1.0D, 22.0D}
            };
        }

        @Test(
                dataProvider = "Positive Division Test Data"
        )
        public void positiveDataProviderMultiTest(double a, double b, double expected) {
            double actual = this.calculator.div(a, b);
            Assert.assertEquals(actual, expected);
        }

        @Test(
                dataProvider = "Negative Division Test Data"
        )
        public void negativeDataProviderMultiTest(double a, double b, double expected) {
            double actual = this.calculator.div(a, b);
            Assert.assertNotEquals(actual, expected);
        }
}
