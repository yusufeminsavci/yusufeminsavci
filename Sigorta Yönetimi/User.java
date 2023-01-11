package Java102.SigortaYonetim;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
public class User {
    private String fname, lname, email, pass, job;
    private int age;
    private ArrayList<Address> address;
    private Date lastlogin = null; // login oldukça güncellenecek

    public User(){}

    public User(String fname, String lname, String email, String pass, String job, int age) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.pass = pass;
        this.job = job;
        this.age = age;
        this.address = new ArrayList<>();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    public ArrayList<Address> getAddress() {
        return address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return Objects.equals(email, user.email);
    }
}
