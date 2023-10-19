package dio.webapi.handler;

public class MandatoryFieldsException extends BusinessException{

    public MandatoryFieldsException(String field) {
        super("O campo %s é obrigatório", field);
    }

}
