package com.qrcode.test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;

public class BufferedImageHandler {

	public BufferedImage getSubBufferedImage(String srcPath){
		return this.getSubBufferedImage(new File(srcPath));
	}
	
	public BufferedImage getSubBufferedImage(File file){
		try {
			BufferedImage bufImg = ImageIO.read(file);
			int width = bufImg.getWidth();
			int heght = bufImg.getHeight();
			System.out.println("width="+width);;
			System.out.println("Height="+heght);;
			return bufImg.getSubimage(width-250, 50, 200, 200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void writeBufferedImage(BufferedImage bufImg, String formatName, String tarPath){
		 try {
			ImageIO.write(bufImg, formatName, new File(tarPath));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		BufferedImageHandler handler = new BufferedImageHandler();
		BufferedImage bufImg = handler.getSubBufferedImage("D:/QRcode/RL20161221000002.jpg");
		handler.writeBufferedImage(bufImg, "jpg", "D:/QRcode/jietu/"+new Date().getTime()+".jpg");
		System.out.println("处理成功===============");
	}
}
