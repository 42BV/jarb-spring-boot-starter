# JaRB Spring Boot Starter

The Jarb project: https://github.com/42BV/jarb

## Features
- Adds a `BeanConstraintController` to the `ApplicationContext`.
- Adds a `HibernatePropertiesCustomizer` to the `ApplicationContext` 
to set the `javax.persistence.validation.factory` hibernate property to the configured `LocalValidatorFactoryBean`.

## Usage
Add this maven dependency to your project.

```xml
<dependency>
    <groupId>nl.42</groupId>
    <artifactId>jarb-spring-boot-starter</artifactId>
    <version>1.1.0</version>
</dependency>
```