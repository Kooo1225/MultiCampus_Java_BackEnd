package Java_Study.Chapter03;

public class WhilePrintFrom1To10Example {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;

		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}
}
