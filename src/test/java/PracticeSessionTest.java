import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PracticeSessionTest {
    private static final PracticeSession practiceSession = new PracticeSession(LocalDate.now(), 60);

    @Test
    void getDuration() {
        assertEquals(60, practiceSession.getDuration());
    }

    @Test
    void getDate() {
        assertEquals(LocalDate.now(), practiceSession.getDate());
    }
}