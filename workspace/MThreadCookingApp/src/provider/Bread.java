package provider;

public class Bread {
	
	private String type;
	private Integer  id;
	
	public Bread(String type, Integer id) {
		super();
		this.type = type;
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Bread    ("+id+")    [type=" + type + "]";
	}
}
