import java.util.*;
class stu
{
    String USN,name,branch;
    long ph;
    double percentage;
    stu(String a,String b,String c,long d, double e)
    {
        USN=a;name=b;branch=c;ph=d;percentage=e;
    }
}
class Student
{
    public static void main(String args[])
    {
        stu ob1=new stu("1MS23CY000","A","CY",0000000000L,99);
        stu ob2=new stu("1MS23CY001","B","CY",1111111111L,98);
        stu ob3=new stu("1MS23CY002","C","CY",2222222222L,97);
        
        System.out.println(ob1.USN+"\t"+ob1.name+"\t"+ob1.branch+"\t"+ob1.ph+"\t"+ob1.percentage);
        System.out.println(ob2.USN+"\t"+ob2.name+"\t"+ob2.branch+"\t"+ob2.ph+"\t"+ob2.percentage);
        System.out.println(ob2.USN+"\t"+ob2.name+"\t"+ob2.branch+"\t"+ob2.ph+"\t"+ob2.percentage);
    }
}
