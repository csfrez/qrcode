package com.zxing.test;

import java.io.File;
import java.util.Hashtable;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;

public class TestEncode {

	 public static void main(String []args)throws Exception{
	       
	        int width = 100;
	        int height = 100;
	        String format = "jpg";
	        /*
	        for(int i=0; i< 10; i++){
	        	String text = "200"+i;
	        	
	        	JSONObject json = new JSONObject();
	        	json.put("type", "02");
	        	json.put("code", text);
	        	
	        	Map<EncodeHintType, String> hints = new Hashtable<>();
	        	hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
	        	BitMatrix bitMatrix = new MultiFormatWriter().encode(json.toJSONString(), BarcodeFormat.QR_CODE, width, height, hints);
	        	File outputFile = new File("D:/QRcode/code/"+text+".jpg");
	        	MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
	        	System.out.println("制作成功：text=" + text);
	        	
	        }
	        */
	        
	       for(int i=10; i< 20; i++){
	        	String text = "80";
	        	text = text + i;
	        	JSONObject json = new JSONObject();
	        	json.put("type", "01");
	        	json.put("code", text);
	        	Map<EncodeHintType, String> hints = new Hashtable<>();
	        	hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
	        	BitMatrix bitMatrix = new MultiFormatWriter().encode(json.toJSONString(), BarcodeFormat.QR_CODE, width, height, hints);
	        	File outputFile = new File("D:/QRcode/0207/"+text+".jpg");
	        	MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
	        	System.out.println("制作成功：text=" + text);
	        }
	       /* 
	        String text = "99";
        	JSONObject json = new JSONObject();
        	json.put("type", "01");
        	json.put("code", text);
        	Map<EncodeHintType, String> hints = new Hashtable<>();
        	hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
        	BitMatrix bitMatrix = new MultiFormatWriter().encode(json.toJSONString(), BarcodeFormat.QR_CODE, width, height, hints);
        	File outputFile = new File("D:/QRcode/0207/"+text+".jpg");
        	MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
        	System.out.println("制作成功：text=" + text);*/
	    }
}
