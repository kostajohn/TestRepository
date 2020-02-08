
public class homeworkTwo {

	public static void main (String [] args) {

		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = false;
		
		double costOfMilk = 2.50;
		double moneyInWallet = 10.00;
		double thirstLevel = 5;
		
		boolean shouldBuyIcecream = (isHotOutside) && (hasMoneyInPocket);
		boolean shouldGoSwimming = (isHotOutside) && (!isWeekday);
		boolean isAGoodDay = ((isHotOutside) && (hasMoneyInPocket) && (isWeekday));
		boolean willBuyMilk = (isHotOutside) && (thirstLevel >= 3) && (moneyInWallet >= (2 * costOfMilk));
		
		System.out.println(shouldBuyIcecream);
		
	}
}
