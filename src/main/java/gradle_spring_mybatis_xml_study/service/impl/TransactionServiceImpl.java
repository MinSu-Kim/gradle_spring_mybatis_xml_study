package gradle_spring_mybatis_xml_study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gradle_spring_mybatis_xml_study.dto.Department;
import gradle_spring_mybatis_xml_study.dto.Employee;
import gradle_spring_mybatis_xml_study.mapper.DepartmentMapper;
import gradle_spring_mybatis_xml_study.mapper.EmployeeMapper;
import gradle_spring_mybatis_xml_study.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {
    @Autowired
    private DepartmentMapper deptMapper;

    @Autowired
    private EmployeeMapper empMapper;

    @Override
    @Transactional
    public void trRegister(Department department, Employee employee) {
        int res = deptMapper.insertDepartment(department);
        res += empMapper.insertEmployee(employee);
        if (res != 2) throw new RuntimeException();
    }

    @Override
    @Transactional
    public void trUnRegister(Department department, Employee employee) {
        int res = empMapper.deleteEmployee(employee);
        res += deptMapper.deleteDepartment(department);
        if (res != 2) throw new RuntimeException();
    }

}
