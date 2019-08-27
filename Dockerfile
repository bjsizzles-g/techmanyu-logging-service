FROM tomcat:8.0

MAINTAINER AbhimanyuGarg

# COPY path-to-your-application-war path-to-webapps-in-docker-tomcat
COPY target/Logging-0.0.1.war /usr/local/tomcat/webapps/Logging.war