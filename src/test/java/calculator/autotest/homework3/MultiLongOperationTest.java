package calculator.autotest.homework3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class MultiLongOperationTest extends AbstractBaseTest {
        public MultiLongOperationTest() {
        }

        @DataProvider(
                name = "Positive Multi Test Data"
        )
        public Object[][] multiPositiveTestDataProvider() {
            return new Object[][]{{110, 3, 330}, {20, -11, -220}, {110, 0, 0}};
        }

        @DataProvider(
                name = "Negative Multi Test Data"
        )
        public Object[][] multiNegativeTestDataProvider() {
            return new Object[][]{{110, 3, 331}, {20, -11, 220}, {110, 0, 22}};
        }

        @Test(
                dataProvider = "Positive Multi Test Data"
        )
        public void positiveDataProviderMultiTest(long a, long b, long expected) {
            double actual = (double)this.calculator.mult(a, b);
            Assert.assertEquals(actual, (double)expected);
        }

        @Test(
                dataProvider = "Negative Multi Test Data"
        )
        public void negativeDataProviderMultiTest(long a, long b, long expected) {
            double actual = (double)this.calculator.mult(a, b);
            Assert.assertNotEquals(actual, expected);
        }
}

