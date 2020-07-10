package com.pri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * className: ServerAApp <BR>
 * description: <BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/7/10 1:02 <BR>
 * version 1.0 jdk1.8 <BR>
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ServerAApp {
    public static void main(String[] args) {
        SpringApplication.run (ServerAApp.class,args);
    }
}
