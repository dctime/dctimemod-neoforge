### 2025.4.22

After placing the build helper block and the slot is empty. 
Right clicking with the same slot wont change the mode of the block

Energy and item disappear when reopen the world (1)

### 2025.4.23

Flawless Exchanger needs GUI and a new name

Signal Wire needs collision block and needs a way to detect which multipart it clicked on (2)

### 2025.4.24

Signal Wire break box isnt the same as the model (make the break box bigger than the unconnected one to make it)

### 2025.4.25

Let the one who is updated to modify its capability, not the one who sends the update (1)

### 2025.4.27

The Collision box of the SignalWireBlock is so small that when a wire is connected player will fall between the wires

When placing the ConstSignalBlock, the FACING blockstate is always north. The block should be face to the player when placed.

ConstSignalBlock requires RF/t

Nearby wires not updated when break (4)

### 2025.4.28

Nearby source not applying source to newly configured wire. (1)

Signal to Redstone converter redstone feature not implemented. (2)

### 2025.4.30

Cannot type anything to the editbox (1)

Not checking inputs and sending inputs to the entity (2)

### 2025.5.1

Signal Block needs to update wires which is connected (1)

Higher Signal Values should dominate Low Signal Values in wire networks (2)

### 2025.5.2

Packet should use method in the const signal block to update signal value it outputs. Do not hardcode stuff. (1)

Breaking const signal block with two signal blocks connection to each other with wires doesn't update the wires. (2)

Add signal operation block and switch operation by storing item (3)

### 2025.5.5

Adding input port and output port models. (1)

clicking the sides to switch input and output. (2)

Limiting input and output sides. (X) (Just turn off the functionality)

Turning off functionality if not the same amount of input and output sides. (4)

### 2025.5.7

Render the model of input and output ports of the operation block (1)

Adding functionalities to the operation block (2)

Shrink the hit box of the operation block (3)

need input 1 and input 2 models (4)

Signal Operation Block output will be pulled to zero when output and one of the input connected to each other and the wire between the two updates.
Requires a new block that provides stable feedback loop. (5)

Const Signal Block and Operation block has a lot of functionalities that are the same, use inheritance (x) 

Let signal wire have a "no signal" state in signal information (7)

Replace GROUND signal with no signal (8)

Source should not output if the target signal wire has higher signal value. Use Forcefully to bypass (x)

Placing Blocks on operation signal block will cause serious error. (10)

### 2025.5.8

Using redstone dust will got ghost redstone dust placed (1)

Turning off functionality if not the same amount of input and output sides counter can be cached.

Const Signal Block output side should be bigger so that play knows where the output is. (3)

Let the stick detect if the operation block is functioning (4)

BlockItem rendering (5)

Wires item not 3D

### 2025.5.9

Add GUI to signal opeartion block and change the operation by the card inserted into.

The card defines how many input and output ports is required, the operation and holds constant if necessary. 
No idea how to implement it.

Signal Operation block needs screen (3)

Design some cards and add them to the game (& | ~) (4)

Signal Operation Block doesn't store cards when leaving the game 

Check it operation block valid by the card insert into (6)

Create a configurator to modify the connections and ports of the wire block and operation block



