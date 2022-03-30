package randomNumber;

import java.util.Arrays;
import java.util.Random;

public class randomnmb {
	
	public static void main(String [] args) {
		int [] rnadomnmb= new int[500];
		int smallest= Integer.MAX_VALUE;
		int count=0;
		
		int greatest = 500;
		while(count<rnadomnmb.length-1) {
			Random rand = new Random();
			rnadomnmb[count]= rand.nextInt(greatest);
			if(rnadomnmb [count]<smallest) {
				smallest=rnadomnmb[count];
			}
			count++;
			
		}
		System.out.println(Arrays.toString(rnadomnmb));
		System.out.println("the smallest nmb is " +smallest);
	}
	
	
}




