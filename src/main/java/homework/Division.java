package homework;


public class Division {

    private static int count = 0;
    private static int ID = count++;

    private int Id;
    private String nameSubdivision;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNameSubdivision() {
        return nameSubdivision;
    }

    public void setNameSubdivision(String nameSubdivision) {
        this.nameSubdivision = nameSubdivision;
    }

    public Division(int id, String nameSubdivision) {
        Id = id;
        this.nameSubdivision = nameSubdivision;
    }

    public static Division createDivision(String nameSubdivision){
        return new Division(ID, nameSubdivision);
    }


    @Override
    public String toString() {
        return "Division{" +
                "Id=" + Id +
                ", nameSubdivision='" + nameSubdivision + '\'' +
                '}';
    }
}
