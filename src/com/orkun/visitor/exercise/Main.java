package com.orkun.visitor.exercise;

public class Main {
    public static void main(String[] args) {
        var wavFile = WavFile.read("myFile.wav");
        wavFile.applyFilter(new NoiseReductionFilter());
        wavFile.applyFilter(new NormalizeFilter());
        wavFile.applyFilter(new ReverbFilter());
    }
}
