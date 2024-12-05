package h_w_Interface;

public class Animal implements Sound{
	private String name;
	private int age;
	private String food;
	
	public Animal(String _name,int _age,String _food) {
		name=_name;
		age=_age;
		food=_food;
	}

	public Animal() {
		name=null;
		age=0;
		food=null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}
	@Override
	public void PlayASound() {
		System.out.println("I am animal");
	}
	
	
}
