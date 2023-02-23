package com.example.day02mvvm.mvvm.viewmodel;

import android.app.Application;
import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.example.day02mvvm.R;
import com.example.day02mvvm.adapter.CategoryAdapter;
import com.example.day02mvvm.adapter.GoodsAdapter;
import com.example.day02mvvm.databinding.ActivityMainBinding;
import com.example.day02mvvm.entiity.CategoryEntity;
import com.example.day02mvvm.reposities.CategoryRepositories;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private CategoryAdapter mCategoryAdapter;
    private List<CategoryEntity.DataBeanX> mDataBeanXList = new ArrayList<>();
    private CategoryRepositories mCategoryRepositories = new CategoryRepositories();
    private GoodsAdapter mGoodsAdapter;
    private List<CategoryEntity.DataBeanX.DataBean> mDataBeans = new ArrayList<>();
    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public void loadData(ActivityMainBinding binding, Context context, LifecycleOwner owner){
        mCategoryAdapter = new CategoryAdapter(R.layout.item_type,mDataBeanXList);
        binding.rvType.setAdapter(mCategoryAdapter);
        binding.rvType.setLayoutManager(new LinearLayoutManager(context));
        mCategoryRepositories.getTypes().observe(owner, new Observer<CategoryEntity>() {
            @Override
            public void onChanged(CategoryEntity categoryEntity) {
                mDataBeanXList.addAll(categoryEntity.getData());
                mCategoryAdapter.notifyDataSetChanged();
                loadGoods(0);
            }
        });
        mGoodsAdapter = new GoodsAdapter(R.layout.item_goods,mDataBeans);
        binding.rv.setAdapter(mGoodsAdapter);
        binding.rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        mCategoryAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(@NonNull BaseQuickAdapter adapter, @NonNull View view, int position) {
                loadGoods(position);
            }
        });
    }

    private void loadGoods(int i) {
        mDataBeans.clear();
        mDataBeans.addAll(mDataBeanXList.get(i).getData());
        mGoodsAdapter.notifyDataSetChanged();
    }
}
