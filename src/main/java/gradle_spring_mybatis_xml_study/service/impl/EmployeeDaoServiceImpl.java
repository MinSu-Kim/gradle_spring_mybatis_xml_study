package gradle_spring_mybatis_xml_study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gradle_spring_mybatis_xml_study.dto.Employee;
import gradle_spring_mybatis_xml_study.mapper.EmployeeMapper;
import gradle_spring_mybatis_xml_study.service.EmployeeService;

@Service
public class EmployeeDaoServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeMapper mapper;
    
    public int addEmployee(Employee employee) {
        return mapper.insertEmployee(employee);
    }
    
    public int delEmployee(Employee employee) {
        return mapper.deleteEmployee(employee);
    }
}
