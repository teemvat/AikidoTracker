import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class PracticeTracker {
    private final List<PracticeSession> sessions = new ArrayList<>();

    public void addSession(LocalDate date, int duration) {
        sessions.add(new PracticeSession(date, duration));
    }

    public int getTotalPracticeTime() {
        return sessions.stream().mapToInt(PracticeSession::getDuration).sum();
    }

    public boolean isEligibleForGraduation() {
        return sessions.size() >= 60 || (sessions.size() > 1 && ChronoUnit.DAYS.between(sessions.get(0).getDate(), sessions.get(sessions.size() - 1).getDate()) > 182);    }
}
