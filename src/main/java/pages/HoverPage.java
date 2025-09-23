package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;
    private By figurebox = By.className("figure");
    private By boxCaption = By.className("figcaption");

    public HoverPage(WebDriver driver){
        this.driver = driver;
    }

    public FigureCaptions hoverOverFigure(int index) {
        WebElement figure = driver.findElements(figurebox).get(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaptions(figure.findElement(boxCaption));
    }

    //Inner class for getting the name and view profile link
    public class FigureCaptions{
        private WebElement caption;
        private By header = By.cssSelector(".figcaption h5");
        private By link = By.cssSelector(".figcaption a");

        //constructor
        public FigureCaptions(WebElement caption) {
            this.caption = caption;
        }
        //methods to interact with elements
        public boolean isCaptionDisplayed(){
            return caption.isDisplayed();
        }

        public String getTitle(){
            return caption.findElement(header).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }
    }
}
