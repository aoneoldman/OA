package cn.op;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.op.dao")
@SpringBootApplication
public class OaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OaServerApplication.class, args);
	}

}
