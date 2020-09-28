package gradle_spring_mybatis_xml_study.service;

import javax.inject.Inject;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import gradle_spring_mybatis_xml_study.AbstractTest;
import gradle_spring_mybatis_xml_study.dto.Department;
import gradle_spring_mybatis_xml_study.dto.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/context-root.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IEmployeeServiceTest extends AbstractTest{

    @Inject
    private IEmployeeService service;
    
    @Test
    public void testAddEmloyee() {
        log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
        Employee employee = new Employee(1005, "박규영", "과장", new Employee(4377), 4100000, new  Department(1));
        int res = service.addEmployee(employee);
        Assert.isTrue(res > -1, "The value must be greater than zero");
    }

    @Test
    public void testDelEmployee() {
        log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
        Employee employee = new Employee(1005);
        int res = service.delEmployee(employee);
        Assert.isTrue(res > -1, "The value must be greater than zero");
    }

}
