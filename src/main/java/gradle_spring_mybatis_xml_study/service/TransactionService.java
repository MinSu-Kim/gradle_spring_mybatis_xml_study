package gradle_spring_mybatis_xml_study.service;

import org.springframework.stereotype.Service;

import gradle_spring_mybatis_xml_study.dto.Department;
import gradle_spring_mybatis_xml_study.dto.Employee;

public interface TransactionService {

    public void trRegister(Department department, Employee employee);

    public void trUnRegister(Department department, Employee employee);

}
