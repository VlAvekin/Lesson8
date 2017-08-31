package com.vladavekin.Task3;

public class ProDocumentWorker extends DocumentWorker {


    @Override
    void EditDocument() {
        System.out.println("Документ отредактирован");
    }

    @Override
    void SaveDocument() {
        System.out.println("Документ сохранен в старом формате, сохранение в остальных форматах доступно в версии Эксперт");
    }
}
