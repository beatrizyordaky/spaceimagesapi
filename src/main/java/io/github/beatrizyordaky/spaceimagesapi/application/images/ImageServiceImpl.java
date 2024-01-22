package io.github.beatrizyordaky.spaceimagesapi.application.images;

import io.github.beatrizyordaky.spaceimagesapi.domain.entity.Image;
import io.github.beatrizyordaky.spaceimagesapi.domain.service.ImageService;
import io.github.beatrizyordaky.spaceimagesapi.infra.repository.ImageRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
