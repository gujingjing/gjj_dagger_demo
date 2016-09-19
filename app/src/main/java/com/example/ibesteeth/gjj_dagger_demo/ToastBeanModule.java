package com.example.ibesteeth.gjj_dagger_demo;

import dagger.Module;
import dagger.Provides;

/**
 * 作者：iBesteeth on 2016/9/19 17:31
 * 邮箱：gujingjing@ibesteeth.com
 */
@Module
public class ToastBeanModule {

//    @Provides
//    ToastBean getToastBean(String message){
//        return new ToastBean(message);
//    }
    @Provides
    ToastBean getToastBean(){
        return new ToastBean();
    }
}
