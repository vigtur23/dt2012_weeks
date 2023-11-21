# Week assignments for the dt2012 course

## Structure
Every week has a unique folder with the name `weekx` where x is the week for the specific assignment.

## Compile
1. Create a build folder in the week folder cd into it.
2. Run
```bash
cmake -G ninja ..
```

## Run an assignment
1. Cd into the build folder and run the following command and change $CLASS and $ARGS with the class and arguments
```bash
java -cp main.jar $CLASS $ARGS
```
