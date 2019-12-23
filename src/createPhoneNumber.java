
public class createPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,0};
		String str = "(";
		
		for(int i = 0; i < numbers.length; i++) {
			String aux;
			
			aux = Integer.toString(numbers[i]);
			if(i == 3) {
				str += ") ";
			}
			if(i == 6) {
				str += '-';
			}
			str += aux;
		}
		
		System.out.println(str);
		
	}

}
