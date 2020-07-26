package Calculator_Java;

public class Operations {
    float a,b,res;
    char o;
    Operations(){
        a=0;
        b=0;
        res=0;
    }
    public float getOutput(float a,char operator,float b){

        switch (operator){
            case '+':
                return add(a,b);
            case '-':
                return subtract(a,b);
            case '*':
                return multiply(a,b);
            case '/':
                return divide(a,b);

        }

        return -1;

    }
    public float add(float a,float b){
        return a+b;
    }
    public float subtract(float a,float b){
        return a-b;
    }
    public float multiply(float a,float b){
        return a*b;
    }
    public float divide(float a,float b){
        return a/b;
    }
}
