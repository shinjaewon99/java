import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Exam11 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> score = new HashMap<String,Integer>();
		
		score.put("김성동", 97);
		score.put("황기태", 88);
		score.put("김남윤", 98);
		score.put("이재문", 70);
		score.put("한원선", 99);
		
		System.out.println("HasMap의 요소 개수: " + score.size());
		
		Set<String> keys = score.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int s = score.get(name);
			System.out.println(name + ":" + score);
		}
		
	}

}
