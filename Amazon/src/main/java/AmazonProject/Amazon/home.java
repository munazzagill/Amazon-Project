package AmazonProject.Amazon;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class home {
	
	public static WebDriver driver;
	
	
	
	 	@FindBy(id="twotabsearchtextbox") WebElement searchField;

	    @FindBy(xpath = "//input[@value='Go']") WebElement searchButton;

	    @FindBy(xpath = "(//span[contains(@class,'a-size-medium a-color-base')])[1]") WebElement product;

	    @FindBy(id = "add-to-cart-button") WebElement addToCartButton;

	    public home (WebDriver driver) {
	        home.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void searchProduct(String productName) {
	        searchField.sendKeys(productName);
	        searchButton.click();
	    }

	    public void selectProduct() {
	        product.click();
	    }

	    public void addToCart() {
	        addToCartButton.click();
	    }

	}
	
