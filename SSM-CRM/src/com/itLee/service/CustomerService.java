package com.itLee.service;

import java.util.List;

import com.itLee.pojo.BaseDict;
import com.itLee.pojo.Customer;
import com.itLee.pojo.QueryVo;

public interface CustomerService {
	//高级查询下拉列表
	public List<BaseDict> findDictByCode(String code);
	
	public List<Customer> findCustomerByVo(QueryVo vo);
	
	public Integer findCustomerByVoCount(QueryVo vo);
}
