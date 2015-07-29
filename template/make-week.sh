#!/usr/bin/bash

# Week number
WEEK=$1

# Script location
TEMPLATE_DIR=$(cd $(dirname $0); pwd)

# Test script
TEST_SH="java -cp .:bin:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore pcpp.week$WEEK.TestSubmission"

# Build the directory
ROOT=$(pwd)/week$WEEK
PKG=$ROOT/src/pcpp/week$WEEK
mkdir -p $PKG

# Build the makefile
echo "WEEK=$WEEK" > $ROOT/Makefile && cat $TEMPLATE_DIR/Makefile >> $ROOT/Makefile

# Build the build.xml
cp $TEMPLATE_DIR/build.xml $ROOT/build.xml
sed -i '' s/THEWEEK/$WEEK/g $ROOT/build.xml

# Copy test template and add package.
cp $TEMPLATE_DIR/TestSubmission.java $PKG/TestSubmission.java
sed -i '' s/THEWEEK/$WEEK/g $PKG/TestSubmission.java

# Copy the other stuff
cp -R $TEMPLATE_DIR/lib $ROOT/lib
echo $TEST_SH > $ROOT/test.sh

echo "Created a new empty assignment in $ROOT."
exit 0
