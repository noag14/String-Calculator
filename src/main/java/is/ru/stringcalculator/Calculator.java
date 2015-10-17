package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
			}
		else if(text.contains(",")||text.contains("//")){
			return sum(splitNumbers(text));
			}
		else
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}
	
	private static String[] splitNumbers(String numbers){
		String delimiter = ",|n";
		if (numbers.startsWith("//")){
			int delimiterIndex = numbers.indexOf("//") + 2; 
			delimiter = delimiter + numbers.substring(delimiterIndex, delimiterIndex + 1); 
			numbers = numbers.substring(numbers.indexOf("n") + 1); 
			return numbers.split(delimiter);
		}
		else {
			return numbers.split(",|n");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += toInt(number);
		}
		return total;
    }
}