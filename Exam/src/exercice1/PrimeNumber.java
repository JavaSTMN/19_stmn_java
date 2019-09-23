package exercice1;

public class PrimeNumber {

	public static int nToCube(int n) {
		int answer=0;
		for(int i = 1; i<=n; i++) {
			answer+= i*i*i;
		}
		return answer;
	}
	
	public static int nSumToCube(int n) {
		int answer=0;
		for(int i = 1; i<=n; i++) {
			answer+= i;
		}
		answer = answer * answer * answer;
		return answer;
	}
	
	public static int diff(int n) {
		int answer=0;
		answer = nSumToCube(n) - nToCube(n);
		return answer;
	}
}
