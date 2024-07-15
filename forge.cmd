@echo off

mvn -q exec:java -Dexec.mainClass="com.mavenforge.Console.Forge" -Dexec.args="%*"
