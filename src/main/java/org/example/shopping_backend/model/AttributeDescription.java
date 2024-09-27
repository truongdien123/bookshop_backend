package org.example.shopping_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.bookshop_backend.model.base.BaseEntity;
import org.hibernate.annotations.Nationalized;

@Entity
@Table(name = "attribute_description")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AttributeDescription extends BaseEntity {

    @Column(name = "title")
    @Nationalized
    private String title;

    @Column(name = "content")
    @Nationalized
    private String content;

    @ManyToOne
    @JoinColumn(name = "id_book")
    @JsonIgnore
    private Book book;
}
