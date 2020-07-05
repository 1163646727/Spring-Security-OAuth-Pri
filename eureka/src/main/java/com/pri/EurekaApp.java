package com.pri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * className: EurekaApp <BR>
 * description: Eureka 启动类<BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/7/5 20:46 <BR>
 * version 1.0 jdk1.8 <BR>
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp {
    public static void main(String[] args) {
        SpringApplication.run (EurekaApp.class,args);

    }
}
