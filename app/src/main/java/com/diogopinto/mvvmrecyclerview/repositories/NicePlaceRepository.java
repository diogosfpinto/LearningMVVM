package com.diogopinto.mvvmrecyclerview.repositories;

import com.diogopinto.mvvmrecyclerview.models.NicePlace;

import java.util.ArrayList;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/*
* Singleton pattern
* */
public class NicePlaceRepository {

    private static NicePlaceRepository instance;
    private ArrayList<NicePlace> dataSet = new ArrayList<>();

    public static NicePlaceRepository getInstance(){
        if (instance == null){
            instance = new NicePlaceRepository();
        }
        return instance;
    }

    public MutableLiveData<ArrayList<NicePlace>> getNicePlaces(){
        setNicePlaces();

        MutableLiveData<ArrayList<NicePlace>> data = new MutableLiveData<>();
        data.setValue(dataSet);
        return data;
    }

    private void setNicePlaces(){
        dataSet.add(new NicePlace("Landscape", "https://img1.madeiramadeira.com.br/product/images/93158678-adesivo-paisagem-natureza-lago-papel-parede-montanhas-gg423prdjlgbeahvwvdsv-179-1-800x729.jpg"));
    }
}
