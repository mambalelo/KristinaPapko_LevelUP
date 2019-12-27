package hm4.ex3;

import hm4.AbstractBaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchUserTest extends AbstractBaseTest {

    @Test
    public void searchUserTest(){
        //Open website page
        driver.get("http://users.bugred.ru/");

        //Authorization step
        driver.findElement(By.xpath("//a//span[text()='Войти']")).click();
        driver.findElement(By.name("login")).sendKeys("KrisTester3@mail.ru");
        driver.findElement(By.xpath("//form[contains(@action, 'login')]//input[@name='password']")).sendKeys("test123");
        driver.findElement(By.xpath("//input[@value='Авторизоваться']")).click();

        //Enter the search parameters
        driver.findElement(By.xpath("//a//span[text()='Пользователи']")).click();
        driver.findElement(By.xpath("//input[@name='date_start']")).sendKeys("27122019");
        driver.findElement(By.xpath("//input[@placeholder='Введите email или имя']")).sendKeys("kristina");
        driver.findElement(By.xpath("//button[@class='btn btn-submit']")).click();




        //Logout step
        driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
        driver.findElement(By.linkText("Выход")).click();
    }

}
