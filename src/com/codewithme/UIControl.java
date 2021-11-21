package com.codewithme;

public class UIControl {
    protected boolean isEnabled = true;

//    public UIControl(boolean isEnabled) {
//        this.isEnabled = isEnabled;
//        System.out.println("UIControl initialized");
//    }

    //UI 객체를 렌더링하는 메서드. 다른 클래스에서 overriding 하여 사용한다.
    public void render() {

    }

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
