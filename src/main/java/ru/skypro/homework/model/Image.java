package ru.skypro.homework.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;


@Data
@Entity
public class Image {
    @Id
    private String id;

    @Lob
    private byte[] image;
}
