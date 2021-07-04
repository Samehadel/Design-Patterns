package builder_pattern;

public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;

    private User(UserBuilder userBuilder){
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

    public static class UserBuilder{
        private String username;
        private String password;
        private String firstName;
        private String lastName;
        private String address;
        private String phone;

        public UserBuilder(String username, String password){
            this.username = username;
            this.password = password;
        }
        public UserBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public UserBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
        public UserBuilder address(String address){
            this.address = address;
            return this;
        }
        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }
}
