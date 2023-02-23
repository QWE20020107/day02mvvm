package com.example.day02mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.day02mvvm.databinding.ActivityMainBinding;
import com.example.day02mvvm.mvvm.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mBinding;
    private MainViewModel mMainViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mMainViewModel = new ViewModelProvider(this).get(MainViewModel.class);
        mMainViewModel.loadData(mBinding,this,this);
    }
}