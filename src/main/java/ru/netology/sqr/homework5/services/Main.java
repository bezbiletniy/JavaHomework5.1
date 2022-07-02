package ru.netology.sqr.homework5.services;
public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println("Итоговый ответ: " + service.Calculate(10, 99));
    }
}
