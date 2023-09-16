package US3;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class senaryo1 extends BaseDriver {

    @Test
    public void test3(){
        driver.get("https://www.akakce.com/");


        WebElement openAccountBtn = driver.findElement(By.cssSelector("div[id='H_rl_v8'] a:first-child"));
        openAccountBtn.click();
        MyFunc.bekle(1);

        WebElement name = driver.findElement(By.cssSelector("form input[name='rnufn']"));
        name.sendKeys("Alper");

        WebElement lastname = driver.findElement(By.cssSelector("span>[name='rnufs']"));
        lastname.sendKeys("Aygun");

        WebElement email = driver.findElement(By.cssSelector("form[id='FrmRnuS']>span:nth-of-type(3)>input"));
        email.sendKeys("alper@gmail.com\n");

        WebElement email2 = driver.findElement(By.xpath("//input[@name='rnufe2']"));
        email2.sendKeys("alper1@gmail.com\n");

        WebElement password = driver.findElement(By.cssSelector("label[for='rnufp1']+span>input"));
        password.sendKeys("Alper2344");

        WebElement password2 = driver.findElement(By.cssSelector("[id='rnufp2']"));
        password2.sendKeys("Alper2344");

        WebElement gender = driver.findElement(By.cssSelector("[id='rngm']"));
        gender.click();

        WebElement state = driver.findElement(By.cssSelector("label[for='locpr']+select"));
        state.click();

        WebElement stateSelect = driver.findElement(By.cssSelector("select[name='locpr']>:nth-child(16)"));
        stateSelect.click();

        WebElement county = driver.findElement(By.cssSelector("label[for='locds']+select"));
        county.click();

        WebElement countySelect = driver.findElement(By.cssSelector("select[name='locds']>:nth-child(14)"));
        countySelect.click();

        WebElement day = driver.findElement(By.cssSelector("span[class='frm_v8 inl_v8']>select[name='bd']"));
        day.click();

        WebElement daySelect = driver.findElement(By.cssSelector("select[name='bd']>:nth-child(15)"));
        daySelect.click();

        WebElement month = driver.findElement(By.cssSelector("span[class='frm_v8 inl_v8']+span>select[name='bm']"));
        month.click();

        WebElement monthSelect = driver.findElement(By.cssSelector("select[name='bm']>:nth-child(3)"));
        monthSelect.click();

        WebElement year = driver.findElement(By.cssSelector("span[class='frm_v8 inl_v8']+span+span>select[name='by']"));
        year.click();

        WebElement yearSelect = driver.findElement(By.cssSelector("select[name='by']>:nth-child(13)"));
        yearSelect.click();

        WebElement agreement = driver.findElement(By.cssSelector("[name='rnufpca']"));
        agreement.click();

        WebElement openAccountSubmit = driver.findElement(By.cssSelector("[type='submit'][value='Hesap aç']"));
        openAccountSubmit.click();
        MyFunc.bekle(1);

        WebElement accountName = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        Assert.assertEquals("Alper", accountName.getText());

        BekleVeKapat();
    }
}
