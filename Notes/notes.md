Also, we can perform setter injection by using the configuration XML file.

Okay, so suppose I want to perform the setter injection by using the `configuration.xml` file.

Then what we will do?

First, we create the `configuration.xml` file inside the `src/main/resources`, okay?

Then we apply the namespace, tags, and all those things.

But the most important thing to use setter injection is the **`property` tag**, okay?

But the `property` tag is inside the `bean` tag.

So first, we create the `bean` inside the `bean` tag. We open the bean tag, we write the required properties, and then we close the bean tag.

In between, we use the `property` tag, okay?

The `property` tag contains the **name of the property** of the class and the **value** that we want to inject into that property.

For example:

```xml
<bean id="student" class="com.example.Student">

    <property name="name" value="Rajesh"/>

</bean>
```

Now, for the means, how will we know which bean is for which class?

For that, we use the **`class` attribute** inside the `bean` tag.

We write this `class` attribute inside the bean tag, and there we give the **fully qualified class name**, means the package name plus the class name.

Also, we give the **`id`** of that bean, which is the name by which we can identify that bean.

So our XML configuration is basically telling Spring:

**"Create the object of this class, and inject this value into this property using the setter method."**

After that, we save that file.

And in the main method, now we need to read this XML configuration file.

For this type of XML configuration, we use the **`ClassPathXmlApplicationContext`**, because we have saved our XML configuration file inside `src/main/resources`.

The resources from `src/main/resources` are available on the application's **classpath**, so we use `ClassPathXmlApplicationContext` to load the XML configuration.

For example:

```java
ApplicationContext context =
        new ClassPathXmlApplicationContext("configuration.xml");
```

This `ClassPathXmlApplicationContext` loads the XML configuration and returns an object of the `ApplicationContext` type.

Then, by using that context object, we get the object of our required bean by using:

```java
Student student = context.getBean(Student.class);
```

Inside `getBean`, we provide the type of bean we want.

Here I am saying:

**"I want the bean whose type is `Student`."**

So we give:

```java
Student.class
```

and it will return the object of the `Student` class.

And because we have configured the property in the XML file, Spring has already performed the setter injection while creating the object.

So whenever we use that object and print the data, we will get the injected data.

So this is the whole concept of **setter injection by using the XML configuration file**.
