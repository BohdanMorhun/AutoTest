package steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySteps {

    static WebDriver webDriver;

    @Given("^I am on the https://rozetka.com.ua/ main page$")
    public void i_am_on_the_https_rozetka_com_ua_main_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bohdan\\Downloads\\chromedriver.exe");
        webDriver = new ChromeDriver();
      webDriver.manage().window().maximize();
        webDriver.get("https://rozetka.com.ua");
    }

    @Given("^Have been already registered$")
    public void have_been_already_registered() {
        System.out.println("registered");
    }

    @Given("^The account is successfully validated$")
    public void the_account_is_successfully_validated() {
        System.out.println("validated");
    }

    @When("^I click a “Sign in Personal Cabinet”$")
    public void i_click_a_Personal_Cabinet_button() {
        webDriver.findElement(By.xpath("//a[@class ='header-topline__user-link link-dashed']")).click();
        System.out.println("click a “Personal Cabinet” button");
    }


    @When("^Input the registered valid login email and password$")
    public void input_the_registered_login_email_and_password_correctly() throws InterruptedException {
        webDriver.findElement(By.cssSelector("#auth_email")).sendKeys("xitotip945@dfb55.com");
        webDriver.findElement(By.cssSelector("#auth_pass")).sendKeys("21031989Mbv");
        Thread.sleep(1000);
        System.out.println("valid login email and password");
    }

    @When("^Hit a “Log in” button$")
    public void hit_a_Log_in_button() {
        webDriver.findElement(By.xpath("//button[@class='button button_size_large button_color_green auth-modal__submit']")).click();
        System.out.println("Log in button");
    }

    @When("^I am successfully logged in$")
    public void i_am_successfully_logged_in() {
        System.out.println("successfully logged in");
    }

    @When("^I see Rozetka’s main screen$")
    public void i_see_Rozetka_s_main_screen() {
        System.out.println("Rozetka’s main screen");
    }

    @Given("^I am logged in on the https://rozetka\\.com\\.ua/ page$")
    public void i_am_logged_in_on_the_https_rozetka_com_ua_page() {
        System.out.println("I am logged");
    }

    @When("^I type a query in the search element$")
    public void user_searches_for_an() throws InterruptedException {
        WebElement webElement = webDriver.findElement(By.xpath("//input[@name='search']"));
        webElement.sendKeys("iphone");
        Thread.sleep(1000);
        System.out.println("search an element");
    }

    @When("^I hit a “Find” button$")
    public void hit_a_Find_button() {
        webDriver.findElement(By.xpath("//button[@class='button button_color_green button_size_medium search-form__submit']")).click();
        System.out.println("hit Find button");
    }

    @Then("^I see the results$")
    public void i_see_the_results() {
        System.out.println("see the results");
    }

    @Given("^I am on the https://rozetka\\.com\\.ua/ page$")
    public void i_am_on_the_https_rozetka_com_ua_page() throws Throwable {
        System.out.println("still on rozetka page");
    }

    @When("^I have found the needed product$")
    public void i_have_found_the_needed_product() {

        webDriver.findElement(By.xpath("/html/body/app-root/div/div[1]/rz-category/div/main/ctg-catalog/div/div[2]/section/div/ctg-grid/ul/li[1]/app-goods-tile-default/div/div[2]/a[2]")).click();
        System.out.println("click on selected iphone");
    }

    @When("^I click “Buy” button$")
    public void i_click_a_Shopping_cart_button() {
        webDriver.findElement(By.xpath("/html/body/app-root/div/div[1]/app-rz-product/div/product-tab-main/div[1]/div[1]/div[2]/product-main-info/div/div/app-product-buy-btn/app-buy-button/button")).click();
        System.out.println("clicked on shopping cart button");
    }

    @Then("^I successfully added the product to the shopping cart$")
    public void i_successfully_added_the_product_to_the_shopping_cart() {
        System.out.println("added the product");
    }

    @Then("^I see a shopping cart modal window with the added item$")
    public void i_see_a_shopping_cart_modal_window_with_the_added_item() {
        System.out.println("shopping cart modal window");
    }

    @After
    public void tearDown() {
        webDriver.quit();
    }
}
