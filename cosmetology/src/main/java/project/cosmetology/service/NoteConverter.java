package project.cosmetology.service;

import org.springframework.stereotype.Component;
import project.cosmetology.dto.NoteDto;
import project.cosmetology.entity.Note;

@Component
public class NoteConverter {
    public Note toLocal(NoteDto dto) {
        if (dto == null) {
            return null;
        }

        Note note = new Note();

        note.setAllergy(dto.allergy());
        //  note.setPerson(person);
        note.setId(dto.id());
        note.setDisease(dto.disease());
        note.setPregnancy(dto.pregnancy());
        note.setSpecialNotes(dto.specialNotes());

        return note;
    }

    public NoteDto toFront(Note note) {
        if (note == null) {
            return null;
        }

        return new NoteDto(note.getId(), note.getAllergy(), note.getDisease(), note.getPregnancy(), note.getSpecialNotes());
    }
}
