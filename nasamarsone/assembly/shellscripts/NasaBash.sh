#! /bin/bash
echo "NASA transmisor beginning to run..."

echo "MarsBase beginning to run..."
exec "$JAVA_HOME"/bin/java -jar marsbase-${project.version}.jar 'start' &
echo "MarsBase ON!!"

echo "MarsRover beginning to run..."
exec "$JAVA_HOME"/bin/java -jar marsrovers-${project.version}.jar 'start' &
echo "MarsRovers ON!!"

echo "NASA transmisor ON!!"
