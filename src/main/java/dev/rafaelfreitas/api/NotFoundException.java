package dev.rafaelfreitas.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-11-06T21:16:01.493Z")

public class NotFoundException extends ApiException {
    private int code;
    public NotFoundException (int code, String msg) {
        super(code, msg);
        this.code = code;
    }
}
