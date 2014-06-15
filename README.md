nasamarsone
===========


To deploy the NASA marsbase and rovers squad, you need to download the latest release binaries version and execute the NasaBash.sh file. Then with that bash is executed the MarsBase.jar process and The MarsRover.jar, each one started the Transmisor instance and will be able to receive new messages from nasa and between each other<br/>
For send the message to the MarsBase, write the input into the "bin/comunications/BASE_INPUT.co" and wait to the MarsBase processing.<br/>
Example message into BASE_INPUT.co: 
<pre>input: 5 5 1 2 N LMLMLMLMM 3 3 E MMRMMRMRRM</pre>
<pre>output: 1 3 N 5 1 E</pre>
