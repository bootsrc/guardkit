# springboot-demo
Spring Boot demo. Get ApplicationContext in it.

# How to set each configuation files for development, test, and produce environmant? 

Step1: Add file 'application-test.properties' and 'application-prod.properties'
Step2: Run it with this command. <br/>
In test environment:
<code>
java -jar springboot-demo-0.0.1-RELEASE.jar
</code>
or <br/>
<code>
java -jar springboot-demo-0.0.1-RELEASE.jar --spring.profiles.active=test 
</code>
<br/>
In produce environment:
<code>
java -jar springboot-demo-0.0.1-RELEASE.jar --spring.profiles.active=prod
</code>
