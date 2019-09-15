package com.zb.client;
import com.zb.pojo.Gqgmessage;

import com.zb.fallback.GqgmessageClientFallBack;
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
@FeignClient(name = "my-goods-ticket", fallback = GqgmessageClientFallBack.class)
public interface RestGqgmessageClient {
@RequestMapping(value = "/getGqgmessageById",method = RequestMethod.POST)
public Gqgmessage getGqgmessageById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getGqgmessageListByMap",method = RequestMethod.POST)
public List<Gqgmessage>	getGqgmessageListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getGqgmessageCountByMap",method = RequestMethod.POST)
public Integer getGqgmessageCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddGqgmessage",method = RequestMethod.POST)
public Integer qdtxAddGqgmessage(@RequestBody Gqgmessage gqgmessage)throws Exception;

@RequestMapping(value = "/qdtxModifyGqgmessage",method = RequestMethod.POST)
public Integer qdtxModifyGqgmessage(@RequestBody Gqgmessage gqgmessage)throws Exception;
}

