package ch.hearc.masrad.springboot.examen.controller;

import ch.hearc.masrad.springboot.examen.service.InitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("init")
@AllArgsConstructor
public class InitController {

    private final InitService initService;

    @GetMapping(value="")
    public void init() {
        initService.init();
    }

}
