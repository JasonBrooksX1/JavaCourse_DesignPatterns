package com.patterns.visitor;

public class Spokes implements VisatableInterface {
    @Override
    public void acceptVisitor(WheelVisitorInterface visitor) {
        visitor.visit(this);
    }
}
