package gradle_spring_mybatis_xml_study;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/context-root.xml" })
public class SqlSessionTest {
    protected static final Log log = LogFactory.getLog(SqlSessionTest.class);

    @After
    public void tearDown() throws Exception {
        System.out.println();
    }
    
    @Autowired
    private SqlSessionFactory sessionFactory;

    @Test
    public void testOpenSession() {
        log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
        SqlSession session = sessionFactory.openSession();
        log.debug("session " + session);
        Assert.notNull(session, "The class must not be null");
    }
}
