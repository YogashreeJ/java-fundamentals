package Encapsulation;

class Bank{
    //private variables which cant be accessed directly
    private int accNo;
    //public getters and setters
    public int getNo(){
        return accNo;
    }
    public void setNo(int no){
        accNo=no;
    }

}

public class Encapsulation {
    public static void main(String[] args){
        Bank sbi=new Bank();
        //Can't access the private variable
        sbi.setNo(100);
        int num=sbi.getNo();//getter
        System.out.println(num);
        
    }
    
}
