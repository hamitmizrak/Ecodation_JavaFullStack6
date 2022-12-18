package com.hamitmizrak.javasetutorials;

// IO
//absolute path: statiktir. resim
//relative path: dinamiktir. root

// 8 bit=1byte
//fileInputStream
//fileOutputStream

import lombok.extern.log4j.Log4j2;

import java.io.*;

// 16 bit=2byte
//fileWriter
//fileReader
@Log4j2
public class _22_FileIO {

    private static final String PATH = "C:\\io\\ecodation\\data.txt";


    //dosya yazmak
    private static void fileWriterData() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH, true))) {
            bufferedWriter.write("1.satır\n2.satır");
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Dosya okumak
    private static void fileReaderData() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
            StringBuilder stringBuilder = new StringBuilder();
            String rows = "";
            while ((rows = bufferedReader.readLine()) != null) {
                stringBuilder.append(rows).append("\n");
            }
            String data = stringBuilder.toString();
            System.out.println(data);
            log.info(data);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        /*File file=new File(PATH);
        System.out.println(file.canWrite());
        System.out.println("dosya mı ? "+file.isFile());
        System.out.println("dizin mi? "+file.isDirectory());
        System.out.println(" "+file.getTotalSpace());
        System.out.println(" "+file.getFreeSpace());*/

        //fileWriterData();
        fileReaderData();
    }

}

