package day02_WebDriverOlusturmaVeKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {

         /*
            Thread.sleep() kodlarin calismasini
            verdigimiz sure boyunca durdurur

            Biz ilk defa testi hazirlarken,
            veya testi bir sunumda gostermemiz gerekirse
            test adimlarini gozlemleyebilmek icin
            Thread.sleep() kullanilabilir


            ANNNCCCAAAAKKK  calismamiz bittiginde
            bu beklemeleri silmek daha dogru olacaktir

            toplu calistirmalarda bu beklemelerin
            ciddi zaman kayiplarina yol acacagi unutulmamalidir
         */

        WebDriver driver = new ChromeDriver();

        //1. Youtube ana sayfasina gidin . https://www.youtube.com/
        driver.get(
                "https://www.youtube.com/");
        // driver.get() ile ayni islemi yapar
       // Thread.sleep(2000);

        // 2. url’in “youtube” icerdigini test edin.
        String expectedWord = "youtube";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedWord)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAİLED");
       // Thread.sleep(1000);

        //3. Testotomasyonu sayfasina gidin. https://www.testotomasyonu.com/
        driver.navigate().to( "https://www.testotomasyonu.com/");
       // Thread.sleep(1000);

        //4. Title’in “Test Otomasyonu” icerdigini test edin.
        String expectedTitle = "Test Otomasyonu";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("PASSED");
        }else System.out.println("FAİLED");
       // Thread.sleep(1000);

        //5. Tekrar YouTube’sayfasina donun.
        driver.navigate().back();

        //6. Title’in “YouTube” oldugunu test edin

        String expectedTitle1 = "YouTube";
        String actualTitle1 = driver.getTitle();

        if (actualTitle1.equals(expectedTitle1)){
            System.out.println("PASSED");
        }else System.out.println("FAİLED");

        //7. Sayfayi Refresh(yenile) yapin.
        driver.navigate().refresh();



       // Thread.sleep(3000);
        driver.quit();


    }
}
