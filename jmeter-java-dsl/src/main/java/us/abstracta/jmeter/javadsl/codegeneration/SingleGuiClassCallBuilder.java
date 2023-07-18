package us.abstracta.jmeter.javadsl.codegeneration;

import java.lang.reflect.Method;
import java.util.List;
import org.apache.jmeter.gui.JMeterGUIComponent;
import org.apache.jmeter.testelement.TestElement;

/**
 * Abstracts common logic for usual scenario where MethodCallBuilders apply to test elements
 * associated to certain JMeter Gui component.
 * <p>
 * In most of the cases a {@link MethodCallBuilder} can simply extend this or {@link
 * SingleTestElementCallBuilder} class. Scenarios where these classes would not be used are complex
 * ones which cover several test elements. Eg:
 * {@link us.abstracta.jmeter.javadsl.core.threadgroups.DslDefaultThreadGroup}
 * handles both JMeter default thread groups but also ultimate thread groups.
 * <p>
 * This class abstracts logic of checking if a test element MethodCall should be generated by this
 * builder or not, just comparing if the test element associated JMeter GUI component is of the type
 * associated to the MethodCallBuilder instance.
 *
 * @since 0.52
 */
public abstract class SingleGuiClassCallBuilder extends MethodCallBuilder {

  protected final Class<? extends JMeterGUIComponent> guiClass;

  protected SingleGuiClassCallBuilder(Class<? extends JMeterGUIComponent> guiClass,
      List<Method> builderMethods) {
    super(builderMethods);
    this.guiClass = guiClass;
  }

  @Override
  public boolean matches(MethodCallContext context) {
    return guiClass.getName()
        .equals(context.getTestElement().getPropertyAsString(TestElement.GUI_CLASS));
  }

}
