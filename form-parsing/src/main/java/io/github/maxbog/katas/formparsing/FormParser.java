package io.github.maxbog.katas.formparsing;

/**
 * Created by dvkc73 on 2016-03-17.
 */
public class FormParser {
    private CsrfValidator validator;
    private FormDataParser dataParser;

    public FormParser(CsrfValidator validator, FormDataParser dataParser) {

        this.validator = validator;
        this.dataParser = dataParser;
    }

    public ParsedFormData parse(HtmlForm submitted) {
        if (submitted.validateCsrfToken(validator)) {
            return submitted.parseData(dataParser);
        } else {
            return null;
        }
    }
}
