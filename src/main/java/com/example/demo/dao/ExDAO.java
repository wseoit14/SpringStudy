package com.example.demo.dao;

import java.sql.SQLException;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.vo.ExVO;

@Mapper
public interface ExDAO {
	ExVO now()throws SQLException;
}
