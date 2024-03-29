package com.buba.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * <code>PayMentMain</code>
 * </p>
 * Description:
 *
 * @author: jalchu
 * @date: 12/28/2022
 **/
@SpringBootApplication
@EnableEurekaClient
public class PayMentMain {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain.class, args);
    }
}
