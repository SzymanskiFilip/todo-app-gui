package eu.filip.todoappgui;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<String> getTodos(){
        File file = new File("src/todos.txt");
        ArrayList<String> todos = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                todos.add(scanner.nextLine());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return todos;
    }

    public static void overrideTodos(ArrayList<String> todosToOverride){
        File file = new File("src/todos.txt");
        try{
            FileWriter fileWriter = new FileWriter(file);
            String toWrite = "";
            for(String todo : todosToOverride){
                toWrite += todo + "\n";
            }
            fileWriter.write(toWrite);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
