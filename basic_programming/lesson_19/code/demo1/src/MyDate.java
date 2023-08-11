public class MyDate {
    private int day;
    private int month;
    private int year;

    private boolean format=true;




    public MyDate(int day, int month, int year){

       setYearOrDefaultValue(year);
        this.day =day;
        this.month=month;
    }

    private void setYearOrDefaultValue(int year){
        this.year=  (year>=2000)? year:2000;
    }

    private boolean isArgCorrect(int day, int month, int year){
        //TODO implements checking parametrs
        return true;
    }

    public String toString(){

        if (!format){
            return year+"-"+ month+"-"+day;
        } else {
            return day + "-" + month + "-" + year;
        }
    }

    public int getDay(){
        return day;
    }

    public  int getMonth(){
        return month;
    }

    public int getYear(){
        return this.year;
    }

    public void setFormat(boolean format){
        this.format=format;
    }


}
