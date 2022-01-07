package com.example.mvp;

import java.util.ArrayList;
import java.util.List;

public class BuyBookModel implements IBuyBookModel{
    private List<BuyBookBean> listData;

    public BuyBookModel() {
        this.listData = new ArrayList<>();
    }
    @Override
    public void getTestData() {
        listData.add(new BuyBookBean("EDG_Jiejie", 19));
        listData.add(new BuyBookBean("keyL", 23));
        listData.add(new BuyBookBean("capper", 22));
    }

    @Override
    public List<BuyBookBean> getAdapterData() {
        return listData;
    }
}
