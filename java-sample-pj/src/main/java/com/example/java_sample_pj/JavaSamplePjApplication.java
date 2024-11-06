package com.example.java_sample_pj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.example.java_sample_pj.domain.mapper")
public class JavaSamplePjApplication {
    public static void main(String[] args) {
			SpringApplication.run(JavaSamplePjApplication.class, args);
    }
}
