package hm4.ex2;

import hm4.AbstractBaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UserAddTest extends AbstractBaseTest {


    @Test
    public void userAddTest() {
        //Open website page
        driver.get("http://users.bugred.ru/");

        //Registration step
        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();
        driver.findElement(By.name("login")).sendKeys("KrisTester3@mail.ru");
        driver.findElement(By.xpath("//form[contains(@action, 'login')]//input[@name='password']")).sendKeys("test123");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();


        //Check about adding user list
        driver.findElement(By.xpath("//a//span[text()='Пользователи']")).click();
        driver.findElement(By.xpath("//a[text()='Добавить пользователя']")).click();
        driver.findElement(By.xpath("//input[@name='noibiz_name']")).sendKeys("Kristina");
        driver.findElement(By.xpath("//input[@name='noibiz_email']")).sendKeys("Kristina@mail.ru");
        driver.findElement(By.xpath("//input[@name='noibiz_password']")).sendKeys("Kristina123");
        driver.findElement(By.xpath("//input[@name='noibiz_birthday']")).sendKeys("11.11.1990");
        driver.findElement(By.xpath("//input[contains(@name,'act_create')]")).click();


        //Logout step
        driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
        driver.findElement(By.linkText("Выход")).click();

    }


}
