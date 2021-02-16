package deignPatterns.creational.builder.example2;

public class Form2 {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private String city;
    private String country;

    public Form2(FormBuilder2 formBuilder2) {
        this.firstName = formBuilder2.getFirstName();
        this.lastName = formBuilder2.getLastName();
        this.userName = formBuilder2.getUserName();
        this.password = formBuilder2.getPassword();
        this.email = formBuilder2.getEmail();
        this.city = formBuilder2.getCity();
        this.country = formBuilder2.getCountry();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(firstName);
        sb.append("\nLast Name: ").append(lastName);
        sb.append("\nUser Name: ").append(userName);
        sb.append("\nPassword: ").append(password);

        if (this.email != null) {
            sb.append("\nEmail: ").append(email);
        }
        if (this.city != null) {
            sb.append("\nCity: ").append(city);
        }
        if (this.country != null) {
            sb.append("\nCountry: ").append(country);
        }
        return sb.toString();
    }
}
