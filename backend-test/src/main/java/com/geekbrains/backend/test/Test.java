package com.geekbrains.backend.test;


public class Test {


    // Для урока № 4

    public static void main (String[] args) {

        // При builder необязательно настраивать все поля, как в конструкторе
        // т.е. можно создать объект с ограниченным рядом свойств, как будто другой конструктор
        User.builder()
                .setName("Ivan")
                .setSurName("Ivanov")
                .setAddress("Ivanovo")
                .setPhone("9876543217")
                .setEmail("iii@ii.com")
                .build();
    }




}
