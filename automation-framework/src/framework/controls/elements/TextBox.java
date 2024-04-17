package framework.controls.elements;

import framework.controls.internals.Control;

public interface TextBox extends Control {

    void EnterText(String text);
    String GetTextValue();
}
