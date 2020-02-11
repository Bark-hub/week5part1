package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("hello world");

        Book book1 = new Book("Hue stien", "Spoopy Stories", 300, 212.2);
        Book book2 = new Book("Turner Mays","Elmanack",100,313.3);

        System.out.println(Book.numBooks);

        Person person1 = new Person("pong",10);

        System.out.println(person1.getName() + " is reading " + book1.getTitle());

        person1.readBook(book1);

        System.out.println(Book.totalPrice);

    }



}
