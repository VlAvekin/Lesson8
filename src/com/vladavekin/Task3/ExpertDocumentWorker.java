package com.vladavekin.Task3;

public class ExpertDocumentWorker extends ProDocumentWorker {

    @Override
    void SaveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
