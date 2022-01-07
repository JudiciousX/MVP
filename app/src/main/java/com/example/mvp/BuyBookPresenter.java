package com.example.mvp;

import android.media.MediaPlayer;
import android.widget.VideoView;

import java.util.ArrayList;
import java.util.List;

public class BuyBookPresenter extends BasePresenter implements IBuyBookPresenter{
    private IBuyBookModel Model;
    private IBuyBookView View;

    public BuyBookPresenter(IBuyBookView view) {
        View = view;
        Model = new BuyBookModel();
    }
    @Override
    void initData() {
        Model.getAdapterData();
        View.refreshAdapter();
    }

    @Override
    public List<BuyBookBean> getAdapterData() {
        Model.getTestData();
        return Model.getAdapterData();
    }
}
