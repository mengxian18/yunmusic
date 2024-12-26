package com.mengxian.yunmusic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class frag2 extends Fragment {
    private View view;
    private ImageView imageView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag2_layout, container, false); // 使用container代替null
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // 绑定ImageView控件
        imageView = view.findViewById(R.id.zj);
        // 设置ImageView透明度为40%
        imageView.setAlpha(0.4f); // 0.4f 表示40%的不透明度，60%的透明度
    }
}