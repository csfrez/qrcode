package com.image.test;

public class Test {
	public static void main(String[] args) {
		double div = 0.3170014076337711;
		double amount = 20154.39;
		double divAmount = div*amount;
		System.out.println(divAmount);
		
		
		//File file = new File("/wls/filesave/document/ddpm_image/image_document/2017/0213/ZZS0420170213002/10000023362622.jpg");
		
		String path = "/wls/filesave/document/ddpm_image/image_document/2017/0213/ZZS0420170213002/10000023362622.jpg";
		String s = path.substring(0, path.lastIndexOf("/") +1 );
		String b = path.substring(path.lastIndexOf("."));
		System.out.println(path);
		System.out.println(s);
		System.out.println(b);
	}
}
