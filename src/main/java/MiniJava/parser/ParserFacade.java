package MiniJava.parser;

import MiniJava.errorHandler.ErrorHandler;

import java.util.Scanner;

public class ParserFacade {
    private final Parser parser;

    public ParserFacade() {
        this.parser = new Parser();
    }

    public void parseInput(Scanner inputScanner) {
        try {
            parser.startParse(inputScanner);
        } catch (Exception e) {
            ErrorHandler.printError("An error occurred during parsing: " + e.getMessage());
        }
    }
}