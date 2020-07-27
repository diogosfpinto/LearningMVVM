package com.diogopinto.mvvmrecyclerview.viewmodels;

import com.diogopinto.mvvmrecyclerview.models.NicePlace;

import java.util.ArrayList;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<ArrayList<NicePlace>> mNicePlaces;

    public void init(){

    }

    public LiveData<ArrayList<NicePlace>> getNicePlaces(){
        return mNicePlaces;
    }
}
