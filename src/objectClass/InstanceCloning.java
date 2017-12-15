package objectClass;

class Point implements Cloneable { //clone()을 구현하는 클래스는 implements Cloneable해야!
	private int xPos;
	private int yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println("");
	}
	public void changePos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class InstanceCloning {
	public static void main(String[] args) {
		Point org = new Point(3, 5);
		Point cpy;
		
		try {
			cpy = (Point) org.clone();
			org.showPosition();
			cpy.showPosition();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
