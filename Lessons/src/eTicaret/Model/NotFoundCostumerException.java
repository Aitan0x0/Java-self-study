package eTicaret.Model;

public class NotFoundCostumerException extends RuntimeException {
    public NotFoundCostumerException(String message) {
        super("Bu ordere uygun costumer tapilmadi");
    }
}
