package io.dongtai.iast.core.bytecode.enhance.plugin.framework.dubbo;

import io.dongtai.iast.core.bytecode.enhance.ClassContext;
import io.dongtai.iast.core.bytecode.enhance.plugin.AbstractClassVisitor;
import io.dongtai.iast.core.utils.AsmUtils;
import io.dongtai.log.DongTaiLog;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;

public class DubboSyncHandlerAdapter extends AbstractClassVisitor {
    private static final String DUBBO_SYNC_HANDLER_INVOKE = "{package}.dubbo.rpc.listener.ListenerInvokerWrapper.invoke({package}.dubbo.rpc.Invocation)";

    private final String packageName;
    private final String fullSign;

    public DubboSyncHandlerAdapter(ClassVisitor classVisitor, ClassContext context, String packageName) {
        super(classVisitor, context);
        this.packageName = packageName;
        this.fullSign = DUBBO_SYNC_HANDLER_INVOKE.replace("{package}", this.packageName);
    }

    @Override
    public MethodVisitor visitMethod(final int access, final String name, final String desc, final String signature, final String[] exceptions) {
        MethodVisitor mv = super.visitMethod(access, name, desc, signature, exceptions);
        String signCode = AsmUtils.buildSignature(context.getClassName(), name, desc);

        if (this.fullSign.equals(signCode)) {
            DongTaiLog.debug("Adding dubbo consumer tracking by {}", signCode);
            mv = new DubboSyncHandlerInvokeAdviceAdapter(mv, access, name, desc, signCode,
                    this.context, this.packageName);
            setTransformed();
        }
        return mv;
    }
}
