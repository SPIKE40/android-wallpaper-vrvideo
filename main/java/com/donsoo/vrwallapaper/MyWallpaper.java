package com.donsoo.vrwallapaper;

import android.opengl.GLSurfaceView;

public class MyWallpaper extends OpenGLES2WallpaperService{

    @Override
    GLSurfaceView.Renderer getNewRenderer() {
        return new MyRenderer();
    }
}
