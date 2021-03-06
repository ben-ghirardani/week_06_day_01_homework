import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ClassroomTest {
  Classroom classroom;
  Person person;

  @Before
  public void before(){
    classroom = new Classroom("4b");
    person = new Person();
  }

  @Test
  public void classStartsEmpty(){
    assertEquals(0, classroom.personCount());
  }

  @Test
  public void studentsArrive(){
    classroom.add(person);
    assertEquals(1, classroom.personCount());
  }
  @Test
  public void noMoreStudentsWhenFull(){
    for(int i = 0; i < 11; i++){
      classroom.add(person);
    }
    assertEquals(10, classroom.personCount());
  }

}