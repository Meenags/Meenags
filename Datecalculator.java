import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.concurrent.TimeUnit;
	import java.util.Scanner;
	
public class Datecalculator {
	
		public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

			String inputString1 = sc.nextLine();
			String inputString2 = sc.nextLine();
System.out.println("Enter the inputstring1");
System.out.println("Enter the inputstring2");
		
			System.out.println(getDateDiffInDays(inputString1,inputString2));

		}

	static long getDateDiffInDays(String inputString1, String inputString2 )
	{
	SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
	long days=0;

	try {
	    Date date1 = myFormat.parse(inputString1);
	    Date date2 = myFormat.parse(inputString2);
	    long diff = date2.getTime() - date1.getTime();
	    days= Math.abs(TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
	    
	} catch (ParseException e) {
	    e.printStackTrace();
	}
	return days-1;
	}
	}


