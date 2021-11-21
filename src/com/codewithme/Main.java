package com.codewithme;

public class Main {

    public static void main(String[] args) {
        var control = new UIControl(true);
        var textBox = new TextBox();
        show(control); // 1. TextBox object is also a UIControl object

    }
    public static void show(UIControl control) {

        // 3. downcasting이 불가능한 UIControl 객체라면, setText()메서드를 사용하지 않고 바로 출력한다.
        if (control instanceof TextBox) {
            // 2. upcasting 되어 TextBox 객체를 UIControl 타입으로 받을 수 있지만,
            // 받은 객체에서 TextBox 객체의 메서드를 쓰는 것은 불가능 하다.
            // 따라서 downcasting을 통해 TextBox의 메서드를 쓸 수 있도록 만들 수 있다.
            var textBox = (TextBox) control;
            textBox.setText("Hello World");
        }
        System.out.println(control);
    }

}
