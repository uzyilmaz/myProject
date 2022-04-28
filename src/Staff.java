public class Staff extends Datas {
    private String userName;
    private String password;



    public Staff(String name, String surname, String phoneNumber, String email, String userName, String password) {
        super(name, surname, phoneNumber, email);
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
