package gradle_spring_mybatis_xml_study;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/resources/context-root.xml" })
public class DataSourceTest extends AbstractTest {
    @Autowired
    private DataSource dataSource;
    @Autowired
    private SqlSessionFactory sessionFactory;

    @Test
    public void testDataSource() throws SQLException {
        log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
        log.debug("DataSource " + dataSource);
        log.debug("LoginTimeout " + dataSource.getLoginTimeout());
    }

    @Test
    public void testOpenSession() {
        log.debug(Thread.currentThread().getStackTrace()[1].getMethodName() + "()");
        SqlSession session = sessionFactory.openSession();
        log.debug("session " + session);
        Assert.notNull(session, "The class must not be null");
    }
}
