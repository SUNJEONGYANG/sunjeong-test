class MyPoint extends Object {
	int x;
	int y;
	}

class Circle extends Object {// Æ÷ÇÔ
	MyPoint p = new MyPoint();
	int r;
}
public class InteritanceTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.toString()); // "Circle@2a139a55"
		System.out.println(c);

	}

}
