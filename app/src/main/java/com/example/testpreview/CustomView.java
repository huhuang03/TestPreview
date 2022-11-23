package com.example.testpreview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.example.testpreview.databinding.CustomViewBinding;

public class CustomView extends FrameLayout {
    private CustomViewBinding binding;

    public CustomView(Context context) {
        this(context, null);
    }

    public CustomView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttrs) {
        super(context, attrs, defStyleAttrs);
        binding = CustomViewBinding.inflate(LayoutInflater.from(getContext()), this, true);
        binding.setS("kkkkj");
    }
}
