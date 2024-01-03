package io.github.beatrizyordaky.spaceimagesapi.application.images;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController // todo controlador precisa dessa annotation pra receber requisicoes http
@RequestMapping("/v1/images") // necessario pra dizer a url que ficara escutando
@Slf4j // objeto de log
public class ImagesController {

    @PostMapping
    public ResponseEntity save(
            @RequestParam("file") MultipartFile file,
            @RequestParam("name") String name,
            @RequestParam("tags") List<String> tags
            ){
        log.info("Imagem recebida: name: {}, size: {}", file.getOriginalFilename(), file.getSize());
        log.info("Nome definido para a imagem: {}", name);
        log.info("Tags: {}", tags);
        return ResponseEntity.ok().build();
    }
}
