package MiniJava.codeGenerator;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public class Address {
    private int num;
    private AddressType type;
    private varType varType;

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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public AddressType getType() {
        return type;
    }

    public void setType(AddressType type) {
        this.type = type;
    }

    public varType getVarType() {
        return varType;
    }

    public void setVarType(varType varType) {
        this.varType = varType;
    }

    @Override
    public String toString() {
        return type.format(num);
    }
}
