package com.airobosoft.mapper;

import com.airobosoft.dto.EmployeeDTO;
import com.airobosoft.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeMapper extends GenericMapper<Employee, EmployeeDTO> {
    @Override
    @Mapping(target = "id", ignore = true)
    Employee asEntity(EmployeeDTO dto);
}