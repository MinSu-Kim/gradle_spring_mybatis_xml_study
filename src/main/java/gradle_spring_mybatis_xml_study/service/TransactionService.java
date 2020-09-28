package gradle_spring_mybatis_xml_study.service;

import org.springframework.stereotype.Service;

import gradle_spring_mybatis_xml_study.dto.Department;
import gradle_spring_mybatis_xml_study.dto.Employee;

@Service
public interface TransactionService {

    public void registerTransaction(Department department, Employee employee);

    public void unRegisterTransaction(Department department, Employee employee);

}
