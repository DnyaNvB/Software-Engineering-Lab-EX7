package MiniJava.codeGenerator;

public class DirectAddress implements AddressType {
    @Override
    public String format(int num) {
        return Integer.toString(num);
    }
}