package pages.reviewCategory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import static constants.Constant.Urls.REVIEW_CATEGORY_SECOND_PAGE_URL;

public class ReviewCategoryPage extends BasePage {

    public ReviewCategoryPage (WebDriver driver) {super(driver);}

    private final By changeLanguageMenuOpen = By.xpath("(//span[@class='wpml-ls-native'])[1]");
    private final By paginationButton = By.xpath("(//a[@class='RPcr991'])[1]");

    public ReviewCategoryPage changeLanguageMenuOpen() {
        By changeLanguageButton = By.xpath("(//span[@class='wpml-ls-native'])[2]");
        if (!elementVisibleCheck(changeLanguageButton)) {
            driver.findElement(changeLanguageMenuOpen).click();
        }
        return this;
    }

    public ReviewCategoryPage changeLanguageButtonClick (int numButton) {
        By changeLanguageButton = By.xpath("(//span[@class='wpml-ls-native'])[" + numButton + "]");
        driver.findElement(changeLanguageButton).click();
        return this;
    }

    public ReviewCategoryPage visitSiteRegButtonClick (int numButton) {
        By visitSiteRegButton = By.xpath("(//a[contains(@class,'DSYGt wcOqq0LqU')])[" + numButton + "]");
        driver.findElement(visitSiteRegButton).click();
        return this;
    }

    public ReviewCategoryPage readReviewButtonClick (int numButton) {
        By readReviewButton = By.xpath("(//a[@class='vYYpeEg'])[" + numButton + "]");
        driver.findElement(readReviewButton).click();
        return this;
    }

    public ReviewCategoryPage paginationButtonClick () {
        driver.findElement(paginationButton);
        return this;
    }

    public Boolean urlPaginationCheck () {
        String url = driver.getCurrentUrl();
        Boolean result = false;
        if (REVIEW_CATEGORY_SECOND_PAGE_URL.contains(url)) {
            result = true;
        }
        return result;
    }

}
