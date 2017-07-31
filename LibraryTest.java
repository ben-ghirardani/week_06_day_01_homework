import static org.junit.Assert.assertEquals;
import org.junit.*;

public class LibraryTest {

  Library library;
  Book book;

  @Before
  public void before(){
    library = new Library("The Library");
    book = new Book();
  }

  @Test
  public void hasName(){
    assertEquals("The Library", library.getName());
  }

}