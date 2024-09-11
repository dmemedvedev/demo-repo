import com.github.javafaker.Faker;

public class Utils {

    public static String generateEmail(){
        Faker faker = new Faker();
        return (faker.internet().emailAddress());
    }
    public static String generateName() {
        Faker faker = new Faker();
        return (faker.name().firstName());
    }
}
