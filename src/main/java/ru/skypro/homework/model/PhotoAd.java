package ru.skypro.homework.model;

import jakarta.persistence.*;
import lombok.*;



@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "photo_Ad")
public class PhotoAd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String filePath;
    private long fileSize;
    private String mediaType;
    @OneToOne
    @JoinColumn(name = "ad_id")
    private Ad ad;
}
