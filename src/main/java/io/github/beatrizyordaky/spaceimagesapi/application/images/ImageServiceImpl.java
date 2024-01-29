package io.github.beatrizyordaky.spaceimagesapi.application.images;

import io.github.beatrizyordaky.spaceimagesapi.domain.entity.Image;
import io.github.beatrizyordaky.spaceimagesapi.domain.service.ImageService;
import io.github.beatrizyordaky.spaceimagesapi.infra.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository repository;

    @Override
    @Transactional
    public Image save(Image image) {
        return repository.save(image);
    }
}
