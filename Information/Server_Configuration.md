Here are some good-to-know configuration on the server that players would apprecieate.

Updated as of June 24, 2022

<hr>

**view-distance=8**
<br />Number of chunks (in radius) loaded around each player. This does not include the chunk you're standing in.

<hr>

**simulation-distance=4**
<br />Maximum distance from players that living entities may be updated by the server, in chunks (radius, not diameter).
<br />If entities are outside of this radius, then they will not be ticked by the server nor will they be visible to players.

<hr>

**spawn-limits**:
- axolotls: 5
- water-underground-creature: 5
- water-ambient: 3
- monsters: 15
- animals: 3
- water-animals: 1
- ambient: 0

<br />How many mobs of each type can spawn around each player. This is per-player based.

<hr>

**entity-activation-range**:
- animals: 16
- monsters: 48
- raiders: 48
- misc: 4
- water: 4
- villagers: 16
- flying-monsters: 16

<br />Controls the range in blocks that entities will become "activated" - entities outside of this range will tick at a reduced rate.

<hr>

**entity-tracking-range**:
- players: 48
- animals: 32
- monsters: 48
- misc: 32
- other: 32

<br />Controls the range in blocks that entities will become "visible" or otherwise known as "tracked" to the client.

<hr>

**mob-spawn-range**: 3

<br />Radius in chunks around the player in which mobs will spawn.
<br />This also determines the maximum size of a farm as no mobs will spawn outside of this defined range

<hr>

despawn-ranges:<br />
monster: - soft: 32 - hard: 48
<br />creature: - soft: 32 - hard: 48
<br />ambient: - soft: 32 - hard: 48
<br />axolotls: - soft: 32 - hard: 48
<br />underground_water_creature: - soft: 32 - hard: 48
<br />water_creature: - soft: 32 - hard: 48
<br />water_ambient: - soft: 32 - hard: 48
<br />misc: - soft: 32 - hard: 48
       
<br />Soft: The number of blocks away from a player in which monsters will be randomly selected to be despawned.
<br />Hard: The number of blocks away from a player in which monsters will be forcibly despawned.

<br />**NOTE**: The value of hard despawn-range determines the ideal afk spot of the farm

<hr>

**ticks-per**:
- hopper-transfer: 8 // The time - in server ticks - between when a hopper pushes/pulls/receives items and when the hopper pushes/pulls more items
- hopper-check: 3 //The time - in server ticks - hoppers attempt to push/pull items since the last attempt.
<hr>

Ask Kyrobi if you want other info
