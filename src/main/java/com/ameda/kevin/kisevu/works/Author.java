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

public record Author(Integer id, String name) {
    public static List<Author> authors = Arrays.asList(
            new Author(1,"Kevin"),
            new Author(2,"Ameda"),
            new Author(3,"Kisevu"),
            new Author(4,"Lindoe")
    );

    public static Optional<Author> getAuthorById(Integer id){
        return authors.stream()
                .filter(a->a.id.equals(id))
                .findFirst();
    }
}
