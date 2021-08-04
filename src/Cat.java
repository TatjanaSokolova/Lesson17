public class Cat {
    private String name;
    private String breed;
    private String color;
    private boolean isAMammal;
    private int age;


    public Cat() {
        System.out.println("I am here . Meow!");
    }
    // Constructor with attributes
    public Cat(String name, String breed, String color, boolean isAMammal, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.isAMammal = isAMammal;
        this.age = age;
    }

    // String formatting method
    public String formatCat(){
        return "Name " + name;
    }


    // To String Method
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", isAMammal=" + isAMammal +
                ", age=" + age +
                '}';
    }

    // method returns nothing
    public void sleep() {
        System.out.println("Zzzzzzzzz...");
    }

    // method returns nothing
    public void catchprey(String prey){
        System.out.println("I have cought  a " + prey);
    }


    //GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAMammal() {
        return isAMammal;
    }

    public void setAMammal(boolean AMammal) {
        isAMammal = AMammal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("The age cannot be negative");
        } else if (age > 40){
            System.out.println("Age can't be more than 40");
        }
        this.age = age;
    }
}
