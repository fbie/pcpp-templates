# How to hand in #

## What you get as part of the assignment ##

The assignment is handed out as a ZIP-archive that contains example code, empty classes that you will have to implement and a PDF document with the assignment and further questions and explanations.

Unzip the archive into any folder. You can use for instance Eclipse to import the files into a project and build and run from there.

If you want to use a shell that supports Make, then simply run:

```
$ make
```

to build the source files. You can then run the compiled classes with, e.g.:

```
$ java -cp ./pcpp pcpp.week01.TestAccountTransfer
```

The ```-cp``` flag declares Java's class path, which is where the Java runtime looks for compiled classes at runtime. Note that you will have to use the full class name, e.g. ```pcpp.week01.TestAccountTransfer```, in order to run the program.

## Submissions ##

Please hand in a ZIP-archive that contains only:

* The Java source files, in the same directory structure you received originally.
* Your answers to the questions as a plain text file called ```answers.txt```. Using Markdown or similar is appreciated but no requirement. The file ending may differ (e.g. ```answers.md```, ```answers.org```), but it **must** begin with ```answers```.
* The Makefile file.

You can build such a ZIP-archive by re-using the Makefile and by running:

```
$ make submission
```

Do **under no circumstances** hand in any of the following:

* Compiled binary files (*.class files)
* Eclipse workspace settings, project files etc.
* PDF or Microsoft Word documents.

Furthermore, **do not** change the packages of the provided source files. That is, do not move them into different folders (e.g. something horribly long like ```dk.itu.pcpp.group49.week02```) and do not change the ```package``` declaration at the top of the files. Furthermore, all files must still compile when using the Makefile.

## Why do you not use Ant/Maven/Gradle? ###

We use Make because it is very convenient for us. We are aware that Make is not part of the standard Java tool chain, but writing build scripts for Ant, Maven or Gradle is much more tedious and imposes a huge overhead for each single assignment. Make is part of Linux and Mac OSX and can be run on Windows using e.g. CygWin.
