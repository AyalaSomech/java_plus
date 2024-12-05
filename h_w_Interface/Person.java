package h_w_Interface;

public class Person implements Sound{
	private int id;
	private double age;
	private String name; 
	private String lastName;

	public Person(int _id, double _age, String _name, String _lastName) {
		id=_id;
		age=_age;
		name=_name;
		lastName=_lastName;
	}

	public Person(double _age) {
		id=123;
		age=_age;
		name=null;
		lastName=null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
    public void PlayASound() {
        if (age < 1) {
            System.out.println("hooouououooooouooohoaa");
        } else {
            System.out.println("hi hello world!");
        }
	}
	
}
