import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_PATTERN = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public Email(){
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    public boolean validateEmail(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
