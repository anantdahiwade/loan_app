package com.fi.loanapp.exceptionHandled;

public class exceptions {
}

//        java.lang.AssertionError: Redirected URL expected:</CustomerDashBoard> but was:</CustomerDashBoard?customer_id=12345>
//        Expected :/CustomerDashBoard
//        Actual   :/CustomerDashBoard?customer_id=12345
//<Click to see difference>
//
//
//        at org.springframework.test.util.AssertionErrors.fail(AssertionErrors.java:59)
//        at org.springframework.test.util.AssertionErrors.assertEquals(AssertionErrors.java:122)
//        at org.springframework.test.web.servlet.result.MockMvcResultMatchers.lambda$redirectedUrl$2(MockMvcResultMatchers.java:130)
//        at org.springframework.test.web.servlet.MockMvc$1.andExpect(MockMvc.java:214)
//        at com.fi.loanapp.controllerTest.CustomerControllerTest.testVerifyCustomer(CustomerControllerTest.java:79)
//        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
//        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
//        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:725)
//        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:149)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:140)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:84)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:214)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:210)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:135)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:66)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
//        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
//        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:107)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:88)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:54)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:67)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:52)
//        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
//        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
//        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
//        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:53)
//        at com.intellij.junit5.JUnit5IdeaTestRunner.startRunnerWithArgs(JUnit5IdeaTestRunner.java:57)
//        at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
//        at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
//        at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
//        at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
//        at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
//
//        22:33:30.144 [main] DEBUG org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator - Loaded expression factory via original TCCL
//        22:33:30.144 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom MessageInterpolator of type org.springframework.validation.beanvalidation.LocaleContextMessageInterpolator
//        22:33:30.144 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom ParameterNameProvider of type org.springframework.validation.beanvalidation.LocalValidatorFactoryBean$1
//        22:33:30.145 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - Trying to load META-INF/validation.xml for XML based Validator configuration.
//        22:33:30.145 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via TCCL
//        22:33:30.145 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via Hibernate Validator's class loader
//        22:33:30.145 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - No META-INF/validation.xml found. Using annotation based configuration only.
//        22:33:30.145 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Found javax.persistence.Persistence on classpath containing 'getPersistenceUtil'. Assuming JPA 2 environment. Trying to instantiate JPA aware TraversableResolver
//        22:33:30.145 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Instantiated JPA aware TraversableResolver of type org.hibernate.validator.internal.engine.resolver.JPATraversableResolver.
//        22:33:30.149 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider as property node name provider.
//        22:33:30.149 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.springframework.validation.beanvalidation.LocaleContextMessageInterpolator as ValidatorFactory-scoped message interpolator.
//        22:33:30.149 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.resolver.JPATraversableResolver as ValidatorFactory-scoped traversable resolver.
//        22:33:30.150 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as ValidatorFactory-scoped parameter name provider.
//        22:33:30.150 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.DefaultClockProvider as ValidatorFactory-scoped clock provider.
//        22:33:30.150 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluatorFactory as ValidatorFactory-scoped script evaluator factory.
//        22:33:30.152 [main] DEBUG _org.springframework.web.servlet.HandlerMapping.Mappings -
//        c.f.l.c.CustomerController:
//        {POST [/addcustomer]}: registerCustomer(Customer)
//        {GET [/CustomerDashBoard]}: getDashBoard(Model)
//        {GET [/CustomerProfile]}: getProfile(Model)
//        {GET [/RegisterSuccess]}: registerSuccess()
//        {POST [/verifycustomer]}: verifyCustomer(Model,String,String)
//        22:33:30.153 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - 5 mappings in org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping
//        22:33:30.160 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter - ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
//        22:33:30.162 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver - ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
//        22:33:30.162 [main] INFO org.springframework.mock.web.MockServletContext - Initializing Spring TestDispatcherServlet ''
//        22:33:30.162 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Initializing Servlet ''
//        22:33:30.163 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected AcceptHeaderLocaleResolver
//        22:33:30.163 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected FixedThemeResolver
//        22:33:30.163 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator@5a8c93
//        22:33:30.163 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.support.SessionFlashMapManager@3bed3315
//        22:33:30.163 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logging of potentially sensitive data
//        22:33:30.163 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Completed initialization in 1 ms
//
//        java.lang.ClassCastException: class com.fi.loanapp.entity.Customer$MockitoMock$69mCmJnv cannot be cast to class java.util.List (com.fi.loanapp.entity.Customer$MockitoMock$69mCmJnv is in unnamed module of loader 'app'; java.util.List is in module java.base of loader 'bootstrap')
//
//        at com.fi.loanapp.controllerTest.CustomerControllerTest.testGetDashBoard(CustomerControllerTest.java:100)
//        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
//        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
//        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:725)
//        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:149)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:140)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:84)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:214)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:210)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:135)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:66)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
//        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
//        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:107)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:88)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:54)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:67)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:52)
//        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
//        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
//        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
//        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:53)
//        at com.intellij.junit5.JUnit5IdeaTestRunner.startRunnerWithArgs(JUnit5IdeaTestRunner.java:57)
//        at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
//        at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
//        at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
//        at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
//        at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
//
//        22:33:30.267 [main] DEBUG org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator - Loaded expression factory via original TCCL
//        22:33:30.267 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom MessageInterpolator of type org.springframework.validation.beanvalidation.LocaleContextMessageInterpolator
//        22:33:30.268 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom ParameterNameProvider of type org.springframework.validation.beanvalidation.LocalValidatorFactoryBean$1
//        22:33:30.268 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - Trying to load META-INF/validation.xml for XML based Validator configuration.
//        22:33:30.268 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via TCCL
//        22:33:30.268 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via Hibernate Validator's class loader
//        22:33:30.268 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - No META-INF/validation.xml found. Using annotation based configuration only.
//        22:33:30.268 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Found javax.persistence.Persistence on classpath containing 'getPersistenceUtil'. Assuming JPA 2 environment. Trying to instantiate JPA aware TraversableResolver
//        22:33:30.268 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Instantiated JPA aware TraversableResolver of type org.hibernate.validator.internal.engine.resolver.JPATraversableResolver.
//        22:33:30.270 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider as property node name provider.
//        22:33:30.271 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.springframework.validation.beanvalidation.LocaleContextMessageInterpolator as ValidatorFactory-scoped message interpolator.
//        22:33:30.271 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.resolver.JPATraversableResolver as ValidatorFactory-scoped traversable resolver.
//        22:33:30.271 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as ValidatorFactory-scoped parameter name provider.
//        22:33:30.271 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.DefaultClockProvider as ValidatorFactory-scoped clock provider.
//        22:33:30.271 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluatorFactory as ValidatorFactory-scoped script evaluator factory.
//        22:33:30.273 [main] DEBUG _org.springframework.web.servlet.HandlerMapping.Mappings -
//        c.f.l.c.CustomerController:
//        {POST [/addcustomer]}: registerCustomer(Customer)
//        {GET [/CustomerDashBoard]}: getDashBoard(Model)
//        {GET [/CustomerProfile]}: getProfile(Model)
//        {GET [/RegisterSuccess]}: registerSuccess()
//        {POST [/verifycustomer]}: verifyCustomer(Model,String,String)
//        22:33:30.274 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - 5 mappings in org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping
//        22:33:30.278 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter - ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
//        22:33:30.282 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver - ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
//        22:33:30.282 [main] INFO org.springframework.mock.web.MockServletContext - Initializing Spring TestDispatcherServlet ''
//        22:33:30.282 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Initializing Servlet ''
//        22:33:30.283 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected AcceptHeaderLocaleResolver
//        22:33:30.283 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected FixedThemeResolver
//        22:33:30.283 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator@72503b19
//        22:33:30.283 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.support.SessionFlashMapManager@1cfc2538
//        22:33:30.283 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logging of potentially sensitive data
//        22:33:30.283 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Completed initialization in 1 ms
//
//        org.mockito.exceptions.misusing.UnfinishedStubbingException:
//        Unfinished stubbing detected here:
//        -> at com.fi.loanapp.controllerTest.CustomerControllerTest.testGetDashBoard(CustomerControllerTest.java:100)
//
//        E.g. thenReturn() may be missing.
//        Examples of correct stubbing:
//        when(mock.isOk()).thenReturn(true);
//        when(mock.isOk()).thenThrow(exception);
//        doThrow(exception).when(mock).someVoidMethod();
//        Hints:
//        1. missing thenReturn()
//        2. you are trying to stub a final method, which is not supported
//        3. you are stubbing the behaviour of another mock inside before 'thenReturn' instruction is completed
//
//
//        at com.fi.loanapp.controllerTest.CustomerControllerTest.testGetProfile(CustomerControllerTest.java:128)
//        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
//        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
//        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:725)
//        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:149)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:140)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:84)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:214)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:210)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:135)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:66)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
//        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
//        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:107)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:88)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:54)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:67)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:52)
//        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
//        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
//        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
//        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:53)
//        at com.intellij.junit5.JUnit5IdeaTestRunner.startRunnerWithArgs(JUnit5IdeaTestRunner.java:57)
//        at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
//        at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
//        at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
//        at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
//        at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
//
//        22:33:30.298 [main] DEBUG org.hibernate.validator.messageinterpolation.ResourceBundleMessageInterpolator - Loaded expression factory via original TCCL
//        22:33:30.298 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom MessageInterpolator of type org.springframework.validation.beanvalidation.LocaleContextMessageInterpolator
//        22:33:30.298 [main] DEBUG org.hibernate.validator.internal.engine.AbstractConfigurationImpl - Setting custom ParameterNameProvider of type org.springframework.validation.beanvalidation.LocalValidatorFactoryBean$1
//        22:33:30.299 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - Trying to load META-INF/validation.xml for XML based Validator configuration.
//        22:33:30.299 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via TCCL
//        22:33:30.299 [main] DEBUG org.hibernate.validator.internal.xml.config.ResourceLoaderHelper - Trying to load META-INF/validation.xml via Hibernate Validator's class loader
//        22:33:30.299 [main] DEBUG org.hibernate.validator.internal.xml.config.ValidationXmlParser - No META-INF/validation.xml found. Using annotation based configuration only.
//        22:33:30.299 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Found javax.persistence.Persistence on classpath containing 'getPersistenceUtil'. Assuming JPA 2 environment. Trying to instantiate JPA aware TraversableResolver
//        22:33:30.300 [main] DEBUG org.hibernate.validator.internal.engine.resolver.TraversableResolvers - Instantiated JPA aware TraversableResolver of type org.hibernate.validator.internal.engine.resolver.JPATraversableResolver.
//        22:33:30.301 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000252: Using org.hibernate.validator.internal.engine.DefaultPropertyNodeNameProvider as property node name provider.
//        22:33:30.301 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.springframework.validation.beanvalidation.LocaleContextMessageInterpolator as ValidatorFactory-scoped message interpolator.
//        22:33:30.301 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.resolver.JPATraversableResolver as ValidatorFactory-scoped traversable resolver.
//        22:33:30.301 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.util.ExecutableParameterNameProvider as ValidatorFactory-scoped parameter name provider.
//        22:33:30.301 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.DefaultClockProvider as ValidatorFactory-scoped clock provider.
//        22:33:30.301 [main] DEBUG org.hibernate.validator.internal.engine.ValidatorFactoryConfigurationHelper - HV000234: Using org.hibernate.validator.internal.engine.scripting.DefaultScriptEvaluatorFactory as ValidatorFactory-scoped script evaluator factory.
//        22:33:30.303 [main] DEBUG _org.springframework.web.servlet.HandlerMapping.Mappings -
//        c.f.l.c.CustomerController:
//        {POST [/addcustomer]}: registerCustomer(Customer)
//        {GET [/CustomerDashBoard]}: getDashBoard(Model)
//        {GET [/CustomerProfile]}: getProfile(Model)
//        {GET [/RegisterSuccess]}: registerSuccess()
//        {POST [/verifycustomer]}: verifyCustomer(Model,String,String)
//        22:33:30.304 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - 5 mappings in org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping
//        22:33:30.308 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter - ControllerAdvice beans: 0 @ModelAttribute, 0 @InitBinder, 1 RequestBodyAdvice, 1 ResponseBodyAdvice
//        22:33:30.309 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver - ControllerAdvice beans: 0 @ExceptionHandler, 1 ResponseBodyAdvice
//        22:33:30.309 [main] INFO org.springframework.mock.web.MockServletContext - Initializing Spring TestDispatcherServlet ''
//        22:33:30.309 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Initializing Servlet ''
//        22:33:30.310 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected AcceptHeaderLocaleResolver
//        22:33:30.310 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected FixedThemeResolver
//        22:33:30.310 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.view.DefaultRequestToViewNameTranslator@10947c4e
//        22:33:30.310 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Detected org.springframework.web.servlet.support.SessionFlashMapManager@3667faa8
//        22:33:30.310 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - enableLoggingRequestDetails='false': request parameters and headers will be masked to prevent unsafe logging of potentially sensitive data
//        22:33:30.310 [main] INFO org.springframework.test.web.servlet.TestDispatcherServlet - Completed initialization in 0 ms
//        22:33:30.310 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - GET "/RegisterSuccess", parameters={}
//        22:33:30.310 [main] DEBUG org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping - Mapped to com.fi.loanapp.controller.CustomerController#registerSuccess()
//        22:33:30.311 [main] DEBUG org.springframework.web.servlet.view.InternalResourceView - View [InternalResourceView], model {}
//        22:33:30.314 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Error rendering view [org.springframework.web.servlet.view.InternalResourceView: [InternalResourceView]; URL [RegisterSuccess]]
//        javax.servlet.ServletException: Circular view path [RegisterSuccess]: would dispatch back to the current handler URL [/RegisterSuccess] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
//        at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
//        at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
//        at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
//        at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1405)
//        at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
//        at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1149)
//        at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1088)
//        at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:964)
//        at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
//        at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
//        at javax.servlet.http.HttpServlet.service(HttpServlet.java:670)
//        at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
//        at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
//        at javax.servlet.http.HttpServlet.service(HttpServlet.java:779)
//        at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
//        at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
//        at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:201)
//        at com.fi.loanapp.controllerTest.CustomerControllerTest.testRegisterSuccess(CustomerControllerTest.java:65)
//        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
//        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
//        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:725)
//        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:149)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:140)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:84)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:214)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:210)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:135)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:66)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
//        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
//        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:107)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:88)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:54)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:67)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:52)
//        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
//        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
//        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
//        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:53)
//        at com.intellij.junit5.JUnit5IdeaTestRunner.startRunnerWithArgs(JUnit5IdeaTestRunner.java:57)
//        at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
//        at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
//        at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
//        at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
//        at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
//        22:33:30.314 [main] DEBUG org.springframework.test.web.servlet.TestDispatcherServlet - Failed to complete request: javax.servlet.ServletException: Circular view path [RegisterSuccess]: would dispatch back to the current handler URL [/RegisterSuccess] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
//
//        javax.servlet.ServletException: Circular view path [RegisterSuccess]: would dispatch back to the current handler URL [/RegisterSuccess] again. Check your ViewResolver setup! (Hint: This may be the result of an unspecified view, due to default view name generation.)
//
//        at org.springframework.web.servlet.view.InternalResourceView.prepareForRendering(InternalResourceView.java:210)
//        at org.springframework.web.servlet.view.InternalResourceView.renderMergedOutputModel(InternalResourceView.java:148)
//        at org.springframework.web.servlet.view.AbstractView.render(AbstractView.java:316)
//        at org.springframework.web.servlet.DispatcherServlet.render(DispatcherServlet.java:1405)
//        at org.springframework.test.web.servlet.TestDispatcherServlet.render(TestDispatcherServlet.java:137)
//        at org.springframework.web.servlet.DispatcherServlet.processDispatchResult(DispatcherServlet.java:1149)
//        at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1088)
//        at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:964)
//        at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
//        at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
//        at javax.servlet.http.HttpServlet.service(HttpServlet.java:670)
//        at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
//        at org.springframework.test.web.servlet.TestDispatcherServlet.service(TestDispatcherServlet.java:72)
//        at javax.servlet.http.HttpServlet.service(HttpServlet.java:779)
//        at org.springframework.mock.web.MockFilterChain$ServletFilterProxy.doFilter(MockFilterChain.java:167)
//        at org.springframework.mock.web.MockFilterChain.doFilter(MockFilterChain.java:134)
//        at org.springframework.test.web.servlet.MockMvc.perform(MockMvc.java:201)
//        at com.fi.loanapp.controllerTest.CustomerControllerTest.testRegisterSuccess(CustomerControllerTest.java:65)
//        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77)
//        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//        at java.base/java.lang.reflect.Method.invoke(Method.java:568)
//        at org.junit.platform.commons.util.ReflectionUtils.invokeMethod(ReflectionUtils.java:725)
//        at org.junit.jupiter.engine.execution.MethodInvocation.proceed(MethodInvocation.java:60)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$ValidatingInvocation.proceed(InvocationInterceptorChain.java:131)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.intercept(TimeoutExtension.java:149)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestableMethod(TimeoutExtension.java:140)
//        at org.junit.jupiter.engine.extension.TimeoutExtension.interceptTestMethod(TimeoutExtension.java:84)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker$ReflectiveInterceptorCall.lambda$ofVoidMethod$0(ExecutableInvoker.java:115)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.lambda$invoke$0(ExecutableInvoker.java:105)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain$InterceptedInvocation.proceed(InvocationInterceptorChain.java:106)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.proceed(InvocationInterceptorChain.java:64)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.chainAndInvoke(InvocationInterceptorChain.java:45)
//        at org.junit.jupiter.engine.execution.InvocationInterceptorChain.invoke(InvocationInterceptorChain.java:37)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:104)
//        at org.junit.jupiter.engine.execution.ExecutableInvoker.invoke(ExecutableInvoker.java:98)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$invokeTestMethod$7(TestMethodTestDescriptor.java:214)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.invokeTestMethod(TestMethodTestDescriptor.java:210)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:135)
//        at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.execute(TestMethodTestDescriptor.java:66)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:151)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141)
//        at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139)
//        at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138)
//        at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95)
//        at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35)
//        at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57)
//        at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:107)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:88)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.lambda$execute$0(EngineExecutionOrchestrator.java:54)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.withInterceptedStreams(EngineExecutionOrchestrator.java:67)
//        at org.junit.platform.launcher.core.EngineExecutionOrchestrator.execute(EngineExecutionOrchestrator.java:52)
//        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:114)
//        at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:86)
//        at org.junit.platform.launcher.core.DefaultLauncherSession$DelegatingLauncher.execute(DefaultLauncherSession.java:86)
//        at org.junit.platform.launcher.core.SessionPerRequestLauncher.execute(SessionPerRequestLauncher.java:53)
//        at com.intellij.junit5.JUnit5IdeaTestRunner.startRunnerWithArgs(JUnit5IdeaTestRunner.java:57)
//        at com.intellij.rt.junit.IdeaTestRunner$Repeater$1.execute(IdeaTestRunner.java:38)
//        at com.intellij.rt.execution.junit.TestsRepeater.repeat(TestsRepeater.java:11)
//        at com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:35)
//        at com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:235)
//        at com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:54)
//
//
//        Process finished with exit code -1
//
