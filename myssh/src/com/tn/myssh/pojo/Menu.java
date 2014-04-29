package com.tn.myssh.pojo;

/**
 * Menu entity. 
 * @author 
 */

public class Menu implements java.io.Serializable {

	// Fields

	private Integer menuId;
	private String menuName;
	private String menuDetail;
	private String menuDesc;
	private String menuUrl;
	private Integer parentId;

	// Constructors

	/** default constructor */
	public Menu() {
	}

	/** full constructor */
	public Menu(String menuName, String menuDetail, String menuDesc,
			String menuUrl) {
		this.menuName = menuName;
		this.menuDetail = menuDetail;
		this.menuDesc = menuDesc;
		this.menuUrl = menuUrl;
	}

	// Property accessors

	public Integer getMenuId() {
		return this.menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuDetail() {
		return this.menuDetail;
	}

	public void setMenuDetail(String menuDetail) {
		this.menuDetail = menuDetail;
	}

	public String getMenuDesc() {
		return this.menuDesc;
	}

	public void setMenuDesc(String menuDesc) {
		this.menuDesc = menuDesc;
	}

	public String getMenuUrl() {
		return this.menuUrl;
	}

	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

}