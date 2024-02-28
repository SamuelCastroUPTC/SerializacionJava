package co.edu.uptc.controllers;

import java.io.IOException;

import co.edu.uptc.servicesfiles.ProcessesFiles;

public class TestControllers {
    public void test() throws IOException{
        ProcessesFiles processesFiles= new ProcessesFiles();
        processesFiles.test();
    }
}
