package model;

import java.math.BigDecimal;

public class Store {
    private int id;
    private String name;
    private BigDecimal potential;
    private int whId;

    public Store(int id, String name, BigDecimal potential, int whId) {
        this.id = id;
        this.name = name;
        this.potential = potential;
        this.whId = whId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPotential() {
        return potential;
    }

    public int getWhId() {
        return whId;
    }
}