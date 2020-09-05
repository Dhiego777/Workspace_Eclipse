	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class TimeConversion {

	    public static void main(String[] args) throws ParseException{
	        Scanner in = new Scanner(System.in);
	        String time = in.next();
	        System.out.println(new SimpleDateFormat("HH:mm:ss").format(new SimpleDateFormat("hh:mm:ssa").parse(time)));
	    }
	}