
public class finTheOddInt {

	public static void main(String[] args) {
		int[] a = new int[] {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5} ;
		int sum;
		
		for (int i = 0; i < a.length; i++) {
			sum = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[j] == a[i]) {
					sum++;
				}
				
			}
			
			if(sum % 2 != 0) {
				System.out.println(a[i]);
			}
		}
		
		System.out.println(-1);

	}

}
