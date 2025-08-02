package com.java.fileProgram;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CheckFileExist {

    public static  void main(String args[]) throws IOException {

    //Users/pankajkumar
        // File name specified /Users/pankajkumar/Documents
        File obj = new File("/Users/pankajkumar/Documents/myfile.txt");
        if(obj.createNewFile()){
            System.out.println("File Created! " +obj.getName());
        }
      else System.out.print("Not created ");


        FileWriter fileWriter=new FileWriter("/Users/pankajkumar/Documents/myfile.txt");
                   fileWriter.write("Test File content");
                   fileWriter.close();
                   System.out.println("Sussfully file write");

                    ///read file form file.
        File fileReader=new File("/Users/pankajkumar/Documents/myfile.txt") ;
        Scanner sc=new Scanner(fileReader);
        while(sc.hasNext()){
            String data=sc.nextLine();
            System.out.println(data);
        }
        sc.close();

        String files="/Users/pankajkumar/Documents/myfile.txt";
        FileReader reader=new FileReader(files);
        BufferedReader br=new BufferedReader(reader);
           String line;
           while((line= br.readLine())!=null){
               System.out.println(line);
           }
           br.close();
           reader.close();



           ///Files.readAllLines (Java 8+)

        List<String> lines= Files.readAllLines(Paths.get(files));
           for(String str:lines)
           {
               System.out.println(str);
           }


        ///Always handle exceptions (especially IOException) while reading files.
        //
        //Make sure the file path is correct and accessible.
        //
        //For larger files, prefer using BufferedReader to avoid memory issues

    }
}
