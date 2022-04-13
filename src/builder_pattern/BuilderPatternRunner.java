package builder_pattern;

public class BuilderPatternRunner {
    public static void main(String [] args){
        User user = new User.Builder("mail@example.com", "pass")
                .firstName("Sameh")
                .lastName("Adel")
                .build();

        System.out.println(user);

        Pizza pizza = new Pizza.pizzaBuilder()
                .size(5)
                .hasOlives(true)
                .isSpicy(false)
                .build();

        System.out.println(pizza);

    }
}
