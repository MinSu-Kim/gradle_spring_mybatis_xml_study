package gradle_spring_mybatis_xml_study.service;

import org.springframework.stereotype.Service;

import gradle_spring_mybatis_xml_study.dto.Employee;

@Service
public interface IEmployeeService {
    
    public int addEmployee(Employee employee);
    
    public int delEmployee(Employee employee);
    
}
