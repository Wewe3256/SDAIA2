package org.example.Mappers;

import org.example.dto.EmployeesDTO;
import org.example.models.Employee;
import org.mapstruct.factory.Mappers;

public interface EmployeesMapper {
    EmployeesMapper INSTANCE = Mappers.getMapper(EmployeesMapper.class);

    // get
    EmployeesDTO toDeptDto(Employee j);

    //post
    Employee toModel(EmployeesDTO dto);
}
