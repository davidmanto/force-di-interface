package com.example.forcedi.service.extractor;


import com.example.forcedi.service.extractor.impl.SampleExtractorContext;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

/**
 * Developer should declare mapping methods here for context objects, basically cloning from same class object
 * into an existing object, this will be used for the
 * {@link AbstractExtractor#populateContextBean(ContextMapper, ExtractorContext, ExtractorContext)} method
 */
@Mapper(componentModel = "spring")
public interface ContextMapper {

    ContextMapper INSTANCE = Mappers.getMapper(ContextMapper.class);

    void mapContext(SampleExtractorContext source, @MappingTarget SampleExtractorContext target);
}
