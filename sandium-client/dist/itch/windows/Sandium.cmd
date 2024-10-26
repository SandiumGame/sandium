@echo off
pushd "%~dp0"
jre\bin\java -splash:lib/Splash.jpg -Xmx1G -XX:+UnlockExperimentalVMOptions -XX:+UseZGC -jar lib/Sandium.jar
popd