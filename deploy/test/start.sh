JAVA_MEM_OPTS=" -server -Xmx1g -Xms1g -Xmn256m  -Xss256k"
/opt/java/jdk1.8.0_112/bin/java $JAVA_MEM_OPTS -jar springboot-demo-0.0.1-RELEASE.jar --spring.profiles.active=test &
