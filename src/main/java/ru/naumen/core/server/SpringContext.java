package ru.naumen.core.server;

import java.util.Map;
import org.slf4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

@Component
public class SpringContext {
    private static final Logger LOG = null;
    private static SpringContext INSTANCE;
    private AutowireCapableBeanFactory factory;
    private ConfigurableApplicationContext applicationContext;

    public SpringContext() {
    }

    public static SpringContext getInstance() {
        return INSTANCE;
    }

    public static <T> T tryUnproxyBean(T proxiedBean) {
        return null;
    }

    public void addApplicationListener(ApplicationListener<?> listener) {
    }

    public void autowireBean(Object existingBean) throws BeansException {
    }

    public boolean containsBean(String beanName) {
        return false;
    }

    public <T> T createBean(Class<T> requiredType) throws BeansException {
        return null;
    }

    public <T> T evaluateExpression(String expression, Class<? extends T> clazz) {
        return null;
    }

    public <T> T getBean(Class<T> requiredType) throws BeansException {
        return null;
    }

    public void publishEvent(ApplicationEvent applicationEvent) {
    }

    public Object getBean(String name) throws BeansException {
        return null;
    }

    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return null;
    }

    public AutowireCapableBeanFactory getBeanFactory() {
        return null;
    }

    public <T> Map<String, T> getBeans(Class<T> requiredType) {
        return null;
    }

    public void init() {
    }

    public void initializeBean(Object existingBean, String beanName) {
    }

    public void isTypeMatch(String name, Class<?> targetType) throws NoSuchBeanDefinitionException {
    }

    @SuppressWarnings("NullableProblems")
    public static class NonReadOnlyBeanCondition implements Condition {
        public NonReadOnlyBeanCondition() {
        }

        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            return false;
        }
    }

    @SuppressWarnings("NullableProblems")
    public static class ReadOnlyBeanCondition implements Condition {
        public ReadOnlyBeanCondition() {
        }

        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
            return false;
        }
    }
}
