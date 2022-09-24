package org.example;

import jdk.nashorn.internal.runtime.Source;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.lang.annotation.Target;

/**
 * Dto转换器
 */
@Mapper
public interface PeopleMapper {
    PeopleMapper INSTANCE = Mappers.getMapper(PeopleMapper.class);
    //不加注解就默认转换
    @Mapping(target = "nameDto",source = "name")
    PeopleDto peopleToPeopleDto(People people);

    @InheritInverseConfiguration
    People toSource(PeopleDto target);
}
