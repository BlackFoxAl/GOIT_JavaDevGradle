package Module1;

import com.google.gson.GsonBuilder;

public class MyName {
    private String name;
    private String lastName;
    public MyName(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public static void main(String[] args) {
        MyName myName = new MyName("Oleksandr", "Kolesnyk");
        String jsonString = new GsonBuilder().create().toJson(myName);
        System.out.println(jsonString);
    }
}
