package com.patterns.visitor;

public class Bearings implements VisatableInterface {
    @Override
    public void acceptVisitor(WheelVisitorInterface visitor) {
        visitor.visit(this);
    }
}
