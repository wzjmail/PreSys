package com.wzj.ms.order2;

public class Order2 extends Common {
	private String order2id;

	public String getOrder2id() {
		return order2id;
	}

	public void setOrder2id(String order2id) {
		this.order2id = order2id;
	}

	private double price;
	private int storage;
	private String image;
	private String pname;
	private String provid;

	public String getProvid() {
		return provid;
	}

	public void setProvid(String provid) {
		this.provid = provid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	private int newNum;
	private int newNumB;
	private int num;
	private int numAll;
	private int number;
	private String password;
	private int role;
	private int ty;
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

	public int getNewNum() {
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
		return "Order [" + "orderid=" + this.getOrderid() + "gname=" + this.getGname() + "cname=" + this.getCname()
				+ ", goodsid=" + getGoodsid() + ", cusid=" + getCusid() + ", time=" + getTime() + ", state="
				+ getState() + ", oprice=" + getOprice() + ", nprice=" + getNprice() + ", amount=" + getAmount()
				+ ", sign=" + getSign() + ", type=" + getType() + ", cname=" + getCname() + ",gname=" + getGname()
				+ "]                ";
	}

}