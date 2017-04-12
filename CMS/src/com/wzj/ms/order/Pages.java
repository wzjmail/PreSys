package com.wzj.ms.order;

public class Pages
{
  private int pageNum = 1;
  private int pageSize = 10;
  private long total;
  private int pages;
  private String pageFooter;

  public Pages()
  {
  }

  public Pages(int pageNum, int pageSize, long total, int pages)
  {
    this.pageNum = pageNum;
    this.pageSize = pageSize;
    this.total = total;
    this.pages = pages;
  }

  public Pages(int pageNum, int pageSize)
  {
    this.pageNum = pageNum;
    this.pageSize = pageSize;
  }

  public int getPageNum()
  {
    return this.pageNum;
  }

  public void setPageNum(int pageNum) {
    this.pageNum = pageNum;
  }

  public int getPageSize() {
    return this.pageSize;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }

  public long getTotal() {
    return this.total;
  }

  public void setTotal(long total) {
    this.total = total;
  }

  public int getPages() {
    return this.pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }
  public String getPageFooter() {
    StringBuffer sb = new StringBuffer();
    if ((this.pages > 1) && (this.pageNum > 1))
      sb.append("<li><a class='page' name='" + (this.pageNum - 1) + "'>��һҳ</a></li>");
    else {
      sb.append("<li class='disabled'><a>��һҳ</a></li>");
    }
    int page = (this.pageNum - 1) / 5 * 5 + 5 > this.pages ? this.pages : (this.pageNum - 1) / 5 * 5 + 5;

    for (int i = (this.pageNum - 1) / 5 * 5 + 1; i <= page; i++) {
      sb.append("<li");
      if (i == this.pageNum) {
        sb.append(" class='active' ");
      }
      sb.append("><a class='page' name='" + i + "'>" + i + "</a></li>");
    }
    if ((this.pages > 1) && (this.pageNum < this.pages))
      sb.append("<li><a class='page' name='" + (this.pageNum + 1) + "'>��һҳ</a></li>");
    else {
      sb.append("<li class='disabled'><a>��һҳ</a></li>");
    }

    String pFooter = "<li><a>��" + this.pageNum + "ҳ/��" + this.pages + "ҳ</a></li>" + 
      "<li><a>ÿҳ" + this.pageSize + "��/��" + this.total + "��</a></li>" + 
      "<li><a class='page' name='1'>��ҳ</a></li><li>" + 
      "<input type='hidden' name='pageNum' id='curpage' value=" + this.pageNum + ">" + 
      sb.toString() + "<li><a class='page' name='" + this.pages + "'>ĩҳ</a><li>";

    return pFooter;
  }

  public String toString()
  {
    return "Pages [pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", total=" + this.total + ", pages=" + this.pages + "]";
  }
}