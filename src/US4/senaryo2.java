package US4;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class senaryo2 extends BaseDriver {


    @Test
    public void test4(){
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

        WebElement profile = driver.findElement(By.cssSelector("[title='Hesabım']"));
        profile.click();
        MyFunc.bekle(2);


        WebElement logoutBtn = driver.findElement(By.cssSelector("[href='#Çık']"));
        logoutBtn.click();

        WebElement openAccountBtn = driver.findElement(By.cssSelector("div[id='H_rl_v8'] a:first-child"));
        Assert.assertEquals("Hesap Aç", openAccountBtn.getText());

        BekleVeKapat();


    }



}
