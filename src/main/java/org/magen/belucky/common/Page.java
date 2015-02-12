package org.magen.belucky.common;

/**
 * 分页组件
 * @date 2015年2月12日
 * @author shenzl
 */
public class Page {
	/**
	 * 每页记录数,默认5
	 */
	private int pageSize = 5;  
	/**
	 * 当前页数,初始化1
	 */
	private int currentPage = 1;   
	/**
	 * 总的记录数
	 */
	private int totalSize;  
	/**
	 * 总的页数
	 */
	private int totalPage;  

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
}
