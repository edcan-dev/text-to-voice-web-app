package dev.edcan.texttovoice.services.impl;

import dev.edcan.texttovoice.services.IVoiceGeneratorService;
import dev.edcan.texttovoice.utils.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.Path;

@Service
public class VoiceGeneratorServiceImpl implements IVoiceGeneratorService {

    @Autowired
    PathUtil pathUtil;

    @Override
    public void generateVoice() {
        Path voiceGeneratorPath = pathUtil.getTextToVoicePath();
        Path origenFilePath = voiceGeneratorPath.resolve("origen.txt");

    }
}
