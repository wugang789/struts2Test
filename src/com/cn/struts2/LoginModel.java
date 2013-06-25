package com.cn.struts2;

import com.cn.bean.user;
import com.opensymphony.xwork2.ModelDriven;

public class LoginModel implements ModelDriven<user> {
	private static final String SUCCESS="success";
	private static final String FAIl="fail";
	private user u=new user();
	public String show(){
		System.out.println("...................");
     		if(u.getUsername().equals("admin")&&u.getPasswrod().equals("admin")){
     			System.out.println(">..............");
     			return SUCCESS;
     		}else{
     			System.out.println(">............kkkkk..");
     			return  FAIl;
     		}
	}
	@Override
	public user getModel() {
		return u;
	}

}
