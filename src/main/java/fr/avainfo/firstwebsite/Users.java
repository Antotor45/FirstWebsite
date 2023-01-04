package fr.avainfo.firstwebsite;

public class Users {

    private String uuid;
    private String name;
    private String lastName;
    private int age;

    public Users(String uuid, String name, String lastName, int age) {
        this.uuid = uuid;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
