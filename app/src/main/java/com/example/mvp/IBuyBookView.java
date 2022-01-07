package com.example.mvp;

//View
//主要包含了一些Acticity的一系列UI操作
public interface IBuyBookView {

    void showToast(String str);     //提示Toast

    void refreshAdapter();      //刷新适配器

    void onEmpty();
}
