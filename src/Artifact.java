public class Artifact {
    String culture;
    int countNumber;
    int ageOfCreation;

    public Artifact (int countNumber, String culture, int ageOfCreation){
        this.countNumber=countNumber;
        this.culture=culture;
        this.ageOfCreation=ageOfCreation;

    }
    public  Artifact (int countNumber){
        this.countNumber=countNumber;

    }

    public  Artifact (int countNumber, String culture){
        this.countNumber=countNumber;
        this.culture=culture;
    }

    public static void main(String[] args) {
        Artifact Min = new Artifact(123455);
        Artifact Aztec= new Artifact(645334, "Aztec");
        Artifact Rome=new Artifact(76786876, "Latin", '2');

    }
}
