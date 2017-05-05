package com.wzj.ms.order;

public class Order extends Common
{
	  private String atime;
	  public String getAtime() {
		return atime;
	}


	public void setAtime(String atime) {
		this.atime = atime;
	}


	public String getCtime() {
		return ctime;
	}


	public void setCtime(String ctime) {
		this.ctime = ctime;
	}


	private String ctime;
	  private double price;
	  private int yearcount;
	  public int getYearcount() {
		return yearcount;
	}


	public void setYearcount(int yearcount) {
		this.yearcount = yearcount;
	}


	private int storage;
	private int custype;
	public int getCustype() {
		return custype;
	}


	public void setCustype(int custype) {
		this.custype = custype;
	}


	private String image;
	private int newNum;
	private int newNumB;
	private int num;
	private int amount;
	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	private int numAll;
	private int number;
	private String password;  private String order2id;
	private int role;	private int ty;
	private String session;
	
	  public double getPrice() {
		return price;
	}


	public int getTy() {
		return ty;
	}


	public void setTy(int ty) {
		this.ty = ty;
	}


	public int getNumAll() {
		return numAll;
	}


	public String getPassword() {
		return password;
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
	    return "Order [" + "orderid=" + this.getOrderid() + "gname=" + this.getGname() +"cname=" + this.getCname() +", goodsid=" + getGoodsid() + 
	      ", cusid=" + getCusid() +  ", time=" + getTime() + ", state=" + getState() + ", oprice=" + getOprice() + ", nprice=" + getNprice()  + ", amount=" + getAmount()  + ", sign=" + getSign()  + ", type=" + getType() + ", cname=" + getCname() + ",gname=" + getGname()+"]                ";
	  }


	public String getOrder2id() {
		return order2id;
	}


	public void setOrder2id(String order2id) {
		this.order2id = order2id;
	}
	

	
	 
}