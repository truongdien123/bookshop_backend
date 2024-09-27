package org.example.shopping_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.bookshop_backend.model.base.BaseEntity;
import org.hibernate.annotations.Nationalized;

import java.util.List;

@Entity
@Table(name = "book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book extends BaseEntity {

    @Column(name = "name")
    @Nationalized
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "price")
    private Double price;

    @Column(name = "promo_price")
    private Double promoPrice;

    @Column(name = "image")
    private String image;

    @Column(name = "quantity")
    private Integer quantity;

    @OneToMany(mappedBy = "book")
    @JsonIgnore
    private List<AttributeDescription> attributeDescriptions;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Image> imageList;

    @ManyToOne
    @JoinColumn(name = "id_category")
    @JsonIgnore
    private Category category;

    @ManyToOne
    @JoinColumn(name = "id_publisher")
    @JsonIgnore
    private Publisher publisher;

    @ManyToOne
    @JoinColumn(name = "id_author")
    @JsonIgnore
    private Author author;
}
