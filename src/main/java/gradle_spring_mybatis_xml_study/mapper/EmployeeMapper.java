package gradle_spring_mybatis_xml_study.mapper;

import gradle_spring_mybatis_xml_study.dto.Employee;

public interface EmployeeMapper {
    int insertEmployee(Employee employee);
    int deleteEmployee(Employee employee);
}
