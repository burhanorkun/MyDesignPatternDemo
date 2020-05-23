package com.orkun.composite.exercise;

public class Demo {

    public static void main(String[] args) {
        var subTeam1 = new Team();
        subTeam1.add(new Truck());
        subTeam1.add(new HumanResource());
        subTeam1.add(new HumanResource());

        var subTeam2 = new Team();
        subTeam1.add(new Truck());
        subTeam1.add(new HumanResource());
        subTeam1.add(new HumanResource());

        var team = new Team();
        team.add(subTeam1);
        team.add(subTeam2);

        team.deploy();
    }
}
