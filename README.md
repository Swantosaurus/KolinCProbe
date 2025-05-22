# Probe Kotlin with C

## how to run

requirements:

- [kotlin compiler](https://kotlinlang.org/docs/command-line.html)
- [gcc](https://gcc.gnu.org/) or any other compiler

run steps:

-- in gcc step you need to match the platform library extension
 - OSx dylib
 - linux so
 - windows dll

``` bash
gcc -shared -o libworld.dylib native_world.c -I"$JAVA_HOME/include" -I"$JAVA_HOME/include/darwin" -Wall -Werror
kotlinc Main.kt -d hello.jar
java -Djava.library.path=. -jar hello.jar
```

wanna figure out how to make the .h file:
``` bash
kotlinc Main.kt
javap -s -p WorldLib
  
```

