package cn.th.jump.demoboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@Configuration
//@ComponentScan
//@EnableTransactionManagement
@SpringBootApplication // 此注解替代上述三个注解
@EnableTransactionManagement // 开启事务支持
@MapperScan(basePackages = "cn.th.jump.demoboot.dao")
public class DemobootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemobootApplication.class, args);
	}

}
