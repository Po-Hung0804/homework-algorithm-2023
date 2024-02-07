

public class HW03_4110042019_3 extends One_0k_rock{

	
	public boolean[] one0k(String[] str) {
		 boolean[] result = new boolean[str.length];
	        
	        for (int i = 0; i < str.length; i++) {
	            int zeros = 0;
	            int ones = 0;
	            
	            boolean isInvalid = false;
	            
	            for (int j = 0; j < str[i].length(); j++) {
	                char c = str[i].charAt(j);
	                
	                if (c == '0') {
	                    if (ones == 0) {
	                        zeros++;
	                    } else {
	                        isInvalid = true;
	                        break;
	                    }
	                } else if (c == '1') {
	                    ones++;
	                } else {
	                    isInvalid = true;
	                    break;
	                }
	            }
	            
	            result[i] = !isInvalid && zeros == ones;
	        }
	        
	        return result;
	}
	

}
