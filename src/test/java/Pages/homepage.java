package Pages;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;



public class homepage {
    public static Playwright playwright = Playwright.create();
    protected static BrowserType chrome = playwright.chromium();
    protected static Browser browser = chrome.launch(new BrowserType.LaunchOptions().setHeadless(false));
    protected static Page page = browser.newPage();

    public static void launchApp() {

        page.navigate("https://playwright.dev/");
        page.waitForTimeout(2000);
    }
    public static void clickondropdown(){

       page.click("//a[@role='button']");
    }
    public static void selectGivenoption(){
        page.click("//a[@class='dropdown__link'][normalize-space()='Python']");
    }
    public static void getStarted(){
        page.click("//a[@class='getStarted_Sjon']");
       page.waitForTimeout(2000);
    }
    public static void searchbutton(){
        page.click(" //span[@class='DocSearch-Button-Placeholder']");
        page.waitForTimeout(1000);
    }
    public static void entersTopic(String string){
        page.fill("//input[@id='docsearch-input']",string);
        page.waitForTimeout(1000);
    }
    public static void quitBrowser(){
        page.close();
    }
}
