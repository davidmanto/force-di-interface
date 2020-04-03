package com.example.forcedi.service.extractor.impl;

import com.example.forcedi.service.extractor.AbstractExtractor;
import com.example.forcedi.service.extractor.ContextMapper;
import org.springframework.stereotype.Component;

@Component
public class SampleExtractor extends AbstractExtractor<SampleExtractorResult, SampleExtractorContext> {

    public SampleExtractor(SampleExtractorContext context) {
        super(context);
    }

    @Override
    protected void populateContextBean(ContextMapper contextMapper, SampleExtractorContext inputContext, SampleExtractorContext target) {
        contextMapper.mapContext(inputContext, target);
    }

    @Override
    public SampleExtractorResult extract() {
        return SampleExtractorResult.builder()
                .someResult(context.getSomething())
                .someOtherResult(context.getSomethingElse())
                .build();
    }
}
