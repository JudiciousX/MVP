package com.example.mvp;

import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class BuyBookActivity extends BaseActivity implements IBuyBookView{
    private ListView listView;
    private BuyBookAdapter adapter;
    private BuyBookPresenter buyBookPresenter = new BuyBookPresenter(this);



    @Override
    int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    void initView() {
        listView = (ListView)findViewById(R.id.list_View);
    }

    @Override
    void onPrepare() {
        adapter = new BuyBookAdapter(this, R.layout.buybookbean, buyBookPresenter.getAdapterData());
        System.out.println(buyBookPresenter.getAdapterData());
        listView.setAdapter(adapter);
        buyBookPresenter.initData();
    }

    @Override
    public void showToast(String str) {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void refreshAdapter() {
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onEmpty() {
        listView.setEmptyView(null);
    }
}
