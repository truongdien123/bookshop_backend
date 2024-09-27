package org.example.shopping_backend.input;


import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDataInput {
    private String name;


    private String code;


    private Double price;


    private Double promoPrice;


    private MultipartFile image;


    private Integer quantity;


    private List<String> attributeDescriptions;


    private List<MultipartFile> imageList;


    private String category;


    private String publisher;


    private String author;
}
