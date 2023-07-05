package gg.amy.utt.transform.impl;

import gg.amy.utt.data.InputFormat;
import gg.amy.utt.data.OutputFormat;
import gg.amy.utt.transform.TransformationContext;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author amy
 * @since 2/27/42069.
 */
public class XmlTransformerTest {
    @Test
    public void testXmlIdentityTransformation() {
        final var input = """
                <person>
                    <name>amy</name>
                    <age>42069</age>
                    <address>
                        <street>123 fake street</street>
                        <city>nowhere</city>
                        <state>this was generated by github copilot</state>
                    </address>
                </person>
                """;
        final var ctx = new TransformationContext(InputFormat.XML, OutputFormat.XML, null, null, false, false);
        final var out = new XmlTransformer().transformOutput(ctx, new XmlTransformer().transformInput(ctx, input));
        // TODO: Can we preserve the outer tag name somehow?
        assertEquals("<LinkedHashMap><name>amy</name><age>42069</age><address><street>123 fake street</street><city>nowhere</city><state>this was generated by github copilot</state></address></LinkedHashMap>", out);
    }

    @Test
    public void testJsonToXmlTransformation() {
        final var input = """
                {
                    "name": "amy",
                    "age": 42069,
                    "address": {
                        "street": "123 fake street",
                        "city": "nowhere",
                        "state": "this was generated by github copilot"
                    }
                }
                """;
        final var ctx = new TransformationContext(InputFormat.JSON, OutputFormat.XML, null, null, false, false);
        final var out = new XmlTransformer().transformOutput(ctx, new JsonTransformer().transformInput(ctx, input));
        assertEquals("<LinkedHashMap><name>amy</name><age>42069</age><address><street>123 fake street</street><city>nowhere</city><state>this was generated by github copilot</state></address></LinkedHashMap>", out);
    }
}
