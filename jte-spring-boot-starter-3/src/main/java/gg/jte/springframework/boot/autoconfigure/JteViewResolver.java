package gg.jte.springframework.boot.autoconfigure;

import gg.jte.*;
import org.springframework.core.*;
import org.springframework.http.*;
import org.springframework.lang.*;
import org.springframework.web.servlet.view.*;

public class JteViewResolver extends AbstractTemplateViewResolver {

    private final TemplateEngine templateEngine;

    public JteViewResolver(TemplateEngine templateEngine, final String templateSuffix) {
        this.templateEngine = templateEngine;
        this.setSuffix(templateSuffix);
        this.setViewClass(JteView.class);
        this.setContentType(MediaType.TEXT_HTML_VALUE);
        this.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }

    @Override
    @NonNull
    protected AbstractUrlBasedView instantiateView() {
        return new JteView(templateEngine);
    }

    @Override
    @NonNull
    protected Class<?> requiredViewClass() {
        return JteView.class;
    }
}
