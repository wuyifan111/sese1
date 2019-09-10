package com.zb.client;
import com.zb.pojo.Buyer;

import com.zb.fallback.BuyerClientFallBack;
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
@FeignClient(name = "my-house-private", fallback = BuyerClientFallBack.class)
public interface RestBuyerClient {
@RequestMapping(value = "/getBuyerById",method = RequestMethod.POST)
public Buyer getBuyerById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getBuyerListByMap",method = RequestMethod.POST)
public List<Buyer>	getBuyerListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getBuyerCountByMap",method = RequestMethod.POST)
public Integer getBuyerCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddBuyer",method = RequestMethod.POST)
public Integer qdtxAddBuyer(@RequestBody Buyer buyer)throws Exception;

@RequestMapping(value = "/qdtxModifyBuyer",method = RequestMethod.POST)
public Integer qdtxModifyBuyer(@RequestBody Buyer buyer)throws Exception;
}

