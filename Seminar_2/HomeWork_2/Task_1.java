package HomeWork_2;

import java.util.logging.*;

import com.sun.tools.javac.Main;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.lang.ProcessHandle.Info;

public class Task_1 {

    // Напишите программу, которая принимает с консоли число в формате byte и
    // записывает его в файл ”result.txt”.
    // Требуется перехватить все возможные ошибки и вывести их в логгер.
    //
    // После написания, попробуйте подать на вход числа 100 и 200 и проследите
    // разницу в результате
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Task_1.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter simf = new SimpleFormatter();
        fh.setFormatter(simf);
 
        
        try (FileWriter file = new FileWriter("result.txt", false)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число > ");
            Byte count = scanner.nextByte();
            file.write(count);
 /*           file.append('\n');
            file.append('2');
            file.append('\n');
            file.write("line 3");
*/
            logger.info("Programm done!");  
            file.flush();
        } catch (Exception ex) {
            String error = ex.getMessage();
            logger.log(Level.WARNING,"Error ",ex);
            logger.info(error);
            System.out.println(error);
          }
    }

}

 

