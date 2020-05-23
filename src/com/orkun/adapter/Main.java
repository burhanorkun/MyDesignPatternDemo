package com.orkun.adapter;

import com.orkun.adapter.avaFilter.Caramel;

public class Main{
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramelFilter(new Caramel()));
        //imageView.apply(new Caramel());

    }
}
