package MiniJava.codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    public int num;
    public AddressType type;
    public varType varType;

    public Address(int num, varType varType, AddressType type) {
        this.num = num;
        this.type = type;
        this.varType = varType;
    }

    public Address(int num, varType varType) {
        this.num = num;
        this.type = new DirectAddress();
        this.varType = varType;
    }

    @Override
    public String toString() {
        return type.format(num);
    }
}