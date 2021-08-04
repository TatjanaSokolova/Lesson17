public class Lesson17 {
    public static void main(String[] args) {


    Cat myCat = new Cat();
    myCat.setName("Sebastian");
    myCat.sleep();

    myCat.setAge(3);
        System.out.println("My cat's age is " + myCat.getAge());
    Cat myNeighbourcat = new Cat("Puka", "Stray", "brown", true, 7)  ;


        System.out.println(myNeighbourcat.toString());
    }
}