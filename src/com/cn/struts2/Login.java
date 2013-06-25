package com.cn.struts2;

import com.cn.bean.user;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport{
	private static final String SUCCESS="success";
	private static final String FAIl="fail";
	private user u;
	/**
	 * 验证
	 */
	@Override
	public void validate() {
	System.out.println("先执行验证");
	if(u.getPasswrod()==null||u.getUsername()==null){
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<,,,,,,,");
		addFieldError("myerroe", "请输入用户名");
	}
	
	}
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
	
	public void setU(user u) {
		this.u = u;
	}
	public user getU() {
		return u;
	}

}
