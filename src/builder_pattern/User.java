package builder_pattern;

public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;

    private User(Builder userBuilder){
        this.username = userBuilder.username;
        this.password = userBuilder.password;
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.address = userBuilder.address;
        this.phone = userBuilder.phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static class Builder {
        private String username;
        private String password;
        private String firstName;
        private String lastName;
        private String address;
        private String phone;

        public Builder(String username, String password){
            this.username = username;
            this.password = password;
        }
        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }

        public User build(){
            User user = new User(this);
            validateObject(user);
            return user;
        }

        private void validateObject(User user){
            // Do some check to validate pre-defined assumptions
        }
    }
}
