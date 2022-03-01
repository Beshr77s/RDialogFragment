package com.qashar.bqfragment;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@SuppressLint("ValidFragment")
public class BQDialogFragment extends DialogFragment {
    private Integer res;
    private TextView title,message;
    public Button cancel,ok;

    public BQDialogFragment(Integer res) {
        this.res = res;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        return getLayoutInflater().inflate(res,null);
    }

}
