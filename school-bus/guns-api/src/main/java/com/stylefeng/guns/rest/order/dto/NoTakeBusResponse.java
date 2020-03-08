/**
 * @program school-bus
 * @description: NoTakeBusResponse
 * @author: mf
 * @create: 2020/03/04 22:18
 */

package com.stylefeng.guns.rest.order.dto;

import com.stylefeng.guns.rest.common.AbstractResponse;
import lombok.Data;

import java.util.List;

@Data
public class NoTakeBusResponse extends AbstractResponse {
    // 当前页
    private Long currentPage;
    // 每页数量
    private Long pageSize;
    // 总量
    private Long total;
    // 总页
    private Long pages;
    List<OrderDto> orderDtos;
}