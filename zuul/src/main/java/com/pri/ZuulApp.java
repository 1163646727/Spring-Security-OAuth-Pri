package com.pri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * className: ZuulApp <BR>
 * description: <BR>
 * remark: <BR>
 * auther: ChenQi <BR>
 * date: 2020/7/5 21:14 <BR>
 * version 1.0 jdk1.8 <BR>
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulApp {
    public static void main(String[] args) {
        SpringApplication.run (ZuulApp.class,args);
    }
}
