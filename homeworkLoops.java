
public class homeworkLoops {
	public static void main (String [] args) {
	
	
	int a = 0;
	while (a <= 100) {
		if (a % 2 == 0) {
			System.out.println(a);
		}
		a++;
	}

	
	int b = 100;
	while (b >= 0) {
		if (b % 3 == 0) {
			System.out.println(b);
		}
		b--;
	}

		
	for (int c = 0; c <= 100; c++) {
		if (c % 2 == 0) {
			System.out.println(c);
		}
	}

		
	for (int d = 0; d <= 100; d++) {
		if ((d % 3 == 0) && (d % 5 == 0)) {
			System.out.println("Hello World");
		} else if (d % 3 == 0) {
			System.out.println("Hello");
		} else if (d % 5 == 0) {
			System.out.println("World");
		} else {
			System.out.println(d);
		}
	}
	
	
	}
}
