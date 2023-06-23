package study;

import java.util.Scanner; //키보드로 입력받기위해 추가필요

public class HwanJun {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//키보드로 부터 입력을 받음
		int yen = input.nextInt();
		int dollar = input.nextInt();
		
		//환률 변수생성(엔화,달러)
		double yenRate =  9.16;
		double dollarRate = 1309.83;
		
		//환전하기 및 출력
		int won = (int)(yen * yenRate + dollar * dollarRate);
		System.out.println("200엔 + 15달러 =" + won + "원");

	}

}
