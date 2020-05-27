package com.patterns.base;

import com.patterns.visitor.VisatableInterface;

/* This interface supplies the methods for Wheels */
public interface WheelInterface extends VisatableInterface {
    int getSize();
    boolean isWide();
}
