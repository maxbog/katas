package io.github.maxbog.katas.formparsing;

import org.mockito.Matchers;
import org.testng.annotations.Test;

import static autofixture.publicinterface.Generate.any;
import static autofixture.publicinterface.Generate.anyString;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by dvkc73 on 2016-03-17.
 */
public class FormDataParserTest {
    @Test
    public void shouldBuildFullName() {
        // GIVEN
        String builtFullName = anyString();
        SubmittedFormData submitted = mock(SubmittedFormData.class);
        FullNameBuilder builder = mock(FullNameBuilder.class);
        when(submitted.buildFullName(builder)).thenReturn(builtFullName);

        FormDataParserImpl parser = new FormDataParserImpl(builder);

        // WHEN
        ParsedFormData parsed = parser.parse(submitted);

        // THEN
        assertThat(parsed.getFullName()).isEqualTo(builtFullName);
    }
}
