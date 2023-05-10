import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MainSelenium {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","src/test/chromedriver,exe" );
//        ChromeDriver driver =new ChromeDriver();

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get(" https://demoqa.com/elements");
//        WebElement element1 = driver.findElement(By.xpath("//div[@class = 'home-banner']/a"));
//        WebElement element2 =driver.findElement(By.cssSelector("div.home-banner a"));
//        element1.click();
//        element2.click();

        String fullname = "Pintilie Ionut";
        String fistname = "Ionut";
        String lastname = "Pintilie";
        String Email = "ionut.pintilie78@gmail.com";
        Integer Age = 0;
        String address = "fadadfgdgg";
        String permanentadress = "foemfeofmaofaof";
        Integer Sallary = 2500;
        String Department = "DRL";


        WebElement elements = driver.findElement(By.xpath("//div[@class='header-text'][normalize-space()='Elements']"));
        WebElement textBox = driver.findElement(By.cssSelector("span[class = 'text']"));
        WebElement checkBox = driver.findElement(By.xpath("//span[text()='Check Box']"));
        WebElement radioBtn = driver.findElement(By.xpath("//span[text() ='Radio Button']"));
        WebElement webTables = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        WebElement buttonsbtn = driver.findElement(By.xpath("//span[text()='Buttons']"));
        WebElement linksbtn = driver.findElement(By.xpath("//span[normalize-space()='Links']"));


        textBox.click();
        WebElement fullName = driver.findElement(By.xpath("//input[@placeholder= 'Full Name']"));
        fullName.click();
        fullName.sendKeys(fullname);
        fullName.clear();

        WebElement email = driver.findElement(By.cssSelector("input[type = 'email']"));
        email.click();
        email.sendKeys(Email);
        email.clear();

        WebElement curentAddress = driver.findElement(By.xpath("//textarea[@id = 'currentAddress']"));
        curentAddress.click();
        curentAddress.sendKeys(address);
        curentAddress.clear();

        WebElement permanentAddress = driver.findElement(By.cssSelector("#permanentAddress"));
        permanentAddress.click();
        permanentAddress.sendKeys(permanentadress);
        permanentAddress.clear();

//        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
//        submit.click();


        checkBox.click();

        WebElement rightArrow = driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']"));
        rightArrow.click();

        WebElement rctNode = driver.findElement(By.xpath("//li[@class = 'rct-node rct-node-parent rct-node-expanded']"));

        WebElement uncheck = driver.findElement(By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg']"));
        uncheck.click();
        
        

        radioBtn.click();
        WebElement yes = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yes.click();
        yes.getText();
        System.out.println("You have selected Yes");

        WebElement impresive = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impresive.click();
        impresive.getText();
        System.out.println("You have selected Impressive");

//        WebElement nobtn = driver.findElement(By.cssSelector("//div[@class='custom-control disabled custom-radio custom-control-inline']"));
//    nobtn.click();


        webTables.click();
        WebElement addBtn = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        addBtn.click();


        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.click();
        firstName.sendKeys(fistname);

        WebElement lastName = driver.findElement(By.cssSelector("#lastName"));
        lastName.click();
        lastName.sendKeys(lastname);

        WebElement email1 = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email1.click();
        email1.sendKeys(Email);

       WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
        age.click();
        age.sendKeys("25");

        WebElement salary = driver.findElement(By.cssSelector("#salary"));
        salary.click();
        salary.sendKeys("2500");

        WebElement department = driver.findElement(By.cssSelector("#department"));
        department.click();
        department.sendKeys(Department);

        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();

        WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchBox']"));
        searchBox.click();
        searchBox.sendKeys(fistname);

        buttonsbtn.click();
        WebElement doubleClickMe = driver.findElement(By.id("doubleClickBtn"));
        doubleClickMe.click();
        doubleClickMe.click();
        doubleClickMe.getText();
        System.out.println("You have done a double click");

//        WebElement rightClickMe = driver.findElement(By.id("rightClickBtn"));

        WebElement clickMe =driver.findElement(By.xpath("//button[ text()='Click Me']"));
        clickMe.click();
        clickMe.getText();
        System.out.println("You have done a dynamic click");

        linksbtn.click();
        WebElement home = driver.findElement(By.xpath("//a[@id='simpleLink']"));
        home.click();

        WebElement dynamicLink = driver.findElement(By.xpath("//a[@id='dynamicLink']"));
        dynamicLink.click();

        WebElement created =driver.findElement(By.cssSelector("#created"));
        created.click();






//        driver.close();
//        WebElement header = driver.findElement(By.tagName("header"));
//        header.click();

//        driver.get("https://demoqa.com/webtables");
//        WebElement button = driver.findElement(By.id("addNewRecordButton"));
//        button.click();


        driver.quit();

        System.out.println("Finish");

    }
}
