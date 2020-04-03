package com.example.forcedi.service.extractor.impl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class SampleExtractorResult {
    private String someResult;
    private String someOtherResult;
}
