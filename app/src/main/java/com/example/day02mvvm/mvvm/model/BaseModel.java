package com.example.day02mvvm.mvvm.model;

import androidx.lifecycle.MutableLiveData;

import com.example.day02mvvm.http.ApiServer;
import com.example.day02mvvm.http.RetrofitManager;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class BaseModel {
    public ApiServer getApiServer(){
        return RetrofitManager.getInstance().getRetrofit().create(ApiServer.class);
    }

    public <T> MutableLiveData<T> getData(Observable observable,MutableLiveData<T> liveData){
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer() {
                    @Override
                    public void accept(Object o) throws Exception {
                        liveData.postValue((T)o);
                    }
                });
        return liveData;
    }
}
