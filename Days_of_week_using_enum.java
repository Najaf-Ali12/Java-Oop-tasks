class Enum_container{
enum days{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}

    public void FindDay(days object){
        if (object==days.Saturday || object==days.Sunday){
            System.out.println("It is weekend");
        }
        else{
            System.out.println("It is weekday");
        }
    }
}
public class Days_of_week_using_enum{
    public static void main(String[] args) {
        Enum_container obj=new Enum_container();
        //When the enum is in a class then it is called like this classObject.Method(Classname.enumName.constant)
        obj.FindDay(Enum_container.days.Thursday);
    }
}