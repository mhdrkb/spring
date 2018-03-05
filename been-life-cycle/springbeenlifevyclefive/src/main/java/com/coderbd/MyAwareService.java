package com.coderbd;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 
 * @author Rajaul Islam
 *
 */
public class MyAwareService implements ApplicationContextAware, ApplicationEventPublisherAware, BeanClassLoaderAware,
		BeanFactoryAware, BeanNameAware, EnvironmentAware, ImportAware, ResourceLoaderAware {

	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		System.out.println("setApplicationContext called");
		System.out.println(
				"setApplicationContext:: Bean Definition Names=" + Arrays.toString(ctx.getBeanDefinitionNames()));
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("setBeanName called");
		System.out.println("setBeanName:: Bean Name defined in context=" + beanName);
	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader) {
		System.out.println("setBeanClassLoader called");
		System.out.println("setBeanClassLoader:: ClassLoader Name=" + classLoader.getClass().getName());
	}

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		System.out.println("setResourceLoader called");
		Resource resource = resourceLoader.getResource("classpath:spring.xml");
		System.out.println("setResourceLoader:: Resource File Name=" + resource.getFilename());
	}

	@Override
	public void setImportMetadata(AnnotationMetadata annotationMetadata) {
		System.out.println("setImportMetadata called");
	}

	@Override
	public void setEnvironment(Environment env) {
		System.out.println("setEnvironment called");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory called");
		System.out.println("setBeanFactory:: employee bean singleton=" + beanFactory.isSingleton("employee"));
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		System.out.println("setApplicationEventPublisher called");
	}

}
/**
 * Spring Aware Interfaces
 * 
 * Sometimes we need Spring Framework objects in our beans to perform some
 * operations, for example reading ServletConfig and ServletContext parameters
 * or to know the bean definitions loaded by the ApplicationContext. That’s why
 * spring framework provides a bunch of *Aware interfaces that we can implement
 * in our bean classes.
 * 
 * org.springframework.beans.factory.Aware is the root marker interface for all
 * these Aware interfaces. All of the *Aware interfaces are sub-interfaces of
 * Aware and declare a single setter method to be implemented by the bean. Then
 * spring context uses setter-based dependency injection to inject the
 * corresponding objects in the bean and make it available for our use.
 * 
 * Spring Aware interfaces are similar to servlet listeners with callback
 * methods and implementing observer design pattern.
 * 
 * Some of the important Aware interfaces are:
 * 
 * ApplicationContextAware – to inject ApplicationContext object, example usage
 * is to get the array of bean definition names. BeanFactoryAware – to inject
 * BeanFactory object, example usage is to check scope of a bean. BeanNameAware
 * – to know the bean name defined in the configuration file.
 * ResourceLoaderAware – to inject ResourceLoader object, example usage is to
 * get the input stream for a file in the classpath. ServletContextAware – to
 * inject ServletContext object in MVC application, example usage is to read
 * context parameters and attributes. ServletConfigAware – to inject
 * ServletConfig object in MVC application, example usage is to get servlet
 * config parameters.
 */