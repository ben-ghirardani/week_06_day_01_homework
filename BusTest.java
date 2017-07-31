import static org.junit.Assert.assertEquals;
import org.junit.*;

  public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before(){
      bus = new Bus("Bus", 134);
      person = new Person();
    }

    @Test
    public void howManyPassengers(){
      assertEquals(0, bus.countPassengers());
    }

    @Test
    public void howManyPeopleGetOn(){
      bus.pickup(person);
      assertEquals(1, bus.countPassengers());
    }

    @Test
    public void noMorePassengersWhenFull(){
      for(int i = 0; i < 6; i++){
        bus.pickup(person);
      }
      assertEquals(5, bus.countPassengers());
    }

  }