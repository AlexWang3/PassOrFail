package PassOrFail;
import java.util.*;
public class passOrFail {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int wt=in.nextInt();
		int wa=in.nextInt();
		int wp=in.nextInt();
		int wq=in.nextInt();
		int num;
		int count=0;
		double sum=0;
		int ti,ai,pi,qi;
		int counts[]=new int[10];
		for(int i=0;i<10;i++) {
			num=in.nextInt();
			count=0;
			for(int j=0;j<num;j++) {
				sum=0;
				ti=in.nextInt();
				ai=in.nextInt();
				pi=in.nextInt();
				qi=in.nextInt();
				sum=wt*ti+wa*ai+wp*pi+wq*qi;
				sum/=100;
				if(sum>=50)
					count++;
			}
			counts[0]=count;	
		}
		for(int i=0;i<10;i++)
			System.out.println(counts[i]);
	}

}
