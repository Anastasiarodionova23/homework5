import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.FreelancerService;

public class FreelancerServiceTest {

    @Test
    public void shouldCalculateMonthOfRest () {
        FreelancerService service = new FreelancerService();

        int expected1 = 3;
        int actual1 = service.calculate(10_000, 3000, 20_000);

        Assertions.assertEquals(expected1, actual1);

        int expected2 = 2;
        int actual2 = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected2, actual2);
    }

        @Test
        public void shouldCalculateWhenNoRest () {
            FreelancerService service = new FreelancerService();

            int expected = 0;
            int actual = service.calculate(5_000, 3000, 100_000);

            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void shouldCalculateWhenAllRest () {
            FreelancerService service = new FreelancerService();

            int expected = 10;
            int actual = service.calculate(100_000, 1000, 0);

            Assertions.assertEquals(expected, actual);
        }



}
