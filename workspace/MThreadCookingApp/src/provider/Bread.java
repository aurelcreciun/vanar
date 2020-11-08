package provider;

public class Bread {
	
	private String type;
	private Integer  id;
	private Factory manufactorir;
	
	public Bread(String type, Integer id, Factory manufactorir) {
		super();
		this.type = type;
		this.id = id;
		this.manufactorir = manufactorir;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Bread    ("+id+")    [type=" + type + "; manufacturer=" + manufactorir.getName() + "]";
	}
}
