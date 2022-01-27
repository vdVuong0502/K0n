
public class Pale {
	private String girlName;
	
	public Pale(String name) {
		girlName = name;
	}
	
	public Pale() {}
	
	public void setName(String name) {
		girlName = name;
	}
	public String getName() {
		return girlName;
	}
	
	public void saying() {
		System.out.printf("Your girl deskmate's name is %s", getName());
	}
}
