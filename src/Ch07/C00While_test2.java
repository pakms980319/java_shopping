package Ch07;

import java.util.Scanner;

public class C00While_test2 {

	public static void main(String[] args) {
		
		//구구단 출력(2단-9단)

//		int dan=2;
//		int i;
//		while(dan<=9) {
//			
//			i=1;
//			while(i<=9) {
//				
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//	
//		}
//		//구구단 출력(9단 - 2단)
//		int dan=9;
//		int i;
//		while(dan>=2) {
//			
//			i=9;
//			while(i>=1) {
//				
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//	
//		}
		
		
//		//구구단 출력(2단 - N단)
//		//N은 Scanner로 받습니다.
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		while(n>9) { 
//			System.out.println("다시입력하세요.");
//			n=sc.nextInt();
//		}
//		
//		int dan=2;
//		int i;
//		while(dan<=n) {
//			
//			i=1;
//			while(i<=9) {
//				
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//		}
		
		//4행 별찍 -> 높이 입력 별찍기
		//****
		//****
		//****
		//****
		
//		int i=0; //행증가
//		int j=0; //별찍기
//		while(i<4) {
//			
//			j=0;
//			while(j<4) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++; 
//		}
		
		//높이 : n
		//****
		//****
		//****
		//****	
//		높이 : n
//		행증가(i)		별찍기(j)
//		0		0~3
//		1		0~3
//		2		0~3
//		3		0~3
//		..
//		n-1		0~3
//		------------------------------------------
//		i=0		j=0
//		i<n		j<4
//		i++		j++
		
//		int i=0; //행증가
//		int j=0; //별찍기
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		while(i<n) {
//			j=0;
//			while(j<4) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++; 
//		}
		
		//*
		//**
		//***
		//****
//		i		j
//		0		0-0
//		1		0-1
//		2		0-2
//		3		0-3
//		----------------------------
//		i=0		j=0
//		i<4		j<=i
//		i++		j++

		
//		int i=0; //행증가
//		int j=0; //별찍기
//		while(i<4) {
//			
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++; 
//		}	
		
//		높이 : n
//		i		j
//		0		0-0
//		1		0-1
//		2		0-2
//		3		0-3
//		..
//		n-1
//		----------------------------
//		i=0		j=0
//		i<n		j<=i
//		i++		j++
		
//		int i=0; //행증가
//		int j=0; //별찍기
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		while(i<n) {
//			
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++; 
//		}	
		
		
		 //000*
		 //00***
		 //0*****
		 //*******
//		높이 : n
//		i(행)		j(공백)		k(별)
//		0		0-(n-2)		0-0
//		1		0-1		0-2
//		2		0-0		0-4	
//		3		x		0-6
//		n-1
//		------------------------------------------------
//		i=0		j=0		k=0
//		i<n		j<=(n-2)-i		k<=i*2
//		i++		j++		k++

		
		 int i=0;
		 int j=0;
		 int k=0;
		 Scanner sc = new Scanner(System.in);
		 int n  = sc.nextInt();
		 while(i<n) {
			 //공백
			 j=0;
			 while(j<=(n-2)-i) {
				 System.out.print(" ");;
				 j++;
			 }
			 //별
			 k=0;
			 while(k<=i*2) {
				 System.out.print("*");;
				 k++;
			 }			 
			 System.out.println();
			 i++;
		 }
		 
	}

}
