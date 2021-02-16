package deignPatterns.creational.builder.example2;

public class FormBuilder2 {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private String city;
    private String country;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }


    public FormBuilder2(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public FormBuilder2 email(String email) {
        this.email = email;
        return this;
    }

    public FormBuilder2 city(String city) {
        this.city = city;
        return this;
    }

    public FormBuilder2 country(String country) {
        this.country = country;
        return this;
    }

    public Form2 build() {
        return new Form2(this);
    }

}
