package h_w_Interface;

import java.util.*;
public class main {

	public static void main(String[] args) {
		
		List<Sound> s= new ArrayList<Sound>();
		s.add(new Person(20));
		s.add(new Employee(30,3000));
		s.add(new Person(0.5));
		s.add(new Employee(50, 100));
		s.add(new Cat());
		s.add(new Dog());
		s.add(new Animal());
		
		for (Sound sound : s) {
            sound.PlayASound();

	}

}
}