package com.example.ibesteeth.gjj_dagger_demo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 作者：iBesteeth on 2016/9/19 16:32
 * 邮箱：gujingjing@ibesteeth.com
 */

@Singleton
// 如果这里有多个 可以用逗号隔开，继续追加
//Component 指定了他具体的依赖的类。
@Component(modules = {ApiServiceModule.class,ToastBeanModule.class})

public interface AppComponent {

    ApiService getService();
//    ApiService getService(int id,String name);

    ToastBean getToastBean();
}
