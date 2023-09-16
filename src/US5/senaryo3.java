package US5;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class senaryo3 extends BaseDriver {

    @Test
    public void test5(){
        driver.get("https://www.akakce.com/");

        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"H_rl_v8\"]/a [2]"));
        loginBtn.click();
        MyFunc.bekle(2);

        WebElement emailLogin = driver.findElement(By.xpath("//*[@id='life']"));
        emailLogin.sendKeys("alper@gmail.com");
        MyFunc.bekle(2);

        WebElement passwordLogin = driver.findElement(By.xpath("//*[@id='lifp']"));
        passwordLogin.sendKeys("Alper2344");
        MyFunc.bekle(2);

        WebElement submit = driver.findElement(By.xpath("//*[@id='lfb' and @value='Giriş yap']"));
        submit.click();

        WebElement accountName = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        Assert.assertEquals("Alper", accountName.getText());

        BekleVeKapat();
    }
}
