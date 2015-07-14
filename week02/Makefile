WEEK=02
FILES_ALL=$(shell ls pcpp/week$(WEEK)/*.java)
FILES_PUB=$(shell ls pcpp/week$(WEEK)/*.java | grep -v TestSubmission)

all:
	javac -cp ./pcpp:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar $(FILES_ALL)

clean:
	rm -f pcpp/$(WEEK)/*.class
	rm -f *.zip

students:
	zip -r pcpp-week$(WEEK).zip $(FILES_PUB)

tas:
	zip -r pcpp-week$(WEEK)-tas.zip $(FILES_ALL) Makefile test.sh lib/*.jar
