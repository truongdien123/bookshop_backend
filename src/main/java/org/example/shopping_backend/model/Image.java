package org.example.shopping_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.bookshop_backend.model.base.BaseEntity;

@Entity
@Table(name = "image")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Image extends BaseEntity {

    @Column(name = "link")
    private String link;

    @ManyToOne
    @JoinColumn(name = "id_book")
    @JsonIgnore
    private Book book;
}
