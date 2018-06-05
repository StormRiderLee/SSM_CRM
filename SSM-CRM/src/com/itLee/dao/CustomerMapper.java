package com.itLee.dao;

import java.util.List;

import com.itLee.pojo.Customer;
import com.itLee.pojo.QueryVo;

public interface CustomerMapper {
	public List<Customer> findCustomerByVo(QueryVo vo);
	
	public Integer findCustomerByVoCount(QueryVo vo);
	
}
