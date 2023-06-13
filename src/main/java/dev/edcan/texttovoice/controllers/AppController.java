package dev.edcan.texttovoice.controllers;


import dev.edcan.texttovoice.entities.TextUploadRequest;
import dev.edcan.texttovoice.entities.TextUploadResponse;
import dev.edcan.texttovoice.services.IFileWriterService;
import dev.edcan.texttovoice.utils.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping( value ="/app")
public class AppController {

    @Autowired
    IFileWriterService fileWriterService;

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping(value = "/uploadText", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TextUploadResponse> uploadText(@RequestBody TextUploadRequest text) {

        System.out.println(text.getText());

        if(! fileWriterService.writeTxtFileFromString(text.getText())) {
            System.out.println("========== Error al guardar el texto ==========");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        } else {


            return new ResponseEntity<>(new TextUploadResponse(true), HttpStatus.OK);
        }

    }
}
