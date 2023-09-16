package US8;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class senaryo extends BaseDriver {

    @Test
    public void test8(){
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
        MyFunc.bekle(2);

        WebElement accountName = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        accountName.click();

        WebElement deleteAccountBtn = driver.findElement(By.cssSelector("[href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        deleteAccountBtn.click();

        WebElement passwordInput = driver.findElement(By.cssSelector("[type='password']"));
        passwordInput.sendKeys("Alper2344");
        MyFunc.bekle(2);

        WebElement deleteAccountBtn2 = driver.findElement(By.cssSelector("[type='submit']"));
        deleteAccountBtn2.click();

        WebElement successMessage = driver.findElement(By.cssSelector("ul[class=\"cul\"] i"));
        Assert.assertTrue(successMessage.getText().contains("Hesabın silindi."));

        BekleVeKapat();
    }
}
