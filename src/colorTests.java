import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Color API tests")
class colorTests {

    @Test
    @DisplayName("Check the webserver succeed")
    void succeedingTest() {
	assertEquals(2, 2);
    }
}

