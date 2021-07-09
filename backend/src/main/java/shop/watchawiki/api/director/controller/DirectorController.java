package shop.watchawiki.api.director.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.watchawiki.api.director.service.DirectorServiceImpl;

@RestController
@RequestMapping("/movies")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DirectorController {
    private final DirectorServiceImpl service;
}
