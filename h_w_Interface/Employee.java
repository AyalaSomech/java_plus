package h_w_Interface;

public class Employee extends Person implements Sound{

	private int employee;
	private int month;
	
	public Employee(int _id, double _age, String _name, String _lastName, int _employee, int _month) {
		super(_id, _age, _name, _lastName);
		employee=_employee;
		month=_month;
	}

	public Employee(double _age, int employee) {
		super(_age);
		this.employee = employee;
	}

	public int getEmployee() {
		return employee;
	}

	public void setEmployee(int employee) {
		this.employee = employee;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	@Override
    public void PlayASound() {
        if (employee > 1000) {
            System.out.println("wooooooow");
        } else {
            System.out.println("uffffff");
        }

	}
}
