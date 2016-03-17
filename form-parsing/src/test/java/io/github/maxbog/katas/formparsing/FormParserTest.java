package io.github.maxbog.katas.formparsing;

import org.testng.annotations.Test;

import static autofixture.publicinterface.Generate.any;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by dvkc73 on 2016-03-17.
 */
public class FormParserTest {
    @Test
    public void shouldReturnNullWhenCsrfTokenIsInvalid() {
        // GIVEN
        FormDataParser dataParser = any(FormDataParser.class);
        CsrfValidator validator = any(CsrfValidator.class);

        HtmlForm submitted = mock(HtmlForm.class);
        when(submitted.validateCsrfToken(validator)).thenReturn(false);

        FormParser parser = new FormParser(validator, dataParser);

        // WHEN
        ParsedFormData parsed = parser.parse(submitted);

        // THEN
        assertThat(parsed).isNull();
    }

    @Test
    public void shouldReturnParsedDataWhenTokenIsValid() {
        // GIVEN
        CsrfValidator validator = any(CsrfValidator.class);
        FormDataParser dataParser = any(FormDataParser.class);
        ParsedFormData expectedParsedData = any(ParsedFormData.class);

        HtmlForm submitted = mock(HtmlForm.class);
        when(submitted.validateCsrfToken(validator)).thenReturn(true);
        when(submitted.parseData(dataParser)).thenReturn(expectedParsedData);

        FormParser parser = new FormParser(validator, dataParser);

        // WHEN
        ParsedFormData parsed = parser.parse(submitted);

        // THEN
        assertThat(parsed).isEqualTo(expectedParsedData);
    }

}
