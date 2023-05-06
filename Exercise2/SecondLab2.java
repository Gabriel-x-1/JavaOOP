import java.util.Scanner;
class SecondLab2{
public static void main(String args[]){
String s="";
Scanner scan=new Scanner(System.in);
String FirstName=scan.nextLine();
String LastName=scan.nextLine();
String CNP=scan.nextLine();
s=s+FirstName.substring(0, 2).toLowerCase()+LastName.substring(LastName.length()-2,LastName.length()).toUpperCase();
System.out.println(s);
}}