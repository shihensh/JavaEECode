package cn.ty.action;

import java.util.List;

import cn.ty.domain.Dept;
import cn.ty.service.DeptService;

public class DeptAction extends BaseAction {

	
	private DeptService deptService;
	
	
	public DeptService getDeptService() {
		return deptService;
	}


	public void setDeptService(DeptService deptService) {
		this.deptService = deptService;
	}


	public String listDept(){
		
		
		List<Dept> deptList = deptService.listDept();
		for(Dept dept:deptList){
			
		}
		return "deptList";
	}
}
