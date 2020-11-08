package provider;

// design pattern Factory
public class Factory {
	
	private String name;	
	
	public Factory(String name) {
		super();
		this.setName(name);
	}
	
	@Override
	public String toString() {
		return "Factory [toString()=" + this.toString() + "]";
	}

	public static Integer counter = 0;

	public Bread CreateBread(String type) {
		
		return new Bread(type, ++counter, this);	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
