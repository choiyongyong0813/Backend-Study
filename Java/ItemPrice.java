package study;

public class ItemPrice {

	public static void main(String[] args) {
		int tumPrice = 24000;		//텀블러 가격
		int beenPrice = 15000;		//원두 가격
		int macaPrice = 2500;		//마카롱 가격
		
		int tumNum = 1;		//텀블러 수량
		int beenNum = 2;	//원두 수량
		int macaNum = 5;	//마카롱 수량
		
		System.out.printf("%s * %d개 = %d\n", "텀블러", tumNum, tumPrice * tumNum);
		System.out.printf("%s * %d개 = %d\n", "원두", beenNum, beenPrice * beenNum);
		System.out.printf("%s * %d개 = %d\n", "마카롱", macaNum, macaPrice * macaNum);
		System.out.println("===================");
		int sum = tumPrice * tumNum + beenPrice * beenNum + macaPrice * macaNum;
		System.out.printf("%s: %d\n", "총합", sum);
	}

}
