package com.aashiq;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return softwareEngineerService.getAllEngineers();
    }@GetMapping("{id}")
    public SoftwareEngineer getEngineersById(
            @PathVariable Integer id
    ) {
        return softwareEngineerService.getAllEngineersById(id);
    }

    @PostMapping
    public void addNewSoftwareEngineer(@RequestBody SoftwareEngineer softwareEngineer)
    {
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}
