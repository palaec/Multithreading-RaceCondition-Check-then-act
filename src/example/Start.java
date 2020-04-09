package example;

public class Start {

	public static void main(String[] args) {
		BuyBookServiceImpl buyBookServiceImpl = new BuyBookServiceImpl();
		Controller controller = new Controller(buyBookServiceImpl);
		
		Thread thread1= new Thread(()->{
			String result  = controller.buyBooks("BOOK1", 1);
			System.out.println(result);
		},"Person1");
		
		Thread thread2= new Thread(()->{
			String result  = controller.buyBooks("BOOK1", 1);
			System.out.println(result);
		},"Person2");
		
		
		thread1.start();
		thread2.start();
	}
	
}
