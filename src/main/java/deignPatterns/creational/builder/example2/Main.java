package deignPatterns.creational.builder.example2;

public class Main {
    public static void main(String[] args) {
        Form form = new Form.FormBuilder("Bob", "Johnson", "BobJon", "1234").email("bob@gmail.com").city("Vilnius").build();
        System.out.println(form);

        System.out.println();

        Form2 form2 = new FormBuilder2("Aleks", "Aleks", "AA", "4567").city("Kaunas").build();
        System.out.println(form2);
    }
}
