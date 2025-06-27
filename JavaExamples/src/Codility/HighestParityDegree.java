package Codility;

public class HighestParityDegree {
	
	
	public static int solution(int N) {
        int k = 0;
        while (N % 2 == 0) {
            N /= 2;
            k++;
        }
        return k;
    }
				
	
	public static void main(String[] args) {
		
		int parityDegree = solution(620000) ;
		System.out.println("Parity Degree::"+parityDegree);
		
	}

}
