/**
 * Created by guohao4 on 2017/1/14.
 */
class BirthDate {
    private int day;
    private int month;
    private int year;

    public BirthDate(int d, int m, int y) {
        day = d;
        month = m;
        year = y;

    }

    public void setDay(int d) {
        day = d;
    }

    public void setMonth(int m) {
        month = m;
    }

    public void setYear(int y) {
        year = y;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void print() {
        System.out.println(day + "-" + month + "-" + year);
    }


}



public class Test {

    public static void main(String[] arg) {
        int day = 1;

        Test test = new Test();
        test.change1(day);

        System.out.println(day);

        BirthDate birthDate = new BirthDate(1,1,2017);
        birthDate.print();

        test.change3(birthDate);
        birthDate.print();

        test.change2(birthDate);
        birthDate.print();

    }

    public void change1(int i) {
        i = 1234;
    }

    public void change2(BirthDate b) {
        b = new BirthDate(2,2,2012);
    }

    public void change3(BirthDate b) {
        b.setDay(3);
    }
}
