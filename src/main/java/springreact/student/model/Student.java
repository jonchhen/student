package springreact.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Student {

    @Id
    @SequenceGenerator(name = "studentseq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "studentseq")

    private int id;
    private String name;
    private String address;

    public Student() {

    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [address=" + address + ", id=" + id + ", name=" + name + "]";
    }

}
