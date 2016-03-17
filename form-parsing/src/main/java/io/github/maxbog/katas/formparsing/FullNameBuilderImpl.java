package io.github.maxbog.katas.formparsing;

/**
 * Created by dvkc73 on 2016-03-17.
 */
public class FullNameBuilderImpl implements FullNameBuilder {
    @Override
    public String build(String firstName, String lastName, String initials) {
        if(firstName == null || lastName == null)
            return null;
        String fullNameWithoutInitials = firstName + " " + lastName;

        if(initials == null) {
            return fullNameWithoutInitials;
        }
        else {
            return initials + " " + fullNameWithoutInitials;
        }
    }
}
