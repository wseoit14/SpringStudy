package com.example.demo.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DBConfig {
	DataSource dataSource() {
		HikariConfig config = new HikariConfig();
		config.setDriverClassName("org.mariadb.jdbc.Driver");
		config.setJdbcUrl("jdbc:mariadb://localhost:3306/jspdb");
		config.setUsername("jspuser");
		config.setPassword("123456");
		return new HikariDataSource(config);
	}
	
	SqlSessionFactoryBean sqlSessionFactoryBean() {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource());
		// ClassPathResource : 하나의 파일만 가능
		// PathMatchingResourcePatternResolver : 여러 개 파일 가능, 와일드 카드 적용 가능
//		try {
//			bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:/mappers/*.xml"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		bean.setMapperLocations(new ClassPathResource("mappers/mybatis-config.xml"));
		bean.setTypeAliasesPackage("com.example.demo.vo");
		return bean;
	}
	
}
