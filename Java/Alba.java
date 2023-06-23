package study;

import java.util.Scanner;

public class Alba {

	public static void main(String[] args) {
		
		//키보드로 부터 입력받기 위한 Scanner변수 생성
		Scanner input = new Scanner(System.in);
		
		// 키보드로부터 정수값을 입력받아 시급에 대입
		int basePay = input.nextInt();
		
		// 키보드로부터 정수값을 입력받아 일한 시간에 대입
		int workHour = input.nextInt();
		
		// 급여 = 시급 * 일한시간
		int pay = basePay * workHour;
		
		 // 출력
		System.out.println(pay);
	}

}
