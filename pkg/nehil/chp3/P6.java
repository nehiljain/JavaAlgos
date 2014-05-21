package pkg.nehil.chp3;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class P6 {

	public Deque<Integer> sortAsc(Deque<Integer> orig) {

		Deque<Integer> rev = new ArrayDeque<Integer>();

		while (!orig.isEmpty()) {
			int tmp = orig.removeFirst();

			while (!rev.isEmpty() && rev.peekFirst() > tmp) {
				orig.addFirst(rev.removeFirst());
			}
			rev.addFirst(tmp);
		}

	
		return rev;
	}


	public static void main(String argsp[]) {


		P6 obj = new P6();

		System.out.println( "Starting P6 " );


		Deque<Integer> test = new ArrayDeque<Integer>();

		test.addFirst(18);
		test.addFirst(4);
		test.addFirst(3);
		test.addFirst(17);
		test.addFirst(15);
		test.addFirst(9);
		test.addFirst(5);
		test.addFirst(3);

		Iterator it = test.iterator();

		while (it.hasNext()) {
			System.out.println(" 1:: " + (int) it.next() );
		}

		Deque<Integer> test2 = obj.sortAsc(test);

		Iterator it2 = test2.iterator();

		while (it2.hasNext()) {
			System.out.println(" 2:: " + (int) it2.next() );
		}

	}
}