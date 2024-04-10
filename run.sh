#!/bin/bash
./gradlew clean build
java -Xmx3m -jar build/libs/app1-1.0-SNAPSHOT.jar

