package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Gaddress implements Serializable {
    //
    private Long Addressid;
    //
    private String Addressname;
    //get set 方法
    public void setAddressid (Long  Addressid){
        this.Addressid=Addressid;
    }
    public  Long getAddressid(){
        return this.Addressid;
    }
    public void setAddressname (String  Addressname){
        this.Addressname=Addressname;
    }
    public  String getAddressname(){
        return this.Addressname;
    }
}
