
public class number4 {
	//호텔 방 계산
	
	static long k = 10;
	static long[] room_number = {1,3,4,1,3,1};
	static int room_number_length = room_number.length;
	
	public static void main(String[] args) {
		
		long[] answer = new long[room_number_length];
	      
	    answer[0] = room_number[0];
	        
	    for(int i=1; i<room_number_length; i++) { //두 번째 값부터 시작
			long key = room_number[i];
			int j = i-1;
			while(j>=0 && room_number[j] == key) {
				key = key + 1L;
			}
			if(key > k)
				key = -1;
			
			answer[i] = key;
		}
	       
	    for(int i=0; i<room_number_length; i++) {
	    	System.out.println(answer[i]);
	    }
	}
}
