export JVMFLAGS="-Xms${zkHeapSize}G -Xmx${zkHeapSize}G   <#if zkSecurity??>${zkSecurity}</#if> $JVMFLAGS"