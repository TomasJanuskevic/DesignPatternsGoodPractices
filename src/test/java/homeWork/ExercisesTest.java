package homeWork;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExercisesTest {

    @Test
    void smallestNumber() {
        Exercises exercises = new Exercises();
        int num1 = 5;
        int num2 = 8;
        int num3 = 77;

        int expectedInt = 5;
        int actualInt = exercises.smallestNumber(num1, num2, num3);
        assertThat(actualInt).isEqualTo(expectedInt);
    }

    @Test
    void average() {
        Exercises exercises = new Exercises();
        int num1 = 2;
        int num2 = 5;
        int num3 = 8;

        double expectedAverage = 5;
        double actualAverage = exercises.average(num1, num2, num3);
        assertThat(actualAverage).isEqualTo(expectedAverage);
    }

    @Test
    void checkKey() {
        Exercises exercises = new Exercises();
        Map<String, String> map = new HashMap();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");
        map.put("Key3", "Value3");

        boolean actualTrueResult = exercises.checkKey(map,"Key2");
        boolean actualFalseResult = exercises.checkKey(map,"Key4");

        assertThat(actualTrueResult).isTrue();
        assertThat(actualFalseResult).isFalse();

    }
}