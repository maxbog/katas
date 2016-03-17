package io.github.maxbog.katas.formparsing;

/**
 * Created by dvkc73 on 2016-03-17.
 */
public class HtmlForm {
    private SubmittedFormData formData;

    private String csrfToken;

    public boolean validateCsrfToken(CsrfValidator validator) {
        return false;
    }

    public ParsedFormData parseData(FormDataParser dataParser) {
        return null;
    }
}
