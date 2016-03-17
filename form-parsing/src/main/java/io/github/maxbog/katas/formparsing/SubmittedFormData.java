package io.github.maxbog.katas.formparsing;

/**
 * Created by dvkc73 on 2016-03-17.
 */
public class SubmittedFormData {
    private String firstName;
    private String lastName;
    private String initials;

    private String phoneNumber;

    public SubmittedFormData(String firstName, String lastName, String initials) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.initials = initials;
    }

    public String buildFullName(FullNameBuilder builder) {
        return builder.build(firstName, lastName, initials);
    }
}
