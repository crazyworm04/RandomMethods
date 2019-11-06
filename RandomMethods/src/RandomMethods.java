import java.util.Scanner;

/**
 * A class of random but simple methods that I created when initially learning Java 
 * in my spare time 
 */

public class RandomMethods {
	
	/**
	 * Method that checks if the number is a Palindrome
	 * @param number the number that is checked
	 * @return true or false, depending on whether the number is a Palindrome or not  
	 */
	public static boolean isPalindrome(int number){
        
        int originalNumber = number;
        int reverseNumber = 0;

        if(number < 0){
            number -= number;
            number -= originalNumber;
        }
        
        originalNumber = number;
        
        while(number > 0){
            
            int lastDigit = number % 10;
            reverseNumber *= 10;
            reverseNumber += lastDigit;
            number /= 10;

        }
        
        if(reverseNumber == originalNumber){
            return true;
        }
        return false;
    }
	
	/**
	 * Method that checks if the number is perfect
	 * @param number the number that is checked
	 * @return true or false, depending on whether the number is perfect or not  
	 */
	public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }

        int sum = 0;

        for(int i = 1; i < number; i++){
            if(number % i == 0){  
                sum += i;      
            }
        }
        if(sum == number){
            return true;
        }
        return false;
    }
	
	/**
	 * Method that gets the greatest common divisor of two numbers
	 * @param first, second the two numbers that are compared
	 * @return highestDivisor the highest common factor of the two numbers 
	 */
	public static int getGreatestCommonDivisor(int first, int second){
        if((first < 10) || (second < 10)){
            return -1;
        }

        int highestDivisor = 0;

        for(int i = 1; i <= first && i <= second; i++){
            if(first % i == 0 && second % i == 0){
                highestDivisor = i;
            }
        }
        
        return highestDivisor;
    }
	
	/**
	 * Method that checks if the number is prime or not
	 * @param number the number that is checked
	 * @return true or false, depending on whether the number is prime  
	 */
	public static boolean isPrime(int number){

        if(number == 1){
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
	
	/**
	 * Method that checks if the specified year is a leap year
	 * @param number the year that it is checked
	 * @return true or false, depending if the year is a leap year  
	 */
	public static boolean isLeapYear(int year){
        if((year < 0) && (year < 1000)){
            return false;
        }
        else if(year % 400 == 0){
            return true;
        }
        else if(year % 4 == 0){
            if(year % 100 == 0){
                return false;
            }
            else{
                return true;
            }
        }         
            return false;        
    }
	
	/**
	 * Method that checks if the number is a Palindrome
	 * @param number the number that is checked
	 * @return true or false, depending on whether the number is a Palindrome or not  
	 */
	public static boolean hasSharedDigit(int firstNumber, int secondNumber){
        if(((firstNumber < 10) || (firstNumber > 99)) || ((secondNumber < 10) || (secondNumber > 99))){
            return false;
        }
        
        String numberOne = Integer.toString(firstNumber);
        String numberTwo = Integer.toString(secondNumber);

        for(int i = 0; i < numberOne.length(); i++){
            for(int j = 0; j < numberTwo.length(); j++){
                if(numberOne.charAt(i) == numberTwo.charAt(j)){
                    return true;
                }
            }
        }
        return false;
	}

	/**
	 * Method that adds the first and last digit of any number
	 * @param number the number to sum the digits (first and last) of 
	 * @return the sum of the first and last digits 
	 */
	public static int sumFirstAndLastDigit(int number){
        if(number < 0 ){
            return -1;
        }
    int lastDigit = number % 10;

    String digit = Integer.toString(number);
    char firstNum = digit.charAt(0);
    int firstDigit = Integer.parseInt("" + firstNum);
       
    return firstDigit + lastDigit;
    }
	
	/**
	 * Method that checks if the number is odd
	 * @param number the number that is checked
	 * @return true or false, depending on whether the number is odd 
	 */
	public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }
        else if(number % 2 == 1){
            return true;
        }
        
        return false;
    }
	
	/**
	 * Method that adds all of the odd numbers between the specified range
	 * @param start, end the two numbers that determine the range
	 * @return total, the sum of all the odd numbers between the range   
	 */
	public static int sumOdd(int start, int end){
        
        if((end < start) || ((start < 0) || (end < 0))){
            return -1;
        }

        int total = 0;

        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                total += i;
            }
        }

        return total;
    }
	
	/**
	 * Method that finds the sum of the even digits within a number
	 * @param number the number of which, has its even digits added
	 * @return total the total sum of the number's even digits  
	 */
	public static int getEvenSum(int number){
        if(number < 0){
            return -1;
        }

        int total = 0;
        
        while(number > 0){
        
       
	        int lastDigit = number % 10;
	        
	        if(lastDigit % 2 == 0){
	            total += lastDigit;
	        }
	
	        number /= 10;

        }
        return total;
    }
	
	/**
	 * Method that prints the sum and average of the input provided by the user
	 */
	public static void inputThenPrintSumAndAverage(){

        int total = 0;
        int numbers = 0;
        int count = 0;
        long average = 0;
        Scanner input = new Scanner(System.in);

        while(true){
            
            if(input.hasNextInt()){
            	
            	count++;
                numbers = input.nextInt();                
                total += numbers;
                
                average = Math.round(total / (double)count);
            }
            else{
                System.out.println("SUM = " + total + " AVG = " + average);
                break;
            }
        }
        input.close();
	}	
   
	public static void main(String[] args) {
		
		
	}
}

