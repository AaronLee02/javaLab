package verify;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetTest01 {

	public static void main(String[] args) {
		int n;
		Set s = new HashSet(); // ���1. ������ ������� �Է�
		// TreeSet s = new TreeSet(); // ���2. �����ϱ�

		Random r = new Random();

		while (true) {
			n = r.nextInt(45) + 1;
			s.add(n);
			if (s.size() == 6) {
				System.out.println(s);

				break;
			}
		}

		// �����ϱ�
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
