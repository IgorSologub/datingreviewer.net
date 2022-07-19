package pages.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Urls.QUIZ_PAGE_URL;

public class ReviewPage extends BasePage {

    public ReviewPage (WebDriver driver) {super(driver);}

    private final By visitSiteRegButton = By.xpath("//a[contains(@class,'DSYGt u_Ozx7hahKAc uvssGl')]");
    private final By startButton = By.xpath("//a[@class='DSYGt ft-2cM']");
    private final By nameInput = By.xpath("//input[@id='author']");
    private final By emailInput= By.xpath("//input[@id='email']");
    private final By commentIInput = By.xpath("//textarea[@id='comment']");
    private final By submitButton = By.xpath("//button[@class='DSYGt']");
    private final By submitMessage = By.xpath("//div[@id='form-message']");
    private final By nextSliderButton = By.xpath("//button[@class='js-sites-next-sm slick-arrow slick-next']");
    private final By sliderBlock = By.xpath("(//div[@class='D8SbYJ'])[4]");
    private final By scrollToSlider = By.xpath("(//h2[@class='P3-0FiRjZqLB'])[7]");
    private final By scrollToSubmitButton = By.xpath("(//h2[@class='P3-0FiRjZqLB'])[8]");

    public ReviewPage visitSiteRegButtonClick () {
        driver.findElement(visitSiteRegButton).click();
        return this;
    }

    public ReviewPage pictureRegButtonClick (int numButton) {
        By pictureRegButton = By.xpath("(//a[contains(@class,'pRIyPWWKS8hW')])[" + numButton + "]");
        driver.findElement(pictureRegButton).click();
        return this;
    }

    public ReviewPage startButtonClick () {
        driver.findElement(startButton).click();
        return this;
    }

    public Boolean startButtonCheckUrl () {
        boolean result = false;
        String url = driver.getCurrentUrl();
        if (url.contains(QUIZ_PAGE_URL)) {
            result = true;
        }
        return result;
    }
    public ReviewPage enterName (String name) {
        driver.findElement(nameInput).sendKeys(name);
        return this;
    }

    public ReviewPage enterEmail (String email) {
        driver.findElement(emailInput).sendKeys(email);
        return this;
    }

    public ReviewPage enterComment (String comment) {
        driver.findElement(commentIInput).sendKeys(comment);
        return this;
    }

    public ReviewPage scrollToSubmitButton () {
        scrollToElement(scrollToSubmitButton);
        return this;
    }

    public ReviewPage submitButtonClick () {
        driver.findElement(submitButton).click();
        return this;
    }

    public Boolean submitMessageVisibleCheck () {
        boolean isVisible = driver.findElements(submitMessage).size() > 0;
        if (!isVisible) {
            waitOneSeconds();
            submitButtonClick();
            waitFiveSeconds();
            isVisible = driver.findElements(submitMessage).size() > 0;
        }
        return isVisible;
    }

    public Boolean inputErrorVisibleCheck () {
        boolean errorsCheck = driver.findElements(By.xpath("//*[@class='ciBsMTK3Kl error']")).size() == 3;
        if (!errorsCheck) {
            waitOneSeconds();
            submitButtonClick();
            waitFiveSeconds();
            errorsCheck = driver.findElements(submitMessage).size() == 3;
        }
        return errorsCheck;
    }

    public ReviewPage nextSliderButtonClick () {
        driver.findElement(nextSliderButton).click();
        return this;
    }

    public Boolean sliderBlockVisibleCheck () {
        return elementVisibleCheck(sliderBlock);
    }

    public ReviewPage scrollToSlider () {
        scrollToElement(scrollToSlider);
        return this;
    }

    public ReviewPage latestReviewsButtonClick (int numButton) {
        By latestReviewsButton = By.xpath("(//a[@class='VMlmVh'])[" + numButton + "]");
        driver.findElement(latestReviewsButton).click();
        return this;
    }

}
