package com.company;

public class Rank {
    String name;
    int t;
    int x;
    int res;

    public Rank() {
    }

    public Rank(String name, int t, int x) {
        this.name = name;
        this.t = t;
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
