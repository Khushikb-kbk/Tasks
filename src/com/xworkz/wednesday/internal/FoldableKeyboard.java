package com.xworkz.wednesday.internal;

public class FoldableKeyboard
{
    private String layout;
    private boolean backlit;
    private int folds;

    public FoldableKeyboard(String layout, boolean backlit, int folds) {
        this.layout = layout;
        this.backlit = backlit;
        this.folds = folds;
    }

    @Override
    public String toString() {
        return "Layout: " + layout + ", Backlit: " + backlit + ", Folds: " + folds;
    }
}

