public class Teachers extends Datas{
    private String registrationNum;

    public Teachers (){}

    public Teachers(String name, String surname, String phoneNumber, String email, String registrationNum) {
        super(name, surname, phoneNumber, email);
        this.registrationNum = registrationNum;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public void setRegistrationNum(String registrationNum) {
        this.registrationNum = registrationNum;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "registrationNum='" + registrationNum + '\'' +
                '}';
    }
}
