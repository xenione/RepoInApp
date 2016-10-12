package com.xenione.repoinapp.cuore.usecases;


import com.xenione.repoinapp.cuore.Note;
import com.xenione.repoinapp.cuore.NoteRepository;

/**
 * Created by Eugeni on 24/04/2016.
 */
public class AddNoteUseCase implements Runnable {

    private NoteRepository mNoteRepository;
    private Note mNote;

    public AddNoteUseCase(NoteRepository noteRepository, Note note) {
        mNoteRepository = noteRepository;
        mNote = note;
    }

    @Override
    public void run() {
        // this just give us a delay of 5 secs, time enough
        // to see how this executable survives to recreation activity/fragment process
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mNoteRepository.store(mNote);
    }
}