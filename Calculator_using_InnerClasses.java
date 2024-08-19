class Calculator{
    class Addition{
       double num1,num2;
       public void performAddition(){
        System.out.println("The addition of "+num1+" and "+num2+" is "+(num1+num2));
       } 
    }
    class Subtraction{
        double num1,num2;
        public void performSubtraction(){
         System.out.println("The Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
        } 
     }
    class Multiplication{
        double num1,num2;
        public void performMultiplication(){
        System.out.println("The Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
        } 
    }
    class Division{
        double num1,num2;
        public void performDivision(){
         System.out.println("The division of "+num1+" and "+num2+" is "+(num1/num2));
        } 
    }
}
public class Calculator_using_InnerClasses{
    public static void main(String[] args) {
        Calculator cal_obj=new Calculator();

        //creating object of inner classes ADDITION,SUBTRACTION, Multiplication and Division
        Calculator.Addition add_obj=cal_obj.new Addition();
        add_obj.num1=9;
        add_obj.num2=3;
        add_obj.performAddition();

        Calculator.Subtraction sub_obj=cal_obj.new Subtraction();
        sub_obj.num1=45;
        sub_obj.num2=21;
        sub_obj.performSubtraction();

        Calculator.Multiplication mult_obj=cal_obj.new Multiplication();
        mult_obj.num1=19;
        mult_obj.num2=23;
        mult_obj.performMultiplication();

        Calculator.Division div_obj=cal_obj.new Division();
        div_obj.num1=21;
        div_obj.num2=3;
        div_obj.performDivision();
    }
}