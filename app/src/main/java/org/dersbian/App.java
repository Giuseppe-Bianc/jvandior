package org.dersbian;

import picocli.CommandLine;
import picocli.CommandLine.Command;

@Command(name = "jvandior", mixinStandardHelpOptions = true, version = "1.0", description = "An example application.")
public class App implements Runnable{
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        final int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public void run() {
        System.out.println(getGreeting());
    }
}
