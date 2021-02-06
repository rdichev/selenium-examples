package utils;
import com.github.javafaker.*;

public class FakerUtils {
    private String userName;
    private String userEmail;
    private String currentAddress;
    private String permanentAddress;
    private Faker faker;

    public FakerUtils() {
        faker = new Faker();
        userName = faker.name().fullName();
        userEmail = faker.internet().emailAddress();
        currentAddress = faker.address().fullAddress();
        permanentAddress = faker.address().secondaryAddress();
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getCurrentAddress() {
        return currentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public Faker getFaker() {
        return faker;
    }
}
