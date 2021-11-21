package com.codewithme;

public class UIControl {
    // 각 UIControl을 조작할 수 있는 기능을 만든다.
    private boolean isEnabled = true;

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
