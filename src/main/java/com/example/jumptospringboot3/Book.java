package com.example.jumptospringboot3;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Book {
    private final String title;
    private final String author;

    public static void main(String[] args) {
        Book book = new Book("제목", "저자");
        System.out.println(book.title);
        System.out.println(book.author);
    }
}
