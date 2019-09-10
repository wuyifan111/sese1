package com.zb.fallback;

import com.zb.pojo.Buyer;

import com.zb.client.RestBuyerClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class BuyerClientFallBack implements RestBuyerClient {


    @Override
    public Buyer getBuyerById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Buyer>	getBuyerListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getBuyerCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddBuyer(Buyer buyer)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyBuyer(Buyer buyer)throws Exception{
        return null;
    }
}
