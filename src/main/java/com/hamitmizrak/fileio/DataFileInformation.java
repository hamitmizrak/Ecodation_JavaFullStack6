package com.hamitmizrak.fileio;

import lombok.Data;
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
        path = FilePathNameStaticData.FILE_PATH.concat("\\data.txt");

        //file
        file = new File(path);

        //exception handling
        try {
            // ilgili path yoksa oluştursun varsa oluşturmasın
            // createNewFile: zaten böyle bir dosya varsa ekleme yapmasın
            if (file.createNewFile()) {
                log.info("ID: "+id+" "+   file + " path oluşturuldu");
                System.out.println("ID: "+id+" "+ file + " oluşturuldu");
            } else {
                log.error("ID: "+id+" "+ file + " zaten oluşturulmuş");
                System.out.println("ID: "+id+" "+ file + " zaten oluşturulmuş");
                //exception fırlatma
               // throw  new HamitMizrakException(file + " zaten oluşturulmuş");
            }
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }// end parametresiz constructor
}
