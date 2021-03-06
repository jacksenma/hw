package edu.nju.hw.model;

import java.util.List;

public class Page<T> {
	private int pageNum;//当前页码
	private int numPerPage;//每页条数
	private int totalNum;//总条数
	private int totalPage;//总页数
	private List<T> obj;//当前页需要的数据
	
	public int getPageNum(){
		return pageNum;
	}
	
	public void setPageNum(int pageNum){
		this.pageNum=pageNum;
	}
	
	public int getNumPerPage(){
		return numPerPage;
	}
	
	public void setNumPerPage(int numPerPage){
		this.numPerPage=numPerPage;
	}
	
	public int getTotalNum(){
		return totalNum;
	}
	
	public void setTotalNum(int totalNum){
		this.totalNum=totalNum;
	}
	
	public int getTotalPage(){
		return totalPage;
	}
	
	public void setTotalPage(int totalPage){
		this.totalPage=totalPage;
	}
	
	public List<T> getObj(){
		return obj;
	}
	
	public void setObj(List<T> obj){
		this.obj=obj;
	}
}
