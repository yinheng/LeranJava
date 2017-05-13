package cap6;

/**
 * Learning
 */
public class Name implements Comparable<Name>{
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

    @Override
    public String toString() {
        return firstName + "," + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Name) {
            Name name = (Name)obj;
            return (firstName.equals(name.firstName)) && (lastName.equals(name.lastName));

        }
        return super.equals(obj);

    }

    @Override
    public int hashCode() {
        return firstName.hashCode();
    }

    @Override
    public int compareTo(Name o) {
        Name n = o;
        int lastcmp = lastName.compareTo(n.lastName);
        return
                (lastcmp !=0 ? lastcmp : firstName.compareTo(n.firstName));
    }


}
