package com.zhuoxin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XuechengPlusContentServiceApplication {

    public static void main(String[] args) {
       try{
           SpringApplication.run(XuechengPlusContentServiceApplication.class, args);
       }catch (Exception e){
           e.printStackTrace();
       }
    }

}
