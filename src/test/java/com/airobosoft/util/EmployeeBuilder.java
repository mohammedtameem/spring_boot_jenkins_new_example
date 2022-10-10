package com.airobosoft.util;

import com.airobosoft.dto.EmployeeDTO;
import com.airobosoft.entity.Employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeBuilder
{
    public static List<EmployeeDTO> getListDTO()
    {
        return Arrays.asList(new EmployeeDTO(1,"Tameem","IT",5000),
                new EmployeeDTO(2,"Santosh","IT",6000));
    }

    public static List<Employee> getListEntities()
    {
        return Arrays.asList(new Employee(1,"Tameem","IT",5000),
                new Employee(2,"Santosh","IT",6000));
    }

    public static EmployeeDTO getDTO() {
        return new EmployeeDTO(2,"Santosh","IT",6000);
    }

    public static Employee getEntity()
    {
        return new Employee(2,"Santosh","IT",6000);
    }
}
