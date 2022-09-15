package prac4_5_6.prac6_task1;

public abstract class Person {
    protected String Name, Phone_Number, Email_address;

    public abstract void duty();

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Phone_Number='" + Phone_Number + '\'' +
                ", Email_address='" + Email_address + '\'' +
                '}';
    }

}
