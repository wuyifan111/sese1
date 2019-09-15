package com.zb.client;
import com.zb.pojo.OrderDb;

import com.zb.fallback.OrderDbClientFallBack;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
/**
* Created by shang-pc on 2018/5/15.
*/
@FeignClient(name = "my-goods-order", fallback = OrderDbClientFallBack.class)
public interface RestOrderDbClient {
@RequestMapping(value = "/getOrderDbById",method = RequestMethod.POST)
public OrderDb getOrderDbById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getOrderDbListByMap",method = RequestMethod.POST)
public List<OrderDb>	getOrderDbListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getOrderDbCountByMap",method = RequestMethod.POST)
public Integer getOrderDbCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddOrderDb",method = RequestMethod.POST)
public Integer qdtxAddOrderDb(@RequestBody OrderDb orderDb)throws Exception;

@RequestMapping(value = "/qdtxModifyOrderDb",method = RequestMethod.POST)
public Integer qdtxModifyOrderDb(@RequestBody OrderDb orderDb)throws Exception;
}

