import java.time.LocalDate;

class PracticeSession {
    private final LocalDate date;
    private final int duration;

    public PracticeSession(LocalDate date, int duration) {
        this.date = date;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public LocalDate getDate() {
        return date;
    }
}