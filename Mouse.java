public class Mouse {

	public static void leftClick() {
		System.out.println("click!");
	}
	
	public static void  rightClick() {
	System.out.println("click!");
    }
	public static void scrollUp() {
		System.out.println("scrollup!");
	}
    public static void scrollDown() {
    	System.out.println("scrolldown!");
    }
    public static class Main {
    	public static void main(String[]args) {
    		Mouse M1 = new Mouse();
    		M1.leftClick();
    		M1.rightClick();
    		M1.scrollDown();
    		M1.scrollUp();
    	}
    }
}

 class Mouse1 extends Mouse {
	String texture = "Matte";
	public static void leftClick() {
		System.out.println("click!");
	}
	
	public static void  rightClick() {
	System.out.println("click!");
    }
	public static void setColor(String color) {
		System.out.println("color");

	}
}

class Mouse2 extends Mouse {

	public static void leftClick() {
		System.out.println("click!");
	}
	
	public static void  rightClick() {
	System.out.println("click!");
    }
	
	public static void Connect() {
		System.out.println("connected!");
// TODO Auto-generated method stub
	}

}
 class Mouse3 extends Mouse {

	boolean ambidextrous = true;
	 public static void leftClick() {
		System.out.println("click!");
	}
	
	public static void  rightClick() {
	System.out.println("click!");
    }
	

}

