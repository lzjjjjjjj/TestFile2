package demo.pojo;

public class User {
    private int Userid;
    private String Name;
    private String sex;
    private String dress;

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        Userid = userid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDress() {
        return dress;
    }

    public void setDress(String dress) {
        this.dress = dress;
    }

    @Override
    public String toString() {
        return "User{" +
                "Userid=" + Userid +
                ", Name='" + Name + '\'' +
                ", sex='" + sex + '\'' +
                ", dress='" + dress + '\'' +
                '}';
    }
}
