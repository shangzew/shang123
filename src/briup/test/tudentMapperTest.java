package briup.test;

import java.io.InputStream;
import java.util.Date;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import briup.mapper.StudentMapper;
import briup.pojo.Student;

public class tudentMapperTest {
	@Test
	public void test_insert(){
		
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml"); 
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			SqlSession sqlSession = sqlSessionFactory.openSession();
			
			StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
			Student s = new Student(4,"tom","123@briup.com",new Date());
			studentMapper.insertStudent(s);
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
