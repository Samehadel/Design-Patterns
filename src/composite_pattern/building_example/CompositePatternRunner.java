package composite_pattern.building_example;

public class CompositePatternRunner {


    public static void main(String[] args) {

        Building building = new Building("Main Street 12St", 15, "The Local Bomna Ben Building");

        House house1 = new House(1, 3, "Sameh Adel House");
        House house2 = new House(1, 4, "Ahmed Adel House");

        //Room 1 House 1
        Room room1 = new Room("Living Room", 5, 10);

        //Room 2 House 1
        Room room2 = new Room("Bed Room", 10, 15);

        //Room 3 House 2
        Room room3 = new Room("Living Room", 10, 10);

        //Room 4 House 2
        Room room4 = new Room("Bed Room", 5, 20);

        //Add rooms to house
        house1.addStructure(room1);
        house1.addStructure(room2);

        house2.addStructure(room3);
        house2.addStructure(room4);


        //Add Houses to buiding
        building.addHouse(house1);
        building.addHouse(house2);

        //Access structures within Building
        System.out.println("Building Name: " + building.getName());
        System.out.println("Building `" + building.getName() + "` has house of " + building.getHouse(0).getName());
        System.out.println("Building `" + building.getName() + "` has house of " + building.getHouse(1).getName());

    }

}
