package com.yb.client;

public class Mail implements Cloneable {
    @Override
    public Mail clone(){
        Mail mail=null;
        try {
            mail=(Mail)super.clone();
            //深度拷贝 需要对内对象进行单独拷贝
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return mail;
    }
}
