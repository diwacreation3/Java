# Java ?
Java is a popular programming language. Java is used to develop mobile apps, desktops apps, games, and much more.

### Hello World in Java 

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}
```
In Java, a source file is called a compilation unit. it is text file that contains one or more class definations. The java compiler requires that source file use the `.java` filename extension. 

In Java, all code must reside inside a class. By convention, the name of the public class should match the its file name. And java is case sensitive

## Compiling the Progarm 
To compile the program, execute the compiler, `javac`, specifying the name of the source file on the command line: 
```bash
javac Main.java
```
The `javac` compiler creates a file called `Main.class` `Main.class` contains the byte code version of the program.

To run the program, use the Java interpeter, called `java`. Pass the class name `Main` as a command-line argument 
```bash
java main
```
When java source code is compiled each individual class is put into it's own file named `classname.class`

## A Closer Look at the `Main.java`

```java
public class Main{ 
```
The keyword `class` declares that a new class is being defined. `Main` is the name of the class. The entire class definition is between the opening curly brace { and the closing curly brace }. 

```java
public static void main(String args[]) {
```
Java applications begin execution by calling `main(String args[])`. Java is case-sensitive, Thus, `Main` is different from `main`.