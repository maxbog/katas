package io.github.maxbog.katas.formparsing;

/**
 * Created by dvkc73 on 2016-03-17.
 */
public class FormDataParserImpl implements FormDataParser {
    private FullNameBuilder builder;

    public FormDataParserImpl(FullNameBuilder builder) {

        this.builder = builder;
    }

    public ParsedFormData parse(SubmittedFormData submitted) {
        return new ParsedFormData(submitted.buildFullName(builder));
    }
}
