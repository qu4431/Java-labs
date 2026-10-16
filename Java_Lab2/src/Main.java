void main() {

    boolean run = true;
    JournalModel model = new JournalModel();
    JournalView view = new JournalView();
    JournalController controller = new JournalController(model, view);

    while(run) {
        IO.println("Choose what you want to do:");
        IO.println("1. Add student");
        IO.println("2. View students");
        IO.println("3. Exit");
        int choice = Integer.parseInt(IO.readln());
        switch (choice) {
            case 1:
                Scanner scanner = new Scanner(System.in);
                controller.addStudent(scanner);
                break;
            case 2:
                view.displayStudents(model.getStudents());
                break;
            case 3:
                run = false;
                break;
            default:
                IO.println("Invalid choice");
                break;
        }
    }
}

