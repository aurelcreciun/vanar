package provider;

// design pattern Factory
public class Factory {
	
	public static Integer counter = 0;

	public Bread CreateBread(String type) {
		
		return new Bread(type, ++counter);
		
	}
}
