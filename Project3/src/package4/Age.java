package package4;

public class Age {
static int age=45;
	public static void main(String[] args) {
	boolean x=data();
System.out.println(x);
	}
public static boolean data() {
	if(age>18) {
		System.out.println("eligible");
		return true;}
		else {
			System.out.println("not eligible");
			return false;
		}
	}
}

