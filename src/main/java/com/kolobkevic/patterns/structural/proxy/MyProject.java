package com.kolobkevic.patterns.structural.proxy;

public class MyProject implements Project{
    private String url;

    public MyProject(String url) {
        this.url = url;
        loadProject();
    }

    public void loadProject(){
        System.out.println("Loading project from " + url);
    }

    @Override
    public void run() {
        System.out.println("Running project " + url);
    }
}
