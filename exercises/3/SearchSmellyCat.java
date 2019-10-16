import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.Select;

public class SearchSmellyCat {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    Map<String, Object> prefs = new HashMap<String, Object>();
    prefs.put("profile.default_content_setting_values.notifications", 2);
    ChromeOptions options = new ChromeOptions();
    options.setExperimentalOption("prefs", prefs);

    driver = new ChromeDriver(options);
    baseUrl = "https://www.katalon.com/";
    driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
  }

  @Test
  public void testSearchSmellyCat() throws Exception {
    driver.get("https://www.reddit.com/r/cats/");
    driver.findElement(By.id("header-search-bar")).click();
    driver.findElement(By.id("header-search-bar")).clear();
    driver.findElement(By.id("header-search-bar")).sendKeys("smelly cat");
    driver.findElement(By.id("header-search-bar")).sendKeys(Keys.ENTER);
    driver.findElement(By.xpath("//a/div/h3/span")).click();
    assertTrue(Pattern.compile(".*[Ss][Mm][Ee][Ll][Ll][Yy] [Cc][Aa][Tt].*").matcher(driver.findElement(By.xpath("//div[3]/div/div/h1")).getText()).find());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
