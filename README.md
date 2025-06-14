# Spring Boot 

##  What is Spring?

Spring is a powerful, lightweight framework for building **enterprise-level Java applications**. It offers:

- ✅ Loose coupling using **Dependency Injection (DI)**
- ✅ Support for **modular design**
- ✅ Powerful abstractions for **web apps, data access**, and more

---

##  What is Spring Boot?

Spring Boot is built on top of the Spring Framework and makes development faster and easier by:

-  Reducing boilerplate **configuration**
-  Providing **auto-configuration** for many common components
-  Embedding servers like **Tomcat or Jetty**
-  Allowing creation of **stand-alone**, production-ready apps

---

##  What is Dependency Injection (DI)?

Dependency Injection is a **design pattern** in which objects get their dependencies from an **external source**, rather than creating them internally. In Spring, the framework handles this for you.

---

##  Inversion of Control (IoC)

- Spring **controls the creation, configuration, and lifecycle** of objects (beans)
- Improves:
    - ✅ **Testability**
    - ✅ **Modularity**
    - ✅ **Maintainability**

---

##  How It Works

| Annotation          | Purpose                                                                 |
|---------------------|-------------------------------------------------------------------------|
| `@SpringBootApplication` | Combines `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan` |
| `@RestController`        | Marks a class to handle REST API calls                              |
| `@Service`               | Declares a class as a **business service** managed by Spring         |
| `@Autowired`             | Automatically injects dependencies (also supports constructor injection) |

---

## ✅ Summary

This project is a great starting point to understand:

-  Core **Spring** concepts
-  The **power of Spring Boot** in simplifying Java development
-  How **Dependency Injection (DI)** decouples code and improves structure

