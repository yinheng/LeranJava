package cap6;

/**
 * Learning
 */
public class Name implements Comparable{
    private String firstName, lastName;

    public Name(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return firstName + "," + lastName;
    }

    public boolean equals(Object obj) {
        if(obj instanceof Name) {
            Name name = (Name)obj;
            return (firstName.equals(name.firstName)) && (lastName.equals(name.lastName));

        }
        return super.equals(obj);

    }

    public int hashCode() {
        return firstName.hashCode();
    }

    public int compareTo(Object o) {
        Name n = (Name)o;
        int lastcmp = lastName.compareTo(n.lastName);
        return
                (lastcmp !=0 ? lastcmp : firstName.compareTo(n.firstName));
    }


}
