package edu.nju.hw.model;

import org.springframework.web.multipart.MultipartFile;

public class Test {
	private MultipartFile img;
	public MultipartFile getImg(){
		return img;
	}
	public void setImg(MultipartFile img){
		this.img=img;
	}
}
