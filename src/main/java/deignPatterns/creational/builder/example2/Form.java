package deignPatterns.creational.builder.example2;

public class Form {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private String city;
    private String country;

    public static class FormBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String password;
        private String email;
        private String city;
        private String country;

        public FormBuilder(String firstName, String lastName, String userName, String password) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.userName = userName;
            this.password = password;
        }

        public FormBuilder email(String email) {
            this.email = email;
            return this;
        }

        public FormBuilder city(String city) {
            this.city = city;
            return this;
        }

        public FormBuilder country(String country) {
            this.country = country;
            return this;
        }

        public Form build() {
            return new Form(this);
        }
    }

    private Form(FormBuilder formBuilder) {
        this.firstName = formBuilder.firstName;
        this.lastName = formBuilder.lastName;
        this.userName = formBuilder.userName;
        this.password = formBuilder.password;
        this.email = formBuilder.email;
        this.city = formBuilder.city;
        this.country = formBuilder.country;
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