package Demo;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        /*float f = 10.0000F;
        BigDecimal bigDecimal = new BigDecimal(f);
        System.out.println(bigDecimal);
        float fnew = bigDecimal.setScale(4, BigDecimal.ROUND_HALF_UP).floatValue();
        System.out.println(fnew);*/
        Scanner input=new Scanner(System.in);

    System.out.print("请输入一个数值：");

    double num=input.nextDouble();//输入一个数值

    DecimalFormat df=new DecimalFormat("0.0");//保留一位小数

    DecimalFormat dg=new DecimalFormat("0.00");//保留两位小数

    DecimalFormat dh=new DecimalFormat("0.000");//保留三位小数

    String strnum1=df.format(num);//将num转换为字符串型

    String strnum2=dg.format(num);

    String strnum3=dh.format(num);

    System.out.println("一位小数位："+strnum1);//输出一位小数

    System.out.println("两位小数位："+strnum2);

    System.out.println("三位小数位："+strnum3);
    }
}
