WEEK=02
SRC=src/pcpp/$(WEEK)
BIN=bin
FILES_ALL=$(shell ls src/pcpp/week$(WEEK)/*.java)
FILES_PUB=$(shell ls src/pcpp/week$(WEEK)/*.java | grep -v TestSubmission)

all:
	mkdir -p $(BIN)
	javac -cp ./pcpp:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar $(FILES_ALL) -d $(BIN)

clean:
	rm -rf $(BIN)

clean-zip:
	rm -f *.zip

submission:
	zip -r pcpp-week$(WEEK)-submission.zip $(FILES_ALL) answers*

students:
	zip -r pcpp-week$(WEEK).zip $(FILES_PUB) Makefile build.xml

tas:
	zip -r pcpp-week$(WEEK)-tas.zip $(FILES_ALL) Makefile build.xml test.sh lib/*.jar

archive: students tas
