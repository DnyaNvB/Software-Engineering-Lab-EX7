package MiniJava.scanner;

import MiniJava.scanner.token.Token;

public class ScannerFacade {
    private final LexicalAnalyzer lexicalAnalyzer;

    public ScannerFacade(java.util.Scanner scanner) {
        this.lexicalAnalyzer = new LexicalAnalyzer(scanner);
    }

    public Token getNextToken() {
        return this.lexicalAnalyzer.getNextToken();
    }

}