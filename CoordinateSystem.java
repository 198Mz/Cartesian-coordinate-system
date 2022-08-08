
public class CoordinateSystem {
	
	private final int size;
	private String[][] coordinates;
	
	public CoordinateSystem(int size){
		this.size = size;
		this.coordinates = new String[this.size][this.size];
		for(int y=0;y<this.size;y++) {
			for(int x=0;x<this.size;x++) {
				this.coordinates[y][x] = " ";
				//Integer.toString(x) + Integer.toString(y);
			}
		}
	}
	
	public void addPoint(int x, int y) {
		this.coordinates[y][x] = "*";
	}
	
	private static String[][] flipArray(String[][] array){
		int max = array.length/2;
		for(int i=0;i<max;i++) {
			int j = array.length - i - 1;
			String[] temp = array[j];
			array[j] = array[i];
			array[i] = temp;
		}
		return array;
	}
	
	public void printCoordinateSystem() {
		this.coordinates = flipArray(this.coordinates);
		
		for(int y=0;y<this.size;y++) {
			System.out.printf("%d ", this.size-y-1);
			for(int x=0;x<this.size;x++) {
				System.out.printf("%s ", this.coordinates[y][x]);
			}
			System.out.println("");
		}
		System.out.printf("  ");
		for(int y=0;y<this.size;y++) {
			System.out.printf("%d ", y);
		}
	}
	
	
}
