package org.example.shopping_backend.service;

import org.example.shopping_backend.input.BookDataInput;
import org.example.shopping_backend.input.GetListBookDataInput;
import org.example.shopping_backend.output.BookDataOutput;

import java.util.List;

public interface BookService {
    BookDataOutput createBook(BookDataInput input);
    List<BookDataOutput> getListBookFilter(GetListBookDataInput input);
    List<BookDataOutput> getAllBook();
    BookDataOutput getBookDetail(Long id);
    BookDataOutput updateBook(BookDataInput input, Long id);
    BookDataOutput deleteBook(Long id);
}
