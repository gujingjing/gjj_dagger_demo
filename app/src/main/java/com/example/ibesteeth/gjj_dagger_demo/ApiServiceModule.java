package com.example.ibesteeth.gjj_dagger_demo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 作者：iBesteeth on 2016/9/19 16:26
 * 邮箱：gujingjing@ibesteeth.com
 */
//apiservice的工厂类
@Module
public class ApiServiceModule {



    @Provides
    @Singleton
    ApiService provideApiServiceNull() {
        return new ApiService();
    }
}
