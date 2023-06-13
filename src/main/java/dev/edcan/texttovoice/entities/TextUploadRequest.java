package dev.edcan.texttovoice.entities;

public class TextUploadRequest {

    private String text;

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }


    public TextUploadRequest() {}
    
    public TextUploadRequest(String text) {
        this.text = text;
    }
}
