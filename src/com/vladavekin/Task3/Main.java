package com.vladavekin.Task3;


//      В теле метода Main() реализуйте
// возможность приема от пользователя номера ключа доступа pro и exp.
// Если пользователь не вводит ключ, он может пользоваться только
// бесплатной версией (создается экземпляр базового класса), если
// пользователь ввел номера ключа доступа pro и exp, то должен
// создаться экземпляр соответствующей версии класса, приведенный к
// базовому - DocumentWorker.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String Pro = "Pro";
        String Expert = "Expert";

        System.out.print("Введите ключ: ");
        String var = scanner.next();


        if (var.equals(Pro) && var.equals(Expert) ){

            DocumentWorker documentWorker = new DocumentWorker();

            System.out.println("Ключ: " + var);

            documentWorker.OpenDocument();
            documentWorker.EditDocument();
            documentWorker.SaveDocument();

        } else if (var.equals(Pro)) {

            ProDocumentWorker proDocumentWorker = new ProDocumentWorker();

            System.out.println("Ключ: " + var);

            proDocumentWorker.OpenDocument();
            proDocumentWorker.EditDocument();
            proDocumentWorker.SaveDocument();

        } else if (var.equals(Expert)) {

            ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();

            System.out.println("Ключ: " + var);

            expertDocumentWorker.OpenDocument();
            expertDocumentWorker.EditDocument();
            expertDocumentWorker.SaveDocument();

        }


    }

}
