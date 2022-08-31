public class Animal {
    private String name;
    private int age;
    private String environment;


    public Animal(String name, int age, String environment) {
        this.name = name;
        this.age = age;
        this.environment = environment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;

    }
}


