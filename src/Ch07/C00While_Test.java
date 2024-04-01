package Ch07;

import java.util.Scanner;

public class C00While_Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// N - M 까지의 합을 구합니다.(N<M)
		//01 1 - N 까지 수중에 짝수/홀수의 합을 각각 출력
		//1 - N 까지 수중에 3의 배수만 출력하고 그합도 출력
		//1 - N까지 수중에 4의 배수를 출력하고 4의배수가 아닌 나머지의 합을 구하세요
		//구구단 N 단 역순출력(N<=9)
		
		//양의 정수를 입력받아서 소수인지 아닌지를 판별하는 코드를 작성하세요
		//소수 : 약수가 1과 자기 자신뿐인 수
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("수를 입력 하세요 : " );
//		int num = sc.nextInt();
//		
//		int i=2;
//		boolean is소수=true;
//		while(i<num) {
//			if(num%i==0) {
//				is소수=false;
//				break;
//			}
//			i++;
//		}
//		if(num<=1) {
//			System.out.println(num + " 는 소수가 아닙니다.");
//		}else {
//			if(!is소수)
//				System.out.println(num + " 는 소수가 아닙니다");
//			else
//				System.out.println(num + " 는 소수입니다");		
//		}

	
		//숫자를 입력받아 해당 수를 거꾸로 저장해서 출력해보세요
		//정수값을 입력받아서 처리합니다
		//입력 : 1234
		//출력 : 6543

//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : " );
//		int num = sc.nextInt();
//		
//		//자리수 구하기 1234 -> 4 , 12345 -> 5
//		int digit=0;
//		int tmp = num;
//		int result=0;
//		while(tmp!=0) {
//			digit++;
//			tmp=tmp/10;
//		}
//		//System.out.println("자리수 : " + digit);
//		
//		while(num!=0) {
//			//System.out.println("num : " + num);
//			//System.out.print((num%10));
//			result += (int) ((num%10)*(Math.pow(10, digit-1)));
//			digit--;
//			num=num/10;
//		}
//		System.out.println("출력 : " + result);
				
		//문자열로 처리
//		Scanner sc = new Scanner(System.in);
//		System.out.print("입력 : " );
//		int num = sc.nextInt();
//		String num_2 = num+"";
//		String tmp ="";
//		for(int i=num_2.length()-1; i>=0 ;i--) {
//			tmp = tmp+num_2.charAt(i);
//
//		}
//		System.out.println(Integer.parseInt(tmp));
		
		
		// 이중 while문제.. 나중에 푸세요~~
		//자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오. 
		//10 미만의 홀수만 출력하시오.
		// 주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.
		//입력 : 3
		//출력 :
		//1 3 5
		//7 9 1
		//3 5 7
		
		
		//별찍기(그냥찍기/높이입력받아서 찍기)
//		높이 : 4
//		****
//		****
//		****
//		****
//		
//		높이 : 4
//		*
//		**
//		***
//		****
//		
//		높이 : 4		
//		****		
//		***
//		**
//		*
//		
//		높이 : 4		
//		   *
//		  ***
//		 *****
//		*******
//		i(행증가)		j(공백)		k(별찍기)		
//		0		0-2				0-0
//		1		0-1				0-2
//		2		0-0				0-4
//		3		x				0-6
//		---------------------------------------------------------
//		i=0;		j=0			k=0
//		i<4;		j<=2-i		k<=2*i
//		i++			j++			k++		
		
//		h : n
//		   *
//		  ***
//		 *****
//		*******
//
//		i(행증가)		j(공백)		k(별찍기)		
//		0		0-(n-2)-0		0-0
//		1		0-(n-2)-1		0-2
//		2		0-(n-2)-2		0-4
//		3		x		0-6
//		...
//		n-1
//		---------------------------------------------------------
//		i=0;	j=0				k=0
//		i<n;	j<=(n-2)-i		k<=2*i
//		i++		j++				k++		
//		int i=0;
//		int j=0;
//		int k=0;
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		while(i<n) {
//			//공백
//			j=0;
//			while(j<=(n-2)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
//		
//		높이 : 4		
//		*******
//		 *****
//		  ***
//		   *

//		i(행)		j(공백)		k(별)
//		0		x		0-6		
//		1		0-0		0-4
//		2		0-1		0-2
//		3		0-2		0-0
//		-------------------------------------------------------
//		i=0		j=0		k=0		
//		i<4		j<=i-1	k<=6-2i
//		i++		j++		k++

//		h : n
//		***********
//		 *********
//		  *******
//		   *****
//		    ***
//		     *
//
//		i(행)		j(공백)		k(별)
//		0			x			0-8
//		1			0-1			0-6
//		2			0-2			0-4
//		3			0-3			0-2
//		4			0-4			0-0
//		..
//		n-1
//		-------------------------------------------------------
//		i=0			j=0			k=0		
//		i<n			j<=i-1		k<=((n-1)*2)-2*i
//		i++			j++			k++
		
//		int i=0;
//		int j=0;
//		int k=0;
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		while(i<h)
//		{
//			//공백
//			j=0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=((h-1)*2)-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
//		
//		높이 : 7		
//		   *
//		  ***
//		 *****
//		*******	
//		 *****
//		  ***
//		   *

		
//		i(행)		j(공백)		k(별)
//		0		0-2		0-0
//		1		0-1		0-2
//		2		0-0		0-4
//		3		x		0-6
//		-------------------------------------------------------
//				j=0		k=0
//				j<=2-i		k<=2*i
//				j++		k++
//
//		4		0-0		0-4
//		5		0-1		0-2
//		6		0-2		0-0
//		--------------------------------------------------------
//		i=0		j=0		k=0
//		i<7		j<=i-4		k<=(6*2)- 2*i
//		i++		j++		k++
		int i=0;
		int j=0;
		int k=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(i<n) {
			
			if(i<(n/2)+1) {
				//공백
				j=0;
				while(j<=(n/2-1)-i) {
					System.out.print(" ");
					j++;
				}
				//별			
				k=0;
				while(k<=2*i) {
					System.out.print("*");
					k++;
				}
			}else {
				//공백
				j=0;
				while(j<=i-(n/2)-1) {
					System.out.print(" ");
					j++;
				}
				//별			
				k=0;
				while(k<=((n/2*2)*2)- 2*i) {
					System.out.print("*");
					k++;
				}				
			}

			System.out.println();
			i++;
		}
		
		
		
		
		
//	   높이 : 7
//		*******	   
//		 *****
//		  ***
//		   *
//	      ***
//		 *****
//		*******	

		
		   
		
		
	}

}
