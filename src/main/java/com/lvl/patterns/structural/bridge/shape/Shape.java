package com.lvl.patterns.structural.bridge.shape;

import com.lvl.patterns.structural.bridge.renderer.Renderer;

public abstract class Shape {

    public abstract void render(Renderer renderer);
    
}
