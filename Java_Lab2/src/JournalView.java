import Entity.CuratorJournalEntry;

import java.util.List;

public class JournalView {
    public void displayStudents(List<CuratorJournalEntry> students) {
        if (students.isEmpty()) {
            IO.println("No students to display.");
        } else {
            IO.println("List of students:");
            for (CuratorJournalEntry student : students) {
                IO.println(student);
            }
            IO.println("------------------------------");
        }
    }
}
