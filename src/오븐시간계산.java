
import java.util.Scanner;

public class 오븐시간계산 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B,C;
		
		
//		A = sc.nextInt();
//		B = sc.nextInt();
//		C = sc.nextInt();
		A =23;
		B = 48;
		C = 25;
		
	
		int sum = B+C;
		
		if(sum >= 60) {
			
			A =A + (sum / 60);
			sum = (sum % 60);
		}
      System.out.println(A);
        if(A > 24) {
        	A-= 24;
        }
        if(A == 12 || A == 24) {
        	A = 0;
        }
        System.out.println(A + " " + sum);
        
	}

}

// <모범 답안>
//import java.util.*;
//class Main{
//	public static void main(String[] a){
//		Scanner s=new Scanner(System.in);
//		int A=s.nextInt();
//		int B=s.nextInt();
//		int C=s.nextInt();
//		A+=(B+C)/60;
//		A%=24;
//		B=(B+C)%60;
//		System.out.print(A+" "+B);
//}
//}
