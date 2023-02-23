package com.example.day02mvvm.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.day02mvvm.databinding.ItemGoodsBinding;
import com.example.day02mvvm.databinding.ItemTypeBinding;
import com.example.day02mvvm.entiity.CategoryEntity;

import java.util.List;

public class GoodsAdapter extends BaseQuickAdapter<CategoryEntity.DataBeanX.DataBean, BaseViewHolder> {

    public GoodsAdapter(int layoutResId, @Nullable List<CategoryEntity.DataBeanX.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        DataBindingUtil.bind(holder.itemView);
        super.onBindViewHolder(holder, position);
    }

    @Override
    protected void convert(@NonNull BaseViewHolder baseViewHolder, CategoryEntity.DataBeanX.DataBean dataBean) {
        ItemGoodsBinding binding = DataBindingUtil.getBinding(baseViewHolder.itemView);
        binding.setGoods(dataBean);
    }
}
