package h_w_Interface;

public class Cat extends Animal implements Sound{
	private String color;
	
	public Cat(String _name,int _age,String _food, String _color) {
		super(_name, _age, _food);
		color=_color;
	}
	public Cat() {
		super();
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void PlayASound() {
		System.out.println("I am cat- miyau_miyau");
	}
}
