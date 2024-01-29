package io.github.beatrizyordaky.spaceimagesapi.domain.service;

import io.github.beatrizyordaky.spaceimagesapi.domain.entity.Image;

import java.util.Optional;

public interface ImageService {
    Image save(Image image);

    Optional<Image> getById(String id);
}
