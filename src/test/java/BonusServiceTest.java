//  import org.example.bonusService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BonusServiceTest {

    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        bonusService service = new bonusService();

        // подготавливаем данные:
        long amount = 1000;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        bonusService service = new bonusService();

        // подготавливаем данные:
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
        @Test
        void shouldCalculateForUnRegisteredAndOverLimit() {

            bonusService service = new bonusService();

            // подготавливаем данные
            long amount = 17_000;
            boolean registered = false;
            long expected = 170;

            //вызываем целевой метод:
            long actual = service.calculate(amount, registered);

            // проводим проверку. сравниваем ожидаемый и фактический результат.
            Assertions.assertEquals(expected, actual);

        }
            @Test
            void shouldCalculateForUnRegisteredAndUnderLimit() {
                bonusService service = new bonusService();
                long amount = 170_000;
                boolean registered = false;
                long expected = 500;

                // вызываем целевой метод:
                long actual = service.calculate(amount, registered);

                // сравниваем соттветствие фактического и ожидаемого результата

                Assertions.assertEquals(actual, expected);
            }


        }

