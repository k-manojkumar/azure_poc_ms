FROM websphere-liberty:latest

RUN mkdir /usr/applib
copy mysql.jar /ussr/applib

COPY server.xml /config/

COPY target/DiaryManagerService.war /config/apps/DiaryManagerService.war

ENTRYPOINT ["/opt/ibm/wlp/bin/server", "run", "defualtServer"]
