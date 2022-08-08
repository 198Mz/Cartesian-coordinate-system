
public class Main {

	public static void main(String[] args) {
		CoordinateSystem zeros = new CoordinateSystem(100);
		for(int i=0;i<5;i++) {
			// (x,y)
			zeros.addPoint(i, (int) Math.pow(i, 2));
		}
		zeros.printCoordinateSystem();
	}
}
