package gradle_spring_mybatis_xml_study.mapper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import gradle_spring_mybatis_xml_study.AbstractTest;
import gradle_spring_mybatis_xml_study.dto.Department;
import gradle_spring_mybatis_xml_study.dto.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/context-root.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeMapperTest extends AbstractTest{
    @Autowired
    private EmployeeMapper dao;

    @Test
    public void test01InsertEmployee() {
        log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
        Employee employee = new Employee(1004, "이유영", "과장", new Employee(4377), 4100000, new  Department(1));
        int res = dao.insertEmployee(employee);
        Assert.isTrue(res > -1, "The value must be greater than zero");
    }

    @Test
    public void test02DeleteEmployee() {
        log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
        Employee employee = new Employee(1004);
        int res = dao.deleteEmployee(employee);
        Assert.isTrue(res > -1, "The value must be greater than zero");
    }

}
