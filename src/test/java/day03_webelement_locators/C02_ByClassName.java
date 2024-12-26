package day03_webelement_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ByClassName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // testotomasyonu anasayfaya gidin
        driver.get("https://www.testotomasyonu.com");

        // arama kutusuna phone yazip aratin
        WebElement aramaKutusu = driver.findElement(By.className("search-input"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);
        //submit işleminin bir alternatifi de arama kutusuna Keys.ENTER yollamaktır


        // arama sonucunda bulunan urun sayisini yazdirin
        WebElement aramaSonucu = driver.findElement(By.className("product-count-text"));
        System.out.println(aramaSonucu);
        //[[ChromeDriver: chrome on windows (bd623d621cd48334dd1ac43817fa1215)] -> class name: product-count-text]
        // WebElement direkt yazdirilamaz,
        // WebElement'i yazi olarak yazdirabilmemiz icin getText() kullanmaliyiz

        System.out.println(aramaSonucYaziElementi.getText()); // 4 Products Found

        // arama sonucunda urun bulunabildigini test edin

        String aramaSonucYazisi = aramaSonucYaziElementi.getText(); // "4 Products Found"

        aramaSonucYazisi = aramaSonucYazisi.replaceAll("\\D",""); // "4"

        int aramaSonucSayisi = Integer.parseInt(aramaSonucYazisi);  // 4

        if (aramaSonucSayisi > 0 ){
            System.out.println("Arama testi PASSED");
        } else System.out.println("Arama testi FAILED");



        // sayfayi kapatin
        driver.quit();

























    }
}
