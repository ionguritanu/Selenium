package Utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserUtils {
    //we creat browserutils to be able to call reusable methods from here to reduce amount of the codes
    public static void selectBy(WebElement element, String value, String methodName){
        Select select = new Select(element);

        switch (methodName){
            case "text":
                select.selectByVisibleText(value);
                break;
            case "index":
                select.selectByIndex(Integer.parseInt(value));
                break;
            case "value":
                select.selectByValue(value);
                break;
            default:
                System.out.println("Methode name is not available, Use text, value, or index for method name");
          }

        }


      public static String getTextMethode (WebElement element){
      return element.getText().trim();

    }
}
