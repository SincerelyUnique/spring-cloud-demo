package com.buba.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * <p>
 * <code>EurekaMain</code>
 * </p>
 * Description:
 *
 * @author: jalchu
 * @date: 12/28/2022
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain.class, args);
    }
}
