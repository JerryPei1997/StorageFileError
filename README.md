# StorageFile-Java-bug-getStatistics
Method "setAccessPolicy" doesn't work when use SASTokenCredential

# Reproduce this issue
- clone this repository using Git first.

- git clone https://github.com/JerryPei1997/StorageFileError.git

- set your  SASToken , AccountName and ShareName in the code. 

- In Visual Studio Code, Open-Folder your project file and run...

# StackTrace & Error Message

Exception in thread "main" com.azure.storage.file.models.StorageException: Status code 403, "﻿<?xml version="1.0" encoding="utf-8"?><Error><Code>AuthorizationFailure</Code><
Message>This request is not authorized to perform this operation.
RequestId:ac2feb79-001a-00fe-8009-75721f000000
Time:2019-09-27T07:57:47.4807378Z</Message></Error>"
        at com.azure.storage.file.PostProcessor.lambda$2(PostProcessor.java:18)
        at reactor.core.publisher.MonoFlatMap$FlatMapMain.onNext(MonoFlatMap.java:118)
        at reactor.core.publisher.FluxSwitchIfEmpty$SwitchIfEmptySubscriber.onNext(FluxSwitchIfEmpty.java:67)
        at reactor.core.publisher.FluxMap$MapSubscriber.onNext(FluxMap.java:114)
        at reactor.core.publisher.Operators$MonoSubscriber.complete(Operators.java:1515)
        at reactor.core.publisher.MonoProcessor.subscribe(MonoProcessor.java:457)
        at reactor.core.publisher.MonoMap.subscribe(MonoMap.java:55)
        at reactor.core.publisher.MonoSwitchIfEmpty.subscribe(MonoSwitchIfEmpty.java:44)
        at reactor.core.publisher.MonoFlatMap.subscribe(MonoFlatMap.java:60)
        at reactor.core.publisher.Mono.subscribe(Mono.java:3848)
        at reactor.core.publisher.FluxOnErrorResume$ResumeSubscriber.onError(FluxOnErrorResume.java:97)
        at reactor.core.publisher.MonoFlatMap$FlatMapMain.onError(MonoFlatMap.java:165)
        at reactor.core.publisher.FluxContextStart$ContextStartSubscriber.onError(FluxContextStart.java:117)
        at reactor.core.publisher.FluxDoOnEach$DoOnEachSubscriber.onError(FluxDoOnEach.java:181)
        at reactor.core.publisher.MonoFlatMap$FlatMapMain.secondError(MonoFlatMap.java:185)
        at reactor.core.publisher.MonoFlatMap$FlatMapInner.onError(MonoFlatMap.java:251)
        at reactor.core.publisher.Operators$MultiSubscriptionSubscriber.onError(Operators.java:1748)
        at reactor.core.publisher.MonoFlatMap$FlatMapMain.secondError(MonoFlatMap.java:185)
        at reactor.core.publisher.MonoFlatMap$FlatMapInner.onError(MonoFlatMap.java:251)
        at reactor.core.publisher.Operators$MultiSubscriptionSubscriber.onError(Operators.java:1748)
        at reactor.core.publisher.MonoFlatMap$FlatMapMain.onNext(MonoFlatMap.java:135)
        at reactor.core.publisher.Operators$MonoSubscriber.complete(Operators.java:1515)
        at reactor.core.publisher.MonoProcessor.onNext(MonoProcessor.java:389)
        at reactor.core.publisher.Operators$MonoSubscriber.complete(Operators.java:1515)
        at reactor.core.publisher.MonoFlatMap$FlatMapMain.onNext(MonoFlatMap.java:144)
        at reactor.core.publisher.FluxMap$MapSubscriber.onNext(FluxMap.java:114)
        at reactor.core.publisher.Operators$MonoSubscriber.complete(Operators.java:1515)
        at reactor.core.publisher.MonoProcessor.subscribe(MonoProcessor.java:457)
        at reactor.core.publisher.MonoMap.subscribe(MonoMap.java:55)
        at reactor.core.publisher.MonoFlatMap.subscribe(MonoFlatMap.java:60)
        at reactor.core.publisher.MonoDefer.subscribe(MonoDefer.java:52)
        at reactor.core.publisher.Mono.subscribe(Mono.java:3848)
        at reactor.core.publisher.MonoProcessor.add(MonoProcessor.java:531)
        at reactor.core.publisher.MonoProcessor.subscribe(MonoProcessor.java:444)
        at reactor.core.publisher.MonoFlatMap.subscribe(MonoFlatMap.java:60)
        at reactor.core.publisher.MonoSwitchIfEmpty.subscribe(MonoSwitchIfEmpty.java:44)
        at reactor.core.publisher.MonoFlatMap$FlatMapMain.onNext(MonoFlatMap.java:150)
        at reactor.core.publisher.FluxMap$MapSubscriber.onNext(FluxMap.java:114)
        at reactor.core.publisher.Operators$MonoSubscriber.complete(Operators.java:1515)
        at reactor.core.publisher.MonoProcessor.onNext(MonoProcessor.java:389)
        at reactor.core.publisher.FluxDoFinally$DoFinallySubscriber.onNext(FluxDoFinally.java:123)
        at reactor.core.publisher.FluxHandle$HandleSubscriber.onNext(FluxHandle.java:113)
        at reactor.core.publisher.FluxMapFuseable$MapFuseableConditionalSubscriber.onNext(FluxMapFuseable.java:287)
        at reactor.core.publisher.FluxUsing$UsingFuseableSubscriber.onNext(FluxUsing.java:350)
        at reactor.core.publisher.FluxFilterFuseable$FilterFuseableSubscriber.onNext(FluxFilterFuseable.java:113)
        at reactor.core.publisher.FluxPeekFuseable$PeekFuseableConditionalSubscriber.onNext(FluxPeekFuseable.java:486)
        at reactor.core.publisher.Operators$MonoSubscriber.complete(Operators.java:1515)
        at reactor.core.publisher.MonoReduceSeed$ReduceSeedSubscriber.onComplete(MonoReduceSeed.java:156)
        at reactor.core.publisher.FluxMap$MapSubscriber.onComplete(FluxMap.java:136)
        at reactor.netty.channel.FluxReceive.terminateReceiver(FluxReceive.java:378)
        at reactor.netty.channel.FluxReceive.drainReceiver(FluxReceive.java:202)
        at reactor.netty.channel.FluxReceive.onInboundComplete(FluxReceive.java:343)
        at reactor.netty.channel.ChannelOperations.onInboundComplete(ChannelOperations.java:325)
        at reactor.netty.channel.ChannelOperations.terminate(ChannelOperations.java:372)
        at reactor.netty.http.client.HttpClientOperations.onInboundNext(HttpClientOperations.java:511)
        at reactor.netty.channel.ChannelOperationsHandler.channelRead(ChannelOperationsHandler.java:141)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
        at io.netty.channel.CombinedChannelDuplexHandler$DelegatingChannelHandlerContext.fireChannelRead(CombinedChannelDuplexHandler.java:438)
        at io.netty.handler.codec.ByteToMessageDecoder.fireChannelRead(ByteToMessageDecoder.java:323)
        at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:297)
        at io.netty.channel.CombinedChannelDuplexHandler.channelRead(CombinedChannelDuplexHandler.java:253)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
        at io.netty.handler.ssl.SslHandler.unwrap(SslHandler.java:1436)
        at io.netty.handler.ssl.SslHandler.decodeJdkCompatible(SslHandler.java:1203)
        at io.netty.handler.ssl.SslHandler.decode(SslHandler.java:1247)
        at io.netty.handler.codec.ByteToMessageDecoder.decodeRemovalReentryProtection(ByteToMessageDecoder.java:502)
        at io.netty.handler.codec.ByteToMessageDecoder.callDecode(ByteToMessageDecoder.java:441)
        at io.netty.handler.codec.ByteToMessageDecoder.channelRead(ByteToMessageDecoder.java:278)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
        at io.netty.channel.AbstractChannelHandlerContext.fireChannelRead(AbstractChannelHandlerContext.java:340)
        at io.netty.channel.DefaultChannelPipeline$HeadContext.channelRead(DefaultChannelPipeline.java:1408)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:362)
        at io.netty.channel.AbstractChannelHandlerContext.invokeChannelRead(AbstractChannelHandlerContext.java:348)
        at io.netty.channel.DefaultChannelPipeline.fireChannelRead(DefaultChannelPipeline.java:930)
        at io.netty.channel.nio.AbstractNioByteChannel$NioByteUnsafe.read(AbstractNioByteChannel.java:163)
        at io.netty.channel.nio.NioEventLoop.processSelectedKey(NioEventLoop.java:677)
        at io.netty.channel.nio.NioEventLoop.processSelectedKeysOptimized(NioEventLoop.java:612)
        at io.netty.channel.nio.NioEventLoop.processSelectedKeys(NioEventLoop.java:529)
        at io.netty.channel.nio.NioEventLoop.run(NioEventLoop.java:491)
        at io.netty.util.concurrent.SingleThreadEventExecutor$5.run(SingleThreadEventExecutor.java:905)
        at java.base/java.lang.Thread.run(Thread.java:835)
        Suppressed: java.lang.Exception: #block terminated with an error
                at reactor.core.publisher.BlockingSingleSubscriber.blockingGet(BlockingSingleSubscriber.java:93)
                at reactor.core.publisher.Mono.block(Mono.java:1494)
                at com.azure.storage.common.Utility.blockWithOptionalTimeout(Utility.java:241)
                at com.azure.storage.file.ShareClient.setAccessPolicyWithResponse(ShareClient.java:439)
                at com.azure.storage.file.ShareClient.setAccessPolicy(ShareClient.java:414)
                at repo.main(repo.java:32)
Caused by: com.azure.storage.file.models.StorageErrorException: Status code 403, "﻿<?xml version="1.0" encoding="utf-8"?><Error><Code>AuthorizationFailure</Code><Message>Thi
s request is not authorized to perform this operation.
RequestId:ac2feb79-001a-00fe-8009-75721f000000
Time:2019-09-27T07:57:47.4807378Z</Message></Error>"
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)
        at com.azure.core.implementation.RestProxy.instantiateUnexpectedException(RestProxy.java:373)
        at com.azure.core.implementation.RestProxy.lambda$null$3(RestProxy.java:416)
        at reactor.core.publisher.MonoFlatMap$FlatMapMain.onNext(MonoFlatMap.java:118)
        ... 65 more
