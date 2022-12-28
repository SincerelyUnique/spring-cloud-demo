package com.buba.springcloud.dao;

import com.buba.springcloud.pojo.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * <code>PaymentDao</code>
 * </p>
 * Description:
 *
 * @author: jalchu
 * @date: 12/28/2022
 **/
@Mapper
@Repository
public interface PaymentDao {
    int create(Payment payment);
    Payment queryById(@Param("id")long id);
}
