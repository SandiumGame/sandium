#!/bin/sh

SANDIUM_HOME=$(dirname "$(realpath "$0")")
cd $SANDIUM_HOME
jre/bin/java -splash:lib/Splash.jpg --enable-native-access=ALL-UNNAMED -Xmx1G -XX:+UnlockExperimentalVMOptions -XX:+UseZGC -jar lib/Sandium.jar