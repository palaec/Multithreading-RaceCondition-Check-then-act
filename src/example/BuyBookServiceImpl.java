package example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

public class BuyBookServiceImpl implements BuyService{
	
//	ReentrantLock lock = new ReentrantLock();
	Map<String , Integer> products = new HashMap<String , Integer>();

	public BuyBookServiceImpl() {
			products.put("PEN1", 2);
			products.put("BOOK1", 1);
	}
	
	@Override
	public String buy(String bookName, int quantity) {
//		lock.lock();
		if(products.containsKey(bookName) && products.get(bookName) != 0) {
			products.put(bookName, products.get(bookName)-1);
//			lock.unlock();
			return bookName + " :  is delivered to : " + Thread.currentThread().getName();
		}else {
//			lock.unlock();
			return bookName + " :  is out of stock..";
		}		
	}

}
