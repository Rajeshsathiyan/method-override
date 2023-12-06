package Practice;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		parentClass parent = new parentClass();
//		parent.launchApp();
//		
//		childClass child = new childClass();
//		child.launchApp();
//		
		parentClass upcast = new childClass();
		upcast.launchApp();
		
	}

}
