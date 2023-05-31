package genericPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WorkLib extends BaseTest
{
    	//handle popup
        public void acceptAlert()
        {
        	driver.switchTo().alert().accept();
        }
        public void dismissAlert()
        {
        	driver.switchTo().alert().dismiss();
        }
        public void acceptConfirmation()
        {
        	driver.switchTo().alert().accept();
        }
        public void dismissConfirmation()
        {
        	driver.switchTo().alert().dismiss();
        }
        //handle mouse action
        
        public void rightclick(WebElement target)
        {
        	Actions act = new Actions(driver);
        	act.contextClick(target).perform();
        }
        public void doubleClick(WebElement target)
        {
        	Actions act = new Actions(driver);
        	act.doubleClick().perform();
        }
        public void mouseHoverMethod(WebElement target)
        {
        	Actions act = new Actions(driver);
        	act.moveToElement(target).perform();
        }
        public void dragAndDropMethod( WebElement src,WebElement target)
        {
        	Actions act = new Actions(driver);
        	act.dragAndDrop(src,target).perform();
        }
        //handle a frame
        
        public void handleFrameByIndex(int index)
        {
        	driver.switchTo().frame(index);
        }
        public void hendleFrameByNameOrId(String NameorId)
        {
        	driver.switchTo().frame(NameorId);
        }
        public void handleFrameByElement(WebElement frame)
        {
        	driver.switchTo().frame(frame);
        }
        
}      
