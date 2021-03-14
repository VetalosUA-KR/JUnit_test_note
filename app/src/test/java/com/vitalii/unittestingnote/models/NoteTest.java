package com.vitalii.unittestingnote.models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NoteTest {

    public static final String TIMESTAMP_1 = "02-2019";
    public static final String TIMESTAMP_2 = "04-2019";

    /*
        Compare two equals Notes
     */

    @Test
    void isNotesEqual_identicalProperties_returnTrue() throws Exception {

        Note note1 = new Note("Note 1","this is note1", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note 1","this is note1", TIMESTAMP_1);
        note2.setId(1);

        assertEquals(note1, note2);
        System.out.println("the notes are equal");

    }

    /*
        Compare notes with 2 different ids
     */

    @Test
    void isNotesEqual_differentIds_returnFalse() throws Exception {
        Note note1 = new Note("Note 1","this is note1", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note 1","this is note1", TIMESTAMP_1);
        note2.setId(2);
        assertNotEquals(note1, note2);
        System.out.println("the notes aren't equal");
    }


    /*
        Compare two notes with different timestamps
     */

    @Test
    void isNotesEqual_differenttimestamps_returnTrue() throws Exception {
        Note note1 = new Note("Note 1","this is note1", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note 1","this is note1", TIMESTAMP_2);
        note2.setId(1);
        assertEquals(note1, note2);
        System.out.println("the timestamps are equal");
    }

    /*
        Compare two notes with different titles
     */

    @Test
    void isNotesEqual_differentTitles_returnFalse() throws Exception {
        Note note1 = new Note("Note 1","this is note1", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note 2","this is note1", TIMESTAMP_1);
        note2.setId(1);
        assertNotEquals(note1, note2);
        System.out.println("the titles aren't equal, They have a different titles");
    }

    /*
        Compare two notes with different content
     */
    @Test
    void isNotesEqual_differentContent_returnFalse() throws Exception {
        Note note1 = new Note("Note 1","this is note1", TIMESTAMP_1);
        note1.setId(1);
        Note note2 = new Note("Note 1","this is note2", TIMESTAMP_1);
        note2.setId(1);
        assertNotEquals(note1, note2);
        System.out.println("the titles aren't equal, They have a different contents");
    }
}
