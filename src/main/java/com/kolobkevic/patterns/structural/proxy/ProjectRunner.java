package com.kolobkevic.patterns.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/kolobkevic/myProject");

        //загрузка проекта происходит только после вызова метода run, а не при инициализации
        project.run();
    }
}
