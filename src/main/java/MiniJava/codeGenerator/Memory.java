package MiniJava.codeGenerator;

import java.util.ArrayList;

/**
 * Created by mohammad hosein on 6/27/2015.
 */
public class Memory {
    private ArrayList<_3AddressCode> codeBlock;
    private int lastTempIndex;
    private int lastDataAddress;
    private final int stratTempMemoryAddress = 500;
    private final int stratDataMemoryAddress = 200;
    private final int dataSize = 4;
    private final int tempSize = 4;

    public Memory() {
        codeBlock = new ArrayList<>();
        lastTempIndex = stratTempMemoryAddress;
        lastDataAddress = stratDataMemoryAddress;
    }

    public void increaseTemp() {
        lastTempIndex += tempSize;
    }

    public int getTemp() {
        return lastTempIndex - tempSize;
    }

    public void increaseDateAddress() {
        lastDataAddress += dataSize;
    }

    public int getDateAddress() {
        return lastDataAddress - dataSize;
    }

    public int saveMemory() {
        codeBlock.add(new _3AddressCode());
        return codeBlock.size() - 1;
    }

    public void add3AddressCode(Operation op, Address opr1, Address opr2, Address opr3) {
        add3AddressCodeInternal(codeBlock.size(), op, opr1, opr2, opr3);
    }

    public void add3AddressCode(int i, Operation op, Address opr1, Address opr2, Address opr3) {
        codeBlock.remove(i);
        add3AddressCodeInternal(i, op, opr1, opr2, opr3);
    }

    private void add3AddressCodeInternal(int index, Operation op, Address opr1, Address opr2, Address opr3) {
        codeBlock.add(index, new _3AddressCode(op, opr1, opr2, opr3));
    }

    public int getCurrentCodeBlockAddress() {
        return codeBlock.size();
    }

    public void pintCodeBlock() {
        System.out.println("Code Block");
        printCodeBlockEntries();
    }

    private void printCodeBlockEntries() {
        for (int i = 0; i < codeBlock.size(); i++) {
            printCodeBlockEntry(i, codeBlock.get(i));
        }
    }

    private void printCodeBlockEntry(int index, _3AddressCode code) {
        System.out.println(formatCodeBlockEntry(index, code));
    }

    private String formatCodeBlockEntry(int index, _3AddressCode code) {
        return index + " : " + code.toString();
    }
}

class _3AddressCode {
    public Operation operation;
    public Address Operand1;
    public Address Operand2;
    public Address Operand3;

    public _3AddressCode() {}

    public _3AddressCode(Operation op, Address opr1, Address opr2, Address opr3) {
        operation = op;
        Operand1 = opr1;
        Operand2 = opr2;
        Operand3 = opr3;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("(");
        res.append(operationToString()).append(",");
        res.append(operandToString(Operand1)).append(",");
        res.append(operandToString(Operand2)).append(",");
        res.append(operandToString(Operand3)).append(")");
        return res.toString();
    }

    private String operationToString() {
        return operation == null ? "" : operation.toString();
    }

    private String operandToString(Address operand) {
        return operand == null ? "" : operand.toString();
    }
}
