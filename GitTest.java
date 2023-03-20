package gitTest;

public class GitTest {

	public static void main(String[] args) {
		
		int sum;
		int i, j;
		
		for (i = 2; i <= 9; i++) {
			System.out.println("구구단 " + i + "단");
			for (j = 1; j <= 9; j++) {
				sum = i * j;
			System.out.println(i + "x" + j + " = " + sum  );
			}
		}
		
		

}
}