package io.github.maxbog.katas.formparsing;

import org.testng.annotations.Test;

import static autofixture.publicinterface.Generate.anyString;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by dvkc73 on 2016-03-17.
 */
public class SubmittedFormDataTest {
    @Test
    public void shouldBuildFullNameUsingBuilder() {
        // GIVEN
        String firstName = anyString();
        String lastName = anyString();
        String initials = anyString();
        String expectedFullName = anyString();

        SubmittedFormData data = new SubmittedFormData(firstName, lastName, initials);

        FullNameBuilder builder = mock(FullNameBuilder.class);
        when(builder.build(firstName, lastName, initials)).thenReturn(expectedFullName);

        // WHEN
        String builtFullName = data.buildFullName(builder);

        // THEN
        assertThat(builtFullName).isEqualTo(expectedFullName);
    }
}
