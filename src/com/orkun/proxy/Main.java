package com.orkun.proxy;

public class Main {

    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for (String fileName : fileNames) {
            //library.add(new EbookProxy(fileName));
            library.add(new LoggingEbookProxy(fileName));
        }

        library.openEbook("a");
        library.openEbook("b");
    }
}
