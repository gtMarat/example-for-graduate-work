package ru.skypro.homework.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.homework.service.ImageService;

import java.io.IOException;


@Slf4j
@RestController
public class ImageController {
    private final ImageService photoAdService;
    public ImageController(ImageService photoAdService) {
        this.photoAdService = photoAdService;
    }
    @GetMapping(value = "/image/{id}",
            produces = {MediaType.IMAGE_PNG_VALUE,
                    MediaType.IMAGE_JPEG_VALUE,
                    MediaType.IMAGE_GIF_VALUE, "image/*"})
    public ResponseEntity<byte[]> getImage(@PathVariable Long id) throws IOException {
        return photoAdService.getImage(id);
    }
}
