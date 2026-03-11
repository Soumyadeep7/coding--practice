import java.util.Scanner;
 public class Main{
public static void main(String[]Args){
int nums[]={4,1,2,1,2};
int XOR=0;
for(int num:nums){
XOR=XOR^num;
}
System.out.println(XOR);
}
}
