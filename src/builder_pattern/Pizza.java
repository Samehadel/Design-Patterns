package builder_pattern;

public class Pizza {
    private int size;
    private boolean hasOnion;
    private boolean hasOlives;
    private boolean isSpicy;

    private Pizza(pizzaBuilder builder){
        this.size = builder.size;
        this.hasOnion = builder.hasOnion;
        this.hasOlives = builder.hasOlives;
        this.isSpicy = builder.isSpicy;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", hasOnion=" + hasOnion +
                ", hasOlives=" + hasOlives +
                ", isSpicy=" + isSpicy +
                '}';
    }

    public static class pizzaBuilder {
        private int size;
        private boolean hasOnion;
        private boolean hasOlives;
        private boolean isSpicy;

        public pizzaBuilder size(int size){
            this.size = size;
            return this;
        }
        public pizzaBuilder hasOnion(boolean has){
            this.hasOnion = has;
            return this;
        }
        public pizzaBuilder hasOlives(boolean has){
            this.hasOlives = has;
            return this;
        }
        public pizzaBuilder isSpicy(boolean isSpicy){
            this.isSpicy = isSpicy;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}
