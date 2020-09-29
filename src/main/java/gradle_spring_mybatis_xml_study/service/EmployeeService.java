package gradle_spring_mybatis_xml_study.service;

import gradle_spring_mybatis_xml_study.dto.Employee;

public interface EmployeeService {
    
    public int addEmployee(Employee employee);
    
    public int delEmployee(Employee employee);
    
}
