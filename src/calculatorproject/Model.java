package calculatorproject;
import java.lang.Math;
import java.text.DecimalFormat;

public class Model {
    
    private double num1 = 0;
    private double num2 = 0;
    private String output = "";
    private String operator = "";
    private double answer = 0;
    private String resultMessage;
    private boolean degrees = true;
      
    public String buttonClick(String number){    
        //First click of first number
        if (getNum1()==0 && getOperator()=="" && getOutput()=="" && getOutput()!="0."){       
            setOutput(number);  
            setNum1(Double.parseDouble(getOutput()));                      
        }
        //Second click of first number if it's "0."
        else if (getNum1()==0 && getOperator()=="" && getOutput()=="0."){       
            setOutput(getOutput() + number);
            setNum1(Double.parseDouble(getOutput()));                      
        }
        //Second click of first number
        else if (getNum1()!=0 && getOperator()=="" && getOutput()!=""){
            setOutput(getOutput() + number);
            setNum1(Double.parseDouble(getOutput()));            
        }
        //First click of second number
        else if (getNum2()==0 && getOperator()!="" && getOutput()!="0."){
            setOutput("");
            setOutput(getOutput() + number);
            setNum2(Double.parseDouble(getOutput()));        
        }
        //Second click of second number if it's "0."
        else if (getNum2()==0 && getOperator()!="" && getOutput()=="0."){
            
            setOutput(getOutput() + number);
            setNum2(Double.parseDouble(getOutput()));
         }
        //Second click of second number
        else if (getNum1()!=0 && getOperator()!="" && getNum2()!=0){
            setOutput(getOutput() + number);
            setNum2(Double.parseDouble(getOutput()));        
        }
        
    return output;
    }

    public double Calculate() {
        if (getOperator()=="+") {
            setAnswer((num1 + num2));  
        }
        else if (getOperator()=="-"){
            setAnswer((num1 - num2));
        }
        else if (getOperator()=="*"){
            setAnswer((num1 * num2));
        }
        else if (getOperator()=="^"){
            setAnswer (Math.pow(num1, num2));    
        }
        else if (getOperator()==""){
            setAnswer(num1);
        }
        else if (getOperator()=="/"){
            if (num2!=0){
                answer=num1/num2;
            }
            else {
                throw new ArithmeticException ("ERROR");
                }
            
        }
        
        return answer;
        
    }
    
    public void buttonPi(){
        if (getNum1()==0 && getOperator()=="" && getOutput()==""){
            setOutput(String.valueOf(Math.PI));
            setNum1(Double.parseDouble(getOutput()));
        }
        else if (getNum1()!=0 && getOperator()!="" && getNum2()==0){
            setOutput(String.valueOf(Math.PI));
            setNum2(Double.parseDouble(getOutput()));
        }
    }
    
    public void buttonE(){
        if (getNum1()==0 && getOperator()=="" && getOutput()==""){
            setOutput(String.valueOf(Math.E));
            setNum1(Double.parseDouble(getOutput()));
        }
        else if (getNum1()!=0 && getOperator()!="" && getNum2()==0){
            setOutput(String.valueOf(Math.E));
            setNum2(Double.parseDouble(getOutput()));
        }
    }
            
    public void dotButton(){
        if (getNum1()==0 && getOperator()==""){
            setOutput("0.");
        }
        else if (getNum1()!=0 && getOperator()==""){
            setOutput(String.valueOf((int)getNum1())+".");
            setNum1(Double.parseDouble(getOutput()));
        }
        else if (getNum2()==0 && getOperator()!=""){
            setOutput("0.");
            setNum2(Double.parseDouble(getOutput()));
        }
        else if (getNum2()!=0 && getOperator()!=""){
            setOutput(String.valueOf((int)getNum2())+".");
            setNum2(Double.parseDouble(getOutput()));
            }
    }
    
    public void plusMinus(){
        if (num1!=0 && num2!=0){
            num2 = -num2;
            setOutput(String.valueOf(num2));
        }
        if (num1!=0 && num2==0){
            num1 = -num1;
            setOutput(String.valueOf(num1));
        }
    }
    
    public void clearEntry() {
        setNum2(0);
        setOutput("");
    }
    
    public void clearAll(){
       setNum1(0);
       setNum2(0);
       setOutput("");
       setOperator("");
       setAnswer(0);
    }
    
    public void reciprocal(){
        if (getNum1()!=0 && getNum2()!=0){
            setNum2(1/getNum2());
            setOutput(String.valueOf(getNum2()));
        }
        else if (getNum1()!=0 && getNum2()==0){
            setNum1(1/getNum1());
            setOutput(String.valueOf(getNum1()));
        }
        else {
            throw new ArithmeticException ("ERROR");
        }
    }
    
    public void sin(){
        if (getNum1()!=0 && getNum2()==0){
            if (degrees == true){
                setOutput(String.valueOf(Math.sin(Math.toRadians(num1))));
                setNum1(Double.parseDouble(getOutput()));
            }
            else if (degrees == false){
                setOutput(String.valueOf(Math.sin(num1)));
                setNum1(Double.parseDouble(getOutput()));
            } 
       }
        else if (getNum1()!=0 && getNum2()!=0) {
            if (degrees = true){
                setOutput(String.valueOf(Math.sin(Math.toRadians(num2))));
                setNum2(Double.parseDouble(getOutput()));
            }
            else if (degrees == false){
                setOutput(String.valueOf(Math.sin(num2)));
                setNum2(Double.parseDouble(getOutput()));
            } 
        }
    }
    
    public void tan() {
        if (getNum1()!=0){
            if (degrees == true){
                setOutput(String.valueOf(Math.tan(Math.toRadians(num1))));
                setNum1(Double.parseDouble(getOutput()));
            }
            else if (degrees == false){
                setOutput(String.valueOf(Math.tan(num1)));
                setNum1(Double.parseDouble(getOutput()));
            }
        }
        else if (getNum1()!=0 && getNum2()!=0) {
            if (degrees = true){
                setOutput(String.valueOf(Math.tan(Math.toRadians(num2))));
                setNum2(Double.parseDouble(getOutput()));
            }
            else if (degrees == false){
                setOutput(String.valueOf(Math.tan(num2)));
                setNum2(Double.parseDouble(getOutput()));
            } 
        }
    }
    
    public void cos() {
        if (getNum1()!=0){
            if (degrees == true){
                setOutput(String.valueOf(Math.cos(Math.toRadians(num1))));
                setNum1(Double.parseDouble(getOutput()));
            }
            else if (degrees == false){
                setOutput(String.valueOf(Math.cos(num1)));
                setNum1(Double.parseDouble(getOutput()));
            }
        }
        else if (getNum1()!=0 && getNum2()!=0) {
            if (degrees = true){
                setOutput(String.valueOf(Math.cos(Math.toRadians(num2))));
                setNum2(Double.parseDouble(getOutput()));
            }
            else if (degrees == false){
                setOutput(String.valueOf(Math.cos(num2)));
                setNum2(Double.parseDouble(getOutput()));
            } 
        }
    }
     
    public void asin() { 
        if (getNum1()!=0 && getNum2()!=0){
            if (degrees == true){
                setOutput(String.valueOf(Math.toDegrees(Math.asin(num2))));
                setNum2(Double.parseDouble(getOutput()));
                }
            else if (degrees == false){
                setOutput(String.valueOf(Math.asin(num2)));
                setNum2(Double.parseDouble(getOutput()));
            }
        }
        else if (getNum1()!=0 && getNum2()==0){
                if (degrees == true){
                setOutput(String.valueOf(Math.toDegrees(Math.asin(num1))));
                setNum1(Double.parseDouble(getOutput()));
                
            }
            else if (degrees == false){
                setOutput(String.valueOf(Math.asin(num1)));
                setNum1(Double.parseDouble(getOutput()));
            }
        }
    } 
    
    public void acos() {
      if (getNum1()!=0 && getNum2()!=0){
            if (degrees == true){
                setOutput(String.valueOf(Math.toDegrees(Math.acos(num2))));
                setNum2(Double.parseDouble(getOutput()));
            }
            else if (degrees == false){
                setOutput(String.valueOf(Math.acos(num2)));
                setNum2(Double.parseDouble(getOutput()));
            }
        }
        else if (getNum1()!=0 && getNum2()==0){
                if (degrees == true){
                setOutput(String.valueOf(Math.toDegrees(Math.acos(num1))));
                setNum1(Double.parseDouble(getOutput()));
            }
            else if (degrees == false){
                setOutput(String.valueOf(Math.acos(num1)));
                setNum1(Double.parseDouble(getOutput()));
            }
        }
    }
    
    public void atan() {
      if (getNum1()!=0 && getNum2()!=0){
            if (degrees == true){
                setOutput(String.valueOf(Math.toDegrees(Math.atan(num2))));
                setNum2(Double.parseDouble(getOutput()));
            }
            else if (degrees == false){
                setOutput(String.valueOf(Math.atan(num2)));
                setNum2(Double.parseDouble(getOutput()));
            }
        }
        else if (getNum1()!=0 && getNum2()==0){
                if (degrees == true){
                setOutput(String.valueOf(Math.toDegrees(Math.atan(num1))));
                setNum1(Double.parseDouble(getOutput()));
            }
            else if (degrees == false){
                setOutput(String.valueOf(Math.atan(num1)));
                setNum1(Double.parseDouble(getOutput()));
            }
        }
    }
    
    public void round(int thing){
        if (getNum1()!=0 && getOperator()==""){
           double value;
           value = Math.round(getNum1()*(Math.pow(10, thing)));
           setOutput(String.valueOf(value/(Math.pow(10, thing))));   
        }
        else if (getNum1()!=0 && getNum2()!=0){
            double value;
           value = Math.round(getNum2()*(Math.pow(10, thing)));
           setOutput(String.valueOf(value/(Math.pow(10, thing)))); 
        }
    }
    
   public double factorial(int number) {
       double answer1 =1;
       for (int i = 1; i <= number; i++) {
            answer1 = answer1*i; 
            answer = answer1;
       }
       if (number == 0) {
           answer = 1;
       }
              return answer;
   }
       
    public void getFactorial(){
        if (getNum1()!=0 && getNum2()!=0){
            if (getNum2()<0 || getNum2()>20 || getNum2()%1!=0){
           throw new NumberFormatException ("ERROR");
            }
            else {
            factorial((int)getNum2());
            }
        }
        else if (getNum1()!=0 && getNum2()==0) {
            if (getNum1()<0 || getNum1()> 20 || getNum1()%1!=0){
                throw new NumberFormatException ("ERROR");
            }
            else {
                factorial((int)getNum1());
            }   
        }
        else if (getNum1()==0){
            factorial((int)getNum1());
        }
    }
    
    
        
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public String getResultMessage() {
        return resultMessage;
    }

    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    public boolean isDegrees() {
        return degrees;
    }

    public void setDegrees(boolean degrees) {
        this.degrees = degrees;
    }
      
}
