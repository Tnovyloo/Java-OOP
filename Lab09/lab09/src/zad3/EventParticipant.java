package zad3;

public class EventParticipant {
    String name;
    int age, ID;

    public EventParticipant(int age, int ID, String nameString) {
        this.age = age;
        this.ID = ID;
        this.name = nameString;
    }

    @Override
    public String toString() {
        // Returns an Event participant Object to String
        return "Uczestnik: " + this.ID + " " + this.name + " " + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        // Checks if objects are the same. (ID, age, name)

        // If objects is null then returns false
        if (obj == null) {
            return false;
        }

        // Checks if objects are the same class
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        // Finally check if the objects has the same variables.
        final EventParticipant otherObj = (EventParticipant) obj;
        if (otherObj.age == this.age && otherObj.ID == this.ID && otherObj.name == this.name) {
            return true;
        }

        // Else return false.
        return false;
    }

    @Override
    public int hashCode() {
        // It return age of specific participant.
        System.out.println(this.age);
        return this.age;
    }
}
