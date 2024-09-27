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
@Table(name = "publisher")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Publisher extends BaseEntity {

    @Column(name = "name")
    @Nationalized
    private String name;

    @OneToMany(mappedBy = "publisher")
    @JsonIgnore
    private List<Book> bookList;
}
