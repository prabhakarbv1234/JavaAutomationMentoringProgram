package testing;

public class Linear {
	public static boolean linearIn(int[] outer, int[] inner) {
	    int i = 0;
	    int j = 0;
	      
	    while(i < inner.length && j < outer.length) {
	        if(inner[i] > outer[j]) {
	            j++;
	        } else if(inner[i] < outer[j]) {
	            return false;
	        } else {
	            i++;
	        }
	    }
	                                              
	    if(i != inner.length)
	        return false;
	                                                      
	    return true;
	}
	public static void main(String[] args) {
		int[] outer = {1, 2, 4, 6};
		int[] inner = {2,4};
		System.out.println(linearIn(outer,inner)) ;

	}
}
