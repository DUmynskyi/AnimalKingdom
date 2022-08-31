public class Human extends Mammal {

    private String job;



    public Human(String name, int age, String environment, String sex, int height, int weight,String job ) {
        super(name, age, environment, sex, height, weight);

        this.job = job;


    }



    public String getJob() {        return job;    }
    public void setJob(String job) {        this.job = job;    }


}
