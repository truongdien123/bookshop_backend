package org.example.shopping_backend.mapper;

import org.example.shopping_backend.input.BookDataInput;
import org.example.shopping_backend.model.Book;
import org.example.shopping_backend.output.BookDataOutput;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {


    Book toBook(BookDataInput input);

    
    BookDataOutput toBookDataOutput(Book book);
}
