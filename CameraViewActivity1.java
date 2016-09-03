package com.example.admin.pokemongo;

import android.view.SurfaceHolder;
import android.view.View;

/**
 * Created by admin on 30.08.2016.
 */
public interface CameraViewActivity1 {
    void surfaceChanged(SurfaceHolder holder, int format, int width,
                        int height);

    void surfaceCreated(SurfaceHolder holder);

    void onClick(View v);
}
