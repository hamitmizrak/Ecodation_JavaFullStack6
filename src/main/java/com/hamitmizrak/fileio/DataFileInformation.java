package com.hamitmizrak.fileio;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

//lombok
@Data
@Log4j2
public class DataFileInformation {

    //field data
    private String id;
    private String path;
    private File file;

    //parametresiz constructor
    public DataFileInformation() {
        this.id = UUID.randomUUID().toString();
        path = FilePathNameStaticData.FILE_PATH;

        //file
        file = new File(path);

        //exception handling
        try {
            //ilgili path yoksa oluştursun varsa oluşturmasın
            if (file.createNewFile()) {
                log.info("ID: "+id+" "+   file + " path oluşturuldu");
                System.out.println("ID: "+id+" "+ file + " oluşturuldu");
            } else {
                log.error("ID: "+id+" "+ file + " zaten oluşturulmuş");
                System.err.println("ID: "+id+" "+ file + " zaten oluşturulmuş");
                //exception fırlatma
                throw  new HamitMizrakException(file + " zaten oluşturulmuş");
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }// end parametresiz constructor

    public static void main(String[] args) {
        DataFileInformation dataFileInformation=new DataFileInformation();
    }
}
