/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extratutioncenter;

/**
 *
 * @author shiva
 */
public class Booking {
 
    public String subject,tutor,timeslot, notes;
    public String Status;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Booking() {
    }

    public Booking(String tutor, String subject, String timeslot,String Status) {
        this.subject = subject;
        this.tutor = tutor;
        this.timeslot = timeslot;
        this.Status=Status;
    }

    

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }
}
