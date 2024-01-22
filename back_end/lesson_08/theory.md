# Theory

## Weak coupling between application components (classes, layers) - this is necessary based on the requirements for flexibility and development of the application

* Due to the fact that classes are created based on **interfaces** (implements), we can change the application configuration in Main, substituting different implementations of the same interfaces.

* In real applications there can be quite a lot of components (classes) and, accordingly, layers, for example:
  * Services layer for regular user and administrator
  * Various types of validators for serving data entry forms
  * Controllers for different user requests (menu navigation)
  * Different repositories and their types (for example, connections to different DBMSs)

* In applications where there are many such components, it becomes difficult to independently create objects and connect them with each other (as in the Main example)

##Spring

* Implements IoC/DI approach

### Basic concepts

* `Bean` is the central concept of Spring. A bean is an object of some class that is “managed” by Spring (Spring management)
* When is a regular object called a "bean"? When this object was created using Spring and it can be called through the so-called Spring-context of the application.
* Typically beans are placed in a separate AppConfig class, which is usually marked with the `@Configuration` annotation.
* Each bean has two characteristics: "name/id" and the class on which it is created.
* In case we create a bean using a method, for example:

```
     @Bean
     public PasswordValidator passwordValidatorNotEmpty() {
         return new PasswordNotEmptyValidatorImpl();
     }
```

* Here the bean id is the name of the method - `passwordValidatorNotEmpty`
* And the bean class/type is `PasswordValidator`

* All beans created by Spring are placed in the `Spring Context`, a special container managed by Spring.

Next in Main you need to declare/create an applicationContext:

```java
AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
```

* From Spring Context we can get a bean (extract) by id (unique name) and type (class name):

```java
PasswordValidator passwordValidator = applicationContext.getBean("passwordValidatorRegex", PasswordValidator.class);
```

## Generalization

1. In Main we created instances of each class and linked them together.
2. In Main2 we contacted the Spring container (Spring Context) and asked it for a bean with type `UsersController`
3. This bean came to us with a dependency on `UsersService`, and that, in turn, depends on all the other beans we need and useful.
4. To ensure that the beans are in the container (in the context), we create the `AppConfig` class, in which we list all the necessary beans.
5. An approach when the logic for creating application components and linking them is placed in a separate module - called Inversion of Control (IoC).

* A bean is just an object, an application component, an instance of some class, BUT it is inside the Spring container/context.

* `@Bean` - an annotation with which we mark a method, the result of which is the creation of an object of the type we need (class object).

```
@Bean
public PasswordValidator passwordValidatorNotEmpty() {
     return new PasswordNotEmptyValidatorImpl();
}
```

* `passwordValidatorNotEmpty` is the name/id of your bean of type `PasswordValidator`
* inside the method we describe the logic of creating our bean, at the end there must be `return`
* The bean id can be absolutely anything, the main thing is that it is unique:

```
@Bean
public PasswordValidator xyz() {
     return new PasswordNotEmptyValidatorImpl();
}
```

* In a method that is marked with the `@Bean` annotation, you can substitute other beans in the method parameters.
* If there are several beans of the same type, that is, created based on the same class, then the unique name of the bean allows us to understand which bean we need in each specific case.
* If there is only one bean of this type, the name of the bean can be arbitrary.

## Creating and receiving a bean

* You can put a bean into a container using the `@Bean` annotation
* You can get a bean from a container using:
  * `applicationContext.getBean(NeedBeanType.class)`
  * `applicationContext.getBean(Bean-Id, Bean-Type.class)`

==========================================================

# Теория

## Слабая связь между компонентами приложения (классами, слоями) - это нужно, исходя из требований гибкости и развития приложения

* Благодаря тому, что классы создаются на базе **интерфейсов** (implements), мы можем менять конфигурацию приложения в Main, подставляя разные реализации одних и тех же интерфейсов.

* В реальных приложениях компонентов(классов) и, соответственно, слоев может быть достаточно много, например:
  * Слой сервисов для обычного пользователя и администратора
  * Различные виды валидаторов для обслуживания форм ввода данных
  * Контроллеры на разные запросы пользователей (переходы по меню)
  * Разные репозитории и их типы (например, подключения к разным СУБД)
  
* В приложениях, где таких компонентов много, становится трудно самостоятельно создавать объекты и связывать их между собой (как в примере Main)

## Spring

* Реализует подход IoC/DI

### Основные понятия

* `Bean\Бин` - центральное понятие Spring. Бин - это объект какого-либо класса, который "управляется" Spring-ом (Spring management)
* Когда обычный объект называют "бином"? Когда этот объект был создан с использованием Spring и он может быть вызван через так называемый Spring-context приложения.
* Обычно бины помещаются в отдельный класс AppConfig, который, как правило, помечается аннотацией `@Configuration`.
* Каждый бин имеет две характеристики: "названием/id" и класс, на основе которого он создан.
* В случае, если мы создаем бин с помощью метода, например:

```
    @Bean
    public PasswordValidator passwordValidatorNotEmpty() {
        return new PasswordNotEmptyValidatorImpl();
    }
```

* То здесь id-бина - это название метода - `passwordValidatorNotEmpty`
* А класс/тип бина -  `PasswordValidator`

* Все создаваемые Spring бины помещаются в `Spring Context`, специальный контейнер, которым управляет Spring. 

Далее в Main необходимо объявить/создать applicationContext:

```java
AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
```

* Из Spring Context мы можем получить бин (извлечь) по id(уникальному имени) и типу(имени класса):

```java
PasswordValidator passwordValidator = applicationContext.getBean("passwordValidatorRegex", PasswordValidator.class);
```

## Обобщение

1. В Main мы создавали экземпляры каждого класса и связывали их между собой.
2. В Main2 мы обратились к контейнеру Spring (Spring Context) и попросили у него бин с типом `UsersController`
3. Данный бин к нам пришел с зависимостью на `UsersService`,а тот, в свою очередь зависит от всех других нужных нам и полезных бинов.
4. Чтобы бины были в контейнере (попали в контекст), создаем класс `AppConfig`, в котором перечисляем все необходимые бины.
5. Подход, когда логика создания компонентов приложения и их связывания выносится в отдельный модуль - называется Inversion of Control (IoC).

* Бин - это просто объект, компонент приложения, экземпляр какого-либо класса, НО он находится внутри контейнера/контекста Spring.

* `@Bean` - аннотация, которой мы помечаем метод, результатом работы которого является создание объекта нужного нам типа (объекта класса).

```
@Bean
public PasswordValidator passwordValidatorNotEmpty() {
    return new PasswordNotEmptyValidatorImpl();
}
```

* `passwordValidatorNotEmpty` - это название/id вашего бина типа `PasswordValidator`
* внутри метода описываем логику создания нашего бина, в конце обязательно `return`
* id-бина может быть абсолютно любым, главное - уникальным:

```
@Bean
public PasswordValidator xyz() {
    return new PasswordNotEmptyValidatorImpl();
}
```

* В метод, который помечен аннотацией `@Bean` можно подставить другие бины в параметрах метода.
* Если имеется несколько бинов, одинакового типа, то етсь созданных на основе одного класса, то уникальное название бина позволяет понять, какой бин нам нужен в каждом конкретном случае.
* Если бин по такому типу только один - на название бина может быть произвольным.

## Создание и получение бина

* Положить бин в контейнер можно с помощью аннотации `@Bean`
* Получить бин из контейнера можно с помощью:
  * `applicationContext.getBean(ТипНужногоБина.class)`
  * `applicationContext.getBean(Id-нужного-бина, ТипНужногоБина.class)`