package gradle_spring_mybatis_xml_study.service;

import org.springframework.stereotype.Service;

import gradle_spring_mybatis_xml_study.dto.Department;
import gradle_spring_mybatis_xml_study.dto.Employee;

@Service
public interface TransactionAOPService {
    int trRegister(Department department, Employee employee);
    int trUnRegister(Department department, Employee employee);
}
