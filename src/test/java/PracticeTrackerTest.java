import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTrackerTest {

    PracticeTracker tracker = new PracticeTracker();

    @Order(1)
    @Test
    void addSession() {
        tracker.addSession(LocalDate.now(), 60);
        assertEquals(60, tracker.getTotalPracticeTime());
    }

    @Order(2)
    @Test
    void getTotalPracticeTime() {
        tracker.addSession(LocalDate.now(), 60);
        tracker.addSession(LocalDate.now(), 60);
        assertEquals(120, tracker.getTotalPracticeTime());
    }

    @Order(3)
    @Test
    void isEligibleForGraduation() {
        tracker.addSession(LocalDate.now(), 60);
        assertFalse(tracker.isEligibleForGraduation());
        tracker.addSession(LocalDate.now().plusDays(181), 60);
        assertFalse(tracker.isEligibleForGraduation());
        tracker.addSession(LocalDate.now().plusDays(200), 60);
        assertTrue(tracker.isEligibleForGraduation());
    }
}