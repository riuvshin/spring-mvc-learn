package com.rakas.mvc.web.form;

/**
 * @author <a href="mailto:riuvshin@codenvy.com">Roman Iuvshin</a>
 * @version $Id: 4:45 PM 8/26/13 $
 */
public class Message {

    private String type;

    private String message;

    public Message(){}

    public Message(String type, String message){
        this.type = type;
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
