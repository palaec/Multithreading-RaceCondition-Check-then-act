package example;

public class Controller {

	private BuyService buyService;

	public Controller(BuyService buyService) {
		this.buyService = buyService;
	}
	
	public String buyBooks(String bookName,int quantity ) {
		return this.buyService.buy(bookName , quantity);
	}
	

}
