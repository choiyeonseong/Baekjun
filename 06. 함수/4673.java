public class Main {
	public static void main(String[] args) {

		boolean[] isSelfnumber = new boolean[10001];

		for (int i = 1; i < 10001; i++) {
			int n = d(i);

			if (n < 10001) {
				isSelfnumber[n] = true;	//셀프넘버이면 t, 아니면 f
			}
		}

		for (int i = 1; i < 10001; i++) {
			if (!isSelfnumber[i]) {
				System.out.println(i);
			}
		}
	}

	//원래 수와 각 자리수의 합
	public static int d(int n) {
		int dn = n;
		while (n > 0) {
			dn += n % 10;	//첫째자리수
			n /= 10;		//10을 나누어 첫째자리를 없앰
		}
		return dn;
	}
}
