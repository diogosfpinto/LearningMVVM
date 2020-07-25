package com.diogopinto.mvvmrecyclerview.viewmodels;

import com.diogopinto.mvvmrecyclerview.models.NicePlace;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MainActivityViewModel {

    private MutableLiveData<List<NicePlace>> mNicePlaces;

    public void init(){

    }

    public LiveData<List<NicePlace>> getNicePlaces(){
        return mNicePlaces;
    }
}
