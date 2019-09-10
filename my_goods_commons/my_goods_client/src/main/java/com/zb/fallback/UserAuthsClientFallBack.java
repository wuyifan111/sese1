package com.zb.fallback;

import com.zb.pojo.UserAuths;

import com.zb.client.RestUserAuthsClient;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Map;
@Component
public class UserAuthsClientFallBack implements RestUserAuthsClient {


    @Override
    public UserAuths getUserAuthsById(Long id)throws Exception{
        return null;
    }

    @Override
    public List<UserAuths>	getUserAuthsListByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer getUserAuthsCountByMap(Map<String,Object> param)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxAddUserAuths(UserAuths userAuths)throws Exception{
        return null;
    }

    @Override
    public Integer qdtxModifyUserAuths(UserAuths userAuths)throws Exception{
        return null;
    }
}
