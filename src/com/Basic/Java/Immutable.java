package com.Basic.Java;

public final class Immutable {
    private final String panNumber;

    public Immutable(String panNumber){
        this.panNumber=panNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }
}
