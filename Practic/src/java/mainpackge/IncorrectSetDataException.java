package mainpackge;

/*ошибка, возникающая при неверном заполнении полей классов, наследованных от
AbstactContact*/

public class IncorrectSetDataException extends Exception{
    public IncorrectSetDataException(String message) {
        super(message);
    }
}
