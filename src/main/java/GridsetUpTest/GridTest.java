package GridsetUpTest;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class GridTest {
    public static void main(String[] args) throws MalformedURLException {
        //Desired capabilities olusturcaz.
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.ANY); //platform ANY olarak'ta secilebilir.
        //2.adim Chrome Options to merge--buda bir class'tir. Buradan olusturulan obje ile browser ile isletim sistemi birletiriliyor
        ChromeOptions options = new ChromeOptions(); //simdi birletiriyoruz merge ile
        options.merge(cap);
        //hub;in url'ini vermem lazim
        String hubUrl = "http://192.168.1.105:4444/wd/hub";
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
    }
}