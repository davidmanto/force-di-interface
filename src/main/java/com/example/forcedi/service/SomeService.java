package com.example.forcedi.service;

import com.example.forcedi.service.extractor.impl.SampleExtractor;
import com.example.forcedi.service.extractor.impl.SampleExtractorContext;
import com.example.forcedi.service.extractor.impl.SampleExtractorResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SomeService {
    private final SampleExtractor sampleExtractor;

    public void prepareInput() {
        SampleExtractorContext context = new SampleExtractorContext() {{
            setSomething("foo");
            setSomethingElse("bar");
        }};

        sampleExtractor.setContextInput(context);
    }

    public SampleExtractorResult getResult() {
        return sampleExtractor.extract();
    }
}
