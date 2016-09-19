package com.example.ibesteeth.gjj_dagger_demo;

import android.app.Application;

/**
 * 作者：iBesteeth on 2016/9/19 17:24
 * 邮箱：gujingjing@ibesteeth.com
 */

public class ApiService {

    public int id=-1;
    public String name="ApiService";

    public ApiService(){

    }
    public ApiService( int id,String name){
        this.id=id;
        this.name=name;
    }
    public ApiService( String name){
        this.name=name;
    }
    public ApiService( ApiService name){

    }

}
