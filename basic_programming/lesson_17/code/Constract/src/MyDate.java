public class MyDate {

    int day;
    int month;
    int year;

    // not "static"  !!!
    // no parameter MyDate

    public  String toString(){
        String [] months = {"" ,"January","February","March","April","May","June","July","August","September","October","November","December"};
        if (day<0 || day>31){return "error";}
        if (month<0 || month>12){return "error";}

        return (day<10?"0"+day:day) + " " + months[month] + " " + year;
    }

}
