package com.geekjc.springbootmybatisplus.orderInfo.service.impl;

import com.geekjc.springbootmybatisplus.orderInfo.entity.OrderInfo;
import com.geekjc.springbootmybatisplus.orderInfo.mapper.OrderInfoMapper;
import com.geekjc.springbootmybatisplus.orderInfo.service.IOrderInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * ??? 服务实现类
 * </p>
 *
 * @author ll
 * @since 2019-10-15
 */
@Service
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements IOrderInfoService {

}
