package com.zhoyou100.util;

import java.util.List;



/**
* @author ���� E-mail:
* @version ����ʱ�䣺2018��12��14�� ����5:47:26
* ��˵��
*/

public class PageShow {

	private List list;//Ҫ���ص�ĳһҳ�ļ�¼�б� 

	private Long allRow;//�ܼ�¼�� 
	private long totalPage;//��ҳ�� 
	private int currentPage;//��ǰҳ 
	private int pageSize;//ÿҳ��¼�� 

	private boolean isFirstPage;//�Ƿ�Ϊ��һҳ 
	private boolean isLastPage;//�Ƿ�Ϊ���һҳ 
	private boolean hasPreviousPage;//�Ƿ���ǰһҳ 
	private boolean hasNextPage;//�Ƿ�����һҳ 


	public List getList() { 
	return list; 
	} 
	public void setList(List list) { 
	this.list = list; 
	} 
	public Long getAllRow() { 
	return allRow; 
	} 
	public void setAllRow(Long allRow2) { 
	this.allRow = allRow2; 
	} 
	public long getTotalPage() { 
	return totalPage; 
	} 
	public void setTotalPage(long totalPage2) { 
	this.totalPage = totalPage2; 
	} 
	public int getCurrentPage() { 
	return currentPage; 
	} 
	public void setCurrentPage(int currentPage) { 
	this.currentPage = currentPage; 
	} 
	public int getPageSize() { 
	return pageSize; 
	} 
	public void setPageSize(int pageSize) { 
	this.pageSize = pageSize; 
	} 

	/** *//** 
	* ��ʼ����ҳ��Ϣ 
	*/ 
	public void init(){ 
	this.isFirstPage = isFirstPage(); 
	this.isLastPage = isLastPage(); 
	this.hasPreviousPage = isHasPreviousPage(); 
	this.hasNextPage = isHasNextPage(); 
	} 

	/** *//** 
	* �����ж�ҳ����Ϣ,ֻ��getter����(is����)���� 
	* @return 
	*/ 

	public boolean isFirstPage() { 
	return currentPage == 1;// ���ǵ�ǰҳ�ǵ�1ҳ 
	} 
	public boolean isLastPage() { 
	return currentPage == totalPage;//�����ǰҳ�����һҳ 
	} 
	public boolean isHasPreviousPage() { 
	return currentPage != 1;//ֻҪ��ǰҳ���ǵ�1ҳ 
	} 
	public boolean isHasNextPage() { 
	return currentPage != totalPage;//ֻҪ��ǰҳ�������1ҳ 
	} 


	/** *//** 
	* ������ҳ��,��̬����,���ⲿֱ��ͨ���������� 
	* @param pageSize ÿҳ��¼�� 
	* @param allRow2 �ܼ�¼�� 
	* @return ��ҳ�� 
	*/ 
	public static long countTotalPage(final int pageSize,final Long allRow2){ 
	long totalPage = allRow2 % pageSize == 0 ? allRow2/pageSize : allRow2/pageSize+1; 
	return totalPage; 
	} 

	/** *//** 
	* ���㵱ǰҳ��ʼ��¼ 
	* @param pageSize ÿҳ��¼�� 
	* @param currentPage ��ǰ�ڼ�ҳ 
	* @return ��ǰҳ��ʼ��¼�� 
	*/ 
	public static int countOffset(final int pageSize,final int currentPage){ 
	final int offset = pageSize*(currentPage-1); 
	return offset; 
	} 

	/** *//** 
	* ���㵱ǰҳ,��Ϊ0���������URL��û��"?page=",����1���� 
	* @param page ����Ĳ���(����Ϊ��,��0,�򷵻�1) 
	* @return ��ǰҳ 
	*/ 
	public static int countCurrentPage(int page){ 
	final int curPage = (page==0?1:page); 
	return curPage; 
	} 
	
}
