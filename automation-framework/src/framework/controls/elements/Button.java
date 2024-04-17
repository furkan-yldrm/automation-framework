package framework.controls.elements;

import framework.controls.internals.Control;

public interface Button extends Control {

    void performClick();
    String getButtonText();
    void performSubmit();
}
