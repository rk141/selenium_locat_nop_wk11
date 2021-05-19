package nopcommerce_wk11;
/*Navigate to google https://www.google.com/
In Google search type "nopCommerce demo store" and click search
Click on the link "nopCommerce demo store"
Click on Computers and Verify that the user successfully navigated to Computers page.
Navigate to google https://www.google.com/
In Google search type "nopCommerce demo store" and click search
Click on the link "nopCommerce demo store"
Click on Electronics and Verify that the user successfully navigated to Electronics page.
Above same test do for Apparel, Digital downloads, Books, Jewelry, Gift Cards.
*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Search {

    WebDriver driver;
    @Before
    public void setUp() {

        String baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("nopcommerce demo store");
        driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']//h3[text()='nopCommerce demo store']")).click();
    }
    @Test
    public void verifyUserClickOnComputerTabAndNavigateToComputerPageSuccessfully() {

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
    }
    @Test
    public void verifyUserClickOnElectronicsTabAndNavigateToElectronicsPageSuccessfully() {

        driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"))).click();
    }
    @Test
    public void verifyUserClickOnApparelTabAndNavigateToApparelPageSuccessfully(){

        driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"))).click();
    }
    @Test
    public void verifyUserClickOnDigitalDownloadsTabAndNavigateToDigitalDownloadsPageSuccessfully() {

        driver.findElement((By.xpath("//a[text()='Digital downloads '][1]"))).click();
    }
    @Test
    public void verifyUserClickOnBooksTabAndNavigateToBooksPageSuccessfully() {

        driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"))).click();
    }
    @Test
    public void verifyUserClickOnJewelryTabAndNavigateToJewelryPageSuccessfully() {

        driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"))).click();
    }
    @Test
    public void verifyUserClickOnGiftCardsTabAndNavigateToGiftCardsPageSuccessfully() {

        driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"))).click();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}
