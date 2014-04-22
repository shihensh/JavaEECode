package cn.ty.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_dept")
public class Dept {

	/**部门id */
	private Integer id;
	/**部门名称*/
	private String deptName;
	/**部门职能*/
	private String deptDesc;
	/**上级部门id*/
	private Integer parentId;
	
	
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptDesc() {
		return deptDesc;
	}
	public void setDeptDesc(String deptDesc) {
		this.deptDesc = deptDesc;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
	
	
}
