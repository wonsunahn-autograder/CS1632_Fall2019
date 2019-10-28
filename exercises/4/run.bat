md bin

javac -d bin -cp "quickcheck-jars\*" src\*.java

java -XX:+UseCountedLoopSafepoints -XX:-Inline -cp bin MonkeySim %1
