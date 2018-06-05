package com.itLee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itLee.dao.CustomerMapper;
import com.itLee.dao.DictMapper;
import com.itLee.pojo.BaseDict;
import com.itLee.pojo.Customer;
import com.itLee.pojo.QueryVo;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private DictMapper dictMapper;
	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public List<BaseDict> findDictByCode(String code) {
		List<BaseDict> list = dictMapper.findDictByCode(code);
		return list;
	}

	@Override	
	public List<Customer> findCustomerByVo(QueryVo vo) {
		List<Customer> list = customerMapper.findCustomerByVo(vo);
		return list;
	}

	@Override
	public Integer findCustomerByVoCount(QueryVo vo) {
		Integer count = customerMapper.findCustomerByVoCount(vo);
		return count;
	}

	@Override
	public Customer findCustomerById(Long id) {
		Customer customer = customerMapper.findCustomerById(id);
		return customer;
	}

	@Override
	public void updateCustomerById(Customer customer) {
		customerMapper.updateCustomerById(customer);
	}
	
	

}





