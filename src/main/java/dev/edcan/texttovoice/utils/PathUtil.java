package dev.edcan.texttovoice.utils;

import org.springframework.stereotype.Component;

import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class PathUtil {

    public Path getTextToVoicePath() {
        return Paths.get(System.getProperty("user.home"),"/TextToVoice").toAbsolutePath();
    }
}
