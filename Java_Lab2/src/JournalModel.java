import Entity.CuratorJournalEntry;

import java.util.ArrayList;
import java.util.List;

public class JournalModel {
    private final List<CuratorJournalEntry> students = new ArrayList<>();

    public void addStudent(CuratorJournalEntry student) {
        students.add(student);
    }

    public List<CuratorJournalEntry> getStudents() {
        return students;
    }
}
