package com.wzj.ms.goods;

public class Goods extends Common
{
	
	  private double price;
	  private int storage;
	private String image;
	private int newNum;
	private int newNumB;
	private int num;
	private int numAll;
	private int number;
	private String password;
	private int role;
	private String session;
	private String gname;
	
	  public String getGname() {
		return gname;
	}


	public void setGname(String gname) {
		this.gname = gname;
	}


	public int getNumAll() {
		return numAll;
	}


	public String getPassword() {
		return password;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getStorage() {
		return storage;
	}


	public void setStorage(int storage) {
		this.storage = storage;
	}


	public String getImage() {
	    return this.image;
	  }


	public int getNewNum()
	  {
	    return this.newNum;
	  }


	public int getNewNumB() {
	    return this.newNumB;
	  }


	public int getNum() {
	    return this.num;
	  }


	public int getNumber() {
	    return this.number;
	  }


	public int getRole() {
	    return this.role;
	  }


	public String getSession() {
	    return this.session;
	  }


	public void setImage(String image) {
	    this.image = image;
	  }


	public void setNewNum(int newNum) {
	    this.newNum = newNum;
	  }


	public void setNewNumB(int newNumB) {
	    this.newNumB = newNumB;
	  }


	public void setNum(int num) {
	    this.num = num;
	  }


	public void setNumAll(int numAll) {
	    this.numAll = numAll;
	  }


	public void setNumber(int number) {
	    this.number = number;
	  }


	public void setPassword(String password) {
	    this.password = password;
	  }


	public void setRole(int role) {
	    this.role = role;
	  }


	public void setSession(String session) {
	    this.session = session;
	  }


	public String toString() {
	    return "Goods[session=" + this.session +", id=" + this.getId()  +  ", gname=" + this.getGname()  + ", type=" + this.getType()  + 
	      ",price=" + this.price +",storage=" + this.storage+"]";
	  }
	

	
	 
}