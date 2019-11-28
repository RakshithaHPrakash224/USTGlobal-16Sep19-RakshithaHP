package com.ustglobal.empappdao;

import java.util.List;

import com.ustglobal.empappdto.EmployeeBean;

public interface EmployeeDAO {
	public List<EmployeeBean> getAllEmployeeData();
	public EmployeeBean searchemployeeData(int id);
//	public int insertEmployeeData(EmployeeBean bean);
//	public int updateEmployeeData(EmployeeBean bean);
//	public int deleteEmployeeData(int id);
}
