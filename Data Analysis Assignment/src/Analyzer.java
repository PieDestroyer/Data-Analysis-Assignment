public class Analyzer
	{

	public static void main(String[] args)
		{
		Data.addData();
		countRecords();
		numberOfOccurrencesqqq();
		numberOfOccurrencesg();
		}

	public static void countRecords()
		{
		System.out.println("There are " + Data.data.size() + " records in the database.");
		}

	public static void numberOfOccurrencesqqq()
		{
		int total = 0;
		for (Record r : Data.data)

			{

			if (r.getLetterCode().contains("qqq"))
				
				{
				total = total + 1;
				}
			}
		System.out.println("There are " + total
				+ " occurrences of \"qqq\" in the data.");

		}
	public static void numberOfOccurrencesg()
		{
		int sum = 0;
		for (Record r:Data.data)
			{
			if (r.getLetterCode().startsWith("g"))
				{
				sum++;
				}
			}
		System.out.println("There are "+ sum +" records beginning with the letter \"g\".");
		System.out.println("That is "+sum/Data.data.size()+ "% of the records.");
		}
	
	}
