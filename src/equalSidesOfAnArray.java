
public class equalSidesOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,3,4,3,2,1};
		
		 int sumE = 0,sumD = 0;
	      
		    for(int i = 0; i < arr.length; i++){
		      sumE = 0;
		      sumD = 0;
		      
		      for(int j  = i - 1; j >= 0; j--){
		        sumE += arr[j];
		        
		      }
		      
		      for(int j = i + 1; j < arr.length; j++){
		       sumD += arr[j];
		       
		      }
		     if(sumE == sumD){
		       System.out.println(i);
		     }
		     
		    }
		  System.out.println(-1);
	}

}
