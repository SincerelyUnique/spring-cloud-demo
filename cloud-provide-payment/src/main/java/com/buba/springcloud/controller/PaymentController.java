package com.buba.springcloud.controller;

import com.buba.springcloud.pojo.CommonResult;
import com.buba.springcloud.pojo.Payment;
import com.buba.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * <code>PaymentController</code>
 * </p>
 * Description:
 *
 * @author: jalchu
 * @date: 12/28/2022
 **/
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private int serverPort;

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment dept){
        int i = paymentService.create(dept);
        log.info("***************插入成功*******"+i);
        if(i>0){
            return new CommonResult(200,"插入数据库成功" + serverPort, i);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id){
        Payment payment = paymentService.queryById(id);
        log.info("***************查询成功*********"+payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功" + serverPort,payment);
        }else{
            return new CommonResult(444,"查询失败",null);
        }
    }
}
