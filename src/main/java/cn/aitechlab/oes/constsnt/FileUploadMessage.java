package cn.aitechlab.oes.constsnt;

public class FileUploadMessage {
    int Type;
    String message;

    public FileUploadMessage() {
    }

    public FileUploadMessage(int type, String message) {
        this.Type = type;
        this.message = message;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public String getMessage() {
        return message;
    }


}
