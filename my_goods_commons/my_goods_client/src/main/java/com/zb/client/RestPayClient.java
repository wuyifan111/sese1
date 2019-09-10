package com.zb.client;
import com.zb.pojo.Pay;

import com.zb.fallback.PayClientFallBack;
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
@FeignClient(name = "my-house-private", fallback = PayClientFallBack.class)
public interface RestPayClient {
@RequestMapping(value = "/getPayById",method = RequestMethod.POST)
public Pay getPayById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getPayListByMap",method = RequestMethod.POST)
public List<Pay>	getPayListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getPayCountByMap",method = RequestMethod.POST)
public Integer getPayCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddPay",method = RequestMethod.POST)
public Integer qdtxAddPay(@RequestBody Pay pay)throws Exception;

@RequestMapping(value = "/qdtxModifyPay",method = RequestMethod.POST)
public Integer qdtxModifyPay(@RequestBody Pay pay)throws Exception;
}

