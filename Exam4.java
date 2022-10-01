class Point{
	private int x, y;
	
	public Point(int x , int y) {
		this.x =x;
		this.y = y;
		
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y , String Color) {
		super(x,y);
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}


public class Exam4 {

	public static void main(String[] args) {
		ColorPoint c = new ColorPoint(5,6 , "blue");
		c.showColorPoint();
		

	}

}
