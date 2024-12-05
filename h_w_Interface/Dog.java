package h_w_Interface;

public class Dog extends Animal implements Sound{
	private String type;
	
	public Dog(String _name,int _age,String _food, String _type) {
		super(_name,_age,_food);
		type=_type;
	}
	
	public Dog() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Override
	public void PlayASound() {
		System.out.println("I am dog- hoohoohoo");
	}

}
