package com.example.forcedi.service.extractor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractExtractor<T, C extends ExtractorContext> {

    @Getter
    protected final C context;

    /**
     * Used to prepare the input for the extractor, the developer will need to implement
     * the {@link #populateContextBean(ContextMapper, ExtractorContext, ExtractorContext)} for the actual population
     * process
     */
    public final void setContextInput(C inputContext) {
        populateContextBean(ContextMapper.INSTANCE, inputContext, context);
    }

    /**
     * Used to populate the RequestScope context bean class member of the extractor with regular context POJO.
     * The mapper is given in the arguments to give the developer a hint that he should use it to populate the bean.
     */
    protected abstract void populateContextBean(ContextMapper contextMapper, C input, C context);

    public abstract T extract();

}
