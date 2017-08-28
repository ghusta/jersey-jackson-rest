FROM tomcat:8.5

# Au cas ou besoin de $JAVA_ENDORSED_DIRS (cf. catalina.sh)
RUN mkdir $CATALINA_HOME/endorsed

# $CATALINA_HOME is defined in tomcat image
ADD target/*.war $CATALINA_HOME/webapps/myapp.war

# Application config
RUN mkdir $CATALINA_HOME/app_conf/
ADD conf/ $CATALINA_HOME/app_conf/
# Définir un volume
VOLUME $CATALINA_HOME/app_conf/

# Create "$CATALINA_HOME/bin/setenv.sh"
# Escape char : https://docs.docker.com/engine/reference/builder/#/escape
RUN echo "# Add app_conf to Tomcat CLASSPATH" > $CATALINA_HOME/bin/setenv.sh
RUN echo "CLASSPATH=\$CATALINA_HOME/app_conf/" >> $CATALINA_HOME/bin/setenv.sh
RUN chmod 750 $CATALINA_HOME/bin/setenv.sh

# Add user for role manager-gui
ADD docker/conf/tomcat-users.xml $CATALINA_HOME/conf/
