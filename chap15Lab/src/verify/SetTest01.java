package verify;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetTest01 {

	public static void main(String[] args) {
		int n;
		Set s = new HashSet(); // 방법1. 나오는 순서대로 입력
		// TreeSet s = new TreeSet(); // 방법2. 정렬하기

		Random r = new Random();

		while (true) {
			n = r.nextInt(45) + 1;
			s.add(n);
			if (s.size() == 6) {
				System.out.println(s);

				break;
			}
		}

		// 정렬하기
		// List list = new ArrayList(s);
		// Collections.sort(list);
		// System.out.println(list);

		// Set t = new HashSet();
		// while(t.size()!=45) {
		// t.add(r.nextInt(45)+1);
		// }
		// System.out.println(t);

	}

}
