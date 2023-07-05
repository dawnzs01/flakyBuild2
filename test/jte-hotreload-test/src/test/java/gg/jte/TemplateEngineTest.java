package gg.jte;

import gg.jte.output.StringOutput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import test.Model;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * To run these tests, you first need to run the jte-maven-plugin (<code>jte:generate</code>)
 *
 * This tests the following scenario:
 * <ul>
 *     <li>jte template sources are generated and part of the project, ready to be deployed</li>
 *     <li>However, during development hot reloading should still work</li>
 * </ul>
 * By default, on-demand template engines have a different package name {@link gg.jte.runtime.Constants#PACKAGE_NAME_ON_DEMAND} so that hot reload works as expected.
 * <br>
 * Also see the related <a href="https://github.com/casid/jte/issues/63">GitHub issue</a>.
 */
public class TemplateEngineTest {

    TemplateEngine templateEngine;
    StringOutput output = new StringOutput();
    Model model = new Model();

    @BeforeEach
    void setUp() {
        templateEngine = TemplateEngine.createPrecompiled(ContentType.Html);

        model.hello = "Hello";
        model.x = 42;
    }

    @Test
    void hotReload() {
        whenTemplateIsRendered("helloWorld.jte");
        thenOutputIs("Hello World");

        templateEngine = TemplateEngine.create(new CodeResolver() {
            long lastModified = 0;

            @Override
            public String resolve(String name) {
                return "@param test.Model model\n" +
                        "${model.hello} changed World";
            }

            @Override
            public long getLastModified(String name) {
                return lastModified++;
            }
        }, ContentType.Html);

        whenTemplateIsRendered("helloWorld.jte");
        thenOutputIs("Hello changed World");
    }

    @SuppressWarnings("SameParameterValue")
    private void whenTemplateIsRendered(String templateName) {
        templateEngine.render(templateName, model, output);
    }

    private void thenOutputIs(String expected) {
        assertThat(output.toString()).isEqualTo(expected);
        output.reset();
    }
}
