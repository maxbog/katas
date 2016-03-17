package io.github.maxbog.katas.formparsing;

/**
 * Created by dvkc73 on 2016-03-17.
 */
public class ParsedFormData {
    private String fullName;
    private PhoneNumber contactNumber;

    public ParsedFormData(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
