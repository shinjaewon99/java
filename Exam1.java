import java.util.Scanner;

public class Exam1 {
	int width;
	int height;
	public int getArea() {
		return width*height;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Exam1 Rectangle = new Exam1();
		
		Rectangle.width = in.nextInt();
		Rectangle.height = in.nextInt();
		
		System.out.println(Rectangle.getArea());
		
		
		in.close();

	}

}
