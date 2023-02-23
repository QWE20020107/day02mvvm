package com.example.day02mvvm.reposities;

import androidx.lifecycle.MutableLiveData;

import com.example.day02mvvm.entiity.CategoryEntity;
import com.example.day02mvvm.mvvm.model.BaseModel;

public class CategoryRepositories extends BaseModel {
    public MutableLiveData<CategoryEntity> getTypes(){
        MutableLiveData<CategoryEntity> liveData = new MutableLiveData<>();
        return getData(getApiServer().category(),liveData);
    }
}
