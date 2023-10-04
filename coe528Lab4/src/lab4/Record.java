/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;        
/**
 *
 * @author ahsaa
 */
public class Record {
    // Name of the associated file
    private String filename;
    private static Record instance;
    
    public Record(String n) {
        filename = n;
    }
    public static Record getInstance() {
        if(instance == null){
            instance = new Record("record.txt");
        }
        return instance;
    }
    // Effects: Reads and prints the contents of the associated
    // file to the standard output.
    public void read() {
        try {
            FileReader readText = new FileReader(filename);
            Scanner user = new Scanner(readText);
            while(user.hasNextLine()){
                System.out.println(user.nextLine());
            }
        } catch (IOException e) {
            System.out.println("An Error Occurred!");
            e.printStackTrace();
        }
    }
    // Effects: Appends the specified message, msg, to the
    // associated file.
    public void write(String msg){
        try { 
            FileWriter writeText = new FileWriter(filename,true);
            writeText.write(msg);
            writeText.close();
        } catch (IOException e) {
            System.out.println("An Error Occurred!");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
    // Fill the blank below that obtains the sole instance
    // of the Record class.
    // (You should not invoke the Record constructor here.)
        Record r = getInstance();
    //Do not modify the code below
        r.write("Hello-1\n");
        r.write("Hello-2\n");
        System.out.println("Currently the file record.txt " +
        "contains the following lines:");
        r.read();
    }
}
