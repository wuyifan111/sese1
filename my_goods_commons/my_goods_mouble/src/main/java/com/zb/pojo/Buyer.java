package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Buyer implements Serializable {
    //
    private Long id;
    //
    private String name;
    //
    private String cardId;
    //
    private String address;
    //
    private Long uid;
    //get set 方法
    public void setId (Long  id){
        this.id=id;
    }
    public  Long getId(){
        return this.id;
    }
    public void setName (String  name){
        this.name=name;
    }
    public  String getName(){
        return this.name;
    }
    public void setCardId (String  cardId){
        this.cardId=cardId;
    }
    public  String getCardId(){
        return this.cardId;
    }
    public void setAddress (String  address){
        this.address=address;
    }
    public  String getAddress(){
        return this.address;
    }
    public void setUid (Long  uid){
        this.uid=uid;
    }
    public  Long getUid(){
        return this.uid;
    }
}
