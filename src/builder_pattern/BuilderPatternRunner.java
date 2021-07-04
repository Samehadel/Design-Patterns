package builder_pattern;

public class BuilderPatternRunner {
    public static void main(String [] args){
        User user = new User.UserBuilder("mail@example.com", "pass")
                .firstName("Sameh")
                .lastName("Adel")
                .build();

        System.out.println(user);

        Guitar guitar = new Guitar("551545")
                .price(15.7f)
                .name("G20");
        System.out.println(guitar);
    }
}
