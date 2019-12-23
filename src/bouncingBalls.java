
public class bouncingBalls {

	public static void main(String[] args) {
		double h = 2.2;
		double bounce = 0.66;
		double window = 1.5;
		int sum = 0;
		if((h <= 0) || (bounce < 0) || (bounce > 1) || (window > h)){
			System.out.println(-1);
		}

		while( h >= window) {
			h *= bounce;
			
			if(h > window) {
				sum++;
			}
			sum++;
		}
		System.out.println(sum);
		
	}

}
