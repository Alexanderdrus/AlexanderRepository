package Lesson5;

public class Sotrudnik {
    //fields
    private String FullName;
    private String Position;
    private String Email;
    private long Phone;
    private int Salary;
    private int Age;


    //Constructor
    public Sotrudnik(String FullName, String Position, String Email, long Phone, int Salary, int Age) {
        this.FullName = FullName;
        this.Position = Position;
        this.Email = Email;
        this.Phone = Phone;
        this.Salary = Salary;
        this.Age = Age;

    }

    public void info() {
        System.out.println("FullName=" + FullName + "  Position=" + Position + "  Email=" + Email + "  Phone=" + Phone + "  Salary=" + Salary + "  Age=" + Age);
    }
    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public long getPhone() {
        return Phone;
    }

    public void setPhone(long phone) {
        Phone = phone;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}


