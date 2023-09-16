package US2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class senaryo extends BaseDriver {

    @Test
    public void test2(){
        driver.get("https://www.akakce.com/");

        WebElement openAccountBtn = driver.findElement(By.cssSelector("div[id='H_rl_v8'] a:first-child"));
        openAccountBtn.click();
        MyFunc.bekle(1);

        WebElement name = driver.findElement(By.cssSelector("form input[name='rnufn']"));
        name.sendKeys("Alper");

        WebElement lastname = driver.findElement(By.cssSelector("span>[name='rnufs']"));
        lastname.sendKeys("");

        WebElement email = driver.findElement(By.cssSelector("form[id='FrmRnuS']>span:nth-of-type(3)>input"));
        email.sendKeys("alper@gmail.com");

        WebElement email2 = driver.findElement(By.xpath("//input[@name='rnufe2']"));
        email2.sendKeys("alper@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("label[for='rnufp1']+span>input"));
        password.sendKeys("Alper2344");

        WebElement password2 = driver.findElement(By.cssSelector("label[for='rnufp2']+span>input"));
        password2.sendKeys("Alper2344");

        WebElement gender = driver.findElement(By.cssSelector("span[class='radio_v8']>:nth-child(1)"));
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
        MyFunc.bekle(2);

        WebElement warningMessage = driver.findElement(By.cssSelector("div[class=\"alertX t2\"]>p"));
        Assert.assertEquals("Lütfen soyadınızı yazın", warningMessage.getText());

        BekleVeKapat();
    }
}