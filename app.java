
public class Main 
{
public static void main(String[] args) {

double itemPrice = 5.23;
double wallet = 20.00;
int numberOfFriends = 20;
int age = 28;
String firstName = "John";
String lastName = "Kosta";
String middleInitial = "x";

double currentWallet = wallet - itemPrice;
double friendPerYear = age / numberOfFriends;
String fullName = firstName + "" + middleInitial + "" + lastName;
}
System.out.println(fullName);
}