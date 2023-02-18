package com.atiguigu.gulimall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、整合MyBatis-Plus
 * 		1）、导入依赖
 * 		2）、配置
 * 			1.配置数据源：
 * 				1）、导入数据库的驱动
 * 				2）、创建application.yml,配置数据源相关信息
 * 			2.配置MyBatis-Plus;
 * 				1）、使用@MapperScan
 * 				2）、告诉MyBatis-Plus，sql映射文件位置
 *
 */
@MapperScan("com.atiguigu.gulimall.member.dao")
@SpringBootApplication
public class GulimallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallMemberApplication.class, args);
	}

}
