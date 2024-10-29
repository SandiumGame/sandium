#!/bin/sh

SANDIUM_HOME=$(dirname "$(realpath "$0")")
cd $SANDIUM_HOME
export LD_LIBRARY_PATH=lib${LD_LIBRARY_PATH:+:$LD_LIBRARY_PATH}
jre/bin/java -splash:lib/Splash.jpg -Xmx1G -XX:+UnlockExperimentalVMOptions -XX:+UseZGC -jar lib/Sandium.jar