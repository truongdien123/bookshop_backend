package org.example.shopping_backend.service.imp;

import org.example.shopping_backend.input.BookDataInput;
import org.example.shopping_backend.input.GetListBookDataInput;
import org.example.shopping_backend.output.BookDataOutput;
import org.example.shopping_backend.repository.BookRepository;
import org.example.shopping_backend.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {

     private final BookRepository bookRepository;
     private

    public BookServiceImp(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public BookDataOutput createBook(BookDataInput input) {

        return null;
    }

    @Override
    public List<BookDataOutput> getListBookFilter(GetListBookDataInput input) {
        return List.of();
    }

    @Override
    public List<BookDataOutput> getAllBook() {
        return List.of();
    }

    @Override
    public BookDataOutput getBookDetail(Long id) {
        return null;
    }

    @Override
    public BookDataOutput updateBook(BookDataInput input, Long id) {
        return null;
    }

    @Override
    public BookDataOutput deleteBook(Long id) {
        return null;
    }
}
