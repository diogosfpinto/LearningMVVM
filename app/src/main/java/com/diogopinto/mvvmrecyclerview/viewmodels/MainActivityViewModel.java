package com.diogopinto.mvvmrecyclerview.viewmodels;

import com.diogopinto.mvvmrecyclerview.models.NicePlace;
import com.diogopinto.mvvmrecyclerview.repositories.NicePlaceRepository;

import java.util.ArrayList;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<ArrayList<NicePlace>> mNicePlaces;
    private NicePlaceRepository mRepo;

    public void init(){
        if (mNicePlaces!= null)
            return;
        mRepo = NicePlaceRepository.getInstance();
        mNicePlaces = mRepo.getNicePlaces();
    }

    public LiveData<ArrayList<NicePlace>> getNicePlaces(){
        return mNicePlaces;
    }
}
