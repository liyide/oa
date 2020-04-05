package com.csdj;

import com.csdj.erpdao.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ErpWebApplication {


    public static void main(String[] args) {
        SpringApplication.run(ErpWebApplication.class, args);
    }

}
