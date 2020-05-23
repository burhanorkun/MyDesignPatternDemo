package com.orkun.observer;

public class SpreadSheet implements Observer {
    private DataSource datasource;

    public SpreadSheet(DataSource datasource) {
        this.datasource = datasource;
    }

    @Override
    public void update() {
        System.out.println("SpreadSheet got notified: " + datasource.getValue());
    }
}
