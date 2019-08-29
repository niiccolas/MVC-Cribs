import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

// EXTERNAL LIB FOR WINDOWS ANSI SUPPORT:
//export CLASSPATH=/Users/niic/Sync/Code/simplon/MVC-Cribs/lib/*.jar
//javac -classpath ../lib/jansi.jar MainAnsi.java
//java -classpath ../lib/jansi.jar MainAnsi.java

public class MainAnsi {
  public static void main(String[] args) {
    // App mvcCribs = new App();
    // mvcCribs.start();

    AnsiConsole.systemInstall();
    System.out.println( ansi().eraseScreen().bg(RED).fg(BLUE).a("Hello").fg(GREEN).a(" World").reset() );
  }
}
