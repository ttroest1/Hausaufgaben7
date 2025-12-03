package h2;

import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int[]change(int[] a,int[] b,int start,int end){

		if(end>start) {
			int[] c = Arrays.copyOf(a,a.length);		

			if(Arrays.compare(a, b)!=0){
				return c;					
			}else {
				Arrays.sort(c);
				return Arrays.copyOfRange(c, start, end);
			}

		}else{
			return new int[0];
		}

	}

}
