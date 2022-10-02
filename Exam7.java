import java.util.Vector;

public class Exam7 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		
		v.add(5);
		v.add(4);
		v.add(-1);
		
		v.add(2,100);
		
		
		System.out.println("v size()" + v.size());
		System.out.println("v capacity()" + v.capacity());
		
		// 모든 요소 출력
		for(int i = 0 ; i<v.size(); i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		
		int sum = 0;
		for(int i = 0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum += n;
		}
		System.out.println("sum" + sum);
	}

}
