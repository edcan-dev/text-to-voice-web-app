package dev.edcan.texttovoice.entities;


public class TextUploadResponse {

    private Boolean isSubmited;

    public Boolean isSubmited() {
        return isSubmited;
    }
    public void setSubmited(Boolean submited) {
        isSubmited = submited;
    }

    public TextUploadResponse(Boolean isSubmited) {
        this.isSubmited = isSubmited;
    }
}
