package com.buba.springcloud.service;

import com.buba.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * <code>PaymentService</code>
 * </p>
 * Description:
 *
 * @author: jalchu
 * @date: 12/28/2022
 **/
public interface PaymentService {
    int create(Payment payment);
    Payment queryById(@Param("id")long id);
}
