public class constructor {
    public int modelNo;
    public String modelName;
    public constructor(int x , String name)
    {
        modelNo = x;
        modelName = name;
    }
    public static void main(String[] args)
    {
        constructor con = new constructor(12, "RR");
        System.out.println(con.modelNo + " " + con.modelName);
    }
}
