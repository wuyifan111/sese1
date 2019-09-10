package com.zb.fallback;

import com.zb.pojo.Pay;

import com.zb.client.RestPayClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class PayClientFallBack implements RestPayClient {


    @Override
    public Pay getPayById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Pay>	getPayListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getPayCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddPay(Pay pay)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyPay(Pay pay)throws Exception{
        return null;
    }
}
