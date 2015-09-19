Mars Rovers
===========

A squad of robotic rovers is to be landed by NASA on a plateau on Mars. This plateau, which is curiously rectangular, must be navigated by the rovers so that their on-board cameras can get a complete view of the surrounding terrain to send back to Earth.<br/>
A rover's position and location is represented by a combination of x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.<br/>
In order to control a rover, NASA sends a simple string of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot. 'M' means move forward one grid point, and maintains the same heading.<br/>
Assume that the square directly North from (x, y) is (x, y+1).<br/>
INPUT: The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0. The rest of the input is information pertaining to the rovers that have been deployed. Each rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions telling the rover how to explore the plateau. The position is made up of two integers and a letter separated by spaces, corresponding to the x and y co-ordinates and the rover's orientation. Each rover will be
finished sequentially, which means that the second rover won't start to move until the first one has finished moving.<br/>
OUTPUT: The output for each rover should be its final co-ordinates and heading. INPUT AND OUTPUT 
<br/>Test Input: 5 5 1 2 N LMLMLMLMM 3 3 E MMRMMRMRRM<br/>
Expected Output: 1 3 N 5 1 E

Implemented design
===========
The project is integrated by 3 modules, two of them represents the real entities other is only an api with some common functionality.<br/>
MarsApi: it's the module with common functionality<br/>
MarsBase: represents a base in mars that receive the messages from NASA and send the orders to the rovers squad.<br/>
MarsRovers: represents the Rover software that is executed by the rovers.<br/><br/>
The way that this entities have communication is through the Communicator interface and with the Transmisor interface like an anthena to receive the entry messages.<br/>
Assembly folder, is only for development and release versions purpose.

Used Patterns
===========
You will see some design patterns into the code, some of these are:<br/>
Factory, Strategy, Bridge, Adapter, Facade among others.<br/><br/>
Singleton (to be implemented in next version with more functionalities) ;)

How to test
===========
To deploy the NASA marsbase and rovers squad, you need to download the latest release binaries version https://github.com/mermanu/nasamarsone/releases and execute the NasaBash.sh file. Then with that bash is executed the MarsBase.jar process and The MarsRover.jar, each one started the Transmisor instance and will be able to receive new messages from nasa and between each other<br/>
For send the message to the MarsBase, write the input into the "bin/comunications/BASE_INPUT.co" and wait to the MarsBase processing.<br/>
Example message into BASE_INPUT.co: 
<pre>input: 5 5 1 2 N LMLMLMLMM 3 3 E MMRMMRMRRM</pre>
<pre>output: 1 3 N 5 1 E</pre>

test
