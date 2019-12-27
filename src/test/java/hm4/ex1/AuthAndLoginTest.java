package hm4.ex1;

import hm4.AbstractBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsStringIgnoringCase;


public class AuthAndLoginTest extends AbstractBaseTest {
        @Test
        public void registrationTest() {
            //Open website page
            driver.get("http://users.bugred.ru/");

            //Registration step
            driver.findElement(By.xpath("//a//span[text()='Войти']")).click();
            driver.findElement(By.name("name")).sendKeys("KrisTester3");
            driver.findElement(By.name("email")).sendKeys("KrisTester3@mail.ru");
            driver.findElement(By.xpath("//div[@id='uLogin']//..//input[@name='password']")).sendKeys("test123");
            driver.findElement(By.name("act_register_now")).click();

            //Check about button is't displayed
            WebElement userButton = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
            assertThat("нопка пользователя не отображается", userButton.isDisplayed());
            assertThat(userButton.getText(), containsStringIgnoringCase("KrisTester3"));

        }

        @Test
        public void authAndLogoutTest() {
            //Open website page
            driver.get("http://users.bugred.ru/");

            //Authorization step
            driver.findElement(By.xpath("//a//span[text()='Войти']")).click();
            driver.findElement(By.name("login")).sendKeys("KrisTester3@mail.ru");
            driver.findElement(By.xpath("//form[contains(@action, 'login')]//input[@name='password']")).sendKeys("test123");
            driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();

            //Check about button is't displayed
            WebElement userButton = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
            assertThat("Кнопка пользователя не отображается", userButton.isDisplayed());
            assertThat(userButton.getText(), containsStringIgnoringCase("KrisTester3"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", userButton);

            //Logout step
            WebElement logoutButton = driver.findElement(By.linkText("Выход"));
            logoutButton.click();

        }

}

