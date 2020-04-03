package com.example.forcedi.web.rest;

import com.example.forcedi.service.SomeService;
import com.example.forcedi.service.extractor.impl.SampleExtractorResult;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class ForceDiController {

    private final SomeService someService;

    @GetMapping
    public ResponseEntity<SampleExtractorResult> doTest() {
        someService.prepareInput();
        SampleExtractorResult result = someService.getResult();

        return ResponseEntity.ok(result);
    }


}
