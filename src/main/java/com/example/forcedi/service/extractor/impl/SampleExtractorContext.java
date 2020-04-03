package com.example.forcedi.service.extractor.impl;

import com.example.forcedi.service.extractor.ExtractorContext;
import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Data
@Component
@RequestScope
public class SampleExtractorContext extends ExtractorContext {
    private String something;
    private String somethingElse;
}
