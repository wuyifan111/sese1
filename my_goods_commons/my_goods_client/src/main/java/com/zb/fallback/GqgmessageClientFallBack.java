package com.zb.fallback;

import com.zb.pojo.Gqgmessage;

import com.zb.client.RestGqgmessageClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class GqgmessageClientFallBack implements RestGqgmessageClient {


    @Override
    public Gqgmessage getGqgmessageById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<Gqgmessage>	getGqgmessageListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getGqgmessageCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddGqgmessage(Gqgmessage gqgmessage)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyGqgmessage(Gqgmessage gqgmessage)throws Exception{
        return null;
    }
}
