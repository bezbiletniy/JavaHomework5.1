import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void shouldCalculateExact() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.Calculate(10, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowAbroadLowCalculate() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.Calculate(9, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void HighAbroadLowCalculate() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.Calculate(11, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void LowAbroadHighCalculate() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.Calculate(10, 98);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void HighAbroadHighCalculate() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.Calculate(10, 100);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateInexact() {
        SQRService service = new SQRService();
        int expected = 2;
        int actual = service.Calculate(16, 99);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalculateNull() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.Calculate(0, 0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalculateNegative() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.Calculate(-1, -1);

        Assertions.assertEquals(expected, actual);
    }
}

