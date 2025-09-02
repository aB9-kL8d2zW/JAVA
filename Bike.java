package javaday2;

public class Bike {
	String BkName;
	int BkNum;
	double Bkratting;
	int Bkcost;
	public static void main(String[]args) {
		Bike B1 = new Bike();
		B1.BkName = "gt";
		B1.BkNum = 12334;
		B1.Bkratting = 2.9;
		B1.Bkcost = 120030;
		System.out.println("BIKE NAME :"+B1.BkName);
		System.out.println("BIKE NUMBER :" +B1.BkNum);
		System.out.println("BIKE RATTING  :"+B1.Bkratting);
		System.out.println("BIKE COST :"+B1.Bkcost);
		Bike B2 = new Bike();
		B2.BkName = "hero";
		B2.BkNum = 1233;
		B2.Bkratting = 6.9;
		B2.Bkcost = 12030;
		System.out.println("BIKE NAME :"+B2.BkName);
		System.out.println("BIKE NUMBER :" +B2.BkNum);
		System.out.println("BIKE RATTING  :"+B2.Bkratting);
		System.out.println("BIKE COST :"+B2.Bkcost);
	
	

}
}
