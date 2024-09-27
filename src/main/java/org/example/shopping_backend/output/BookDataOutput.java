package org.example.shopping_backend.output;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookDataOutput {
    private String name;


    private String code;


    private Double price;


    private Double promoPrice;


    private String image;


    private Integer quantity;


    private List<AttributeDescriptionDataOutput> attributeDescriptions;


    private List<String> imageList;


    private String category;


    private String publisher;


    private String author;
}
