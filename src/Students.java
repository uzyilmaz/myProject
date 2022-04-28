public class Students extends Datas{
    private String studentNum;

    public Students (){}

    public Students(String name, String surname, String phoneNumber, String email, String studentNum) {
        super(name, surname, phoneNumber, email);
        this.studentNum = studentNum;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentNum='" + studentNum + '\'' +
                '}';
    }
}
