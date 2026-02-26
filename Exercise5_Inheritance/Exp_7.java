package practical;
//Exp_7.java (subclass implementing interface)
public class Exp_7 extends Exp_6 implements Pet{
	private String owner;
	public Exp_7(String name,String owner) {
		super(name);
		this.owner=owner;
	}
	@Override
	public void play() {
		System.out.println(name+"play fetch with "+owner);
	}
	@Override
	public void speak() {
		System.out.println(name+"barks:Woof! ");
	}
	@Override
	public String getOwnerName() {
		return owner;
	}
	//additional method
	public void wagTail() {
		System.out.println(name+"is wagging its Tail.");
	}
}