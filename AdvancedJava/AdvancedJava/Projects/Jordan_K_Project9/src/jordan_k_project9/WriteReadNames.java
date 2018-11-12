/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jordan_k_project9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.IOException;

public class WriteReadNames {

    private String namesToWrite[];
    private String namesRead[] = new String[7];
    private FileWriter fnames;
    private File nameFile;
    private File readName;
    private String nameOfFile;

    public WriteReadNames() {

    }

    public String[] writeToArray(String[] array) {
        namesToWrite = array;
        return namesToWrite;
    }

    public void writeFile() throws IOException {
        File nameFile = new File("namesOut.txt");
        FileWriter fNames = null;
        System.out.println("writeFile method");
        try {
            fNames = new FileWriter(nameFile);
            System.out.println("WriteNames Class: ");
            for (int i = 0; i < namesToWrite.length; i++) {
                fNames.write(namesToWrite[i] + String.format("%n"));
                System.out.print(namesToWrite[i] + "\n");
            }
            fNames.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        nameOfFile = nameFile.getName();
    }

    public String getName() {
        return nameOfFile;
    }
//public void readFile(File tempName) throws IOException{
//    readName = tempName;
//    int i = 0;
//    System.out.println("readFile Method.");
//    try{
//        Scanner inputFile = new Scanner(readName);
//        while (inputFile.hasNext() && i < namesRead.length){
//            namesRead[i] = inputFile.next();
//            System.out.print(namesRead[i] + "\n");
//            i++;
//        }
//    }
//    catch (IOException e){
//        e.printStackTrace();
//    }
//}

    public String[] readFile() throws IOException {

        
        System.out.println("readFile Method.");
          File newNameFile = new File("namesOut.txt");
            BufferedReader br = new BufferedReader(new FileReader(newNameFile));
        try {
          
            int i = 0;
            String line;
            while ((line = br.readLine()) != null) {
              //  System.out.println(line);
                namesRead[i] = line;
                i++;
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return namesRead;
    }
}
