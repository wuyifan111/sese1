package com.zb.client;
import com.zb.pojo.Gtype;

import com.zb.fallback.GtypeClientFallBack;
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
@FeignClient(name = "my-goods-ticket", fallback = GtypeClientFallBack.class)
public interface RestGtypeClient {
@RequestMapping(value = "/getGtypeById",method = RequestMethod.POST)
public Gtype getGtypeById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getGtypeListByMap",method = RequestMethod.POST)
public List<Gtype>	getGtypeListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getGtypeCountByMap",method = RequestMethod.POST)
public Integer getGtypeCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddGtype",method = RequestMethod.POST)
public Integer qdtxAddGtype(@RequestBody Gtype gtype)throws Exception;

@RequestMapping(value = "/qdtxModifyGtype",method = RequestMethod.POST)
public Integer qdtxModifyGtype(@RequestBody Gtype gtype)throws Exception;
}

