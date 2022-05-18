package lab7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpretion {
	
	public String regexForTime() throws IOException {
		String filePath = "/Users/Vlad/eclipse-workspace/ua.iot.newlabs/labs_IoT_2022/src/lab7/fileForLab7.txt";
        File file = new File(filePath);
        BufferedReader reader =  new BufferedReader(new FileReader(file));
		
        
		final String regex = "(2[0-3]|[01]?[0-9]):([0-5]?[0-9])-(2[0-3]|[01]?[0-9]):([0-5]?[0-9])";
		String line ;
		Pattern pattern = Pattern.compile(regex);
		ArrayList<String> bs = new ArrayList<>();
		
		
		while((line = reader.readLine()) != null) {
			Matcher mt = pattern.matcher(line);
		
			if (mt.find()) {
				bs.add(mt.group());
			}		
		}
		return bs.toString();
	}
}
	
