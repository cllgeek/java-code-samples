package com.geekjc.springbootmybatisplus.orderInfo.entity;

import com.baomidou.mybatisplus.samples.generator.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * ???
 * </p>
 *
 * @author ll
 * @since 2019-10-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class OrderInfo extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * ???
     */
    private String orderName;

    /**
     * ????
     */
    private String orderAddress;


}
