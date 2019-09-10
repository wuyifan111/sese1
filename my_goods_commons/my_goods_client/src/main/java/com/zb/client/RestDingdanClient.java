package com.zb.client;
import com.zb.pojo.Dingdan;

import com.zb.fallback.DingdanClientFallBack;
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
@FeignClient(name = "my-house-private", fallback = DingdanClientFallBack.class)
public interface RestDingdanClient {
@RequestMapping(value = "/getDingdanById",method = RequestMethod.POST)
public Dingdan getDingdanById(@RequestParam("id") Long id)throws Exception;

@RequestMapping(value = "/getDingdanListByMap",method = RequestMethod.POST)
public List<Dingdan>	getDingdanListByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/getDingdanCountByMap",method = RequestMethod.POST)
public Integer getDingdanCountByMap(@RequestParam Map<String,Object> param)throws Exception;

@RequestMapping(value = "/qdtxAddDingdan",method = RequestMethod.POST)
public Integer qdtxAddDingdan(@RequestBody Dingdan dingdan)throws Exception;

@RequestMapping(value = "/qdtxModifyDingdan",method = RequestMethod.POST)
public Integer qdtxModifyDingdan(@RequestBody Dingdan dingdan)throws Exception;
}

