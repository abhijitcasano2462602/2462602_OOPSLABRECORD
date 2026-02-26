package practical;
//Exp_6.java (superclass)
public class Exp_6{
	protected String name;
	public Exp_6(String name) {
		this.name=name;
	}
	public void speak() {
		System.out.println(name + "make a sound.");
	}
	public void info() {
		System.out.println("This is an animal named"+name);
	}
}
