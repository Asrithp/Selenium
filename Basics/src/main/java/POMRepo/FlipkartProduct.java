package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartProduct 
{
   public FlipkartProduct(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath="//input[@placeholder=\"Search for Products, Brands and More\"]")
   private WebElement SearchBar;
     
  @FindBy(xpath="(//div[@class=\"_4rR01T\"])[1]")
  private WebElement Iphone;
  
  @FindBy(xpath="//span[@class=\"B_NuCI\"]")
  private WebElement Name;
  
  @FindBy(xpath="//div[@class=\"_30jeq3 _16Jk6d\"]")
  private WebElement Price;

public WebElement getSearchBar() {
	return SearchBar;
}

public WebElement getIphone() {
	return Iphone;
}

public WebElement getName() {
	return Name;
}

public WebElement getPrice() {
	return Price;
}

}
