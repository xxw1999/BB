import org.junit.Test;

public class StudentTest {

    @Test
    public void test(){
        Student stu = new Student();
        String ss = stu.hello("zs");
        assert ss.equals("hello,zs");
    }

}
