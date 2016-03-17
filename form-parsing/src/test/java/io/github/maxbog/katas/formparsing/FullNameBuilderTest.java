package io.github.maxbog.katas.formparsing;

import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import static autofixture.publicinterface.Generate.anyString;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by dvkc73 on 2016-03-17.
 */
public class FullNameBuilderTest {
    @Test
    public void shouldNotBuildAFullNameWhenLastNameIsNull() {
        // GIVEN
        String firstName = anyString();
        FullNameBuilderImpl builder = new FullNameBuilderImpl();

        // WHEN
        String builtFullName = builder.build(firstName, null, null);

        // THEN
        assertThat(builtFullName).isEqualTo(null);
    }
    @Test
    public void shouldNotBuildAFullNameWhenFirstNameIsNull() {
        // GIVEN
        String lastName = anyString();
        FullNameBuilderImpl builder = new FullNameBuilderImpl();

        // WHEN
        String builtFullName = builder.build(null, lastName, null);

        // THEN
        assertThat(builtFullName).isEqualTo(null);
    }

    @Test
    public void shouldBuildAFullNameFromFirstAndLastName() {
        // GIVEN
        String firstName = anyString();
        String lastName = anyString();
        FullNameBuilderImpl builder = new FullNameBuilderImpl();

        // WHEN
        String builtFullName = builder.build(firstName, lastName, null);

        // THEN
        assertThat(builtFullName).isEqualTo(firstName + " " + lastName);
    }

    @Test
    public void shouldBuildAFullNameWithInitials() {
        // GIVEN
        String firstName = anyString();
        String lastName = anyString();
        String initials = anyString();
        FullNameBuilderImpl builder = new FullNameBuilderImpl();

        // WHEN
        String builtFullName = builder.build(firstName, lastName, initials);

        // THEN
        assertThat(builtFullName).isEqualTo(initials + " " + firstName + " " + lastName);

    }
}
