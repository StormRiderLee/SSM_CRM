package com.itLee.dao;

import java.util.List;

import com.itLee.pojo.BaseDict;

public interface DictMapper {
	public List<BaseDict> findDictByCode(String code);
}
