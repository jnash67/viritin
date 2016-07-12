package org.vaadin.viritin.fields;

import org.vaadin.viritin.util.HtmlElementPropertySetter;

/**
 * Special field type for inputting email address. The type of the field is just
 * basic string, but backing html field is of type "email", making virtual
 * keyboards on mobile devices to be better optimized for typing in email
 * addresses.
 *
 * @author Matti Tahvonen
 */
public class EmailField extends MTextField {

    public EmailField() {
        super();
    }

    public EmailField(String caption) {
        super(caption);
    }

    public EmailField(String caption, String value) {
        super(caption, value);
    }

    private HtmlElementPropertySetter heps;

    @Override
    public void beforeClientResponse(boolean initial) {
        super.beforeClientResponse(initial);
        if (heps == null) {
            heps = new HtmlElementPropertySetter(this);
        }
        heps.setProperty("type", "email");
    }

}
