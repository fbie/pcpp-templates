# How to add a new assignment #

Clone this repository and then run

```
$ sh template/make-week.sh 01
Created a new empty assignment in /Users/fbie/src/pcpp-templates/week01.
```

to add a folder ```week01``` with Ant build file, Makefile, the necessary JUnit dependencies and a file ```test.sh``` which executes the unit tests in ```TestSubmission.java```. Then package the assignment by running either

```
$ make archive
```

or

```
$ ant archive
```

which both produce a file ```pcpp-week01.zip```, which is the assignment archive and
a file ```pcpp-week01-tas.zip``` which contains the same files as the other archive, plus the file ```TestSubmission.java``` and the corresponding dependencies.

# How to hand in #

## What you get as part of the assignment ##

The assignment is handed out as a ZIP-archive that contains example code and empty classes that you will have to implement. Furthermore, the archive contains a ```Makefile``` and an Ant ```build.xml``` which you can use to build and package your solution.

Unzip the archive into any folder. You can use for instance Eclipse to import the source files and the ```build.xml``` into a project and build and run from there.

You can use Ant also from the command line:

```
$ ant
```

If you prefer to use Make, then instead run:

```
$ make
```

to build the source files. You can then run the compiled classes with, e.g.:

```
$ java -cp .:./src pcpp.week01.TestAccountTransfer
```

on Mac OS X and Linux and


```
$ java -cp .;./src pcpp.week01.TestAccountTransfer
```

on Windows. The subtle difference is that on Windows, classpath variables need to be separated by ```;``` instead of ```:```.

The ```-cp``` flag declares Java's class path, which is where the Java runtime looks for compiled classes at runtime. Note that you will have to use the full class name, e.g. ```pcpp.week01.TestAccountTransfer```, in order to run the program.

## Submissions ##

Please hand in a ZIP-archive that contains only:

* The Java source files, in the same directory structure you received originally.
* Your answers to the questions as a plain text file called ```answers.txt```. Using Markdown or similar is appreciated but no requirement. The file ending may differ (e.g. ```answers.md```, ```answers.org```), but it **must** begin with ```answers```.
* The Makefile file.

You can build such a ZIP-archive by re-using the Ant build file or the Makefile by running either:

```
$ ant submission
```

or

```
$ make submission
```

**Under no circumstances** hand in any of the following:

* Compiled binary files (*.class files)
* Eclipse workspace settings, project files etc.
* PDF or Microsoft Word documents.

Furthermore, **do not** change the packages of the provided source files. That is, do not move them into different folders (e.g. something horribly long like ```dk.itu.pcpp.group49.week02```) and do not change the ```package``` declaration at the top of the files. Furthermore, all files must still compile when using the Makefile.
