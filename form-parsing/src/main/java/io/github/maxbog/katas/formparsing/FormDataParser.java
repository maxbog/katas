package io.github.maxbog.katas.formparsing;

/**
 * Created by dvkc73 on 2016-03-17.
 */
public interface FormDataParser {
    ParsedFormData parse(SubmittedFormData submitted);
}
