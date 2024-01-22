package io.github.beatrizyordaky.spaceimagesapi.infra.repository;

import io.github.beatrizyordaky.spaceimagesapi.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {
}
