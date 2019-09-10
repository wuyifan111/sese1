package com.zb.client;
import com.zb.pojo.Gticket;

import com.zb.fallback.GticketClientFallBack;
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
@FeignClient(name = "my-house-private", fallback = GticketClientFallBack.class)
public interface RestGticketClient {
@RequestMapping(value = "/getGticketById",method = RequestMethod.POST)
public Gticket getGticketById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getGticketListByMap",method = RequestMethod.POST)
public List<Gticket>	getGticketListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getGticketCountByMap",method = RequestMethod.POST)
public Integer getGticketCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddGticket",method = RequestMethod.POST)
public Integer qdtxAddGticket(@RequestBody Gticket gticket)throws Exception;

@RequestMapping(value = "/qdtxModifyGticket",method = RequestMethod.POST)
public Integer qdtxModifyGticket(@RequestBody Gticket gticket)throws Exception;
}

