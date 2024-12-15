package MiniJava.codeGenerator;

public class IndirectAddress implements AddressType {
    @Override
    public String format(int num) {
        return "@" + num;
    }
}