package com.erin.Everdrobe.ui.point;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PointViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PointViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is point fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}