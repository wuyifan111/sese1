package com.zb.pojo;
import java.io.Serializable;
import java.util.Date;
/***
*   
*/
public class Users implements Serializable {
    //
    private Long uid;
    //
    private Long upwd;
    //
    private String nickname;
    //
    private String name;
    //
    private String cardId;
    //
    private Date birthday;
    //
    private String phone;
    //
    private String email;
    //
    private String address;
    //get set 方法
    public void setUid (Long  uid){
        this.uid=uid;
    }
    public  Long getUid(){
        return this.uid;
    }
    public void setUpwd (Long  upwd){
        this.upwd=upwd;
    }
    public  Long getUpwd(){
        return this.upwd;
    }
    public void setNickname (String  nickname){
        this.nickname=nickname;
    }
    public  String getNickname(){
        return this.nickname;
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
    public void setBirthday (Date  birthday){
        this.birthday=birthday;
    }
    public  Date getBirthday(){
        return this.birthday;
    }
    public void setPhone (String  phone){
        this.phone=phone;
    }
    public  String getPhone(){
        return this.phone;
    }
    public void setEmail (String  email){
        this.email=email;
    }
    public  String getEmail(){
        return this.email;
    }
    public void setAddress (String  address){
        this.address=address;
    }
    public  String getAddress(){
        return this.address;
    }
}
