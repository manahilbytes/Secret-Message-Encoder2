package com.example.projecttest;
public class Processor2 implements EncryptionLogic,DataStorable{
    private String lastResult = "";
    private String originalText = "";
    @Override
    public String encrypt(String input) {
        originalText = input;
        StringBuilder result = new StringBuilder();
        for(char ch:input.toCharArray()){
            if (ch == ' ')
                result.append("/ ");

            else if (ch == 'a')
                result.append(".- ");

            else if (ch == 'b')
                result.append("-... ");

            else if (ch == 'c')
                result.append("-.-. ");

            else if (ch == 'd')
                result.append("-.. ");

            else if (ch == 'e')
                result.append(". ");

            else if (ch == 'f')
                result.append("..-. ");

            else if (ch == 'g')
                result.append("--. ");

            else if (ch == 'h')
                result.append(".... ");

            else if (ch == 'i')
                result.append(".. ");

            else if (ch == 'j')
                result.append(".--- ");

            else if (ch == 'k')
                result.append("-.- ");

            else if (ch == 'l')
                result.append(".-.. ");

            else if (ch == 'm')
                result.append("-- ");

            else if (ch == 'n')
                result.append("-. ");

            else if (ch == 'o')
                result.append("--- ");

            else if (ch == 'p')
                result.append(".--. ");

            else if (ch == 'q')
                result.append("--.- ");

            else if (ch == 'r')
                result.append(".-. ");

            else if (ch == 's')
                result.append("... ");

            else if (ch == 't')
                result.append("- ");

            else if (ch == 'u')
                result.append("..- ");

            else if (ch == 'v')
                result.append("...- ");

            else if (ch == 'w')
                result.append(".-- ");

            else if (ch == 'x')
                result.append("-..- ");

            else if (ch == 'y')
                result.append("-.-- ");

            else if (ch == 'z')
                result.append("--.. ");

            else if (ch == '0')
                result.append("----- ");

            else if (ch == '1')
                result.append(".---- ");

            else if (ch == '2')
                result.append("..--- ");

            else if (ch == '3')
                result.append("...-- ");

            else if (ch == '4')
                result.append("....- ");

            else if (ch == '5')
                result.append("..... ");

            else if (ch == '6')
                result.append("-.... ");

            else if (ch == '7')
                result.append("--... ");

            else if (ch == '8')
                result.append("---.. ");

            else if (ch == '9')
                result.append("----. ");
        }
        return result.toString();
    }

    @Override
    public String decrypt(String input) {
        this.originalText=input;
        return originalText;
    }

    @Override
    public void storeResult(String result) {

        this.lastResult =originalText;
    }

    @Override
    public String getResult() {

        return lastResult;
    }
}



