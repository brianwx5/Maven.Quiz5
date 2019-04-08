package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    Character delimeter;
    String output = "";

    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
    }

    public StringAssembler append(String str) {
        output += str+ delimeter;
        return this;
    }

    public String assemble() {

        return output.substring(0,output.length()-1);
    }
}
