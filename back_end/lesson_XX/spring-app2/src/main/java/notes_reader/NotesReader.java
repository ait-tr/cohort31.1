package notes_reader;

public class NotesReader {
    Notes notes;

    public NotesReader(Notes notes) {
        this.notes = notes;
    }

    public NotesReader() {
    }

    public void readNotes(){
        System.out.println("Reading: " + notes.getNote());
    }
}
