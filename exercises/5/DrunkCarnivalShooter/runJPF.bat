javac -cp jpf-core/build/* DrunkCarnivalShooter.java

java -ea -jar jpf-core/build/RunJPF.jar +site=./jpf-core/site.properties DrunkCarnivalShooter.jpf
