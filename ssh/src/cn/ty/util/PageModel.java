package cn.ty.util;

public class PageModel {
	
	private int pageSize;//一页有多少条数据
	private int offset;//当前第几页
	
	
	
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	
	
}
