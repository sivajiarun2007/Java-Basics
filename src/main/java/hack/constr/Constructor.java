package hack.constr;

public class Constructor {
	
	static String str;
	
	public void Constructor() {
		System.out.println("Hi");
		this.str = "test";
	}

	public static void main(String[] args) {
		try {
			badMetho();
		} catch (Exception e) {
			System.out.println("Excep");
		} finally {
			System.out.println("Finaly");
		}
	}
	
	
	public static void badMetho() {
		
	}

}
