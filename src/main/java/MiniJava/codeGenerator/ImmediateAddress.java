package MiniJava.codeGenerator;

public class ImmediateAddress implements AddressType {
    @Override
    public String format(int num) {
        return "#" + num;
    }
}

