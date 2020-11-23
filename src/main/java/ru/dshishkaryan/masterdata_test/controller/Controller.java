package ru.dshishkaryan.masterdata_test.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dshishkaryan.masterdata_test.service.RestService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/")
public class Controller {

    private final RestService restService;

    @PostMapping
    public ResponseEntity<List<Integer>> processIntList(@RequestBody List<Integer> integers) {
        return ResponseEntity.ok(restService.processIntegerList(integers));
    }

}
