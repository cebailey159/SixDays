//Casey Bailey
//Florida Tech 1502, Section 3.4
//Programming Assignment #1, 07/23/2023
//
//This program uses static methods to compile the lyrics of the Christmas song "The 12 Days of Christmas"
//For this assignment only the first 6 verses have been called.

public class SixDays {
//this statement calls the main method to perform "singSong"
	public static void main(String[] args) {
		singSong();
	}
//this statement defines "singSong" and further calls "firstDay" to be performed
		public static void singSong() {
			firstDay();
			System.out.println();
	}
//this statement defines "firstDay" as the first line of the first verse in the song
//this statement also calls "firstGift" and "secondDay" to be performed
			public static void firstDay() {
				System.out.println("On the 1st day of Christmas, my true love sent to me");
				firstGift();
				secondDay();
	}
//this statement defines "firstGift" and prints the gift given in the first verse of the song
			public static void firstGift() {
						System.out.println("a partridge in a pear tree.");
	}
//this statement defines "secondDay" and prints the first line of the second day(verse) in the song
//this statement also calls "secondGift" and "thirdDay" to be performed
						public static void secondDay() {
							System.out.println("On the 2nd day of Christmas, my true love sent to me");
							secondGift();
							thirdDay();		
	}
//this statement defines "secondGift" and prints the gift given unique to the second day(verse) of the song
//this statement also calls "firstGift" to be performed in order to list both gifts as it appears in the song
						public static void secondGift() {
									System.out.println("two turtle doves, and");
									firstGift();
	}
//this statement defines "thirdDay" and prints the first line of the third day(verse) in the song
//this statement also calls "thirdGift" and "fourthDay" to be performed
								public static void thirdDay() {
										System.out.println("On the 3rd day of Christmas, my true love sent to me");
										thirdGift();
										fourthDay();									
	}
//this statement defines "thirdGift" and prints the gift given unique to the third day(verse) of the song
//this statement also calls "secondGift" to be performed in order to properly list all three gifts given up to this point in the song
								public static void thirdGift() {
									System.out.println("three French hens,");
									secondGift();
	}
//this statement defines "fourthDay" and prints  the first line of the fourth day(verse) of the song
//this statement also calls "fourthGift" and "fifthDay" to be performed
									public static void fourthDay() {
										System.out.println("On the 4th day of Christmas, my true love sent to me");
										fourthGift();
										fifthDay();
	}
//this statement defines "fourthGift" and prints the gift given unique to the fourth day(verse) of the song
//this statement also calls "thirdGift" in order to properly list all of the gifts given up to this point in the song
									public static void fourthGift() {
										System.out.println("four calling birds,");
										thirdGift();
	}
//this statement defines "fifthDay" and prints the first line of the fifth day(verse) of the song
//this statement also calls "fifthGift" and "sixthDay" to be performed
										public static void fifthDay() {
											System.out.println("On the 5th day of Christmas, my true love sent to me");
											fifthGift();
											sixthDay();
	}
//this statement defines "fifthGift" and prints the gift given unique to the fifth day(verse) of the song
//this statement also calls "fourthGift" in order to properly list all gifts given up to this point in the song
										public static void fifthGift() {
											System.out.println("five golden rings,");
											fourthGift();
	}
//this statement defines "sixthDay" and prints the first line of the sixth day(verse) of the song
//this statement also calls "sixthGift" to be performed
											public static void sixthDay() {
												System.out.println("On the 6th day of Christmas, my true love sent to me");
												sixthGift();
	}
//this statement defines "sixthGift" and prints the gift  given unique to the sixth day(verse) of the song
//this statement also calls "fifthGift" in order to properly list all of the gifts given up to this point in the song
											public static void sixthGift() {
												System.out.println("six geese a-laying,");
												fifthGift();
	}
								
}


