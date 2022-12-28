package com.buba.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * <p>
 * <code>Payment</code>
 * </p>
 * Description:
 *
 * @author: jalchu
 * @date: 12/28/2022
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Payment {
    private Long id;
    // 微服务 一个服务对应一个数据库，同一个信息可能存在不同的数据库
    private  String serial;
}
