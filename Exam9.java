import java.util.Vector;

class P{
	private int x ,y ;
	public P(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	public String toString() {
		return "(" + x + "," + y + ")";  
	}
}
public class Exam9 {

	public static void main(String[] args) {
		
		Vector<P> v = new Vector<P>();
		
		v.add(new P(2,3));
		v.add(new P(-5,20));
		v.add(new P(30,-8));
		
		v.remove(1); //인덱스 1의 P 객체 삭제
		
		for(int i = 0 ; i<v.size(); i++) {
			P p = v.get(i);
			System.out.println(p);
		}
	}

}
