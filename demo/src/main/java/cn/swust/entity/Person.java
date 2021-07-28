package cn.swust.entity;

public class Person {
    private Integer id;
    private String personname;
    private String pw;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpersonname() {
        return personname;
    }

    public void setpersonname(String username) {
        this.personname = username;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
