FROM jenkins/jenkins:lts-jdk11

COPY plugins.txt /usr/share/jenkins/plugins.txt
RUN jenkins-plugin-cli -f /usr/share/jenkins/plugins.txt

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
ENV CASC_JENKINS_CONFIG /var/jenkins_home/my_marvin.yml

COPY init.groovy /var/jenkins_home/init.groovy
COPY job_dsl.groovy /var/jenkins_home/job_dsl.groovy
COPY my_marvin.yml /var/jenkins_home/my_marvin.yml
