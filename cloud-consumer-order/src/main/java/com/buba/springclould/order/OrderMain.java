package com.buba.springclould.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>
 * <code>OrderMain</code>
 * </p>
 * Description:
 *
 * @author: jalchu
 * @date: 12/28/2022
 **/
@SpringBootApplication
@EnableEurekaClient
public class OrderMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);
    }
}
