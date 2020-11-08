package provider;

import java.util.ArrayList;
import java.util.List;

public class Store {
	
	public static final Integer MAX_BREAD = 5;
	private List<Bread> reserve;

	public Store() {
		reserve = new ArrayList<>();
	}
	
	public void getBread(Factory factory) {
		if(count() < MAX_BREAD) {
			Bread bread = factory.CreateBread("Chisinau");
			reserve.add(bread);
		}
		else {
			System.out.println("no stock avalable");
		}
	}
	
	public Integer count() {
		return reserve.size();
	}
	
	public List<Bread> getReserve(){
		return reserve;
	}

}
