package com.hcmmigration.main.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple Java program to read CSV file in Java. In this program we will read
 * list of books stored in CSV file as comma separated values.
 * 
 * @author WINDOWS 8
 *
 */
public class ch_csv {

    public ch_csv() {
        List<Book> books = readBooksFromCSV("ch.csv");

        // let's print all the person read from CSV file
        for (Book b : books) {
            System.out.println(b);
        }
    }

    private static List<Book> readBooksFromCSV(String fileName) {
        List<Book> books = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {

            // read the first line from the text file
            String line = br.readLine();

            // loop until all lines are read
            while (line != null) {

                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(",");

                Book book = createBook(attributes);

                // adding book into ArrayList
                books.add(book);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return books;
    }

    private static Book createBook(String[] metadata) {
       

         String ippfrom =metadata[0];
         String ipto = metadata[1];
         String line_1 =metadata[2];
         String line_2 = metadata[3];
         String country_Code = metadata[4];
         String country = metadata[5];

        // create and return book of this metadata
        return new Book(ippfrom, ipto, line_1, line_2, country_Code, country);
    }

}

class Book {
   
    private String ippfrom = "";
    private String ipto = "";
    private String line_1 = "";
    private String line_2 = "";
    private String country_Code = "";
    private String country = "";

    public Book(String ippfrom, String ipto, String line_1, String line_2, String country_Code, String country){

        this.ippfrom = ippfrom;
        this.ipto = ipto;
        this.line_1 = line_1;
        this.line_2 = line_2;
        this.country_Code = country_Code;
        this.country = country;

    }


    public String getippfrom() {
		return ippfrom;
	}
	public void setippfrom(String v) {
		this.ippfrom = v;
	}
	public String getipto() {
		return ipto;
	}
	public void setName(String ipto) {
		this.ipto = ipto;
	}
	public String getLine1() {
		return line_1;
	}
	public void setline_1(String line_1) {
		this.line_1 = line_1;
	}
	public String getline_2() {
		return line_2;
    }
    
	public String setcountry_Code() {
		return country_Code;
	}

	public void setcountry_Code(String country_Code) {
		this.country_Code = country_Code;
	}
	public String getcountry() {
		return country;
	}
	public void setcountry(String country) {
		this.country = country;
	}	

    @Override
    public String toString() {
        return "Book [from=" + ippfrom + ", to=" + ipto + ", line_1=" + line_1 
                + ", line_2=" + line_2 + ", Code=" + country_Code + ", Country=" + country +  "]";
    }

}