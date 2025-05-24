package com.aashiq;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(1, "Aashiq", "Java, Spring Boot, React"),
                new SoftwareEngineer(2, "Mohd", "Javascript, Spring Boot, React")
        );
    }
}
