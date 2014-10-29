package north.tpop.core.until;

import java.time.Duration;
import north.tpop.core.Until;
import north.tpop.core.Element;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UntilVisible implements Until {

    @Override
    public void apply(Element element, WebDriver driver, Duration timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout.getSeconds());
        wait.until(ExpectedConditions.visibilityOf(element.getWebElement()));
    }

}
