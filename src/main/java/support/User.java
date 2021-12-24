package support;

import com.github.javafaker.Faker;
import support.data.DataYaml;

import java.util.HashMap;
import java.util.Map;

public class User {

    public enum TypeUser{
        NEW_USER, GET_USER
    }

    private Faker faker;
    private Map map;

    private String name;
    private String email;
    private String password;

    public User(TypeUser typeUser){
        map = new HashMap();

        switch (typeUser){
            case NEW_USER:
                createUser("1234");
                break;
            case GET_USER:
                getUser();
                break;
        }
    }

    public void createUser(String password){
        faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String fullName = firstName + " " + lastName;
        String email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@gft.com";

        this.name = fullName;
        this.email = email;
        this.password = password;

        map.put("name", fullName);
        map.put("user", email);
        map.put("pass", password);
        DataYaml.setMapYamlValues("Usuarios","usuario",map);
    }


    public void getUser(){
        map = DataYaml.getMapYamlValues("Usuarios", "usuario");
        this.name = map.get("name").toString();
        this.email = map.get("user").toString();
        this.password = map.get("pass").toString();
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
