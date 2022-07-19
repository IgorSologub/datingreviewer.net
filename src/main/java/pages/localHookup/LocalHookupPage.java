package pages.localHookup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LocalHookupPage extends BasePage {

    public LocalHookupPage (WebDriver driver) {super(driver);}

    private final By learnMoreButton = By.xpath("//a[@class='DSYGt DzKVXH']");
    private final By loadMoreButton = By.xpath("//button[@class='bGSILhDDF7 UcnVu7K js-showner-more js-showner-sortgroups']");
    private final By cityBlock = By.xpath("//div[normalize-space()='Chicago']");
    private final By loadMoreReviewButton = By.xpath("//button[@class='bGSILhDDF7 UcnVu7K lQL7O2 js-showner-more']");
    private final By reviewBlock = By.xpath("(//tr[@class='Uo4cl8ZbQfx'])[2]");
    private final By faqCollapseButton = By.xpath("(//div[@class='estk'])[1]");
    private final By faqCollapseText = By.xpath("(//div[@class='tKP8CZ5Rh2a'])[1]");
    private final By nextSliderButton = By.xpath("//button[@class='js-sites-next-sm slick-next slick-arrow']");
    private final By blogSlide = By.xpath("(//div[@class='D8SbYJ'])[6]");
    private final By scrollToBlogSlider = By.xpath("(//h2[@class='P3-0FiRjZqLB'])[4]");

    public LocalHookupPage learnMoreButtonClick () {
        driver.findElement(learnMoreButton).click();
        return this;
    }

    public LocalHookupPage loadMoreButtonClick () {
        driver.findElement(loadMoreButton).click();
        return this;
    }

    public Boolean cityBlockCheck () {
        return elementVisibleCheck(cityBlock);
    }

    public LocalHookupPage visitSiteButtonClick (int numButton) {
        By visitSiteButton = By.xpath("(//a[@class[contains(.,'DSYGt V0UF4R_')]])[" + numButton + "]");
        driver.findElement(visitSiteButton).click();
        return this;
    }

    public LocalHookupPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class[contains(.,'JTHFk2dEfVbg')]])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public LocalHookupPage latestNewsButtonClick (int numButton) {
        By latestNewsButton = By.xpath("(//a[@class='VMlmVh'])[" + numButton + "]");
        driver.findElement(latestNewsButton).click();
        return this;
    }

    public LocalHookupPage loadMoreReviewButtonClick () {
        driver.findElement(loadMoreReviewButton).click();
        return this;
    }

    public Boolean reviewBlockCheck () {
        return elementVisibleCheck(reviewBlock);
    }

    public LocalHookupPage visitSiteInTextButtonClick (int numButton) {
        By visitSiteInTextButton = By.xpath("(//a[@class='DSYGt WZWpzaOe0 ihNXl9CA'])[" + numButton + "]");
        driver.findElement(visitSiteInTextButton).click();
        return this;
    }

    public LocalHookupPage readFullReviewButtonClick (int numButton) {
        By readFullReviewButton = By.xpath("(//a[@class='DjOUW9'])[" + numButton + "]");
        driver.findElement(readFullReviewButton).click();
        return this;
    }

    public LocalHookupPage faqCollapseButtonClick () {
        driver.findElement(faqCollapseButton).click();
        return this;
    }

    public Boolean faqCollapseTextCheck () {
        return elementVisibleCheck(faqCollapseText);
    }

    public LocalHookupPage articlesButtonClick (int numButton) {
        By articlesButton = By.xpath("(//a[@class='J4bkwG3'])[" + numButton + "]");
        driver.findElement(articlesButton).click();
        return this;
    }

    public LocalHookupPage scrollToBlogSlider () {
        scrollToElement(scrollToBlogSlider);
        return this;
    }

    public LocalHookupPage nextBlogSliderButtonClick () {
        driver.findElement(nextSliderButton).click();
        return this;
    }

    public Boolean blogSliderVisibleCheck () {
        return elementVisibleCheck(blogSlide);
    }

}
