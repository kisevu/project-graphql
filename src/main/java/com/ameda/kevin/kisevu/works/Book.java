package com.ameda.kevin.kisevu.works;
/*
*
@author ameda
@project graphqpl
*
*/

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id,
                   String name,
                   Integer pageCount,
                   Integer authorId) {

    public static List<Book> books = Arrays.asList(
            new Book(1,"The subtle art of not giving a fuck",30,1),
            new Book(2,"How to be a man",45,2),
            new Book(3,"The power of critical thinking",50,3),
            new Book(4,"How to communicate Effectively",100,4)
    );

    public static Optional<Book> bookById(Integer id) {
        return books.stream()
                .filter(b->b.id.equals(id))
                .findFirst();
    }
}
