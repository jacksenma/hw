package edu.nju.hw.model;

import java.util.List;

public class Page<T> {
	private int pageNum;//��ǰҳ��
	private int numPerPage;//ÿҳ����
	private int totalNum;//������
	private int totalPage;//��ҳ��
	private List<T> obj;//��ǰҳ��Ҫ������
	
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