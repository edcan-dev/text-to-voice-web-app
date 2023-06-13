package dev.edcan.texttovoice.services.impl;

import dev.edcan.texttovoice.services.IFileWriterService;
import dev.edcan.texttovoice.utils.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class FIleWriterServiceImpl implements IFileWriterService {

    @Autowired
    PathUtil pathUtil;

    @Override
    public boolean writeTxtFileFromString(String text) {

        File origenFile = new File(
                pathUtil.getTextToVoicePath()
                        .resolve("origen.txt").toUri());

        try (FileWriter writer = new FileWriter(origenFile)) {
            writer.write(text);
            writer.close();
            System.out.println("========== Se ha escrito el archivo ==========");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
