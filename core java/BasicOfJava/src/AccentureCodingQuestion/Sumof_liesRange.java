package AccentureCodingQuestion;
import java.util.*;
public class Sumof_liesRange {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hrange=sc.nextInt();//30
		int lrange=sc.nextInt();//6
		int divsum=0;
		int ndivsum=0;
		for(int i=0;i<=hrange;i++) {
			if(i%lrange==0) {
				divsum=divsum+i;
			}
			else if(i%lrange!=0) {
				ndivsum=ndivsum+i;
			}
		}
		int result=ndivsum-divsum;
		System.out.println(result);
	}
}
