package com.example.day02mvvm.http;

import com.example.day02mvvm.entiity.CategoryEntity;
import com.example.day02mvvm.utils.ConstantUtils;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ApiServer {
    @GET(ConstantUtils.CATEGORY_URL)
    Observable<CategoryEntity> category();
}
