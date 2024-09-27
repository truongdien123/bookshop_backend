package org.example.shopping_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.bookshop_backend.model.base.BaseEntity;
import org.hibernate.annotations.Nationalized;

import java.util.List;

@Entity
@Table(name = "author")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author extends BaseEntity {

    @Column(name = "name")
    @Nationalized
    private String name;

    @OneToMany(mappedBy = "author")
    @JsonIgnore
    private List<Book> bookList;
}
