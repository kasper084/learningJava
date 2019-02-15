package exception;

public class IfURLisCorrect {

    boolean stepOne(String line) throws SomeException {
        if (line.charAt(0) == '='
                || line.charAt(0) == '&'
                || line.charAt(line.length() - 1) == '='
                || line.charAt(line.length() - 1) == '&')
            throw new SomeException("Wow");
        else {
            return true;
        }
    }

    boolean stepTwo(String line) throws SomeException {
        for (int symbol = 0; symbol < line.length(); symbol++) {
            if (line.charAt(symbol) == '=' && line.charAt(symbol + 1) == '&'
                    || line.charAt(symbol) == '=' && line.charAt(symbol + 1) == '='
                    || line.charAt(symbol) == '&' && line.charAt(symbol + 1) == '&'
                    || line.charAt(symbol) == '&' && line.charAt(symbol + 1) == '=')
                throw new SomeException("wow easy man!");
            }
        return true;
    }

    boolean check (String line) throws SomeException{
        if (stepOne(line) == true && stepTwo(line) == true) return true;
        else {
            throw new SomeException("hey! what is this?");
        }
    }
}
