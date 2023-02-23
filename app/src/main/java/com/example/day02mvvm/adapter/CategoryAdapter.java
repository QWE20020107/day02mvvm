package com.example.day02mvvm.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.example.day02mvvm.databinding.ItemTypeBinding;
import com.example.day02mvvm.entiity.CategoryEntity;

import java.util.List;

public class CategoryAdapter extends BaseQuickAdapter<CategoryEntity.DataBeanX, BaseViewHolder> {

    public CategoryAdapter(int layoutResId, @Nullable List<CategoryEntity.DataBeanX> data) {
        super(layoutResId, data);
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        DataBindingUtil.bind(holder.itemView);
        super.onBindViewHolder(holder, position);

    }

    @Override
    protected void convert(@NonNull BaseViewHolder baseViewHolder, CategoryEntity.DataBeanX dataBeanX) {
        ItemTypeBinding binding = DataBindingUtil.getBinding(baseViewHolder.itemView);
        binding.setTypes(dataBeanX);
    }
}
