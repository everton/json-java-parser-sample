# JFLAGS = -g -cp .:vendor/junit-4.9b3.jar
JFLAGS = -cp .:vendor/junit-4.9b3.jar
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $(CLASSES)
#	$(JC) $(JFLAGS) $*.java

CLASSES = \
	JsonWalker.java \
	TestJsonWalker.java \
	AllTests.java

default: test

classes: $(CLASSES:.java=.class)

test: clean classes
	java $(JFLAGS) AllTests

clean:
	$(RM) *.class
