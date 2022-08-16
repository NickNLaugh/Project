import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

/**
 * 表达式求值
 */
public class HJ54 {
    public static void main(String[] args) throws ScriptException {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            str=str.replace('{','(');
            str=str.replace('}',')');
            str=str.replace('[','(');
            str=str.replace(']',')');
            ScriptEngine engine=new ScriptEngineManager().getEngineByName("nashorn");
            System.out.println(engine.eval(str));
        }
    }

}
