import java.util.Scanner;
class vowel_count{
public static void main(String[] args){
Scanner ob = new Scanner(System.in);
System.out.println("Enter a string");
String s=ob.nextLine();
String s1=s.toUpperCase();
int l=s1.length();
int v=0;
for(int i=0;i<l;i++){
char ch = s1.charAt(i);
if(ch=='A'||ch=='I'||ch=='E'||ch=='O'||ch=='U'){
v++;
}
}
System.out.println("Total no of vowel="+v);
}
}