package com.zb.fallback;

import com.zb.pojo.OrderDb;

import com.zb.client.RestOrderDbClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class OrderDbClientFallBack implements RestOrderDbClient {


    @Override
    public OrderDb getOrderDbById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<OrderDb>	getOrderDbListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getOrderDbCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddOrderDb(OrderDb orderDb)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyOrderDb(OrderDb orderDb)throws Exception{
        return null;
    }
}
