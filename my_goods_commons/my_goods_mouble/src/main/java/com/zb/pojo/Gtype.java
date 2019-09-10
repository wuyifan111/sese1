package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Gtype implements Serializable {
    //
    private Long Typeid;
    //
    private String Typename;
    //get set 方法
    public void setTypeid (Long  Typeid){
        this.Typeid=Typeid;
    }
    public  Long getTypeid(){
        return this.Typeid;
    }
    public void setTypename (String  Typename){
        this.Typename=Typename;
    }
    public  String getTypename(){
        return this.Typename;
    }
}
