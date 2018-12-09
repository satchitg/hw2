package hw2;
import java.io.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class match {
	public static void main(String[] args)throws Exception
{
	int count=0;
BufferedReader reader1=new BufferedReader(new FileReader("C:\\Users\\WELCOME\\Desktop\\satchit\\csx-351-hw2-satchitg-master\\HW2-dictionary.txt"));
ArrayList<String>dictionary=new ArrayList<String>();
String currLine=reader1.readLine();
while(currLine!=null)
{
	dictionary.add(currLine);
	currLine=reader1.readLine();
}
Collections.sort(dictionary);
BufferedWriter writer1=new BufferedWriter(new FileWriter("C:\\Users\\WELCOME\\Desktop\\JAVA LAB\\HW2\\HW2-dicsort.txt"));
for(String line : dictionary)
{
	writer1.write(line);
	writer1.newLine();
}
reader1.close();writer1.close();
BufferedReader reader2=new BufferedReader(new FileReader("C:\\Users\\WELCOME\\Desktop\\JAVA LAB\\HW2\\HW2-keywords.txt"));
ArrayList<String>keyword=new ArrayList<String>();
String currLine2=reader2.readLine();
while(currLine2!=null)
{
	keyword.add(currLine2);
	currLine2=reader2.readLine();
}
Collections.sort(keyword);
BufferedWriter writer2=new BufferedWriter(new FileWriter("C:\\Users\\WELCOME\\Desktop\\JAVA LAB\\HW2\\HW2-keysort.txt"));
for(String line : keyword)
{
	writer2.write(line);
	writer2.newLine();
}
reader2.close();writer2.close();
for(int i=0;i<84;i=i+1)
{
	for(int j=0;j<16000;j=j+1)
	{
		boolean x=keyword.get(i).equals(dictionary.get(j));
		if(x)
		{count=count+1;i=i+1;}
	}
		System.out.println("keyword not found:"+ keyword.get(i));
		
}
int x=84-count;
System.out.println("no.of keywrds not found="+ x);
}
}








