package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageRepo {

	
	@FindBy(xpath="//select[@name='fromPort']")
	private WebElement source;

	public WebElement getAdminconsolebtn() {
		return source;
	}

	public void setAdminconsolebtn(WebElement source) {
		this.source = source;
	}
}