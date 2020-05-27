package com.patterns.base;

import com.patterns.visitor.Bearings;
import com.patterns.visitor.Spokes;
import com.patterns.visitor.WheelVisitorInterface;

/* Partent class for Bicycle Wheels */
public class AbstractWheel implements WheelInterface{

    private int size;
    private boolean wide;
    private Spokes spokes;
    private Bearings bearings;

    public AbstractWheel(int size, boolean wide) {
        this.size = size;
        this.wide = wide;

        //part of the visitor pattern
        spokes = new Spokes();
        bearings = new Bearings();
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isWide() {
        return wide;
    }

    @Override
    public void acceptVisitor(WheelVisitorInterface visitor) {
        spokes.acceptVisitor(visitor);
        bearings.acceptVisitor(visitor);
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " at " + size + " inches ";
    }
}
