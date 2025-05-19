package com.example.demo.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.example.demo.dao.ExDAO;
import com.example.demo.vo.ExVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ExService {
	private final ExDAO dao;
	
	public ExVO now() {
		ExVO vo = null;
		try {
			vo = dao.now();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}
}
