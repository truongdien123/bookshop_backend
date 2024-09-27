package org.example.shopping_backend.model.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity implements Serializable {

    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("createBy")
    private Long createBy;

    @JsonProperty("createAt")
    private LocalDateTime createAt = LocalDateTime.now();

    @JsonProperty("updateBy")
    private Long updateBy;


    @JsonProperty("updateAt")
    private LocalDateTime updateAt = LocalDateTime.now();

    @JsonProperty("status")
    private Boolean status;
}