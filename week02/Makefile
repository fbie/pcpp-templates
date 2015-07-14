WEEK=02
FILES=$(shell ls *.java | grep -v TestSubmission)

all:
	javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar **.java

clean:
	rm -f *.class
	rm -f *.zip

students:
	zip -r pcpp-week$(WEEK).zip $(FILES)

tas:
	zip -r pcpp-week$(WEEK)-tas.zip **.java Makefile test.sh **.jar
