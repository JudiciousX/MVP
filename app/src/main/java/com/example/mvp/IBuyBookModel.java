package com.example.mvp;

import java.util.List;

//Model
public interface IBuyBookModel {

    //获取测试数据
    void getTestData();

    //获取本地adapter数据
    List<BuyBookBean> getAdapterData();
}
