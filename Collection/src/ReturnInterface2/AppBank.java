package com.ReturnInterface2;

public class AppBank {

	Bank[] getBank() {
		Bank hdfc=new HDFC__Implemented();
		Bank sbi=new SBI__Implemented();
		Bank[] banks=new Bank[2];
		banks[0]=hdfc;
		banks[1]=sbi;
		return banks;	
	}
	public static void main(String[] ar) {
		AppBank ab=new AppBank();
		Bank[] bank=ab.getBank();
		bank[0].pay(10000);
		bank[1].pay(20000);
	} 
}
