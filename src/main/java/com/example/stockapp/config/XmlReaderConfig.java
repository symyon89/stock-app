package com.example.stockapp.config;


import com.example.stockapp.dto.ProduseListDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


@Configuration
public class XmlReaderConfig {
//    @Bean
//        public ProduseListDto unmarshall() throws JAXBException, FileNotFoundException {
//            JAXBContext context = JAXBContext.newInstance(ProduseListDto.class);
//            File file = new File("src/main/resources/STOCURI_NOI/stocuri_noi.xml");
//
////
////        if(file.renameTo
////                (new File("src/main/resources/STOCURI_PROCESATE/stocuri_procesate.xml")))
////        {
////            file.delete();
////            System.out.println("File moved successfully");
////        }
////        else
////        {
////            System.out.println("Failed to move the file");
////        }
//        return (ProduseListDto) context.createUnmarshaller()
//                .unmarshal(new FileReader(file));
//    }
}
