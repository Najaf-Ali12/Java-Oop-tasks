/*An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
It is good practice to keep constants in CAPITAL.
You can access enum constants with the dot syntax:
Enum is short for "enumerations", which means "specifically listed". */
enum name_of_enum{
    constant1,
    constant2,
    constant3,
    constant4
}
public class Enum_Practice{
    public static void main(String[] args) {
        name_of_enum enum_container=name_of_enum.constant3;                     
        for (name_of_enum typeholder:name_of_enum.values()){
                System.out.println(typeholder);
        }
    }
}          
 //here (line10) enum is an static class whose attributes are called using class name
 //enum_object is the name of variable that will keep value of name_of_week
//datatype that will be returned by name_of_enum.constant3                                            