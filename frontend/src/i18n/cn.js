/********************************************************************************
 * Copyright (c) 2020, 2022 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 ********************************************************************************/
'use strict';

exports.__esModule = true;
exports.default = {
  jifa: {
    searchTip:"搜索文本使用Java语言正则语法，比如用 *.String.* 来搜索java.lang.String，搜索数值使用>num,<num,>=num,<=num,==num,!=num,num的语法",
    searchPlaceholder:'搜索...',
    heapDumpAnalysis: '堆分析',
    gclogAnalysis: 'GC日志分析',

    unlockFileSuccessPrompt:'解锁成功！',
    unlockFilePrompt:'是否解锁文件，允许任意用户访问?',
    unlockFile:'解锁文件',
    setting: '设置',
    diskCleanup: '清理磁盘',
    help: '帮助',
    consoleMsg: '',
    getStarted: '开始使用',
    success: '成功',
    console: '控制台',
    qm: '？',
    feedback: '建议与反馈',
    options: '选项',
    optionsWithHelp: '选项',
    close: '关闭',
    uploadPrompt: '选择文件(拖拽或点击选择)',
    enterPrompt: '请输入',
    inLine: '排队中',
    addFile: '添加文件',
    addHeapDumpFile:'添加 Heap Dump',
    addGCLogFile: '添加 GC 日志',
    copy: '复制',
    copySuccessfully: '复制成功',
    requestFailed: '请求失败',
    config: '配置',
    prompt: '提示',
    confirm: '确定',
    reset: '重置',
    cancel: '取消',
    fileTransfer: '文件传输',
    progress: '进度',
    analyze: '分析',
    reanalyze: '重新分析',
    release: '释放',
    download: '下载原文件',
    edit: '编辑',
    delete: '删除',
    loading: '加载中',
    goToOverViewPrompt: '即将进入概况页面...',
    deletePrompt: '此操作将永久删除该文件，是否继续？',
    deleteSuccessPrompt: '删除成功！',
    deleteFailedPrompt: '删除失败！',
    deleteCanceled: '已取消删除',
    downloadBegin: '文件开始下载，请耐心等待',
    returnValue: '确定离开吗?',
    gotoParseFile: '即将解析文件',

    typeKeyWord: '输入关键字搜索',

    transferring: '传输中',
    transferError: '传输失败',

    show: '显示',
    hide: '隐藏',

    expandResultDivWidth: '显示宽度 Expand',
    shrinkResultDivWidth: '显示宽度 Shrink',
    resetResultDivWidth: '显示宽度 Reset',

    backToHome: '返回主页',
    promote404: '您所寻找的页面不存在。可以点击下面的按钮，返回主页。',

    tip: {
      copyName: '复制文件名',
      rename: '修改文件名',
      uploadToOSS: '上传文件到OSS',
      setShare: '设置文件共享',
      deleteFile: '删除文件',
      downloadFile: '本地下载文件',
    },

    heap: {
      basicInformation: '基础信息',
      reanalyzePrompt: '是否继续？',
      releasePrompt: '是否继续？',
      overview: '概况',
      leakSuspects: '泄露报表',
      description: '描述',
      detail: '细节',
      GCRoots: 'GC 根对象',
      systemProperty: '系统属性',
      OSBit: '操作系统位数',
      jvmInfo: 'JVM',
      heapCreationDate: '创建时间',
      usedHeapSize: '堆使用大小',
      numberOfClasses: '类数量',
      numberOfObjects: '对象数量',
      numberOfClassLoaders: '类加载器数量',
      numberOfGCRoots: '根对象数量',
      threadInfo: '线程信息',
      dominatorTree: '支配树',
      histogram: '类视图',
      unreachableObjects: '不可达类视图',
      duplicatedClasses: '重复类视图',
      classLoaders: '类加载器视图',
      directByteBuffer: '堆外内存视图',
      compare: '内存文件对比',
      ref: {
        object: {
          label: '对象引用',
          outgoing: '引用对象集合',
          incoming: '被引用对象集合',
        },
        type: {
          label: '类型引用',
          outgoing: '引用类型集合',
          incoming: '被引用类型集合',
        }
      },

      pathToGCRoots: 'GC 根路径',
      mergePathToGCRoots: '合并GC 根路径',

      descOfKeepUnreachableObjects: '如果启用此选项，分析器会将不可达对象视为不可达根，进而分析其中的引用关系。 否则，将不对不可达对象进行进一步的分析，仅统计类型信息，即不可达类视图',
      descOfStrictness: '\'strictness\' 表示当分析过程中遇到错误时的后续动作',
      descOfStopStrictness: '终止分析',
      descOfWarnStrictness: '报告警告信息并继续分析',
      descOfPermissiveStrictness: '报告警告信息，尝试修复错误并继续分析',
    },

    gclog: {
      gclogFile: "GC日志文件",
      navigation: '导航',
      navToTop: '回到最上方',
      gcCause: 'GC原因',
      clickToChooseTime: '点击可自选时间',
      gclogFilePlaceholder: "填写文件分析页面的URL，如果要选择分析的时间段请在文件分析页面里先配置好。可以对比同一个GC日志的两个不同时间段",
      stwTooltip: "程序在这个阶段会暂停(stop the world)",
      analysisConfig: '分析配置',
      gclogCompare: 'GC日志对比',
      logTimeRange: "日志覆盖的时间段",
      analysisTimeRange: "当前分析的时间段",
      duration: "时长",
      analysisTimeRangeChooseHint: "选择一个你关心的时间段，分析这个时间段内的GC情况",
      analysisTimeRangeLength: "分析时间段长度",
      baselineFile: "基线日志",
      targetFile: "目标日志",
      metric: "指标",
      metricCompare: "目标 VS 基线 (<font color='#9ad969'>绿色</font>表示变好，<font color='#E74C3C'>红色</font>表示变差)",
      parallelGCThreads: 'GC并行线程数',
      parallelGCThreadsHint: 'GC并行线程(对应参数-XX:ParallelGCThreads)用于处理所有暂停阶段的工作，增大线程数可以减少GC暂停时间，但不要超过CPU数量。',
      concurrentGCThreads: 'GC并发线程数',
      concurrentGCThreadsHint: 'GC并发线程(对应参数-XX:ConcGCThreads)用于所有并发阶段的工作，增大线程数可以让并发GC更快完成，但是会提高并发GC过程中的CPU利用率',
      gcDetail: 'GC详情',
      applyTimeToConfig: "将当前所选时间段应用到整个页面",
      noDateStampPreunified: '日志中没有打印GC发生的现实时间，只能根据相对于日志开始的时间进行搜索，建议增加参数-XX:+PrintGCDateStamps来打印现实时间。',
      noDateStampUnified: '日志中没有打印GC发生的现实时间，只能根据相对于日志开始的时间进行搜索，建议把GC日志打印的参数修改为类似 -Xlog:gc*:file=gc.log:time,uptime,level,tags (加上time这一项)来打印现实时间',
      longPauseThreshold: '长暂停时间阈值(ms)',
      longPauseThresholdHint: '超过这个时长的暂停会被视为长暂停',
      youngGCFrequentIntervalThreshold: 'Young GC 间隔阈值(ms)',
      youngGCFrequentIntervalThresholdHint: '如果两次Young GC之间的间隔少于这个时间则认为Young GC发生的较为频繁',
      oldGCFrequentIntervalThreshold: 'Old GC 间隔阈值(ms)',
      oldGCFrequentIntervalThresholdHint: '如果两次Old GC之间的间隔少于这个时间则认为Old GC发生的较为频繁',
      fullGCFrequentIntervalThreshold: 'Full GC 间隔阈值(ms)',
      fullGCFrequentIntervalThresholdHint: '如果两次Full GC之间的间隔少于这个时间则认为Full GC发生的较为频繁',
      fullGCForNongenerational: '由于{gc}是不分代的GC算法，所有的GC都被视为Full GC',


      basicInfo: '基本信息',
      collector: "收集器",
      objectStats: '对象统计',
      objectCreationSpeed: "对象创建速度",
      objectPromotionSpeed: "对象晋升速度",
      objectPromotionAvg: "平均对象晋升大小",
      objectPromotionMax: "最大单次对象晋升大小",

      pauseInfo: {
        pauseInfo: "暂停信息",
        pauseDistribution: "暂停时间分布",
        throughput: "GC吞吐",
        throughputHint: "GC吞吐是程序实际执行的时间/总运行时间，吞吐率越高意味着GC开销越小",
        pauseAvg: "平均暂停时间",
        pauseMax: "最大暂停时间",
        pauseMedian: "暂停时间中位数",
        pauseP99: "暂停时间P99",
        pauseP999: "暂停时间P999",
        pauseTime: "暂停时间",
        pauseCount: "暂停次数"
      },

      memoryStats: {
        memoryStats: "堆和元空间统计",
        memoryArea: "内存区域",
        capacityAvg: "平均容量",
        capacityAvgHint: "容量表示这个区域能最大容纳多少对象。平均容量有可能会比最大使用量更小，原因在于容量可以是动态变化的，比如当-Xmx!=-Xms时堆会根据内存使用情况和吞吐动态进行扩缩容，年轻代和老年代大小也会相应进行调整",
        g1DynamicCapacity: "此外，即使-Xmx=-Xms，对于G1而言只要没有设-Xmn(通常也不推荐设Xmn)的话年轻代和老年代大小也是动态的",
        usedMax: "最大使用量",
        usedMaxHint: "可以用来评估java进程整体内存占用的RSS，其中堆所占的大小比较接近堆历史上最高使用量",
        usedAvgAfterFullGC: "Full GC后平均使用量",
        usedAvgAfterFullGCHint: "用于估算这个区域大概有多少常驻的对象，如果这个值较高，说明应用在该区域存在内存泄露的可能性",
        usedAvgAfterOldGC: "Old GC后平均使用量",
        usedAvgAfterOldGCHint: "用于估算这个区域大概有多少常驻的对象，如果这个值较高，说明应用在该区域存在内存泄露的可能性",
        metaspaceCapacity: '注意原始GC日志中打印的类似 "Metaspace: 1792694K->291615K(698368K)" 的信息表示元空间reserve的空间是698368K,而非真正的容量',
        youngCapacityAvg: '年轻代平均容量',
        youngUsedMax: '年轻代最大使用量',
        oldCapacityAvg: "老年代平均容量",
        oldUsedMax: "老年代最大使用量",
        oldUsedAvgAfterFullGC: "老年代在Full GC后平均使用量",
        oldUsedAvgAfterOldGC: "老年代在Old GC后平均使用量",
        humongousUsedMax: "大对象最大使用量",
        humongousUsedAvgAfterFullGC: "大对象在Full GC后平均使用量",
        humongousUsedAvgAfterOldGC: "大对象在Old GC后平均使用量",
        heapCapacityAvg: "整堆平均容量",
        heapUsedMax: "整堆最大使用量",
        heapUsedAvgAfterFullGC: "整堆在Full GC后平均使用量",
        heapUsedAvgAfterOldGC: "整堆在Old GC后平均使用量",
        metaspaceCapacityAvg: "元空间平均容量",
        metaspaceUsedMax: "元空间最大使用量",
        metaspaceUsedAvgAfterFullGC: "元空间在Full GC后平均使用量",
        metaspaceUsedAvgAfterOldGC: "元空间在Old GC后平均使用量",
      },

      phaseStats: {
        phaseStatsAndCause: "GC阶段和原因",
        phaseStats: "GC阶段",
        importantMode: "只显示重要的阶段",
        pauseMode: "只显示暂停的阶段",
        structuredMode: "按阶段的父子关系显示",
        causeMode: "按GC原因显示",
        name: "名称",
        count: "发生次数",
        intervalAvg: "平均间隔",
        intervalMin: "最小间隔",
        durationAvg: "平均时长",
        durationMax: "最大时长",
        durationTotal: "总时长",
        youngGCCount: 'Young GC次数',
        youngGCIntervalAvg: 'Young GC平均间隔',
        youngGCDurationAvg: 'Young GC平均时长',
        youngGCDurationMax: 'Young GC最大时长',
        mixedGCCount: 'Mixed GC次数',
        mixedGCIntervalAvg: 'Mixed GC平均间隔',
        mixedGCDurationAvg: 'Mixed GC平均时长',
        mixedGCDurationMax: 'Mixed GC最大时长',
        oldGCCount: 'Old GC次数',
        oldGCIntervalAvg: 'Old GC平均间隔',
        oldGCDurationAvg: 'Old GC平均时长',
        oldGCDurationMax: 'Old GC最大时长',
        fullGCCount: 'Full GC次数',
        fullGCIntervalAvg: 'Full GC平均间隔',
        fullGCDurationAvg: 'Full GC平均时长',
        fullGCDurationMax: 'Full GC最大时长',
      },

      generation: {
        young: "年轻代",
        old: "老年代",
        humongous: "大对象",
        humongousHint: "G1的大对象指的是大小超过Region大小(对应参数-XX:G1HeapRegionSize)一半的对象，如果大对象过多可能会引发GC异常，通常通过调大Region或者减少大对象创建优化",
        archive: "CDS区",
        heap: "整堆",
        metaspace: "元空间",
      },

      vmOptions: {
        vmOptions: "JVM参数",
        unknown: "在GC日志中没有出现",
        gcRelatedOptions: "GC相关参数",
        otherOptions: "其它参数",
      },

      timeGraph: {
        timeGraph: '时间图',
        fullScreen: '切换全屏显示',
        durationOf: '{type}时长',
        youngCapacity: '年轻代容量',
        oldUsed: '老年代使用',
        oldCapacity: '老年代容量',
        humongousUsed: '大对象使用',
        heapUsed: '堆使用',
        heapCapacity: '堆容量',
        metaspaceUsed: '元空间使用',
        metaspaceCapacity: '元空间容量',
        reclamation: '内存回收',
        promotion: '对象晋升',
      },

      cause: {
        archiveShare: '在进行CDS dumping之前执行一次单线程的Full GC来减少内存碎片化',
        cmsFinalRemark: '如果设置了-XX:+CMSScavengeBeforeRemark参数，那么会在CMS Final Remark时先做一次Young GC，通常开启此参数可以减少Remark的最大暂停时间',
        systemgc: '调用System.gc()或Runtime.getRuntime().gc()时触发',
        jvmti: '使用Jvmti时调用ForceGarbageCollection触发',
        gclocker: '如果线程执行在JNI临界区时，刚好需要进行GC，此时GC Locker会阻止GC的发生，同时阻止其他线程进入JNI临界区，直到最后一个线程退出临界区时触发这种GC。过于频繁使用GCLocker可能会使得gc无法及时进行，可能导致长时间暂停甚至可能导致Full GC',
        heapInspection: '当你使用工具(如jmap)执行堆检查操作时会触发',
        heapDump: '执行Heap Dump前触发的一次Full GC',
        allocationFail: '对象分配空间不足时触发，这是最常见的GC触发原因',
        metaspace: '元空间不足时触发。注意由于元空间存在碎片化的问题，可能看起来空间没有用满但依然无法分配',
        ergonomics: '是为了调整堆的大小，从而达到某种暂停时间或吞吐量目标',
        g1Evacuation: '对象分配空间不足时触发，这是最常见的GC触发原因',
        humongous: 'G1大对象分配失败时触发Full GC',
        lastDitch: '在Metadata GC Threshold GC后，如果元空间依然不足，就会再次触发Full gc并清除弱引用',
        promotionFail: '在Young GC过程中，如果老年代没有足够的空间提供晋升，那么这次GC就会变成Full GC',
        toSpaceExhausted: '在Young/Mixed GC过程中，没有足够的region作为to space或用来晋升的现象称为To-space exhausted，这可能会导致空间无法正常释放, 大量对象晋升以及Young GC的暂停时间大幅度拉长',
        proactive: 'JVM主动触发GC来减少堆内存占用，通常只在对象分配速率很低时进行',
        allocationRate: '当JVM根据当前的对象分配速度估计内存即将耗尽，就会触发一次GC',
        timer: "如果设置了-XX:ZCollectionInterval，如果超过了该参数的时长都没有触发GC则主动触发一次GC",
        allocationStall: '对象分配空间不足时触发',
        highUsage: '堆的使用率超过一定的百分比，就会触发一次GC',
        warmup: 'JVM启动之后，如果一直没有发生过GC，那么会在堆内存使用超过10%、20%、30%时，分别触发一次GC',
        metaspaceClearSoftRef: '在Metadata GC Threshold GC后，如果元空间依然不足，就会再次触发Full gc并清除弱引用',
        g1Periodic: "如果设置了-XX:G1PeriodicGCInterval，如果超过了该参数的时长都没有触发GC则主动触发一次GC，通常这个特性用于进行堆内存的回收",
        dcmd: "通过jcmd命令触发的Full gc",
        g1Compaction: '对象分配空间不足时触发',
        g1Preventive: 'JVM会根据当前的内存使用和分配情况，提前触发gc来防止出现To-space exhausted',
      },

      phase: {
        fullGC: 'Full GC会对整个堆进行内存回收，通常暂停时间较长',
        concMarkAbort: 'Concurrent Mark Abort表示在Concurrent Cycle过程中发生了Full GC，本次Concurrent Cycle中止，通常需关注Full GC的发生原因',
        concModeFailure: 'Concurrent Mode Failure表示在CMS GC过程中发生了Full GC，本次CMS GC中止，通常需关注Full GC的发生原因',
        concModeInterrupt: 'Concurrent Mode Interrupted表示在CMS GC过程中发生了System.gc()导致的Full GC，本次CMS GC中止，通常需关注Full GC的发生原因',
        allocationStall: 'Allocation Stall表示当前线程无法继续分配对象，被迫等待直至GC完成',
        cmReset: 'Concurrent Mark Reset For Overflow表示全局标记栈已满，将重新开始标记，可能导致Concurrent Cycle时间超长。如果出现了这种情况则建议调大-XX:MarkStackSize参数(默认值4M)',
        oom: 'Out of memory表示堆内已经彻底无法分配对象，会抛出OutOfMemoryError',
        initialMarkSituation: 'Initial Mark表示此次Young GC同时会对老年代进行初始标记，Young GC结束后会开始执行Concurrent Cycle',
        prepareMixedSituation: 'Prepare Mixed表示此次Young GC完成后就会开始执行Mixed GC',
      },

      badHint: {
        badThroughput: "当前应用的吞吐偏低，通常GC吞吐不应低于90%",
        badPause: "当前暂停时间偏长",
        badUsageAfterGC: "在GC后使用率仍然较高，可能容量设置得过低或者存在内存泄露的情况",
        youngTooSmall: "年轻代容量过小，可能会导致Young GC过于频繁影响吞吐",
        oldTooSmall: "老年代容量过小，可能会导致Full GC",
        badObjectAllocSpeed: "当前对象分配速度偏快",
        badPromotionSpeed: "当前对象晋升速度偏快",
        badSinglePromotion: "单次晋升的对象偏多，可能会导致Young GC长暂停和Full GC",
        badInterval: "当前{name}发生得较为频繁",
        badDuration: "当前{name}执行的时间偏长",
        badCauseCount: "当前{name}发生的次数偏多",
        badPhaseCount: "当前{name}发生的次数偏多",
        badCause: "应尽量避免{name}出现",
        badCauseFull: "应尽量避免{name}导致的Full GC",
        badPhase: "应尽量避免{name}出现",
      },

      diagnose: {
        diagnose: "问题诊断",
        noProblem: "暂无发现问题",
        problemTemplate: "当前时间段在{time}存在{problem}的情况",
        solution: "常见排查和调优方法：",
        abnormal: {
          outOfMemory: "Out of Memory",
          allocationStall: "Allocation Stall",
          metaspaceFullGC: "元空间满导致Full GC",
          heapMemoryFullGC: "堆内存导致的Full GC",
          longYoungGCPause: "Young GC长暂停",
          systemGC: "调用System.gc()导致的Full GC",
          frequentYoungGC: "Young GC频繁",
          longG1Remark: "Remark长暂停",
          longCMSRemark: "Final Remark长暂停",

          badDuration: "此次{param}的持续时间较长",
          badEventType: "应尽量避免{param}出现",
          badCauseFullGC: "应尽量避免{param}导致的Full GC",
          badInterval: "此次{param}的间隔时间较短",
          badPromotion: "此次{param}的对象晋升数量较多",
          smallYoungGen: "年轻代容量太小",
          smallOldGen: "老年代容量太小",
          highHumongousUsed: "GC后大对象依然较多",
          highHeapUsed: "GC后堆内存使用率较高",
          highOldUsed: "GC后老年代内存使用率较高",
          highMetaspaceUsed: "GC后元空间内存使用率较高",
          badSys: "在内核态所花的时间过多",
          badUsr: "在内核态所花的时间过少",
          toSpaceExhausted:"应尽量避免To-space Exhausted出现",
        },
        suggestion: {
          upgradeTo11G1FullGC: "如果实在没办法消除Full GC或者认为Full GC是可以接受的，可以考虑到升级到JDK11的G1 GC，JDK11中G1的Full GC改成了多线程进行，能有效减少暂停时间",
          checkSystemGC: "检查一下System.gc()是在哪里调用的，是否有必要",
          disableSystemGC: "可以增加参数 -XX:+DisableExplicitGC 来彻底关闭System.gc()",
          oldSystemGC: "或者考虑增加参数 -XX:+ExplicitGCInvokesConcurrent 使得调用System.gc()触发一次并发的Old GC",
          checkMetaspace: "排查一下元空间里到底是哪些对象将空间占满了",
          enlargeMetaspace: "适当增大参数-XX:MetaspaceSize -XX:MaxMetaspaceSize以增大元空间空间",
          enlargeHeap: "适当增大参数-Xmx -Xms参数以增大堆空间",
          increaseConcGCThreads: "适当增大参数-XX:ConcGCThreads 以提高并发GC线程数",
          decreaseIHOP: "适当减小参数 -XX:InitiatingHeapOccupancyPercent, 使得Old GC更早发生",
          decreaseCMSIOF: "适当减小参数 -XX:CMSInitiatingOccupancyFraction, 使得CMS GC更早发生",
          increaseZAllocationSpikeTolerance: "适当增大参数 -XX:ZAllocationSpikeTolerance，使得GC更早发生",
          checkLiveObjects: "如果Young GC时的活对象多导致活对象拷贝时间长或者引发跨代引用，那么考虑排查一下应用逻辑，为什么会有那么多活对象",
          checkReferenceGC: "如果是Reference Processing时间长，考虑开启-XX:+ParallelRefProcEnabled多线程优化(JDK11后默认开启)，或者排查为何有这么多Weak/Soft/Phantom Reference",
          checkCPUTime: "检查GC的CPU时间，如果real时间长而usr，sys时间短，可能是磁盘IO或者同一宿主机上不同进程或容器互相干扰导致的",
          shrinkYoungGen: "适当减小参数-Xmn，来减少年轻代大小",
          shrinkYoungGenG1: "适当减小参数-XX:G1MaxNewSizePercent，来减少年轻代大小",
          checkEvacuationFailure: "如果GC出现了To-space exhausted的情况，会大幅拉长GC暂停，解决方法一方面是G1尽量不要设Xmn参数，另一方面考虑排查是否存在大对象分配过多或者内存泄露或者晋升过快等情况",
          checkMemoryLeak: "通过Heap Dump等方式排查是否存在内存泄露的情况",
          checkFastPromotion: "如果这次Full GC前老年代增长地较快，考虑通过做Full GC前的Heap Dump来分析是否存在长生命周期对象引起的过早晋升",
          checkRescan: "如果是Rescan的时间长，可以添加-XX:+CMSScavengeBeforeRemark来优化",
          checkClassUnloading: "如果是Class Unloading的时间长，有可能需要优化下代码，减小class loader的数量",
          expandYoungGen: "适当增加参数-Xmn，来增大年轻代大小",
          expandYoungGenG1: "考虑增大年轻代大小。G1的年轻代大小比较复杂，是根据应用暂停时间来动态调整的，以尽量满足暂停目标。如果当前暂停时间较长，则先考虑优化暂停时间，或者提高暂停时间目标(即增大参数-XX:MaxGCPauseMillis,默认值200 ms)。也可以考虑提高年轻代大小的下限（即打开-XX:+UnlockExperimentalVMOptions，提高-XX:G1NewSizePercent,默认值5，表示年轻代最小是整堆的5%）",
          checkFastObjectAllocation: "排查一下代码中是否存在对象分配速度过快的情况，优化代码",
          useMoreDetailedLoggingUnified: "如果当前的信息还没法确定具体的原因，可以考虑打开debug级GC日志以获取更多信息(把-Xlog参数中的gc*改成gc*=debug，debug级日志内容过多，不建议长期开启)",
        }
      },

      detail: {
        filters: "筛选条件",
        eventType: "GC 事件类型",
        logTime: "日志时间",
        pauseTime: "暂停时间",
        cputime: "CPU时间",
        interval: "发生间隔",
        memory: "内存信息",
      },
    },

    threadDump: {
      title: "线程分析",
      addFile: "添加 Thread Dump",
      overview: '概览',
      lockView: '锁视图',
      basicInfo: '基础信息',
      threadSummary: "线程概要",
      time: '时间',
      vmInfo: '虚拟机',
      jniRefs: 'JNI References',
      jniWeakRefs: 'JNI Weak References',
      errorPrompt: '解析过程中产生的错误数：',
      deadLockCount: '死锁数量',
      threadGroupSummary: "线程池概要",
      javaThread: "Java Thread",
      jitThread: "JIT Thread",
      gcThread: "GC Thread",
      otherThread: "Other Thread",
      total: "Total",
      callSiteTree: "调用栈",
      fileContent: "文件内容",
      loadFileContent: "加载",
      loadMoreFileContent: "加载更多",
      threadNameLabel: "线程名",
    }
  }
};
